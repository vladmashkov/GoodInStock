import scala.io.Source
object Main extends App {
  val residue = Source.fromFile("stock.txt").getLines().map(x => x.toInt).sum
  println(residue)
}