package lectures.documentations.assertions;

import bus.uigen.ObjectEditor;
import lectures.interfaces.ABMISpreadsheet;
import lectures.interfaces.BMISpreadsheet;
//Let us explore some alternatives for documenting, preventng, and/or reporting erroneous situations
//The error example is a height or weight that is <= 0 which in turn can cause problems in computation
//of BMI
public class BMISpreadsheetErrorAlternatives {
	public static void main (String[] args) {
		// Try different alternatives for aBMISpreadsheet by uncommenting the alternative
		// and commenting the rest
		

//		BMISpreadsheet aBMISpreadsheet = new ABMISpreadsheet(1.77, 75);
//		BMISpreadsheet aBMISpreadsheet = new AValidBMISpreadsheet(1.77, 75);
//		BMISpreadsheet aBMISpreadsheet = new AnAlwaysCheckingBMISpreadsheet(1.77, 75);
//		BMISpreadsheet aBMISpreadsheet = new AnAssertingBMISpreadsheet(1.77, 75);
		BMISpreadsheet aBMISpreadsheet = new AnErroneousAssertingSpreadsheet(1.77, 75);
		aBMISpreadsheet.setHeight(0);
		System.out.println (aBMISpreadsheet.getHeight());		
		System.out.println (aBMISpreadsheet.getBMI());
		System.out.println ("Program terminated notmally");
		
		// In which of these alternatives can the spreadsheet have an invalid height or weight?
		// Notice that in all of these cases, the getBMI() method has either a comment or some
		// code that indicates its precondition - the condition that must be true before it
		// executes for its execution to be correct.
		// Why do you think such documentation of precondition important?
		// Is it better to have documentation and/or checking code?
		
		// From a language point of view, the last two alternatives are the most interesting as
		// they use the assert statement. Let us try to understand what it does.
		
		// The last three alternatives all reference preGetBMI.
		// Put a break point in the preGetBMI method defined in AnAlwaysCheckingBMISpreadsheet		
		// In the last two alternatives you will see this method is not called.
		// if we care about execution efficiency, is it good or bad that preGetBMI() was not
		// called in the last two cases. Consider each of the two cases separately.
		
		// Debug-run the program again in the last two cases. However, do not hit debug directly. Instead
		// execute Debug Configurations ...Click on the Arguments tab on the right, and then find the
		// VM Arguments panel. In this panel, enter the string "-ea" which stands for enable assertions.
		// Now run the two cases again, see if preGetBMI is called and look at the console output
		
		// Do you now have a theory as to what assertions do and why they might be useful?
		
		
		
		

		
		

	}

}
