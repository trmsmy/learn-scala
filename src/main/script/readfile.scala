package script

val lines = Source.fromFile(args(0)).getLines().toList

def widthOfLength(s :String) = s.length.toString.length

var maxWidth = 0;
for(line <- lines) {
  maxWidth = maxWidth.max(widthOfLength(line))
}

lines.foreach(line => {
  val numspaces = maxWidth - widthOfLength(line)
  println(" " * numspaces + line.length + " | " + line) 
  
})