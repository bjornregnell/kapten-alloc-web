package kaptenallocweb.ics

case class Event() extends VObject():
  var properties: Vector[Property] = Vector()

  def addProperty(property: Property*): Unit =
    properties = properties ++ property

  override def toString(): String =
    s"""BEGIN:$name
    |${ properties.map(_.toString()).mkString("\n") }
    |END:$name""".stripMargin
