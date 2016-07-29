package lectures.documentations.assertions;

public class AnAssertingBMISpreadsheet extends AnAlwaysCheckingBMISpreadsheet {

	public AnAssertingBMISpreadsheet(double anInitialHeight,
			double anInitialWeight) {
		super(anInitialHeight, anInitialWeight);
	}	
	public double getBMI() {
		//put break point here and step over or step into to see if preGetBMI() is called
		assert 
		    preGetBMI():"Internal Error: Weight or height <= 0";		
		return weight/(height*height);
	}
}
