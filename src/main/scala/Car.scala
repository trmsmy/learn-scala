class Car(b: String) {
  private var brand: String = b

  def drive = {
    assert(brand.nonEmpty)
    "driving " + brand
  }
}

object Car {

  def newCar(b: String) = new Car(b)

}
