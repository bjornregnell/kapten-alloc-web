/*
  This is a version of https://github.com/bjornregnell/tabby
  in which Java dependencies (incompatible with ScalaJS)
  have been stripped out to make it work inside kapten-alloc-web
*/

package kaptenallocweb.tabby

object Grid:
  type Row = Vector[String]
  type Col = Vector[String]
  type Matrix = Vector[Row]
  type RowMap = Map[String, String]

  val defaultDelim = '\t'
  val defaultEnc = "UTF-8"
  val iso8859Enc = "ISO-8859-1"
  val defaultHeadingShowSep = '-'
  val defaultColShowSep = '|'

  extension (text: String)
    def stripQuotesIfNoDelim(delim: Char = defaultDelim): String =
      if text.size >= 2 && text.head == '"' && text.last == '"' && !text
          .contains(delim)
      then text.substring(1, text.length - 1)
      else text

    def splitUnquoted(delim: Char = defaultDelim): Vector[String] =
      var start = 0
      var isInsideQuotes = false
      var i = 0
      val result = scala.collection.mutable.ArrayBuffer.empty[String]
      while i < text.length do
        if text.charAt(i) == '"' then isInsideQuotes = !isInsideQuotes // toggle
        else if text.charAt(i) == delim && !isInsideQuotes then
          result += text.substring(start, i)
          start = i + 1
        i += 1
      result += text.substring(start) // add last
      result.map(_.stripQuotesIfNoDelim(delim)).toVector // remove unwanted ""

  def fromLines(lines: Vector[String], delim: Char = defaultDelim): Grid =
    val headings = lines(0).splitUnquoted(delim).toVector
    val data = lines
      .drop(1)
      .map(
        _.splitUnquoted(delim).toVector
          .take(headings.length)
          .padTo(headings.length, "")
      )
    Grid(headings, data)

  val empty: Grid = Grid(Vector(), Vector())

  def apply(headings: String*)(values: Any*): Grid =
    val n = headings.length
    val extra = values.length % n
    val missing = if extra == 0 then 0 else n - extra
    val strings = values.map(_.toString)
    val padded =
      if missing == 0 then strings
      else strings.padTo(strings.length + missing, "")
    val data = padded.map(_.toString).sliding(n, n).map(_.toVector)
    Grid(headings.toVector, data.toVector)

case class Grid(headings: Grid.Row, data: Grid.Matrix):
  import Grid._

  assert(
    headings == headings.distinct,
    s"headings contains duplicates: $headings"
  )
  assert(
    data.map(_.size).forall(_ == headings.size),
    s"all rows must match headings size"
  )

  lazy val dim = (data.size, headings.size)
  lazy val (nRows, nCols) = dim

  lazy val colIndex: Map[String, Int] = headings.zipWithIndex.toMap
  private def mkRowMap(row: Int): RowMap =
    headings.map(h => (h, apply(row)(h))).toMap
  lazy val rowMap: Vector[RowMap] = data.indices.toVector.map(mkRowMap)

  def apply(row: Int)(colName: String): String = data(row)(colIndex(colName))
  def apply(colName: String): Col = data.map(row => row(colIndex(colName)))
  def apply(row: Int, col: Int): String = data(row)(col)

  def get(row: Int)(colName: String): Option[String] =
    data.lift(row).flatMap(_.lift(colIndex(colName)))
  def get(colName: String): Option[Vector[String]] =
    scala.util.Try(apply(colName)).toOption
  def get(row: Int, col: Int): Option[String] =
    data.lift(row).flatMap(_.lift(col))

  def updated(row: Int, col: Int, newValue: String): Grid =
    copy(data = data.updated(row, data(row).updated(col, newValue)))

  def updated(row: Int, colName: String, newValue: String): Grid =
    updated(row, colIndex(colName), newValue)

  def isDistinct(colNames: String*): Boolean =
    colNames.forall { c =>
      val values = apply(c); values.distinct == values
    }

  def toNestedMap(keyColName: String)(
      valueColNames: String*
  ): Map[String, RowMap] =
    data.indices.map { r =>
      val key = apply(r)(keyColName)
      val mapOfValues: RowMap = {
        val values = valueColNames.map(c => apply(r)(c))
        valueColNames.zip(values).toMap
      }
      key -> mapOfValues
    }.toMap

  def filter(colName: String)(p: String => Boolean): Grid =
    copy(data = data.filter(row => p(row(colIndex(colName)))))

  def lookUp(colName: String)(rowValueInCol: String): Grid =
    filter(colName)(_ == rowValueInCol)

  def filterRow(p: RowMap => Boolean): Grid =
    copy(data =
      (for (i <- data.indices if p(rowMap(i))) yield data(i)).toVector
    )

  def sorted(colName: String = headings(0)): Grid =
    copy(data = data.sortBy(row => row.lift(colIndex(colName)).getOrElse("")))

  def sortBy[T: Ordering](f: Row => T): Grid = copy(data = data.sortBy(f))

  def updateCol(colName: String)(f: RowMap => String): Grid =
    Grid(
      headings,
      data.indices
        .map(r => data(r).updated(colIndex(colName), f(rowMap(r))))
        .toVector
    )

  def updateHeadings(f: String => String): Grid =
    copy(headings = headings.map(f))

  def updateValues(f: String => String): Grid =
    copy(data = data.map(xs => xs.map(f)))

  def mapRows[T](f: RowMap => T): Vector[T] =
    data.indices.map(r => f(rowMap(r))).toVector

  def mapHeadings[T](f: String => T): Vector[T] = headings.map(f).toVector

  def mapValues[T](f: String => T): Vector[Vector[T]] =
    data.map(xs => xs.map(f))

  def sumIntCol(colName: String): Int =
    apply(colName).map(_.toIntOption.getOrElse(0)).sum

  def sumDoubleCol(colName: String): Double =
    apply(colName).map(_.toDoubleOption.getOrElse(0.0)).sum

  def addCol(colName: String)(f: RowMap => String): Grid =
    Grid(
      headings :+ colName,
      data.indices.map(i => data(i) :+ f(rowMap(i))).toVector
    )

  def addCol(colName: String, col: Col): Grid =
    Grid(headings :+ colName, data.indices.map(i => data(i) :+ col(i)).toVector)

  def addEmptyCols(colNames: String*): Grid =
    Grid(
      headings ++ colNames,
      data.indices.map(i => data(i) ++ Vector.fill(colNames.size)("")).toVector
    )

  def keep(colNames: String*): Grid = {
    val heads = colNames.toVector
    Grid(heads, data.indices.map(i => heads.map(c => apply(i)(c))).toVector)
  }

  def skip(colNames: String*): Grid = {
    val heads = headings diff colNames
    Grid(heads, data.indices.map(i => heads.map(c => apply(i)(c))).toVector)
  }

  def join(colNameInThis: String, colNameInThat: String)(that: Grid): Grid = {
    val extraHeadings = (that.headings diff Seq(colNameInThat)) diff headings
    val thatMap = that.toNestedMap(colNameInThat)(extraHeadings*)
    var result = this
    extraHeadings.foreach { colName =>
      result = result.addCol(colName) { rm =>
        val key = rm(colNameInThis)
        thatMap(key)(colName)
      }
    }
    result
  }

  def appendIntersecting(that: Grid): Grid =
    val common = headings intersect that.headings
    Grid(
      headings = common,
      data = keep(common*).data ++ that.keep(common*).data
    )

  def find(p: RowMap => Boolean): Option[RowMap] =
    data.indices.map(rowMap).find(p)
  def indexOf(p: RowMap => Boolean): Int = data.indices.map(rowMap).indexOf(p)
  def count(p: RowMap => Boolean): Int = data.indices.map(rowMap).count(p)

  def rename(colNamePairs: (String, String)*): Grid =
    val renameMap = colNamePairs.toMap
    copy(headings = headings.map(h => renameMap.getOrElse(h, h)))

  def values: Map[String, Col] = headings.map(h => (h, apply(h).distinct)).toMap

  def replaceBy(colName: String)(f: String => String): Grid =
    val i = colIndex(colName)
    copy(data = data.map(r => r.updated(i, f(r(i)))))

  def trim: Grid = copy(headings.map(_.trim), data.map(r => r.map(_.trim)))

  // TODO: IS THIS REALLY NEEDED WHEN ASSERTED THAT EQUAL COL LENGTHS ???
  lazy val maxLengths: Vector[Int] =
    headings.map(h => (apply(h).map(_.size) :+ h.size).max)

  lazy val maxLengthOf: Map[String, Int] = (headings zip maxLengths).toMap

  lazy val showHeadings: String =
    headings.map(h => h + (" " * (maxLengthOf(h) - h.size))).mkString("|")

  lazy val hline: String =
    (defaultHeadingShowSep.toString * showHeadings.size) + "\n"

  def padToMax(row: Int, pad: String = " ")(colName: String): String =
    apply(row)(colName) + (pad * (maxLengthOf(colName) - apply(row)(
      colName
    ).size))

  lazy val showData: String =
    data.indices
      .map(r =>
        headings.map(h => padToMax(r)(h)).mkString(defaultColShowSep.toString)
      )
      .toVector
      .mkString("\n")

  lazy val show: String =
    s"$hline$showHeadings\n$hline$showData" // \n$hline  dim = (nRows, nCols) = ($nRows, $nCols)"

  /** Pretty-printing suitable for use in REPL. * */
  def pp: Unit = println(show)

  /** Trimmed pretty-printing suitable for use in REPL. * */
  def pp(maxWidth: Int): Unit =
    println(show.split('\n').map(_.take(maxWidth)).mkString("\n"))

  def toText(delim: Char = defaultDelim): String =
    headings.mkString("", delim.toString, "\n") +
      data.map(_.mkString("", delim.toString, "\n")).mkString
