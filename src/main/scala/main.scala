package webapp
import org.scalajs.dom
import org.scalajs.dom.document
import scala.scalajs.js.annotation.JSExportTopLevel


val testRows: Seq[String] = """
-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
kurs|datum     |start|typ      |lokal                                                                   |grupp                                                                       
-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
pgk |2021-09-01|10:00|Resurstid|E:Falk, E:Gamma, E:Hacke, E:Panter, E:Varg                              |D1.01, D1.02, D1.03, D1.04, TFRD48.01                                       
pgk |2021-09-01|13:00|Resurstid|E:Falk, E:Gamma, E:Hacke, E:Panter, E:Val                               |D1.09, D1.10, D1.11, TFRD48.02, W3.a                                        
pgk |2021-09-01|15:00|Resurstid|E:Gamma, E:Hacke, E:Jupiter, E:Mars, E:Panter                           |D1.05, D1.06, D1.07, D1.08, W3.b                                            
pgk |2021-09-02|08:00|Resurstid|E:Falk, E:Jupiter, E:Val                                                |C1.04, C1.05, C1.06                                                         
pgk |2021-09-02|10:00|Resurstid|E:Falk, E:Hacke, E:Panter                                               |D1.12, D1.13, D1.14                                                         
dod |2021-09-02|13:00|Datorlabb|E:Beta, E:Falk, E:Gamma, E:Hacke, E:Panter, E:Varg                      |C1.01, C1.02, C1.03, D1.08, D1.09, D1.10                                    
pgk |2021-09-02|15:00|Resurstid|E:Beta, E:Gamma, E:Venus                                                |C1.01, C1.02, C1.03                                                         
dod |2021-09-02|15:00|Datorlabb|E:Falk, E:Hacke, E:Mars, E:Panter, E:Val, E:Varg                        |C1.04, D1.01, D1.02, D1.03, C1.05, C1.06                                    
pgk |2021-09-03|10:00|Labb     |E:Elg, E:Falk, E:Gamma, E:Hacke, E:Jupiter, E:Mars, E:Panter, E:Val     |C1.03, C1.04, D1.11, D1.12, D1.13, D1.14, TFRD48.01, TFRD48.02              
pgk |2021-09-03|13:00|Labb     |E:Elg, E:Falk, E:Gamma, E:Hacke, E:Jupiter, E:Mars, E:Panter, E:Venus   |C1.01, C1.02, D1.01, D1.02, D1.03, D1.04, D1.05, W3.a                       
pgk |2021-09-03|15:00|Labb     |E:Alfa, E:Beta, E:Gamma, E:Hacke, E:Jupiter, E:Mars, E:Panter, E:Val    |D1.06, D1.07, D1.08, D1.09, D1.10, C1.05, C1.06, W3.b     
""".trim.split('\n').toSeq

extension (rows: Seq[String])
  def filterRows(words: String*) = 
    val init = s"filtrera med $words:\n"
    var result = testRows
    for w <- words do 
      result = result.filter(r => r.startsWith("-") || r.startsWith("kurs") || r.contains(w))
    init + result.mkString("\n")

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
    //val button = document.createElement("button").asInstanceOf[dom.html.Button]
    val input = document.createElement("input").asInstanceOf[dom.html.Input]
    val showText = document.createElement("pre")
    showText.textContent = testRows.mkString("\n")

    // button.textContent = "Klicka på mig!"
    // button.addEventListener("click", { (e: dom.MouseEvent) =>
      //   appendMessage("clicked, input.value=" + input.value)
      // })
      // document.body.appendChild(button)
      
    //appendPar(document.body, "Kapten Alloc visar (snart) ditt schema!")
    val filterText = appendPar(document.body, "Filter: ")

    input.id = "myInput"
    input.classList.add("input"); 
    input.setAttribute("value", "")
    // input.addEventListener("input", { (e: dom.Event) =>
    //   appendMessage(s"On input $e input.value=${input.value}  default=${input.getAttribute("value")}")
    // })
    input.addEventListener("change", { (e: dom.Event) =>
      //appendMessage(s"On change $e input.value=${input.value}  default=${input.getAttribute("value")}")
      showText.textContent = testRows.filterRows(input.value.split(' ')*)
      //input.value = ""
    })
    filterText.appendChild(input)
    //document.body.appendChild(input)
    document.body.appendChild(showText)
