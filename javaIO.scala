import java.io._

object Test1 {
def main(args: Array[String]) {

val writer = new PrintWriter(new File("testFile.txt" ))
writer.write("Hello Scala")
writer.close()
}
}
