package files

import java.io.{File, PrintWriter}

object Write {

  def main(args: Array[String]): Unit = {
    val writer = new PrintWriter(new File("test.txt"))

    writer.write("Hello Scala")
    writer.close()
  }

}
