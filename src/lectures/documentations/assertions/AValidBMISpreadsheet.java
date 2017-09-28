package lectures.documentations.assertions;

import lectures.interfaces.ABMISpreadsheet;
import lectures.interfaces.BMISpreadsheet;
import bus.uigen.ObjectEditor;

public class AValidBMISpreadsheet extends ABMISpreadsheet implements BMISpreadsheet  {
//	double height;
//	double weight;	

	public AValidBMISpreadsheet(
			double anInitialHeight, double anInitialWeight) {

		super(anInitialHeight, anInitialWeight);
	}
	public void setWeight(double newValue) {
		if (newValue > 0) { // extra check to prevent invalid weight
			super.setWeight(newValue);
		} else {
			System.out.println ("Ignoring weight <= 0");
		}
	}	

	public void setHeight(double newValue) {
		if (newValue > 0) {
			setHeight(newValue);
		} else {
			System.out.println ("Ignoring height <= 0");
		}
	}	
	/**
	* Height and weight to be > 0 when this method is called
	*/
	public double getBMI() {
		return super.getBMI();
	}
	

		
}
