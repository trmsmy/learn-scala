/*
  def printArgs(args: Array[String]): Unit = {
    var i = 0
    while (i < args.length) {
      println(args(i))
      i += 1
    }
  }

*/


  def mkstr(args: Array[String]): String = args.mkString("\n")

  
  println(mkstr(args))
