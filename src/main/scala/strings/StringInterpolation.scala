package strings

object StringInterpolation {

  def main(args: Array[String]) : Unit = {
    val name = "James"

    println(s"Hello, $name")
    println(s"1 + 1 = ${1 + 1}")


    val height = 1.9d
    println(f"$name%s is $height%2.2f meters tall")

    println(raw"Result = \n a \n b")
  }

}
