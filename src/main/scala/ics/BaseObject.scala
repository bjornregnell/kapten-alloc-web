package kaptenallocweb.ics

trait BaseObject:
  // With Scala.js sometimes '.' is used and sometimes Scala's '$'. Checks both to be sure
  protected val base_name: String = this.getClass.getName.toUpperCase.split("\\.").last.split("\\$").last
  val name: String

  /** Builds String out of VObject in ICS format */
  def toICS(): String

  override def hashCode = name.toUpperCase.hashCode

