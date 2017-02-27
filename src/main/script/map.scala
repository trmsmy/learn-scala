val m  = Map(1 -> "a", 2 -> "b" ) 

println(m(1)) 

println((0 to 10).map(t => t -> 2 * t )) 

println(List((0 to 10).foreach(_.toString)).map(t => t -> 2 * t ))

package script

val im = TreeMap(1 -> "x", 2 -> "y" )

println(im)

println(im.getClass)