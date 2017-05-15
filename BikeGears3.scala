// mike 10-3 2015 
// calculate all the possible combinations of gear ratios from the FrontList and RearList 
// create a list from these values
// then sort the list
// and print the list in order
// Wed 11 Mar 2015 00:39:16 EST 
// into geany 23.03.2015
// 15.05.2017

import scala.collection.mutable.ListBuffer


object BikeGears3{
def main(args: Array[String]) {
var a = 0;
var something = List(2.0, 3.0, 4.0);
var FrontList = List(22.0, 32.0, 42.0);  // make float so division is 
										//	automatically organised
var RearList = List(14, 16, 18, 20, 22, 24, 34);       //26, 23, 21, 19, 15, 13, 12);  // Steve Red bike 
// var RatioList = Nil;
// for loop execution with multiple filters
 var ratios = new ListBuffer[Double]()



for( a <- FrontList; b <- RearList ; c<- something){
// if a != 3;

// if a < 8 ;
 // if a >=2){
 // RatioList = RatioList .::: a/b
	ratios += a/b 

	println( "Gear ratio of F/R: "   + a, +b,
	a/b*c) ;
}

println( "\n");

	//println( RatioList );
	//println( ratios );   // unsorted
	val ratiosList = ratios.toList
// println("spacer line");
	for ( a <- ratiosList.sorted ) {
	// keep as example printf ("ratios %4.2f "+ a);
		printf("ratio %4.2f \n", a);
	}
	
	println("Steve's Green Bike");
// printf( ratiosList.sorted(3) );  // want to show the ratio of smallest to largest available
}  // end main
}  // end object
// }
