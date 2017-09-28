package lectures.documentations.assertions;

public class AnErroneousAssertingSpreadsheet extends AnAssertingBMISpreadsheet{

	public AnErroneousAssertingSpreadsheet(double anInitialHeight,
			double anInitialWeight) {
		super(anInitialHeight, anInitialWeight);
	}
	public void setWeight(double newValue) {
		if (newValue <= 0) { 
			System.out.println ("Warning weight <= 0");
		}
		super.setWeight(newValue);
		
	}	
	
	public void setHeight(double newValue) {
		if (newValue <= 0) { 
			System.out.println ("Warning height <= 0");
		}
		super.setHeight(newValue);	
	}	
}
