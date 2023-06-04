package collections

object Tuples {

  def main(args: Array[String]): Unit = {
    val t1 = (1, "hello", Console)
    val t2 = new Tuple3(1, "hello", Console)
    val t3 = (4,3,2,1)

    val sum = t3._1 + t3._2 + t3._3 + t3._4
    println( "Sum of elements: "  + sum )
    t3.productIterator.foreach{ i =>println("Value = " + i )}

    println("Concatenated String: " + t1.toString() )

    val t4 = new Tuple2("Scala", "hello")

    println("Swapped Tuple: " + t4.swap)
  }

}
