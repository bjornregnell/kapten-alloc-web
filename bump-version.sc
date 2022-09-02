//>using scala "3.1.3"

val file = if args.length == 0 then "index.html" else args(0)
println(s"Bumping version in $file")


extension (s: String) 
  def loadLines(enc: String = "UTF-8"): Vector[String] =
    var result = Vector.empty[String]
    val source = scala.io.Source.fromFile(s, enc)
    try result = source.getLines().toVector finally source.close()
    result

  def incrementVersion =
    val key = "version="
    val i = s.indexOf(key) 
    if i < 0 then s 
    else 
      val start = i + key.length
      val n = s.drop(start).takeWhile(_.isDigit).toIntOption.getOrElse(0)
      val current = n.toString
      val next = (n + 1).toString
      println(s"changing from $key$current to $key$next")
      s.patch(start, next, current.length)

  def saveIn(fileName: String, enc: String = "UTF-8"): Unit = 
    val f = java.io.File(fileName)
    val pw = java.io.PrintWriter(f, enc)
    try pw.write(s) finally pw.close()    


val lines = file.loadLines()

val updated = lines.map(_.incrementVersion).mkString("\n")

updated.saveIn(file)


