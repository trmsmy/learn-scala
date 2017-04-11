package pckg1.mypckg

abstract class Fruit (
  val name: String
)

object Fruits {
  
  object Apple extends Fruit("Apple")
  object Orange extends Fruit("Orange")
  object Pear extends Fruit("Pear")
  
}