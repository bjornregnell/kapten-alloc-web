package kaptenallocweb

import kaptenallocweb.ics.*
import org.scalajs.dom
import org.scalajs.dom.document

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.time.temporal.WeekFields
import kaptenallocweb.timeEdit.TimeEdit
import kaptenallocweb.utils.getWeekNumber
import kaptenallocweb.utils.downloadIcs

val timeEditScheduleUrl = 
  "https://cloud.timeedit.net/lu/web/lth1/ri19566250000YQQ28Z0507007y9Y4763gQ0g5X6Y65ZQ176.csv"

@main def run: Unit = 
    document.addEventListener("DOMContentLoaded", (e: dom.Event) => 
      TimeEdit.fetchData(
        url = timeEditScheduleUrl,
        onLoad = timeEditEntries => 
          val discrepancies = TimeEdit.findDiscrepancies(dataGeneratedFromKaptenAlloc.toSet, timeEditEntries.toSet)
          if discrepancies.size > 0 then addDiscrepancyPanel(discrepancies) else ()
          ,
        onError = _ => 
          dom.console.warn("An error occured when fetching CSV data")
          addTimeEditFailPanel()
      )
      setupUI()
    )  

def appendPar(targetNode: dom.Node, text: String): dom.html.Paragraph =
  val parNode = document.createElement("p").asInstanceOf[dom.html.Paragraph]
  parNode.textContent = text
  targetNode.appendChild(parNode)
  parNode

def createTableHeader(): dom.html.TableRow =
  val headerRow = document.createElement("tr").asInstanceOf[dom.html.TableRow]

  val headers = Seq("del", "datum", "vecka", "dag", "kl", "typ", "grupp", "rum", "vem")

  headers.foreach(headerText =>
    val headerCell = document.createElement("th").asInstanceOf[dom.html.TableCell]
    headerCell.textContent = headerText
    headerRow.appendChild(headerCell)
  )

  headerRow

def createTableRow(entry: KaptenAllocData): dom.html.TableRow =
  val row = document.createElement("tr").asInstanceOf[dom.html.TableRow]

  val valuesToShow = Seq(
    entry.course,
    entry.date,
    entry.week,
    entry.day,
    entry.time,
    entry.entryType,
    entry.group,
    entry.room,
    entry.supervisor
  )

  val cells = valuesToShow.map(_.trim)
  cells.foreach(cellData =>
    val cell = document.createElement("td").asInstanceOf[dom.html.TableCell]
    cell.textContent = cellData
    row.appendChild(cell)
  )

  row

def populateTable(table: dom.html.Table, rows: Seq[KaptenAllocData]): Unit =
  rows.foreach(entry =>
    val tableRow = createTableRow(entry)
    table.appendChild(tableRow)
  )

def createTable(rows: Seq[KaptenAllocData]): dom.html.Table =
  val table = document.createElement("table").asInstanceOf[dom.html.Table]
  table.id = "scheduleTable"
  table.appendChild(createTableHeader())
  populateTable(table, rows)
  table

def updateTable(table: dom.html.Table, rows: Seq[KaptenAllocData]): Unit =
  while table.firstChild != null do
    table.removeChild(table.firstChild)
  table.appendChild(createTableHeader())
  populateTable(table, rows)

def setupUI(): Unit =
  val input = document.createElement("input").asInstanceOf[dom.html.Input]
  val scheduleTable = createTable(dataGeneratedFromKaptenAlloc)
  val downloadButton = document.createElement("button").asInstanceOf[dom.html.Button]
  val akCheckbox = document.createElement("input").asInstanceOf[dom.html.Input]
  val akLabel = document.createElement("label").asInstanceOf[dom.html.Label]
  val todayCheckBox = document.createElement("input").asInstanceOf[dom.html.Input]
  val todayLabel = document.createElement("label").asInstanceOf[dom.html.Label]

  val showSize = document.createElement("label").asInstanceOf[dom.html.Label]
  showSize.textContent = " " + dataGeneratedFromKaptenAlloc.size

  val filterText = appendPar(document.body, "Filter: ")

  input.id = "myInput"
  input.classList.add("input"); 
  input.setAttribute("value", "")
  def words = input.value.split(' ')

  // Save event type to call it from other events via ```.dispatchEvent(<Event>)```
  val inputEvent = new dom.Event("input")
  input.addEventListener("input", (e: dom.Event) =>
    val filtered: Seq[KaptenAllocData] = dataGeneratedFromKaptenAlloc
      .filterOnlyToday(todayCheckBox.checked)
      .filterRows(words)
      .akademiskKvart(akCheckbox.checked)
    updateTable(scheduleTable, filtered)
    showSize.textContent = " " + filtered.size
  )

  akCheckbox.setAttribute("type", "checkbox")
  akCheckbox.id = "akademiskKvart"
  akCheckbox.defaultChecked = true
  akLabel.textContent = "Akademisk Kvart"
  akLabel.setAttribute("for", "akademiskKvart")

  akCheckbox.addEventListener("change", (e: dom.Event) =>
    input.dispatchEvent(inputEvent)
  )

  todayCheckBox.setAttribute("type", "checkbox")
  todayCheckBox.id = "todayCheckBox"
  todayCheckBox.defaultChecked = false
  todayLabel.textContent = "Idag?"
  todayLabel.setAttribute("for", "todayCheckBox")

  todayCheckBox.addEventListener("change", (e: dom.Event) => 
    input.dispatchEvent(inputEvent)
  )

  // TODO: Add input for alert
  downloadButton.textContent = "Ladda ner"
  downloadButton.addEventListener("click", (e: dom.Event) =>
    val filtered = dataGeneratedFromKaptenAlloc
      .filterRows(words)
      .akademiskKvart(akCheckbox.checked)

    val calendar = Calendar()

    for row: KaptenAllocData <- filtered do 
      val e = Event()
      e.addProperty(
        (Property.time(row.date, row.time.replace(":", "").toInt)
        ++ Seq(
          Property.uid(),
          Property.summary(row.course, row.entryType, row.room),
          Property.description(row.course, row.group, row.room),
          Property.location(row.room),
          Property.tzid(),
        )
        ++ Property.createdTimes())*
        // Give Seq as repeated properties (Property*)
      )
      calendar.addEvent(e)
    end for

    if filtered.isEmpty then
      dom.window.alert("Finns inga tider att skapa en ICS fil av")
    else
      downloadIcs(calendar.toICS())
  )

  filterText.appendChild(input)
  filterText.appendChild(showSize)
  filterText.appendChild(downloadButton)
  filterText.appendChild(akCheckbox)
  filterText.appendChild(akLabel)
  filterText.appendChild(todayCheckBox)
  filterText.appendChild(todayLabel)
  document.body.appendChild(scheduleTable)

def addDiscrepancyPanel(discrepancies: Set[String]) =
  val container = document.createElement("div").asInstanceOf[dom.html.Div]
  container.id = "discrepancyPanel"
  discrepancies.foreach(discrepancy => 
    val entrySpan = document.createElement("span").asInstanceOf[dom.html.Span]
    entrySpan.innerHTML = discrepancy
    container.appendChild(entrySpan)
  )
  document.body.prepend(container)

def addTimeEditFailPanel() = 
  val container = document.createElement("div").asInstanceOf[dom.html.Div]
  container.id = "timeEditFailPanel"
  container.innerHTML = "TimeEdit i molnet svara inte just nu - KaptenAlloc kör med tidigare sparad data"
  document.body.prepend(container)
