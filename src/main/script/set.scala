def hline(s: String) {
  println("-" * 60)
  println("............... " + s + " .......... ")
  println("-" * 60)
}

var jets = Set("Boeing", "Airbus")

jets += "Lear"

println(jets)
println(jets.getClass)

println(jets("Lear"))

println(jets.contains("Jet"))

hline("Mutable Set")

package script
val movies = mutable.Set("Hitch", "Up")

println(movies)
println(movies.getClass)

movies += "Shrek"
movies += "Shrek"

println(movies)
