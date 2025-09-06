package kaptenallocweb.timeEdit

import org.scalajs.dom.{XMLHttpRequest}
import kaptenallocweb.tabby.Grid

object TimeEdit:

    def fetchData(
        onLoad: (xhr: XMLHttpRequest) => Unit,
        onError: (xhr: XMLHttpRequest) => Unit,
        uri: String =
          "https://cloud.timeedit.net/lu/web/lth1/ri19566250000YQQ28Z0507007y9Y4763gQ0g5X6Y65ZQ176.csv"
    ) =
      val xhr = XMLHttpRequest()
      xhr.open(
        "GET",
        uri
      )
      xhr.onload = _ => onLoad(xhr)
      xhr.onerror = _ => onError(xhr)
      xhr.send()
    
    def findDiscrepancies(timeEditData: String, kaptenAllocData: Seq[String]) =
        val timeEditGrid = timeEditData.split('\n').toVector.toScheduleGrid
        val kaptenAllocGrid = 
            Grid
                .fromLines(
                    kaptenAllocData.toVector.filterNot(_.startsWith("---")),
                    '|'
                )
                .trim
        
        val timeEditNormalized = normalizeTimeEditData(timeEditGrid)
        val kaptenAllocNormalized = normalizeKaptenAllocData(kaptenAllocGrid)

        val discrepancies = collection.mutable.Set[String]()

        kaptenAllocNormalized.filterNot(_.rum.startsWith("Ambulans")).foreach {
            kaEntry => 
                timeEditNormalized.find(teEntry =>
                    teEntry.datum == kaEntry.datum &&
                    teEntry.start == kaEntry.start &&
                    teEntry.del   == kaEntry.del   &&
                    teEntry.typ   == kaEntry.typ   &&
                    teEntry.grupp == kaEntry.grupp
                ) match {
                    case Some(matchedEntry) =>
                        if (matchedEntry.rum != kaEntry.rum) then
                            discrepancies.add(
                                s"Saländring för ${kaEntry.datum} ${kaEntry.start} ${kaEntry.del} ${kaEntry.typ} ${kaEntry.grupp} - Ny sal: ${matchedEntry.rum}"
                            ) 
                    case None => 
                        discrepancies.add(
                            s"Saknas i TimeEdit: ${kaEntry.datum} ${kaEntry.start} ${kaEntry.del} ${kaEntry.typ} ${kaEntry.grupp} ${kaEntry.rum}"
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
        start: String
    )

    private def normalizeTimeEditData(grid: Grid): Vector[NormalizedEntry] =
        grid.data.flatMap { row =>
            val datum = row(grid.colIndex("datum"))
            val start = row(grid.colIndex("start"))
            val del = row(grid.colIndex("del"))
            val typ = row(grid.colIndex("typ"))
            val lokal = row(grid.colIndex("lokal"))
            val grupp = row(grid.colIndex("grupp"))

            val rooms = lokal.split(",").map(_.trim.stripPrefix("E:"))
            val groups = grupp.split(",").map(_.trim)

            rooms.zip(groups).map { case (room, group) =>
                NormalizedEntry(datum, del, typ, group, room, start)
            }
        }

    private def normalizeKaptenAllocData(grid: Grid): Vector[NormalizedEntry] =
        grid.data.map { row =>
            val datum = row(grid.colIndex("datum"))
            val kl = row(grid.colIndex("kl"))
            val del = row(grid.colIndex("del"))
            val typ = row(grid.colIndex("typ"))
            val grupp = row(grid.colIndex("grupp"))
            val rum = row(grid.colIndex("rum"))

            val adjustedTime = adjustTimeBy15Minutes(kl, -15)

            NormalizedEntry(datum, del, typ, grupp, rum, adjustedTime)
        }
    
    private def adjustTimeBy15Minutes(time: String, minutesDelta: Int): String =
        val parts = time.split(":")
        if (parts.length != 2) return time

        try {
            val hours = parts(0).toInt
            val minutes = parts(1).toInt
            val totalMinutes = hours * 60 + minutes + minutesDelta
            val newHours = (totalMinutes / 60) % 24
            val newMinutes = totalMinutes % 60

            f"$newHours%02d:$newMinutes%02d"
        } catch {
            case _: Exception => time
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