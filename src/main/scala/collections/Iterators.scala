package collections

object Iterators {

  def main(args: Array[String]): Unit = {
    val it = Iterator("a", "number", "of", "words")
    val ita = Iterator(20,40,2,50,69, 90)
    val itb = Iterator(20,40,2,50,69, 90)

    println("Maximum valued element " + it.max)
    //println("Minimum valued element " + it.min)
    println("Value of ita.size : " + itb.size)
    println("Value of itb.length : " + itb.length)


    while (ita.hasNext) {
      println(ita.next())
    }
  }


}
