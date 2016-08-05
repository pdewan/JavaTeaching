package lectures.documentations.assertions;

import lectures.interfaces.BMISpreadsheet;
import bus.uigen.ObjectEditor;

public class AComplexAssertingBMISpreadsheet implements BMISpreadsheet {
	double height;
	double weight;	
	double initialHeight, initialWeight;
	public AComplexAssertingBMISpreadsheet() { }	
	public AComplexAssertingBMISpreadsheet(
			double theInitialHeight, double theInitialWeight) {
		// not calling setters as precondition of these are not met
		height = theInitialHeight;
		weight = theInitialWeight;
		setHeight(theInitialHeight);
		setWeight(theInitialWeight);
		initialHeight = theInitialHeight;
		initialWeight = theInitialWeight;
	}
	public boolean preRestoreHeightAndWeight() {
		return height != initialHeight || weight != initialWeight; 
	}
	public void restoreHeightAndWeight() {
		assert preRestoreHeightAndWeight();
		height = initialHeight;
		weight = initialWeight;		
	}
//	public boolean preGetWeight() {return weight > 0;}
	public double getWeight() {
//		assert preGetWeight();
		return weight;
	}
	public boolean preSetWeight (double newValue) {
		return newValue> 0;
	}
	public void setWeight(double newValue) {
		assert preSetWeight(newValue);
		try {
		if (!preSetWeight(newValue)) {
			return;
		}
		weight = newValue;
		} finally {
		assert preSetWeight(newValue);
		}
	} 
	
	public double getHeight() {
		return height;
	}
	public boolean preSetHeight (double newValue) {
		return newValue> 0;
	}	
	public boolean preSetHeight () {
		return height > 0;
	}
	public void setHeight(double newValue) {
		assert preSetHeight(newValue);
		assert preSetHeight();
		double oldWeight = weight;
		height = newValue;
		assert preSetHeight();
		assert oldWeight == weight;
	}	
	public boolean preGetBMI() { 
		return weight > 0 && height > 0;
	}
	public double getBMI() {
		assert  preGetBMI();
		return weight/(height*height);
	}
	
	public static void main (String[] args) {
		ObjectEditor.edit(new AComplexAssertingBMISpreadsheet(1.77, 75));
	}

		
}
