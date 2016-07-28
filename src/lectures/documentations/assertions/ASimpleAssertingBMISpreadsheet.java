package lectures.documentations.assertions;

import lectures.interfaces.ABMISpreadsheet;
import lectures.interfaces.BMISpreadsheet;
import bus.uigen.ObjectEditor;

public class ASimpleAssertingBMISpreadsheet extends ABMISpreadsheet  {
	
	double initialHeight, initialWeight;
	public ASimpleAssertingBMISpreadsheet() { }	
	public ASimpleAssertingBMISpreadsheet(
			double theInitialHeight, double theInitialWeight) {
		super(theInitialHeight, theInitialWeight);
		initialHeight = theInitialHeight;
		initialWeight = theInitialWeight;
	}
	public boolean preRestoreHeightAndWeight() {
		return getHeight() != initialHeight || getWeight() != initialWeight; 
	}
	public void restoreHeightAndWeight() {
		assert preRestoreHeightAndWeight();
		setHeight(initialHeight);
		setWeight(initialWeight);		
	}	
	
	public boolean preGetBMI() { 
		return getWeight() > 0 && getHeight() > 0;
	}
	public double getBMI() {
		assert  preGetBMI();
		return super.getBMI();
	}
	
	public static void main (String[] args) {
		ObjectEditor.edit(new ASimpleAssertingBMISpreadsheet(1.77, 75));
	}

		
}
