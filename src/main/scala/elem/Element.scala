package elem

import Element.elem

abstract class Element {
  def contents: Array[String]
  def height = contents.length
  def width = if (height == 0) 0 else contents(0).length
  def temp_method() = "paranthesis method"

  def above(that: Element) = new ArrayElement(this.contents ++ that.contents)

  def beside_old(that: Element) = {
    val contents = new Array[String](this.contents.length)

    for (i <- 0 until this.contents.length)
      contents(i) = this.contents(i) + that.contents(i)

    new ArrayElement(contents)

  }

  def beside(that: Element) = {
    //val contents = new Array[String](this.contents.length)
    elem(
      for ((l, r) <- this.contents zip that.contents)
        yield l + r)
  }

  def widen(w: Int): Element = {
    if (w <= width) this
    else {
      val left = elem(' ', (w - width) / 2, height)
      val right = elem(' ', w - width - left.width, height)
      left beside this beside right
    }
  }

  def heighten(h: Int): Element = {
    if (h <= height) this
    else {
      val top = elem(' ', width, (h - height) / 2)
      val bottom = elem(' ', width, (h - height) - top.height)

      top above this above bottom
    }
  }

  override def toString = contents.mkString("\n")

  def demo() = {
    println("Element's implementation invoked")
  }

}

class ArrayElement(val contents: Array[String]) extends Element {
  override val temp_method = "array overrides Element.temp_method()"

  override def demo() = {
    println("ArrayElement's implementation invoked")
  }

}

class LineElement(l: String) extends ArrayElement(Array(l)) {

}

class LineElement2(l: String) extends Element {
  override val contents = Array(l)
  override val height = 1
  override val width = l.length
}

class UniformElement(val c: Char, override val width: Int, override val height: Int) extends Element {
  private val line = c.toString * width;
  def contents = Array.fill(height)(line)
}

object Element {

  def elem(contents: Array[String]): Element = new ArrayElement(contents)

  def elem(s: Char, w: Int, h: Int): Element = new UniformElement(s, w, h)

  def elem(l: String): Element = new LineElement2(l)

}

object Main extends App {

  import Element.elem

  val a1 = new ArrayElement(Array("keyboard", "monitors"))
  val a2 = new ArrayElement(Array("mouse", "bluetooth"))
  val l1 = new LineElement2("one") above new LineElement2("two")
  val l2 = new LineElement2("3re") above new LineElement2("four")

  //println(elem('*' , 10, 10))

  //println("|"+elem("********").widen(15) + "|")
  println("_")
  println(elem('*', 2, 2).heighten(6))
  println("_")

  //println((l1 beside l2))

  //(a1 above a2).contents.foreach(println)

  //(a1 beside a2).contents.foreach(println)
}