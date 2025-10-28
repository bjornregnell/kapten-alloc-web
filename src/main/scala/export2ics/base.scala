package kaptenallocweb.export2ics

trait BaseObject:
  // With Scala.js sometimes '.' is used and sometimes Scala's '$'. Checks both to be sure
  protected val base_name: String = this.getClass.getName.toUpperCase.split("\\.").last.split("\\$").last
  val name: String

  /** Builds String out of VObject in ICS format */
  def toICS(): String

  override def hashCode = name.toUpperCase.hashCode
end BaseObject

trait VObject() extends BaseObject:
  val name = "V" + base_name
  
  /** Builds String out of contents in VObject in ICS format */
  protected def contents(): String

  def toICS(): String =
    s"""BEGIN:$name
    |${contents()}
    |END:$name""".stripMargin
end VObject

abstract class Parameter(val value: String) extends BaseObject: 
  val name = base_name.replace("PARAM", "")
  def toICS(): String =
    s"${name}=$value"
object Parameter:
  case class TzIDParam(tzid: String) extends Parameter(tzid)
end Parameter

case class Event() extends VObject():
  private var properties: Set[Property] = Set()

  /** 
   * Adds a new property, but only one one of each class. If a new instance of an existing class is added, it will replace the old instance
   */
  def addProperty(property: Property*): Unit =
    properties = properties ++ property

  def contents(): String = 
    s"${ properties.map(_.toICS()).mkString("\n") }"
end Event