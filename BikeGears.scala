// mike 10-3 2015 
// calculate all the possible combinations of gear ratios from the FrontList and RearList 
// create a list from these values
// then sort the list
// and print the list in order
// Wed 11 Mar 2015 00:39:16 EST 
// into geany 23.03.2015

import scala.collection.mutable.ListBuffer


object BikeGears{
def main(args: Array[String]) {
var a = 0;
var FrontList = List(27.0, 39.0, 47.0);
var RearList = List(32, 28, 24, 21, 18, 15, 13, 11);  // Phyllis white bike 
// var RatioList = Nil;
// for loop execution with multiple filters
 var ratiosl = new ListBuffer[Double]()


val ratiostr = "ratio" 

for( a <- FrontList; b <- RearList ){
// if a != 3;

// if a < 8 ;
 // if a >=2){
 // RatioList = RatioList .::: a/b
	var ratiosl = a/b 

	println(f"Gear $ratiostr%s of F/R: $ratiosl%3.4f  "  ) // was println
}

// println( "\n");

	//println( RatioList );
	//println( ratios );   // unsorted
	val ratiosList = ratiosl.toList
// println("spacer line");
	for ( a <- ratiosList.sorted ) {
	// keep as example printf ("ratios %4.2f "+ a);
		printf("ratio %f \n", a);
		println("loop")
	}
	
	println("Phyllis White Bike");
// printf( ratiosList.sorted(3) );  // want to show the ratio of smallest to largest available
}  // end main
}  // end object
// }
