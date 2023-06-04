package functions

object Invocation {

  def main(args: Array[String]): Unit = {
    var i = plus(5, 2);
    println(i)
  }

  def plus(i1 : Int, i2 : Int) : Int = {
    i1 +  i2
  }

}
