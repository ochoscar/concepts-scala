package arrays

object Arrays {

  def main(args: Array[String]): Unit = {
    var z:Array[String] = new Array[String](3)
    var z2 = new Array[String](3)
    var z3 = Array("Zara", "Nuha", "Ayan")

    z(0) = "Zara"; z(1) = "Nuha"; z(4/2) = "Ayan"

    var myList1 = Array(1.9, 2.9, 3.4, 3.5)
    var myList2 = Array(8.9, 7.9, 0.4, 1.5)
    var myList3 = Array.concat(myList1, myList2)

    var myList4 = Array.range(10, 20, 2)
    var myList5 = Array.range(10, 20)


    var myList = Array(1.9, 2.9, 3.4, 3.5)

    // Print all the array elements
    for (x <- myList) {
      println(x)
    }

    // Summing all elements
    var total = 0.0;

    for (i <- 0 to (myList.length - 1)) {
      total += myList(i);
    }
    println("Total is " + total);

    // Finding the largest element
    var max = myList(0);

    for (i <- 1 to (myList.length - 1)) {
      if (myList(i) > max) max = myList(i);
    }

    println("Max is " + max);
  }

}
