object Yield extends App {

  println(for {
    i <- 1 to 50
    if i % 2 == 0
  } yield i)

  val list = List(1,2,3,4,5)
  
  println((for {
    i <- list
  } yield "item " + i).map(_.toUpperCase()))

}