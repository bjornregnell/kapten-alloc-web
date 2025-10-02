package kaptenallocweb.utils

import java.time.LocalDate

/** Takes date in format YYYY-MM-DD and returns Swedish 3-letter day abbreviation */
def getDayOfWeek(date: String): String =
  try {
    val parsedDate = LocalDate.parse(date)
    parsedDate.getDayOfWeek.toString.toLowerCase.capitalize match {
      case "Monday" => "mån"
      case "Tuesday" => "tis"
      case "Wednesday" => "ons"
      case "Thursday" => "tor"
      case "Friday" => "fre"
      case "Saturday" => "lör"
      case "Sunday" => "sön"
      case _ => "okänd"
    }
  } catch {
    case _: Exception => "okänd"
  }