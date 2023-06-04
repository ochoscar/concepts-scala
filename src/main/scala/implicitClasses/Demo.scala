package implicitClasses

import implicitClasses.Run.IntTimes

object Demo {

  def main(args : Array[String]): Unit = {
    println("implicito")
    4 times println("hello")
    IntTimes(4).times(println("hello2"))
  }

}
