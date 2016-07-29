package lectures.documentations.assertions;

public class AnAlwaysCheckingBMISpreadsheet extends AValidBMISpreadsheet {

	public AnAlwaysCheckingBMISpreadsheet(double anInitialHeight,
			double anInitialWeight) {
		super(anInitialHeight, anInitialWeight);
	}
	// Specifies the precondition for getBMI(), that is, 
	// the condition that must be true for getBMI() to correctly execute
	protected boolean preGetBMI() {
		return weight > 0 && height > 0;
	}
	@Override
	public double getBMI() {
		if (!preGetBMI()) {
			System.out.println ("Internal Error: weight or height <= 0");
//			System.exit(-1);// should we exit?
		}
		return weight/(height*height);
	}

}
