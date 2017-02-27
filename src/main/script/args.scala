println(args)
args.foreach(println)

println(args.getClass)

for(arg <- args) {
  println(arg)
}


val t = 0 to 5

println(t)
println(t.getClass)

for(i <- t) {
  println(i)
}