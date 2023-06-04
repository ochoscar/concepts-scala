object HelloWorld {

  /**
   * This is my first project in Scala
   */

  def main(args: Array[String]): Unit = {
    var nombre : String = "Oscar" // Declaracion de variable
    var segundoNombre = "Andres" // Declaracion con inferencia de tipo
    val tipoId = "CC" // Constante
    val (tipoId1: Int, numeroId: String) = (1, "CC") // Declaracion multiple

    println("Hello World");

    print("Please enter your input : ")
    val line = Console.in.readLine()

    println("Thanks, you just typed: " + line)
  }

}
