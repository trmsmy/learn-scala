import java.io.IOException
import java.io.FileReader
import java.io.FileNotFoundException
object ExceptionHandling extends App {

  args.foreach(file => { println("reading file " + file) })

    try {
      require(!args(0).isEmpty)
      println(new java.io.FileReader(args(0)))
      println("succcedddd")
    } catch {
      case ex: IOException =>  println(ex.getMessage)
      case e : Throwable => e.printStackTrace 
    }

}