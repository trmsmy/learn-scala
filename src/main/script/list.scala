val l1 = List(1,2,3)

println(l1)

l1.foreach(println)

println("-" * 30) 
println("-" * 30) 

val l2 = List(4)

val l3 = l1 ::: l2

printf("l1 = %s and l2 = %s stays same, but l3 = %s created.\n", l1, l2, l3)


 
println("-" * 30) 
println("Adding item to a list " )
println("-" * 30)


val l4 = List(1,2,3)

val l5 = 4 :: l4 

println(l5)


 
println("-" * 30) 
println("Nil in list " )
println("-" * 30)

val l6 = 1 :: 2 :: 3 :: Nil

println(l6)

val l7 = Nil

println(l7)

println("-" * 30) 
println("............... List methods .......... " )
println("-" * 30)

val str  = "Lorem Ipsum is simply dummy text of the printing and typesetting industry text"

val list = str.split(" ").toList

println(list)

println("item in 4nd place: "  + list(4))

println("count of text: " + list.count(_ == "text"))  

println("count of word length more than 4: " +
    list.count(s => s.length > 4) + " they are " + 
    list.filter(_.length>4))


println("Drop the left first element: " + list.drop(1))

println("Drop the right first element: " + list.dropRight(1))


println("List contains string dummy ? : " + list.exists(_=="dummy"))

println("List head: " + list.head )
println("List last: " + list.last )

println("All element but last " + list.init )

println("is list empty ?: " + list.isEmpty )

println("list length: " + list.length)


println("list map method: " + list.map(_.toUpperCase))
println("list map method: " + 
    list.map("-"+_.toUpperCase.replaceAll("[AEIOU]", "")))


println("List is not modified: " + list)


println("Join strings in list: " + list.mkString("_"))

println("Reverse the list: " + list.reverse)
println("List is not modified: " + list)


println("Sort the list: " + 
    list.sortWith((l, r) => l.length < r.length)    
)























