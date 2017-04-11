package pckg

import java.util.regex

object PackageAndImports extends App {
  println("Lets learn about package and imports here" ) 
  
  import pckg1.mypckg.Fruits.Apple
  
  println("Fruit apple name: " + Apple.name)
  
  
  //import AS macbook and the rest as is
  import pckg1.mypckg.Notebooks.{Apple => MacBook, _}
  
  //Hides Pear but imports the rest as is
  import pckg1.mypckg.Fruits.{Pear => _, _}
  
  println("Fruit apple name: " + MacBook.brand +" " + MacBook.model)
  
  
  //Lets import inner class 
  new pckg1.mypckg.inner.InnerClass
  new pckg1.mypckg.inner.tests.InnerClassTest
  
  
  val pat = regex.Pattern.compile("a*b")
  println( pat.matcher("acdekdb").find() )
  println( pat.matcher("acdekd").find() )
  
  import java.sql.{Date => SDate } 
  
  println(new SDate(1234567890L))
  
  printMe("package" )
  
}