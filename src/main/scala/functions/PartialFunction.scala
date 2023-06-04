package functions

import java.util.Date

object PartialFunction {

  /*def main(args: Array[String]) : Unit = {
    val date = new Date()
    log(date, "message1")

    Thread.sleep(1000)
    log(date, "message2")

    Thread.sleep(1000)
    log(date, "message3")
  }

  def log(date: Date, message: String) = {
    println(date.toString + "----" + message)
  }*/


  def main(args: Array[String]) : Unit = {
    val date = new Date
    val logWithDateBound = log(date, _: String)

    logWithDateBound("message1")
    Thread.sleep(1000)

    logWithDateBound("message2")
    Thread.sleep(1000)

    logWithDateBound("message3")
  }

  def log(date: Date, message: String) = {
    println(date.toString + "----" + message)
  }

}
