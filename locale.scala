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
var df = getDateInstance(LONG, Locale.UK)
	println(df format now)
	
	df = getDateInstance(LONG, Locale.US)
	println(df format now)	

	df = getTimeInstance(LONG, Locale.US)
	println(df format now)	
	
	df = getDateInstance(LONG, Locale.ITALY)
	println(df format now)	
	
	df = getDateInstance(LONG, Locale.JAPAN)
	println(df format now)
	
	df = getDateInstance(LONG, Locale.FRANCE)
	println(df format now)
	System.out.println("Debug1 ");

	df = getDateInstance(LONG, Locale.KOREA)
	println(df format now)
	
	df = getDateInstance(LONG, Locale.CANADA)
	println(df format now)
	/*
    df = DateFormat.getDateInstance(style, Locale.US);
    System.out.println("USA: " + df.format(date));   
    df = DateFormat.getDateInstance(style, Locale.FRANCE);
    System.out.println("France: " + df.format(date));
    df = DateFormat.getDateInstance(style, Locale.ITALY);
    System.out.println("Italy: " + df.format(date));
    */
    df = DateFormat.getDateInstance(style, Locale.JAPAN);
    System.out.println("Japan: " + df.format(date));
  
  }
}