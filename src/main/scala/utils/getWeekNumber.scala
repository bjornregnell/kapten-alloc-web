package kaptenallocweb.utils

import java.time.LocalDate
import java.time.temporal.WeekFields

/** Takes date in format YYYY-MM-DD */
def getWeekNumber(date: String): Int =
  val values = date.split("-").map(_.toInt)
  // Get week number using the ISO-8601 definition, where a week starts on Monday and the first week has a minimum of 4 days
  val week = LocalDate.of(values(0), values(1), values(2)).get(WeekFields.ISO.weekOfYear)
  if week == 0 then
    LocalDate.of(values(0) - 1, 12, 31).get(WeekFields.ISO.weekOfYear)
  else
    week