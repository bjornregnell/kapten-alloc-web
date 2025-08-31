package kaptenallocweb

import org.scalajs.dom

case class NormalizedEntry(
    datum: String,
    del: String,
    typ: String,
    grupp: String,
    rum: String,
    start: String
)

object DiscrepancyChecker:

  def getDiscrepantRowIndices(
      timeEditGrid: Grid,
      kaptenAllocGrid: Grid
  ): Set[Int] =
    dom.console.log(timeEditGrid.showHeadings)
    dom.console.log(kaptenAllocGrid.showHeadings)
    dom.console.log(kaptenAllocGrid(0)("datum"))
    Set()
