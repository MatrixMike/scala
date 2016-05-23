object Test2 {
def main(args: Array[String]) {
print("Please enter your input : " )
//val line = Console.readLine     23.05.2016 20:05:53  deprecated 
val line =  scala.io.StdIn.readLine()    //       Console.readLine   replacement code with no warnings given
println("Thanks, you just typed: " + line)
}
}
