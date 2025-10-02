package kaptenallocweb.timeEdit

import org.scalajs.dom.{XMLHttpRequest}
import java.time.LocalDate
import kaptenallocweb.KaptenAllocData
import kaptenallocweb.utils.{getWeekNumber, getDayOfWeek}
import kaptenallocweb.tabby.Grid
import kaptenallocweb.timeEdit.Date
import org.scalajs.dom

object TimeEdit:
    private type DataCallback = (timeEditEntries: Seq[KaptenAllocData]) => Unit
    private type RequestCallback = (request: XMLHttpRequest) => Unit

    def fetchData(
        url: String,
        onLoad: DataCallback,
        onError: RequestCallback,
    ) =
      val request = XMLHttpRequest()
      request.open(
        "GET",
        url
      )
      request.onload = _ => onLoad(parseData(request.responseText))
      request.onerror = _ => onError(request)
      request.send()
    
    def findDiscrepancies(localData: Set[KaptenAllocData], timeEditData: Set[KaptenAllocData]): Set[String] =
        val today = LocalDate.now()
        val todayDate = Date(today.getYear, today.getMonthValue, today.getDayOfMonth)

        val kaptenAllocEntries = localData
            .filter(entry =>
              entry.room != "Ambulans" && Date(entry.date) >= todayDate
            )

        val discrepancies = collection.mutable.Set[String]()

        kaptenAllocEntries.foreach {
            kaEntry =>
                timeEditData.find(teEntry =>
                    teEntry.date == kaEntry.date &&
                    teEntry.time.take(2) == kaEntry.time.take(2) &&
                    teEntry.course == kaEntry.course &&
                    teEntry.entryType == kaEntry.entryType &&
                    teEntry.group == kaEntry.group
                ) match {
                    case Some(matchedEntry) =>
                        if (matchedEntry.room != kaEntry.room) then
                            discrepancies.add(
                                s"Saländring för ${kaEntry.date} ${kaEntry.time} ${kaEntry.course} ${kaEntry.entryType} ${kaEntry.group} - Ny sal: ${matchedEntry.room}"
                            )
                    case None =>
                        discrepancies.add(
                            s"Saknas i TimeEdit: ${kaEntry.date} ${kaEntry.time} ${kaEntry.course} ${kaEntry.entryType} ${kaEntry.group} ${kaEntry.room}"
                        )
                }
        }

        discrepancies.toSet

    def parseData(rawCsvData: String): Seq[KaptenAllocData] =
        val timeEditGrid = rawCsvData.split('\n').toVector.toScheduleGrid
        normalizeTimeEditData(timeEditGrid).toSeq

    private def normalizeTimeEditData(grid: Grid): Vector[KaptenAllocData] =
        grid.data.flatMap { row =>
            val datum = row(grid.colIndex("datum"))
            val startTime = row(grid.colIndex("start"))
            val del = row(grid.colIndex("del"))
            val typ = row(grid.colIndex("typ"))
            val lokal = row(grid.colIndex("lokal"))
            val grupp = row(grid.colIndex("grupp"))

            val rooms = lokal.split(",").map(_.trim.stripPrefix("E:"))
            val groups = grupp.split(",").map(_.trim)

            rooms.zip(groups).map { case (room, group) =>
                KaptenAllocData(
                    course = del,
                    date = datum,
                    week = getWeekNumber(datum).toString,
                    day = getDayOfWeek(datum),
                    time = startTime,
                    entryType = typ,
                    group = group,
                    room = room,
                    supervisor = ""
                )
            }
        }

    private def normalizeKaptenAllocData(grid: Grid): Vector[KaptenAllocData] =
        grid.data.map { row =>
            val datum = row(grid.colIndex("datum"))
            val startTime = row(grid.colIndex("kl"))
            val del = row(grid.colIndex("del"))
            val typ = row(grid.colIndex("typ"))
            val grupp = row(grid.colIndex("grupp"))
            val rum = row(grid.colIndex("rum"))

            KaptenAllocData(
                course = del,
                date = datum,
                week = getWeekNumber(datum).toString,
                day = getDayOfWeek(datum),
                time = startTime,
                entryType = typ,
                group = grupp,
                room = rum,
                supervisor = ""
            )
        }

    

    
 
 
extension (lines: Vector[String])
  def toScheduleGrid: Grid =
    val xsUnpatched = lines.drop(3).map(removeQuotesAndCommasInsideQuotes)
    val g = Grid
      .fromLines(xsUnpatched, ',')
      .trim
      .updateHeadings(_.toLowerCase.filter(_.isLetterOrDigit))
      .trim
      .updateValues(addCommasIfSpaceSep)

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

private def removeQuotesAndCommasInsideQuotes(s: String): String =
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

private def addCommasIfSpaceSep(s: String): String =
  s.split(" ").filter(_.nonEmpty).mkString(",")