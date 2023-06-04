package collections

object Lists {

  def main(args: Array[String]): Unit = {


    // List of Strings
    val fruit: List[String] = List("apples", "oranges", "pears")

    // List of Integers
    val nums: List[Int] = List(1, 2, 3, 4)

    // Empty List.
    val empty: List[Nothing] = List()

    // Two dimensional list
    val dim: List[List[Int]] =
      List(
        List(1, 0, 0),
        List(0, 1, 0),
        List(0, 0, 1)
      )

    // List of Strings
    val fruit2 = "apples" :: ("oranges" :: ("pears" :: Nil))

    // List of Integers
    val nums3 = 1 :: (2 :: (3 :: (4 :: Nil)))

    // Empty List.
    val empty4 = Nil

    // Two dimensional list
    val dim5 = (1 :: (0 :: (0 :: Nil))) ::
      (0 :: (1 :: (0 :: Nil))) ::
      (0 :: (0 :: (1 :: Nil))) :: Nil

    val fruit1 = List.fill(3)("apples")

    val squares = List.tabulate(6)(n => n * n)
    println("squares : " + squares)

    val mul = List.tabulate(4, 5)(_ * _)
    println("mul : " + mul)


    println("Head of fruit : " + fruit.head)
    println("Tail of fruit : " + fruit.tail)
    println("Check if fruit is empty : " + fruit.isEmpty)
    println("Check if nums is empty : " + nums.isEmpty)

    var fruit0 = fruit1 ::: fruit2
    println("fruit1 ::: fruit2 : " + fruit)

    println( "After reverse fruit : " + fruit.reverse )
  }


}
