package functions

object Add {

  def addInt(a: Int, b: Int): Int = {
    var sum: Int = 0
    sum = a + b
    return sum
  }

  def main(args: Array[String]): Unit = {
    println(addInt(5, 3))
  }

}
