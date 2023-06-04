package singleton

class Point(val xc: Int, val xy: Int) {

  var x: Int = xc;
  var y: Int = xy;

  def move(dx: Int, dy: Int): Unit = {
    x = x + dx;
    y = y + dy;
    println("Point x location: " + x)
    println("Point y location: " + y)
  }

}

object Demo {

  def main(args : Array[String]) : Unit = {
    val pt = new Point(10, 20)
    pt.move(3, 2)

    def printPoint: Unit = {
      val loc = new Point(10, 20)
      loc.move(3, 2)
    }
  }

}