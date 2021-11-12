package kaptenallocweb.ics

case class Calendar(version: String, prodid: String) extends VObject():
  // Vector because order kinda matters, and since Calendar inherits BaseObject hashcode, only one Event would be kept
  var events: Vector[Event] = Vector()
  var timeZone: String = String()

  def addEvent(event: Event*): Unit =
    events = events ++ event 

  // Does not need to be changed, only if ability to change timezones were to be added
  private def addTimeZone(): Unit =
    timeZone = s"""BEGIN:VTIMEZONE
    |TZID:Europe/Stockholm
    |BEGIN:STANDARD
    |DTSTART:19810329T020000
    |TZOFFSETFROM:+0200
    |TZOFFSETTO:+0100
    |RRULE:FREQ=YEARLY;BYMONTH=10;BYDAY=-1SU
    |TZNAME:CET
    |END:STANDARD
    |BEGIN:DAYLIGHT
    |DTSTART:19810329T020000
    |TZOFFSETFROM:+0100
    |TZOFFSETTO:+0200
    |RRULE:FREQ=YEARLY;BYMONTH=3;BYDAY=-1SU
    |TZNAME:CEST
    |END:DAYLIGHT
    |END:VTIMEZONE""".stripMargin

  def contents(): String = 
    s"""VERSION:${version}
      |PRODID:${prodid}
      |${timeZone}
      |${ events.map(_.build()).mkString("\n") }""".stripMargin

object Calendar:
  def apply(): Calendar =
    // Values does not need to be changed
    val c = Calendar("2.0", "-//Kapten Alloc//Knepig Schemaläggning//EN")
    c.addTimeZone()
    c
