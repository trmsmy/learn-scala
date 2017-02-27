object EqualCompare extends App {

  println("I am in main")

  println("""
    
    """)
  println(" 1 == 1.0 => " + (1 == 1.0))

  println(" Array(1,2,3) == Array(1,2,3) => " + (Array(1, 2, 3) == Array(1, 2, 3)))

  println(" List(1,2,3) == List(1,2,3) => " + (List(1, 2, 3) == List(1, 2, 3)))

  println(" List(1,2,4) == List(1,2,3) => " + (List(1, 2, 4) == List(1, 2, 3)))

  println(" List(1,3,2) == List(1,2,3) => " + (List(1, 3, 2) == List(1, 2, 3)))

  println(" ========================== ")

  println(" List(1,2,3) eq List(1,2,3) => " + (List(1, 2, 3) eq List(1, 2, 3)))

}