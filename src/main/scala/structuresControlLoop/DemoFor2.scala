package structuresControlLoop

object DemoFor2 {

  def main(args: Array[String]) : Unit = {
    var a = 0;

    // for loop execution with a range
    for (a <- 1 until 10) {
      println("Value of a: " + a);
    }
  }

}
