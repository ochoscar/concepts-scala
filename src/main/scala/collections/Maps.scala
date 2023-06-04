package collections

object Maps {

  def main(args: Array[String]): Unit = {
    // Empty hash table whose keys are strings and values are integers:
    var A: Map[Char, Int] = Map()

    A += ('I' -> 1)
    A += ('J' -> 5)
    A += ('K' -> 10)
    A += ('L' -> 100)

    val colors = Map("red" -> "#FF0000", "azure" -> "#F0FFFF", "peru" -> "#CD853F")

    val nums: Map[Int, Int] = Map()

    println("Keys in colors : " + colors.keys)
    println("Values in colors : " + colors.values)
    println("Check if colors is empty : " + colors.isEmpty)
    println("Check if nums is empty : " + nums.isEmpty)


    val colors1 = Map("red" -> "#FF0000", "azure" -> "#F0FFFF", "peru" -> "#CD853F")
    val colors2 = Map("blue" -> "#0033FF", "yellow" -> "#FFFF00", "red" -> "#FF0000")

    // use two or more Maps with ++ as operator
    var colors0 = colors1 ++ colors2
    println("colors1 ++ colors2 : " + colors)

    // use two maps with ++ as method
    var colors10 = colors1.++(colors2)
    println("colors1.++(colors2)) : " + colors)



    
    colors.keys.foreach { i =>
      print("Key = " + i)
      println(" Value = " + colors(i))
    }

    if (colors.contains("red")) {
      println("Red key exists with value :" + colors("red"))
    } else {
      println("Red key does not exist")
    }

    if (colors.contains("maroon")) {
      println("Maroon key exists with value :" + colors("maroon"))
    } else {
      println("Maroon key does not exist")
    }

  }

}
