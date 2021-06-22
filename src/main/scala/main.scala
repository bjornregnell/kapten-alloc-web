package kaptenallocweb

import org.scalajs.dom
import org.scalajs.dom.document

object Main:
  def main(args: Array[String]): Unit = 
    document.addEventListener("DOMContentLoaded", (e: dom.Event) => setupUI())  

extension (s: String)
  def containsAll(xs: Array[String], isCaseSensitive: Boolean = false): Boolean =
    val xs2 = if isCaseSensitive then xs else xs.map(_.toLowerCase)
    val s2 = if isCaseSensitive then s else s.toLowerCase
    xs2.forall(x => s2.contains(x))

extension (rows: Seq[String])
  def filterRows(words: Array[String]): Seq[String] = 
    for row <- rows 
    if row.containsAll(words) || row.startsWith("---") || row.startsWith("kurs")
    yield row

def appendPar(targetNode: dom.Node, text: String): dom.html.Paragraph = 
  val parNode = document.createElement("p").asInstanceOf[dom.html.Paragraph]
  parNode.textContent = text
  targetNode.appendChild(parNode)
  parNode

def setupUI(): Unit = 
  val input = document.createElement("input").asInstanceOf[dom.html.Input]
  val showText = document.createElement("pre").asInstanceOf[dom.html.Pre]
  showText.textContent = dataGeneratedFromKaptenAlloc.mkString("\n")
  val filterText = appendPar(document.body, "Filter: ")

  input.id = "myInput"
  input.classList.add("input"); 
  input.setAttribute("value", "")
  def words = input.value.split(' ')

  input.addEventListener("input", (e: dom.Event) =>
    showText.textContent = 
      dataGeneratedFromKaptenAlloc.filterRows(words).mkString("\n")
  )

  filterText.appendChild(input)
  document.body.appendChild(showText)
