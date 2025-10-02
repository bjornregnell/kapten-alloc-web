package kaptenallocweb

import java.time.LocalDate
import java.time.format.DateTimeFormatter

case class KaptenAllocData(
    course: String,
    date: String,
    week: String,
    day: String,
    time: String,
    entryType: String,
    group: String,
    room: String,
    supervisor: String
)

extension (s: String)
  def containsAll(xs: Array[String], isCaseSensitive: Boolean = true): Boolean =
    val xs2 = if isCaseSensitive then xs else xs.map(_.toLowerCase)
    val s2 = if isCaseSensitive then s else s.toLowerCase
    xs2.forall(x => s2.contains(x))

val MagicRegisterPaymentWord = "lön"

extension (rows: Seq[KaptenAllocData])
  def filterRows(words: Array[String]): Seq[KaptenAllocData] =
    if words.lift(0) != Some(MagicRegisterPaymentWord) then
      rows.filter(entry => {
        val searchString = s"${entry.course}|${entry.date}|${entry.day}|${entry.time}|${entry.entryType}|${entry.group}|${entry.room}|${entry.supervisor}"
        searchString.containsAll(words)
      })
    else
      val paymentRows = rows.groupBy(_.supervisor).toSeq.sortBy(_._1).map(_._2).flatten
      def timeToPeriod(hrs: String): String =
        val start = hrs.take(2)
        val end = start.toIntOption.map(_ + 2).getOrElse("??")
        s"$start-$end"

      paymentRows.filter(entry => {
        val searchString = s"${entry.supervisor};${entry.course};${entry.date};${timeToPeriod(entry.time)}"
        searchString.containsAll(words.drop(1))
      })

  def akademiskKvart(isAkademiskKvart: Boolean): Seq[KaptenAllocData] =
    if isAkademiskKvart then rows
    else rows.map(entry => entry.copy(time = entry.time.replace(":15", ":00")))

  def filterOnlyToday(filterOnToday: Boolean): Seq[KaptenAllocData] =
    def todayString: String =
      val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd")
      LocalDate.now().format(formatter)

    if !filterOnToday then rows
    else rows.filter(entry => entry.date == todayString)
