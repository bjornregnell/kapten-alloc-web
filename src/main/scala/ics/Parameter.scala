package kaptenallocweb.ics

abstract class Parameter(val value: String): 
  var parameters: Vector[Parameter] = Vector()
  // With Scala.js sometimes '.' is used and sometimes Scala's '$'
  lazy val name = this.getClass.getName.toUpperCase.split("\\$").last.replace("PARAM", "")

  override def toString(): String =
    s"${name}=$value"

object Parameter:
  case class TzIDParam(tzid: String) extends Parameter(tzid)
