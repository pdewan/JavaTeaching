package lectures.constructors_pointers;

import java.util.Arrays;
import lectures.state_properties.ABMISpreadsheet;

public class PrintingConstructors {

	// Only the curious need look at this 
	public static void printConstructors(Object anObject) {
		System.out.println(Arrays.toString(anObject.getClass().getConstructors()));
	}
	public static void main (String[] args) {
		ABMISpreadsheet aBMISpreadsheet = new ABMISpreadsheet();		
		printConstructors(aBMISpreadsheet);
		// Comment out the the parameterless constructor in ABMISPreadsheet and
		// run this program again.
		// How many constructors?
		
		// Comment out the constructor with the two parameters.
		// How many constructors?
		// Can you explain the numbers?
	}

}
