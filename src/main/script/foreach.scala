println("no of args" + args.length)

//NO explicit Type for argument 
args.foreach(arg => println(arg))

//Explict Type for argument
args.foreach((arg: String )=> println(arg))


println(" --- Concise to the core --- ") 
args.foreach(println)

args.foreach(print)