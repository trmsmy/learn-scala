import java.io.File
object grep extends App {

  val files = new File(".").listFiles

  def getLines(file: File) =
    scala.io.Source.fromFile(file).getLines().toList

  for {
    file <- files
    if file.isFile()
    if file.getName.endsWith(".scala")
    line <- getLines(file)
    trimed = line.trim
    if trimed.contains("gcd")
  } println(file + ": " + trimed)

}