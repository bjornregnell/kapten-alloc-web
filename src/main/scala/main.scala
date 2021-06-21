package webapp
import org.scalajs.dom
import org.scalajs.dom.document
import scala.scalajs.js.annotation.JSExportTopLevel

object Main {

  def appendPar(targetNode: dom.Node, text: String) = {
    val parNode = document.createElement("p")
    parNode.textContent = text
    targetNode.appendChild(parNode)
    parNode
  }

  @JSExportTopLevel("addClickedMessage")
  def appendMessage(msg: String): Unit = {
    appendPar(document.body, msg)
  }

  def main(args: Array[String]): Unit = {
    println("Kapten Alloc finns i konsollen!")
    document.addEventListener("DOMContentLoaded", { (e: dom.Event) =>
      setupUI()
    })  
  }

  def setupUI(): Unit = {
    //val button = document.createElement("button").asInstanceOf[dom.html.Button]
    val input = document.createElement("input").asInstanceOf[dom.html.Input]
    val showText = document.createElement("p")
    showText.textContent = "Landkrabbor"

    // button.textContent = "Klicka på mig!"
    // button.addEventListener("click", { (e: dom.MouseEvent) =>
      //   appendMessage("clicked, input.value=" + input.value)
      // })
      // document.body.appendChild(button)
      
    appendPar(document.body, "Kapten Alloc visar (snart) ditt schema!")
    val filterText = appendPar(document.body, "Filter: ")

    input.id = "myInput"
    input.classList.add("input"); 
    input.setAttribute("value", "")
    // input.addEventListener("input", { (e: dom.Event) =>
    //   appendMessage(s"On input $e input.value=${input.value}  default=${input.getAttribute("value")}")
    // })
    input.addEventListener("change", { (e: dom.Event) =>
      //appendMessage(s"On change $e input.value=${input.value}  default=${input.getAttribute("value")}")
      showText.textContent = input.value
    })
    filterText.appendChild(input)
    //document.body.appendChild(input)
    document.body.appendChild(showText)
  }
}
