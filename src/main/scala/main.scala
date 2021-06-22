package kaptenallocweb

import org.scalajs.dom
import org.scalajs.dom.document
import scala.scalajs.js.annotation.JSExportTopLevel


extension (s: String)
  def containsAll(xs: Array[String], isCaseSensitive: Boolean = false): Boolean =
    val xs2 = if isCaseSensitive then xs else xs.map(_.toLowerCase)
    val s2 = if isCaseSensitive then s else s.toLowerCase
    xs2.forall(x => s2.contains(x))

  def containsAtLeastOne(xs: Array[String], isCaseSensitive: Boolean = false): Boolean = 
    val xs2 = if isCaseSensitive then xs else xs.map(_.toLowerCase)
    val s2 = if isCaseSensitive then s else s.toLowerCase
    xs2.exists(x => s2.contains(x))

extension (rows: Seq[String])
  def filterRows(words: Array[String]): Seq[String] = 
    for row <- rows 
    if row.containsAll(words) || row.startsWith("---") || row.startsWith("kurs")
    yield row

object Main:
  def appendPar(targetNode: dom.Node, text: String) = 
    val parNode = document.createElement("p")
    parNode.textContent = text
    targetNode.appendChild(parNode)
    parNode

  @JSExportTopLevel("appendMessage")
  def appendMessage(msg: String): Unit = appendPar(document.body, msg)

  def main(args: Array[String]): Unit = 
    println("Kapten Alloc finns i konsollen!")
    document.addEventListener("DOMContentLoaded", { (e: dom.Event) =>
      setupUI()
    })  

  def setupUI(): Unit = 
    val input = document.createElement("input").asInstanceOf[dom.html.Input]
    val showText = document.createElement("pre")
    showText.textContent = dataGeneratedFromKaptenAlloc.mkString("\n")
    val filterText = appendPar(document.body, "Filter: ")

    input.id = "myInput"
    input.classList.add("input"); 
    input.setAttribute("value", "")

    input.addEventListener("input", { (e: dom.Event) =>
      val words = input.value.split(' ')
      showText.textContent = 
        dataGeneratedFromKaptenAlloc.filterRows(words).mkString("\n")
    })

    filterText.appendChild(input)
    document.body.appendChild(showText)
