val arr1 = new Array[String](3);
arr1(0) = "Scala"
arr1(1) = "looks"
arr1(2) = "great !!"

//------------------------------------------------------------------------------------------------------------------------------------

arr1.foreach(a => { print(a + " ")} )

println(""); println("") ; println("-" * 30) ; println("")

val arr2 = new Array[String](3);
arr2.update(0,"Scala")
arr2.update(1, "looks")
arr2.update(2, "great !!")



arr2.foreach(a => { print(a + "__")} )


println(""); println("") ; println("-" * 30) ; println("")


val arr3 = Array("arrays","are","awesome !", "!!!", 4)
// The next line throws exception for type inference 
//val arr3: Array[String] = Array("arrays","are","awesome !", "!!!", 4)

for(i <- 0 to (arr3.length - 1)) {
  println(arr3.apply(i))
}




println("-" * 30)
println("Arrays are mutable" )
println("-" * 30)


val arr4 = Array(1,2,3)

arr4.update(2, 4)

arr4.foreach(println)


