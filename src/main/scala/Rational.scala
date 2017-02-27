
class Rational(n :Int, d :Int)  {
  require( d != 0 )

  private val g = gcd(n.abs, d.abs)
  val numer = n / g;
  val denom = d / g;
  
  def this(n :Int) = this(n, 1)
  
  def +(that :Rational): Rational = new Rational(numer * that.denom 
        + denom * that.numer, denom * that.denom)
  
  private def gcd(a :Int, b :Int): Int = {
    if (b == 0) a else gcd(b, a % b)
  }
  
  override def toString = numer + "/" + denom;

  def * (that: Rational): Rational =
        new Rational(numer * that.numer, denom * that.denom)
  
  def * (i: Int): Rational = new Rational(numer * i, denom)
  
  def toDecimal = (numer:Float) / denom
  
}

object Main extends App {
  
  implicit def intToRational(x: Int) = new Rational(x)
  
  println("This is main")
  
  println( new Rational(1,2))
  
  // println( new Rational(1,0)); ----- throws exception 
  
  
  println( new Rational(1,2) + new Rational(1,4) + new Rational(2))
  
  println( new Rational(66, 42) )
  
  
  println(  new Rational(66, 42) * 3 )
  
  println(  (new Rational(66, 42) * 3 ).toDecimal)
  
  println( ( 3 *   new Rational(66, 42) ).toDecimal)
  
}