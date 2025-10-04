package kaptenallocweb.utils

import org.scalajs.dom
import org.scalajs.dom.document

// TODO: Give name to file based on if room, group or any field always are the same
/** Creates an ICS file with given content and presents it as a download to the user */
def downloadIcs(content: String, fileName: String = "handledartider.ics"): Unit =
  val file = new dom.Blob(scala.scalajs.js.Array(content), new dom.BlobPropertyBag { `type` = "text/calendar" })
  val a = document.createElement("a").asInstanceOf[dom.html.Anchor]
  val url = dom.URL.createObjectURL(file)
  a.setAttribute("download", fileName)
  a.href = url
  a.click()
  a.remove()