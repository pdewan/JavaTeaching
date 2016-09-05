package lectures.state_properties;

import lectures.constructors_pointers.ABMISpreadsheet;

public class BMISpreadsheetUser {
	public static void main (String[] args) {
		ABMISpreadsheet bmiSpreadsheet = new ABMISpreadsheet();
		bmiSpreadsheet.setHeight(1.77);
		bmiSpreadsheet.setWeight(75);
	    double computedBMI = bmiSpreadsheet.getBMI();
		System.out.println(computedBMI );

	}

}
