package kaptenallocweb

case class Date(year: Int, month: Int, dayOfMonth: Int = 1)
    extends Ordered[Date]:

  def compare(that: Date): Int =
    import math.Ordered.orderingToOrdered
    (year, month, dayOfMonth) compare (that.year, that.month, that.dayOfMonth)

  lazy val shortDate = s"$dayOfMonth/$month"
  lazy val longDate = f"$year%04d-$month%02d-$dayOfMonth%02d"
  def show = longDate

  lazy val monthName: String = Date.monthName(month - 1)

object Date:

  def apply(s: String): Date =
    val xs = s.split('-')
    require(
      xs.length == 3 && xs(0).length == 4 &&
        xs.map(_.toIntOption).forall(_.isDefined),
      s"Illegal date YYYY-MM-DD: $s"
    )
    new Date(xs(0).toInt, xs(1).toInt, xs(2).toInt)

  val dayOfWeekNumberToName: Map[Int, String] = Map(
    1 -> "sön",
    2 -> "mån",
    3 -> "tis",
    4 -> "ons",
    5 -> "tor",
    6 -> "fre",
    7 -> "lör"
  )
  val weekDays: Map[String, Int] = Map(
    "mån" -> 0,
    "tis" -> 1,
    "ons" -> 2,
    "tor" -> 3,
    "fre" -> 4
  )
  val monthName = Vector(
    "jan",
    "feb",
    "mar",
    "apr",
    "maj",
    "jun",
    "jul",
    "aug",
    "sep",
    "okt",
    "nov",
    "dec"
  )
