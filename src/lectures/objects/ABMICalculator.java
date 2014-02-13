package lectures.objects;

import lectures.interfaces.ABMISpreadsheetAndCalculator;
import lectures.interfaces.BMICalculator;
import lectures.interfaces.BMISpreadsheet;

public class ABMICalculator  {
	// weight is in Kgs, height in metres
	public double calculateBMI(double height, double weight) {
		return weight/(height*height);
	}	

}