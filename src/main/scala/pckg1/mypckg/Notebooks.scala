package pckg1.mypckg

abstract class Notebook (
  val brand: String,
  val model: String
)

object Notebooks {
  object Vaio extends Notebook("Sony", "Vaio")
  object ZBook extends Notebook("HP", "zBook")
  object Apple extends Notebook("Apple", "MacBook Pro")
}