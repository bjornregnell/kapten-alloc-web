package kaptenallocweb.ics

trait VObject() extends BaseObject:
  val name = "V" + base_name
  
  /** Builds String out of contents in VObject in ICS format */
  protected def contents(): String

  def toICS(): String =
    s"""BEGIN:$name
    |${contents()}
    |END:$name""".stripMargin
