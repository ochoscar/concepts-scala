package structuresControlLoop

object DemoWhileLoop {
  def main(args: Array[String]): Unit = {
    // Local variable declaration:
    var a = 10;

    // while loop execution
    while( a < 20 ){
      println( "Value of a: " + a );
      a = a + 1;
    }
  }
}
