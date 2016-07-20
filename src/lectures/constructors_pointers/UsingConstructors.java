package lectures.constructors_pointers;

import java.util.Arrays;

import lectures.state_properties.ABMISpreadsheet;

public class UsingConstructors {
	// Final variable is a named constant - a variable that that cannot be changed later
	// Makes sure magic numbers and strings to do not appear in the program
	// These should be static as they do not change from instance to instance	
	 static final double EXAMPLE_HEIGHT = 1.77;
	 static final double EXAMPLE_WEIGHT = 75;
	 
	// example of a method that takes a class parameter, that is a parameter
	// whose type is a class
	public static void print(ABMISpreadsheet aBMISpreadsheet) {
		System.out.println ("Height:" + aBMISpreadsheet.getHeight() + 
				" Weight:" + aBMISpreadsheet.getWeight() +
				" BMI " + aBMISpreadsheet.getBMI());
	}
	
	public static void main (String[] args) {
		ABMISpreadsheet aBMISpreadsheet = new ABMISpreadsheet();
		// What do you expect to be printed by the following
		print (aBMISpreadsheet);
		// Does it make sense for the height or weight to be ever 0
		// The following uses a different syntax for new
		// It makes sure the two variables are initialized to values spevcified by the user
		// of the class
		aBMISpreadsheet = new ABMISpreadsheet(EXAMPLE_HEIGHT, EXAMPLE_WEIGHT);
		print(aBMISpreadsheet);
		// look into ABMISpreadsheet to better understand what is going on here (Clieck F3 on it)
		
		
	}

}
