// mike 10-3 2015 
// calculate all the possible combinations of gear ratios from the FrontList and RearList 
// create a list from these values
// then sort the list
// and print the list in order
// Wed 11 Mar 2015 00:39:16 EST 
// into geany 23.03.2015
//17.05.2017 01:38:49

import scala.collection.mutable.ListBuffer


object steveRed{
def main(args: Array[String]) {
//var a = 0;
var FrontList = List(22.0, 32.0, 42.0);  // make float so division is 
										//	automatically organised
var RearList = List(26, 23, 21, 19, 17, 15, 13, 12);  // Steve Red bike 
// var RatioList = Nil;
// for loop execution with multiple filters
 var ratios = new ListBuffer[Double]()



	for( a <- FrontList; b <- RearList ){
// if a != 3;

// if a < 8 ;
 // if a >=2){
 // RatioList = RatioList .::: a/b
		ratios += a/b 					// add computed result to end of list?
		println( "Gear ratio of F/R:  "   + a, +b, a/b) ;
	}
	printf("\nGear ratio : %5.3f %4.2f %4.2f", 1.2,2.3,7.0/3);
	println( "\n");

	//println( RatioList );
	//println( ratios );   // unsorted
	val ratiosList = ratios.toList
// println("spacer line");
	for ( a <- ratios.toList.sorted ) {
// xxx 	for ( a <- ratiosList.sorted ) {
	// keep as example printf ("ratios %4.2f "+ a);
		printf("ratio %5.3f \n", a);
	}
	
	println("Steve's Red Bike");
// printf( ratiosList.sorted(3) );  
// want to show the ratio of smallest to largest available
// so need ratio of first and last of the sorted list 
// how to do that ?
}  // end main
}  // end object
// }
