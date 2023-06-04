package collections

object Sets {

  def main(args: Array[String]): Unit = {
    // Empty set of integer type
    var s1: Set[Int] = Set()

    // Set of integer type
    var s2: Set[Int] = Set(1, 3, 5, 7)
    var s3 = Set(1, 3, 5, 7)





    val fruit = Set("apples", "oranges", "pears")
    val nums: Set[Int] = Set()

    println("Head of fruit : " + fruit.head)
    println("Tail of fruit : " + fruit.tail)
    println("Check if fruit is empty : " + fruit.isEmpty)
    println("Check if nums is empty : " + nums.isEmpty)


    val fruit1 = Set("apples", "oranges", "pears")
    val fruit2 = Set("mangoes", "banana")

    // use two or more sets with ++ as operator
    var fruit3 = fruit1 ++ fruit2
    println("fruit1 ++ fruit2 : " + fruit3)

    // use two sets with ++ as method
    var fruit4 = fruit1.++(fruit2)
    println("fruit1.++(fruit2) : " + fruit4)


    val num = Set(5, 6, 9, 20, 30, 45)

    // find min and max of the elements
    println("Min element in Set(5,6,9,20,30,45) : " + num.min)
    println("Max element in Set(5,6,9,20,30,45) : " + num.max)


    val num1 = Set(5, 6, 9, 20, 30, 45)
    val num2 = Set(50, 60, 9, 20, 35, 55)

    // find common elements between two sets
    println("num1.&(num2) : " + num1.&(num2))
    println("num1.intersect(num2) : " + num1.intersect(num2))

  }

}
