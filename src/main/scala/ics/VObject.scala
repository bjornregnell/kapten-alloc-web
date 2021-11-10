package kaptenallocweb.ics

abstract class VObject():
  lazy val name = "V" + this.getClass.getName.toUpperCase.split("\\.").last
