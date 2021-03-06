import java.util.{Date, Locale}
import java.text.DateFormat
import java.text.DateFormat._ 

object DateFormatDemoSO {
def main(args: Array[String]) {
  //  int style = DateFormat.MEDIUM;
    //Also try with style = DateFormat.FULL and DateFormat.SHORT
val now = new Date
 //   DateFormat df;
//    df = DateFormat.getDateInstance(style, Locale.UK);
// http://www.tutorialspoint.com/java/util/java_util_locale.htm. 
// https://github.com/MatrixMike/clojure/blob/master/ThaiDigits.java

var df = getDateInstance(LONG, Locale.UK)
	print("UK "); println(df format now)
	
	df = getDateInstance(LONG, Locale.US)
	println(df format now)	

	df = getTimeInstance(LONG, Locale.US)
	println(df format now)	
	
	df = getDateInstance(LONG, Locale.ITALY)
	print("Italy "); println(df format now)	
	
	df = getDateInstance(LONG, Locale.JAPAN)
	println(df format now)
	
	df = getDateInstance(LONG, Locale.FRANCE)
	print("France "); println(df format now)
	System.out.print("Debug1 ");

	df = getDateInstance(LONG, Locale.KOREA)
	print("Korea "); println(df format now)
	
	df = getDateInstance(LONG, Locale.CANADA)
	println(df format now)
	
	df = getDateInstance(LONG, Locale.JAPAN)
	println(df format now)
		
	df = getDateInstance(LONG, Locale.CHINA)
	println(df format now)
			
	df = getDateInstance(LONG, Locale.GERMANY)
	print("Germany "); println(df format now)
				
	df = getDateInstance(LONG, Locale.TAIWAN)
	println(df format now)
	
	df = getDateInstance(LONG, Locale.PRC)
	println(df format now)
	System.out.print("Debug2 ");	
		df = getDateInstance(LONG, Locale.ROOT)
	println(df format now)
/*	
	public static Locale[] getAvailableLocales()
	
		df = getDateInstance(LONG, Locale.RUSSIA)
	println(df format now)	
	* */
 /*   df = getDateInstance(LONG, Locale.VIETNAM)
	println(df format now)
	*/
		
	/*
    df = DateFormat.getDateInstance(style, Locale.US);
    System.out.println("USA: " + df.format(date));   
    df = DateFormat.getDateInstance(style, Locale.FRANCE);
    System.out.println("France: " + df.format(date));
    df = DateFormat.getDateInstance(style, Locale.ITALY);
    System.out.println("Italy: " + df.format(date));
    */
 /*   df = DateFormat.getDateInstance(style, Locale.JAPAN);
    System.out.println("Japan: " + df.format(date));
  */
  }
}
