package kaptenallocweb.ics

case class Event() extends VObject():
  
  private var properties: Set[Property] = Set()

  /** 
   * Adds a new property, but only one one of each class. If a new instance of an existing class is added, it will replace the old instance
   */
  def addProperty(property: Property*): Unit =
    properties = properties ++ property

  def contents(): String = 
    s"${ properties.map(_.toICS()).mkString("\n") }"
