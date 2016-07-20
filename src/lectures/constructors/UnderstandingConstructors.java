package lectures.constructors;

import lectures.state_properties.ABMISpreadsheet;

public class UnderstandingConstructors {
	// example of a method that takes a class parameter, that is a parameter
	// whose type is a class
	public static void print(ABMISpreadsheet aBMISpreadsheet) {
		System.out.println ("Height:" + aBMISpreadsheet.getHeight() + 
				" Weight:" + aBMISpreadsheet.getWeight() +
				" BMI " + aBMISpreadsheet.getBMI());
	}
	public static void main (String[] args) {
		ABMISpreadsheet aBMISpreadsheet = new ABMISpreadsheet();
		print (aBMISpreadsheet);
		
	}

}
