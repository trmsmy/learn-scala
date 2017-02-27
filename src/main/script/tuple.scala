val t = (1, "Name", 30, List("Child 1", "Child 2" ), Array("Red Car", "Grey Car"))

println(t)
t.productIterator.foreach(println)

println(t._1)
println(t._3)
t._5.foreach(println)


val (id, name, age, childs, cars) = t



println("ID " + id) 
println("Children: " + childs)
