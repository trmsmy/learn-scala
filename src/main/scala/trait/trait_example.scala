import scala.collection.mutable.ArrayBuffer

abstract class IntQueue {
  def get(): Int
  def put(x: Int)
}

class BasicQueue extends IntQueue {
  private val buf = new ArrayBuffer[Int]
  def get(): Int = buf.remove(0);

  def put(x: Int): Unit = {
    buf += x
  }
  
  def size : Int = buf.size
}

trait Doubling extends IntQueue {
  abstract override def put(x: Int) = { super.put(x * 2) }
}

trait Tripling extends IntQueue {
  abstract override def put(x: Int) = { super.put(x * 3) }
}

trait Filtering extends IntQueue {
  abstract override def put(x: Int) = { if (x > 0) super.put(x) }
}

class DoubledQueue extends BasicQueue with Doubling

object TraitExample extends App {
  println("Testing Basic Queue ");

  val q = new BasicQueue
  q.put(10)
  q.put(20)
  println(q.get())
  println(q.get())

  println("Testing Doubled Queue ");

  val dq = new DoubledQueue
  dq.put(10)
  dq.put(20)
  println(dq.get())
  println(dq.get())

  println("Testing Doubled Queue -- Object level");

  val odq = new BasicQueue with Doubling
  odq.put(10)
  odq.put(20)
  println(odq.get())
  println(odq.get())

  println("Testing Tribled Queue");

  val tq = new BasicQueue with Tripling
  tq.put(10)
  tq.put(20)
  tq.put(0)
  println(tq.get())
  println(tq.get())
  println(tq.size)

  println("Mixing Doubled and Tribled Queue");

  val dtq = new BasicQueue with Tripling with Doubling with Filtering
  dtq.put(10)
  dtq.put(20)
  dtq.put(0)
  println(dtq.get())
  println(dtq.get())
  println(dtq.size)

}