import scala.io.Source

object sodokuSolve {

  def main(args: Array[String]) = {

    if (args.length == 0) {
        println("Need the name of the puzzle file to solve.")
    } else {
      val filename = args(0)
      for (line <- Source.fromFile(filename).getLines) {
          println(line)
      }
    }
  }
}