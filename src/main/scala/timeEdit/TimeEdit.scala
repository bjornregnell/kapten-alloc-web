package kaptenallocweb.timeEdit

import org.scalajs.dom.{XMLHttpRequest}
import kaptenallocweb.tabby.Grid
import java.time.LocalDate

object TimeEdit:
    private type RequestCallback = (request: XMLHttpRequest) => Unit

    def fetchData(
        url: String,
        onLoad: RequestCallback,
        onError: RequestCallback,
    ) =
      val request = XMLHttpRequest()
      request.open(
        "GET",
        url
      )
      request.onload = _ => onLoad(request)
      request.onerror = _ => onError(request)
      request.send()
    
    def findDiscrepancies(timeEditData: String, kaptenAllocData: Seq[String]) =
        val timeEditGrid = timeEditData.split('\n').toVector.toScheduleGrid
        val kaptenAllocGrid = 
            Grid
                .fromLines(
                    kaptenAllocData.toVector.filterNot(_.startsWith("---")),
                    '|'
                )
                .trim

        val today = LocalDate.now()
        val todayDate = Date(today.getYear, today.getMonthValue, today.getDayOfMonth)
        
        val timeEditEntries = normalizeTimeEditData(timeEditGrid)
        val kaptenAllocEntries = normalizeKaptenAllocData(kaptenAllocGrid)
            .filter(entry => 
              !entry.rum.startsWith("Ambulans") && Date(entry.datum) >= todayDate
            )

        val discrepancies = collection.mutable.Set[String]()

        kaptenAllocEntries.foreach {
            kaEntry => 
                timeEditEntries.find(teEntry =>
                    teEntry.datum     == kaEntry.datum     &&
                    teEntry.startHour == kaEntry.startHour &&
                    teEntry.del       == kaEntry.del       &&
                    teEntry.typ       == kaEntry.typ       &&
                    teEntry.grupp     == kaEntry.grupp
                ) match {
                    case Some(matchedEntry) =>
                        if (matchedEntry.rum != kaEntry.rum) then
                            discrepancies.add(
                                s"Saländring för ${kaEntry.datum} ${kaEntry.startHour}:15 ${kaEntry.del} ${kaEntry.typ} ${kaEntry.grupp} - Ny sal: ${matchedEntry.rum}"
                            ) 
                    case None => 
                        discrepancies.add(
                            s"Saknas i TimeEdit: ${kaEntry.datum} ${kaEntry.startHour}:15 ${kaEntry.del} ${kaEntry.typ} ${kaEntry.grupp} ${kaEntry.rum}"
                        )
                }
        }

        discrepancies.toSet
    
    private case class NormalizedEntry(
        datum: String,
        del: String,
        typ: String,
        grupp: String,
        rum: String,
        startHour: String
    )

    private def normalizeTimeEditData(grid: Grid): Vector[NormalizedEntry] =
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
                NormalizedEntry(datum, del, typ, group, room, extractHour(startTime))
            }
        }

    private def normalizeKaptenAllocData(grid: Grid): Vector[NormalizedEntry] =
        grid.data.map { row =>
            val datum = row(grid.colIndex("datum"))
            val startTime = row(grid.colIndex("kl"))
            val del = row(grid.colIndex("del"))
            val typ = row(grid.colIndex("typ"))
            val grupp = row(grid.colIndex("grupp"))
            val rum = row(grid.colIndex("rum"))

            val hour = extractHour(startTime)

            NormalizedEntry(datum, del, typ, grupp, rum, hour)
        }
    
    private def extractHour(time: String): String =
        val parts = time.split(":")
        if (parts.length >= 1) parts(0) else time

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
      .filter("datum")(d => Date(d) >= StartOfPeriod && Date(d) <= EndOfPeriod)

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