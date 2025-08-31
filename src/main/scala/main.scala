package kaptenallocweb

import kaptenallocweb.ics.*
import org.scalajs.dom
import org.scalajs.dom.document

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.time.temporal.WeekFields

@main def run: Unit =
  document.addEventListener(
    "DOMContentLoaded",
    (e: dom.Event) => {
      fetchTimeEditData()
      setupUI()
    }
  )

def fetchTimeEditData(): Unit =
  import scala.concurrent.ExecutionContext.Implicits.global
  val xhr = dom.XMLHttpRequest()
  xhr.open(
    "GET",
    "https://cloud.timeedit.net/lu/web/lth1/ri19566250000YQQ28Z0507007y9Y4763gQ0g5X6Y65ZQ176.csv"
  )
  xhr.onload = _ => {
    if xhr.status == 200 then
      val csvContent = xhr.responseText
      checkScheduleDiffs(csvContent)
  }
  xhr.onerror = _ => {
    dom.console.log(("An error occured when fetching CSV data"))
  }
  xhr.send()

def checkScheduleDiffs(csvString: String): Unit =
  val grid = csvString.split('\n').toVector.toSchemaGrid

  val kaptenAllocGrid =
    Grid.fromLines(
      dataGeneratedFromKaptenAlloc.toVector.filterNot(_.startsWith("---")),
      '|'
    ).trim

  val discrepantRowIndices =
    DiscrepancyChecker.getDiscrepantRowIndices(
      grid,
      kaptenAllocGrid
    )

  if discrepantRowIndices.nonEmpty then
    dom.console.log("Differences found between TimeEdit and KaptenAlloc data!")
    dom.console.log(discrepantRowIndices.mkString(", "))
  else dom.console.log("No differences - schedules are synchronized!")

def removeQuotesAndCommasInsideQuotes(s: String): String =
  var isInsideQuotes = false
  var i = 0
  val result = StringBuilder()
  while i < s.length do
    if s(i) == '"' then isInsideQuotes = !isInsideQuotes
    else if isInsideQuotes && s(i) == ',' then result ++= " "
    else result += s(i)
    i += 1
  end while
  result.toString

def addCommasIfSpaceSep(s: String): String =
  s.split(" ").filter(_.nonEmpty).mkString(",")

extension (lines: Vector[String])
  def toSchemaGrid: Grid =
    val xsUnpatched = lines.drop(3).map(removeQuotesAndCommasInsideQuotes)
    // println(s"DEBUG: first 3 lines:   ${xsUnpatched.take(3)}")
    // val xsPatched = xsUnpatched(0).replace("Kurs", "Kursansvarig").replaceFirst("Kursansvarig", "Kurs")
    // val xs = xsUnpatched.updated(0, xsPatched)
    val g = Grid
      .fromLines(xsUnpatched, ',')
      .trim
      .updateHeadings(_.toLowerCase.filter(_.isLetterOrDigit))
      .trim
      .updateValues(addCommasIfSpaceSep)

    // println("\n\n*** DEBUG headings of g:" + g.headings)
    val newHeads = Seq(
      "startdatum" -> "datum",
      "starttid" -> "start",
      "märkning" -> "del",
      "undervisningstyp" -> "typ",
      "lokallokaldelplatskommentar" -> "lokal",
      "studentgrupp" -> "grupp"
    )

    val selectTyp = Set("Resurstid", "Labb")

    g.keep(newHeads.map(_._1)*)
      .rename(newHeads*)
      .filter("del")(_.nonEmpty)
      .updateCol("del") { rm =>
        if rm("del").trim.toLowerCase.startsWith("prog") then "Prog" else "Dod"
      }
      .filter("typ")(selectTyp.contains)
      .updateCol("typ") { rm =>
        if rm("del") == "Dod" then "DodLabb"
        else
          rm("typ") match
            case "Resurstid" => "Resurstid"
            case "Labb"      => "ProgLabb"
      }
      .filter("datum")(d =>
        Date(d) <= Date(s"2025-10-19") && Date(
          d
        ) >= Date(s"2025-09-01")
      )

end extension

extension (s: String)
  def containsAll(xs: Array[String], isCaseSensitive: Boolean = true): Boolean =
    val xs2 = if isCaseSensitive then xs else xs.map(_.toLowerCase)
    val s2 = if isCaseSensitive then s else s.toLowerCase
    xs2.forall(x => s2.contains(x))

  def getKaptenAllocData(): KaptenAllocData =
    val cells = s.filterNot(_.isWhitespace).split('|').toVector
    if cells.length == 8 then
      // del 0 |datum 1 |dag 2 |kl 3 |typ 4 |grupp 5 |rum 6 |handledare 7
      KaptenAllocData(
        cells(0),
        cells(1),
        None,
        cells(2),
        cells(3),
        cells(4),
        cells(5),
        cells(6),
        cells(7)
      )
    else
      // del 0 |datum 1 |vecka 2 |dag 3 |kl 4 |typ 5 |grupp 6 |rum 7 |handledare 8
      KaptenAllocData(
        cells(0),
        cells(1),
        Some(cells(2)),
        cells(3),
        cells(4),
        cells(5),
        cells(6),
        cells(7),
        cells(8)
      )

val MagicRegisterPaymentWord = "lön"

extension (rows: Seq[String])
  def filterRows(words: Array[String]): Seq[String] =
    if words.lift(0) != Some(MagicRegisterPaymentWord) then // filter data rows
      for
        row <- rows
        if row.containsAll(words) || row.startsWith("---") || row.startsWith(
          "del"
        )
      yield row
    else // make magic payment roll
      val dataRows: Seq[Seq[String]] =
        rows.drop(3).map(_.split('|').toSeq.map(_.trim))
      val register =
        dataRows.groupBy(_.last).toSeq.sortBy(_._1).map(_._2).flatten
      def timeToPeriod(hrs: String): String =
        val start = hrs.take(2)
        val end = start.toIntOption.map(_ + 2).getOrElse("??")
        s"$start-$end"
      val paymentRows = register.map(xs =>
        Seq(xs.last) :+ xs(0) :+ xs(1) :+ timeToPeriod(xs(4))
      )
      val headings = Seq(
        "lönereg kopiera till csv",
        "------------------------",
        "init;del;datum;tid"
      )
      for
        row <- headings ++ paymentRows.map(_.mkString(";"))
        if row.containsAll(words.drop(1)) || row.startsWith("init") || row
          .startsWith("-") || row.startsWith("lön")
      yield row

  /** Add a week number column for a KaptenAlloc formatted matrix */
  def addWeekNumbers(): Seq[String] =
    for row <- rows yield
      var value = String()
      if row.startsWith("---") then value = "-" * 6
      else if row.startsWith("del") then value = "|vecka"
      else
        val week = getWeekNumber(row.getKaptenAllocData().date)
        value = s"|v$week"
      // TODO: Instead of hard-coding '15', find index of n:th '|' char in 2nd row
      row.patch(15, f"$value%-6s", 0)

  def akademiskKvart(isAkademiskKvart: Boolean): Seq[String] =
    rows.map(r => if isAkademiskKvart then r else r.replace(":15", ":00"))

  def filterOnlyToday(filterOnToday: Boolean): Seq[String] =
    def todayString: String =
      val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
      LocalDate.now().format(formatter)

    if !filterOnToday then rows
    else
      rows.filter(r =>
        r.startsWith("del") || r.startsWith("---") || r.contains(todayString)
      )

def appendPar(targetNode: dom.Node, text: String): dom.html.Paragraph =
  val parNode = document.createElement("p").asInstanceOf[dom.html.Paragraph]
  parNode.textContent = text
  targetNode.appendChild(parNode)
  parNode

def setupUI(): Unit =
  val input = document.createElement("input").asInstanceOf[dom.html.Input]
  val showText = document.createElement("pre").asInstanceOf[dom.html.Pre]
  val downloadButton =
    document.createElement("button").asInstanceOf[dom.html.Button]
  val akCheckbox = document.createElement("input").asInstanceOf[dom.html.Input]
  val akLabel = document.createElement("label").asInstanceOf[dom.html.Label]
  val todayCheckBox =
    document.createElement("input").asInstanceOf[dom.html.Input]
  val todayLabel = document.createElement("label").asInstanceOf[dom.html.Label]
  showText.textContent = getGeneratedData().mkString("\n")

  val showSize = document.createElement("label").asInstanceOf[dom.html.Label]
  val headRows = 3
  showSize.textContent = " " + (getGeneratedData().size - headRows)

  val filterText = appendPar(document.body, "Filter: ")

  input.id = "myInput"
  input.classList.add("input");
  input.setAttribute("value", "")
  def words = input.value.split(' ')

  // Save event type to call it from other events via ```.dispatchEvent(<Event>)```
  val inputEvent = new dom.Event("input")
  input.addEventListener(
    "input",
    (e: dom.Event) =>
      val filtered: Seq[String] = getGeneratedData()
        .filterOnlyToday(todayCheckBox.checked)
        .filterRows(words)
        .akademiskKvart(akCheckbox.checked)
      showText.textContent = filtered.mkString("\n")
      showSize.textContent = " " + (filtered.size - headRows)
  )

  akCheckbox.setAttribute("type", "checkbox")
  akCheckbox.id = "akademiskKvart"
  akCheckbox.defaultChecked = true
  akLabel.textContent = "Akademisk Kvart"
  akLabel.setAttribute("for", "akademiskKvart")

  akCheckbox.addEventListener(
    "change",
    (e: dom.Event) => input.dispatchEvent(inputEvent)
  )

  todayCheckBox.setAttribute("type", "checkbox")
  todayCheckBox.id = "todayCheckBox"
  todayCheckBox.defaultChecked = false
  todayLabel.textContent = "Idag?"
  todayLabel.setAttribute("for", "todayCheckBox")

  todayCheckBox.addEventListener(
    "change",
    (e: dom.Event) => input.dispatchEvent(inputEvent)
  )

  // TODO: Add input for alert
  downloadButton.textContent = "Ladda ner"
  downloadButton.addEventListener(
    "click",
    (e: dom.Event) =>
      val filtered = dataGeneratedFromKaptenAlloc
        .filterRows(words)
        .drop(3)
        .akademiskKvart(akCheckbox.checked)

      val calendar = Calendar()

      for row: KaptenAllocData <- filtered.map(_.getKaptenAllocData()) do
        val e = Event()
        e.addProperty(
          (Property.time(row.date, row.time.replace(":", "").toInt)
            ++ Seq(
              Property.uid(),
              Property.summary(row.course, row.`type`, row.room),
              Property.description(row.course, row.group, row.room),
              Property.location(row.room),
              Property.tzid()
            )
            ++ Property.createdTimes())*
          // Give Seq as repeated properties (Property*)
        )
        calendar.addEvent(e)
      end for

      if filtered.isEmpty then
        dom.window.alert("Finns inga tider att skapa en ICS fil av")
      else download(calendar.toICS())
  )

  filterText.appendChild(input)
  filterText.appendChild(showSize)
  filterText.appendChild(downloadButton)
  filterText.appendChild(akCheckbox)
  filterText.appendChild(akLabel)
  filterText.appendChild(todayCheckBox)
  filterText.appendChild(todayLabel)
  document.body.appendChild(showText)

// TODO: Give name to file based on if room, group or any field always are the same
/** Creates file with given content, name and presents it as a download to the
  * user
  */
def download(content: String, fileName: String = "handledartider.ics"): Unit =
  var file = new dom.Blob(
    scala.scalajs.js.Array(content),
    new dom.BlobPropertyBag { `type` = "text/calendar" }
  )
  val a = document.createElement("a").asInstanceOf[dom.html.Anchor]
  val url = dom.URL.createObjectURL(file)
  a.setAttribute("download", fileName)
  a.href = url
  a.click()
  a.remove()

/** Wrapper around dataGeneratedFromKaptenAlloc which adds week numbers */
def getGeneratedData(weekNumbers: Boolean = true): Seq[String] =
  if weekNumbers then dataGeneratedFromKaptenAlloc.addWeekNumbers()
  else dataGeneratedFromKaptenAlloc

/** Takes date in format YYYY-MM-DD */
def getWeekNumber(date: String): Int =
  val values = date.split("-").map(_.toInt)
  // Get week number using the ISO-8601 definition, where a week starts on Monday and the first week has a minimum of 4 days
  val week =
    LocalDate.of(values(0), values(1), values(2)).get(WeekFields.ISO.weekOfYear)
  if week == 0 then
    LocalDate.of(values(0) - 1, 12, 31).get(WeekFields.ISO.weekOfYear)
  else week
