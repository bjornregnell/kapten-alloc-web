package kaptenallocweb

import org.scalajs.dom
import org.scalajs.dom.document
import kaptenallocweb.ics.*
import org.scalajs.dom.Blob
import org.scalajs.dom.BlobPropertyBag
import org.scalajs.dom.URL

@main def run: Unit = 
    document.addEventListener("DOMContentLoaded", (e: dom.Event) => setupUI())  

extension (s: String)
  def containsAll(xs: Array[String], isCaseSensitive: Boolean = false): Boolean =
    val xs2 = if isCaseSensitive then xs else xs.map(_.toLowerCase)
    val s2 = if isCaseSensitive then s else s.toLowerCase
    xs2.forall(x => s2.contains(x))

extension (rows: Seq[String])
  def filterRows(words: Array[String]): Seq[String] = 
    for row <- rows 
    if row.containsAll(words) || row.startsWith("---") || row.startsWith("kurs")
    yield row

def appendPar(targetNode: dom.Node, text: String): dom.html.Paragraph = 
  val parNode = document.createElement("p").asInstanceOf[dom.html.Paragraph]
  parNode.textContent = text
  targetNode.appendChild(parNode)
  parNode

def setupUI(): Unit = 
  val input = document.createElement("input").asInstanceOf[dom.html.Input]
  val showText = document.createElement("pre").asInstanceOf[dom.html.Pre]
  val button = document.createElement("button").asInstanceOf[dom.html.Button]
  val akademiskKvart = document.createElement("input").asInstanceOf[dom.html.Input]
  val akademiskKvartLabel = document.createElement("label").asInstanceOf[dom.html.Label]
  showText.textContent = dataGeneratedFromKaptenAlloc.mkString("\n")

  val showSize = document.createElement("label").asInstanceOf[dom.html.Label]
  val headRows = 3
  showSize.textContent = " " + (dataGeneratedFromKaptenAlloc.size- headRows)

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
    var filtered: Seq[String] = Seq("")
    if akademiskKvart.checked then
      filtered = dataGeneratedFromKaptenAlloc.filterRows(words)
    else
      filtered = dataGeneratedFromKaptenAlloc.map(_.replace(":15", ":00")).filterRows(words)
    showText.textContent = filtered.mkString("\n")
    showSize.textContent = " " + (filtered.size - headRows)
  )

  akademiskKvart.setAttribute("type", "checkbox")
  akademiskKvart.id = "akadimiskKvart"
  akademiskKvart.defaultChecked = true
  akademiskKvartLabel.textContent = "Akademisk Kvart: "
  akademiskKvartLabel.setAttribute("for", "akademiskKvart")

  akademiskKvart.addEventListener("change", (e: dom.Event) =>
    input.dispatchEvent(inputEvent)
  )

  // TODO: Add input for alert
  button.textContent = "Kalender"
  button.addEventListener("click", (e: dom.Event) =>
    var filteredKaptenAllocData = dataGeneratedFromKaptenAlloc.filterRows(words).drop(3)
    if ! akademiskKvart.checked then
      filteredKaptenAllocData = filteredKaptenAllocData.map(_.replace(":15", ":00"))
    val calendar = Calendar()

    for row: String <- filteredKaptenAllocData do 

      val cells = row.filterNot(_.isWhitespace).split('|').toVector

      val e = Event()
      // kurs 0|datum 1 |dag 2|kl 3 |typ 4 |grupp 5 |rum 6 |handledare 7
      e.addProperty(
        Property.time(cells(1), cells(3).replace(":", "").toInt)
        ++ Seq(
          Property.uid(),
          Property.summary(cells(0), cells(4), cells(6)),
          Property.description(cells(0), cells(5), cells(6)),
          Property.location(cells(6)),
          Property.tzid(),
        )
        ++ Property.createdTimes()
        // Give Seq as repeated properties (Property*)
        :_*
      )
      calendar.addEvent(e)
    end for

    if filteredKaptenAllocData.isEmpty then
      dom.window.alert("Finns inga tider att skapa en ICS fil av")
    else
      download(calendar.build())
  )

  filterText.appendChild(input)
  filterText.appendChild(showSize)
  optionsText.appendChild(akademiskKvartLabel)
  optionsText.appendChild(akademiskKvart)
  downloadText.appendChild(button)
  document.body.appendChild(showText)

// TODO: Give name to file based on if room, group or any field always are the same
/** Creates file with given content, name and presents it as a download to the user */
def download(content: String, fileName: String = "handledartider.ics"): Unit =
  var file = new Blob(scala.scalajs.js.Array(content), new BlobPropertyBag { `type` = "text/calendar" })
  // file.`type` = "text/calendar"
  val a = document.createElement("a").asInstanceOf[dom.html.Anchor]
  val url = URL.createObjectURL(file)
  a.setAttribute("download", fileName)
  a.href = url
  a.click()

  // dom.window.open("data:text/calendar;charset=utf8," + scala.scalajs.js.URIUtils.encodeURI(content));
