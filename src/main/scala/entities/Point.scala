package entities

class Point(val xc: Int, val xy: Int) {

  var x: Int = xc;
  var y: Int = xy;

  def move(dx: Int, dy: Int): Unit = {
    x = x + dx;
    y = y + dy;
    println("Point x location: " + x)
    println("Point y location: " + y)
  }

  println("Llamado a metodo dentro de clase")

}

class Location(override val xc : Int, override val xy : Int, val zc : Int)
extends Point(xc, xy) {

  var z : Int = zc;

  def move(dx : Int, dy : Int, dz : Int ) : Unit = {
    x = x + dx;
    y = y + dy;
    z = z + dz;
    println("Point x location: " + x)
    println("Point y location: " + y)
    println("Point z location: " + z)
  }

}

object Demo {

  def main(args : Array[String]) : Unit = {
    var pt = new Point(10, 20)
    pt.move(3, 2)

    pt.x = 25;
    pt.move(3, 2)

    var loc = new Location(10, 20, 30)
    loc.move(3, 2, 1)
  }

}