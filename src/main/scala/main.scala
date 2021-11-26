package kaptenallocweb

import kaptenallocweb.ics.*
import org.scalajs.dom
import org.scalajs.dom.document

import java.time.LocalDate
import java.time.temporal.WeekFields

@main def run: Unit = 
    document.addEventListener("DOMContentLoaded", (e: dom.Event) => setupUI())  

extension (s: String)
  def containsAll(xs: Array[String], isCaseSensitive: Boolean = false): Boolean =
    val xs2 = if isCaseSensitive then xs else xs.map(_.toLowerCase)
    val s2 = if isCaseSensitive then s else s.toLowerCase
    xs2.forall(x => s2.contains(x))
  
  def getKaptenAllocData(): KaptenAllocData =
    val cells = s.filterNot(_.isWhitespace).split('|').toVector
    if cells.length == 8 then
      // kurs 0 |datum 1 |dag 2 |kl 3 |typ 4 |grupp 5 |rum 6 |handledare 7
      KaptenAllocData(cells(0), cells(1), None, cells(2), cells(3), cells(4), cells(5), cells(6), cells(7))
    else
      // kurs 0 |datum 1 |väcka 2 |dag 3 |kl 4 |typ 5 |grupp 6 |rum 7 |handledare 8
      KaptenAllocData(cells(0), cells(1), Some(cells(2)), cells(3), cells(4), cells(5), cells(6), cells(7), cells(8))


extension (rows: Seq[String])
  def filterRows(words: Array[String]): Seq[String] = 
    for row <- rows 
    if row.containsAll(words) || row.startsWith("---") || row.startsWith("kurs")
    yield row

  /** Add a week number column for a KaptenAlloc formatted matrix */
  def addWeekNumbers(): Seq[String] =
    for row <- rows yield
      var value = String()
      if row.startsWith("---") then
        value = "-" * 6
      else if row.startsWith("kurs") then
        value = "|vecka"
      else
        val week = getWeekNumber(row.getKaptenAllocData().date)
        value = s"|v$week"
      // TODO: Instead of hard-coding '15', find index of n:th '|' char in 2nd row
      row.patch(15, f"$value%-6s", 0)


  def akademiskKvart(isAkademiskKvart: Boolean): Seq[String] =
    rows.map( r => if isAkademiskKvart then r else r.replace(":15", ":00") )

def appendPar(targetNode: dom.Node, text: String): dom.html.Paragraph = 
  val parNode = document.createElement("p").asInstanceOf[dom.html.Paragraph]
  parNode.textContent = text
  targetNode.appendChild(parNode)
  parNode

def setupUI(): Unit = 
  val input = document.createElement("input").asInstanceOf[dom.html.Input]
  val showText = document.createElement("pre").asInstanceOf[dom.html.Pre]
  val button = document.createElement("button").asInstanceOf[dom.html.Button]
  val akCheckbox = document.createElement("input").asInstanceOf[dom.html.Input]
  val akLabel = document.createElement("label").asInstanceOf[dom.html.Label]
  showText.textContent = getGeneratedData().mkString("\n")

  val showSize = document.createElement("label").asInstanceOf[dom.html.Label]
  val headRows = 3
  showSize.textContent = " " + (getGeneratedData().size- headRows)

  val filterText = appendPar(document.body, "Filter: ")
  val downloadText = appendPar(document.body, "Nedladdning: ")
  val optionsText = appendPar(document.body, "")

  input.id = "myInput"
  input.classList.add("input"); 
  input.setAttribute("value", "")
  def words = input.value.split(' ')

  // Save event type to call it from other events via ```.dispatchEvent(<Event>)```
  val inputEvent = new dom.Event("input")
  input.addEventListener("input", (e: dom.Event) =>
    val filtered: Seq[String] = getGeneratedData()
      .filterRows(words)
      .akademiskKvart(akCheckbox.checked)
    showText.textContent = filtered.mkString("\n")
    showSize.textContent = " " + (filtered.size - headRows)
  )

  akCheckbox.setAttribute("type", "checkbox")
  akCheckbox.id = "akadimiskKvart"
  akCheckbox.defaultChecked = true
  akLabel.textContent = "Akademisk Kvart: "
  akLabel.setAttribute("for", "akademiskKvart")

  akCheckbox.addEventListener("change", (e: dom.Event) =>
    input.dispatchEvent(inputEvent)
  )

  // TODO: Add input for alert
  button.textContent = "Kalender"
  button.addEventListener("click", (e: dom.Event) =>
    val filtered = getGeneratedData()
      .filterRows(words).drop(3)
      .akademiskKvart(akCheckbox.checked)

    val calendar = Calendar()

    for row: KaptenAllocData <- filtered.map(_.getKaptenAllocData()) do 
      val e = Event()
      e.addProperty(
        Property.time(row.date, row.time.replace(":", "").toInt)
        ++ Seq(
          Property.uid(),
          Property.summary(row.course, row.`type`, row.room),
          Property.description(row.course, row.group, row.room),
          Property.location(row.room),
          Property.tzid(),
        )
        ++ Property.createdTimes()
        // Give Seq as repeated properties (Property*)
        :_*
      )
      calendar.addEvent(e)
    end for

    if filtered.isEmpty then
      dom.window.alert("Finns inga tider att skapa en ICS fil av")
    else
      download(calendar.toICS())
  )

  filterText.appendChild(input)
  filterText.appendChild(showSize)
  optionsText.appendChild(akLabel)
  optionsText.appendChild(akCheckbox)
  downloadText.appendChild(button)
  document.body.appendChild(showText)

// TODO: Give name to file based on if room, group or any field always are the same
/** Creates file with given content, name and presents it as a download to the user */
def download(content: String, fileName: String = "handledartider.ics"): Unit =
  var file = new dom.Blob(scala.scalajs.js.Array(content), new dom.BlobPropertyBag { `type` = "text/calendar" })
  val a = document.createElement("a").asInstanceOf[dom.html.Anchor]
  val url = dom.URL.createObjectURL(file)
  a.setAttribute("download", fileName)
  a.href = url
  a.click()
  a.remove()

/** Wrapper around dataGeneratedFromKaptenAlloc which adds week numbers */
def getGeneratedData(weekNumbers: Boolean = true): Seq[String] =
  if weekNumbers then
    dataGeneratedFromKaptenAlloc.addWeekNumbers()
  else
    dataGeneratedFromKaptenAlloc

/** Takes date in format YYYY-MM-DD */
def getWeekNumber(date: String): Int =
  val values = date.split("-").map(_.toInt)
  // Get week number using the ISO-8601 definition, where a week starts on Monday and the first week has a minimum of 4 days
  val week = LocalDate.of(values(0), values(1), values(2)).get(WeekFields.ISO.weekOfYear)
  if week == 0 then
    LocalDate.of(values(0) - 1, 12, 31).get(WeekFields.ISO.weekOfYear)
  else
    week
