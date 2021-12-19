package kaptenallocweb

case class KaptenAllocData(
    course: String,
    date: String,
    week: Option[String],
    day: String,
    time: String,
    `type`: String,
    group: String,
    room: String,
    supervisor: String)
