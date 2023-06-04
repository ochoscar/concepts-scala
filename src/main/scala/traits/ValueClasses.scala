package traits

trait Printable extends Any {
  def print(): Unit = println(this)
}

// El constructor solo puede tener un parametro val
class Wrapper(val underlying: Int) extends AnyVal with Printable

object ValueClasses {
  def main(args: Array[String]) : Unit = {
    val w = new Wrapper(3)
    w.print() // actually requires instantiating a Wrapper instance
  }
}
