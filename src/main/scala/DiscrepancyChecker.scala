package kaptenallocweb

import org.scalajs.dom

case class NormalizedEntry(
    datum: String,
    del: String,
    typ: String,
    grupp: String,
    rum: String,
    start: String
)

object DiscrepancyChecker:

  def hasDiscrepancies(
      timeEditGrid: Grid,
      kaptenAllocGrid: Grid
  ): Boolean =
    dom.console.log(timeEditGrid.showHeadings)
    // datum     |start|del |typ      |lokal                                            |grupp
    dom.console.log(timeEditGrid.showData)
    /*
      2025-09-03|15:00|Prog|Resurstid|E:Alfa,E:Beta,E:Gamma                            |D1.12,D1.13,D1.14
      2025-09-03|15:00|Prog|Resurstid|E:Elg,E:Hacke,E:Panter,E:Ravel                   |D1.01,D1.02,D1.03,D1.04
      2025-09-03|15:00|Prog|Resurstid|E:Falk,E:Val,E:Varg                              |D1.09,D1.10,D1.11
      2025-09-04|10:00|Dod |DodLabb  |E:Alfa,E:Beta,E:Gamma                            |C1.01,C1.02,C1.03
      2025-09-04|10:00|Dod |DodLabb  |E:Elg,E:Hacke,E:Panter,E:Ravel                   |D1.08,D1.09,D1.10,D1.11
      ...
     */

    dom.console.log(kaptenAllocGrid.showHeadings)
    // del |datum     |dag|kl   |typ      |grupp|rum      |handledare
    dom.console.log(kaptenAllocGrid.showData)
    /*
      Prog|2025-09-03|ons|15:15|Resurstid|D1.01|Alfa     |SAR
      Prog|2025-09-03|ons|15:15|Resurstid|D1.02|Beta     |SAJ
      Prog|2025-09-03|ons|15:15|Resurstid|D1.03|Gamma    |ALW
      Prog|2025-09-03|ons|15:15|Resurstid|D1.04|Elg      |JUG
      Prog|2025-09-03|ons|15:15|Resurstid|D1.09|Hacke    |ELÅ
      Prog|2025-09-03|ons|15:15|Resurstid|D1.10|Panter   |NAK
      Prog|2025-09-03|ons|15:15|Resurstid|D1.11|Ravel    |WIS
      Prog|2025-09-03|ons|15:15|Resurstid|D1.12|Falk     |MAU
      Prog|2025-09-03|ons|15:15|Resurstid|D1.13|Val      |MOJ
      Prog|2025-09-03|ons|15:15|Resurstid|D1.14|Varg     |AXF
      Prog|2025-09-03|ons|15:15|Resurstid|XA1  |Ambulans |MEW
     */

    val timeEditNormalized = normalizeTimeEditData(timeEditGrid)
    val kaptenAllocNormalized = normalizeKaptenAllocData(kaptenAllocGrid)

    var foundDiscrepancies = false
    var missingEntries = 0
    var changedRooms = 0

    kaptenAllocNormalized.filterNot(_.rum.startsWith("Ambulans")).foreach {
      entry =>
        timeEditNormalized.find(te =>
          te.datum == entry.datum &&
            te.start == entry.start &&
            te.del == entry.del &&
            te.typ == entry.typ &&
            te.grupp == entry.grupp
        ) match {
          case Some(matchedEntry) =>
            if (matchedEntry.rum != entry.rum) {
              dom.console.log(
                s"Room changed: ${entry.datum} ${entry.start} ${entry.del} ${entry.typ} ${entry.grupp} - KaptenAlloc: ${entry.rum}, TimeEdit: ${matchedEntry.rum}"
              )
              changedRooms += 1
              foundDiscrepancies = true
            }
          case None =>
            dom.console.log(
              s"Missing in TimeEdit: ${entry.datum} ${entry.start} ${entry.del} ${entry.typ} ${entry.grupp} ${entry.rum}"
            )
            missingEntries += 1
            foundDiscrepancies = true
        }
    }

    if (foundDiscrepancies) {
      dom.console.log(
        s"Discrepancy summary: $missingEntries missing entries, $changedRooms changed rooms"
      )
    } else {
      dom.console.log("No discrepancies found between datasets")
    }

    foundDiscrepancies

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
