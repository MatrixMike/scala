import java.util.{Date, Locale}
import java.text.DateFormat
import java.text.DateFormat._ 

object FrenchDate {
def main(args: Array[String]) {
val now = new Date
// val df = getDateInstance(LONG, Locale.FRANCE)
val df = getDateInstance(LONG, Locale.UK)
	println(df format now)
	println("end of prog")
	}
}
