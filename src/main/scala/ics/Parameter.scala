package kaptenallocweb.ics

abstract class Parameter(val value: String) extends BaseObject: 
  val name = base_name.replace("PARAM", "")

  def build(): String =
    s"${name}=$value"

object Parameter:
  case class TzIDParam(tzid: String) extends Parameter(tzid)
