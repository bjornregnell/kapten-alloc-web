package kaptenallocweb.ics

import scala.scalajs.js.defined
import scala.util.Random
import java.time.*

/** Give value to a property as if directly given in an ics file */
trait Property(val value: String) extends BaseObject: 
  private var parameters: Set[Parameter] = Set()

  // A class can't use '-', so classes use '_' instead
  val name = base_name.replace("_", "-")

  def addParameter(parameter: Parameter*): Unit =
    parameters = parameters ++ parameter 

  def build(): String =
    if parameters.isEmpty then
      s"${name}:$value"
    else
      s"${name};${ parameters.map(_.build()).mkString("") }:$value"

object Property:
  case class Summary(summary: String) extends Property(summary)
  case class Description(description: String) extends Property(description)
  case class DtStart(dtstart: String) extends Property(dtstart)
  case class DtEnd(dtend: String) extends Property(dtend)
  case class Location(dtend: String) extends Property(dtend)
  case class TzID(tzid: String) extends Property(tzid)
  case class Uid(uid: String) extends Property(uid)
  case class DtStamp(dtstamp: String) extends Property(dtstamp)
  case class Last_Modified(last_modified: String) extends Property(last_modified)

  /** 
   *  Gives Seq containing formatted DtStart and formatted DtEnd Property
   * 
   *  @param date date in format as in Kapten Alloc (YYYY-MM-DD) or YYYMMDD (which it will be formatted to in the method)
   *  @param time time in format HHMM as an Integer
   *  @param parameter parameter to be added to property; defaults to TzID parameter of Europe/Stockholm timezone
   *  @return both Properties must be given 
   */
  def time(date: String, time: Int, parameter: Option[Parameter] = Option(Parameter.TzIDParam(tzid().tzid))): Seq[Property] =
    val date_formatted = date.replace("-", "")
    Seq(
      {
        val d = DtStart(s"${date_formatted}T${ "%04d".format(time) }00")
        if parameter.isDefined then d.addParameter(parameter.get)
        d
      },
      {
        // Stupid way to remove minutes
        val d = DtEnd(s"${date_formatted}T${ "%04d".format(((time / 100).toInt + 2) * 100) }00")
        if parameter.isDefined then d.addParameter(parameter.get)
        d
      }
    )
  
  /** 
   * Gives formatted Location Property
   * 
   * @param room which session is to be hold in
  */
  def location(room: String): Location =
    Location(s"$room\\, Ole Römers väg 3\\, 223 63 Lund")

  /** 
   * Gives formatted Description Property
   * 
   * @param course type of course being held
   * @param group group to be tutored
   * @param room room held in; will be formatted different is room equals to "Ambulans"
  */
  def description(course: String, group: String, room: String): Description =
    Description(s"Kurs: $course\\nGrupp: $group\\n${ if room.equals("Ambulans") then "Roll" else "Rum" }: $room")

  /**
   * @param course type of course being held
   * @param kind type of session, like "Resurstid" or "Labb"
   * @param room room held in; will be formatted different is room equals to "Ambulans"
  */
  def summary(course: String, kind: String, room: String): Summary =
    Summary(s"($course) $kind ${ if room.equals("Ambulans") then "som" else "i" } $room")
  
  /** 
   * Gives TzID Property with value "Europe/Stockholm" 
  */
  def tzid(): TzID =
    TzID("Europe/Stockholm")

  /** 
   * Gives formatted UID Property containing random and unique String 
  */
  def uid(): Uid =
    Uid(Random.alphanumeric.filter(_.isLetter).take(42).mkString)

  /** 
   * Gives DtStamp & Last_Modified Property set to todays date and time
  */
  def createdTimes(): Seq[Property] = 
    val time = LocalDateTime.now()
      .minusHours(1)
      .format(format.DateTimeFormatter
        .ofPattern("yMd'T'Hms'Z'"))
    Seq(
      DtStamp(time),
      Last_Modified(time)
    )


