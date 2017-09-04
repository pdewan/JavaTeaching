package lectures.class_dual_roles.instances;

import lectures.class_dual_roles.statics.Factorials;
import lectures.interfaces.FactorialSpreadsheet;

/**
 * This class is like ALoppingFactorialSpreadsheet but uses different naming
 * conventions.
 */
public class ALoopingFactorialSpreadsheetWithNonPublicMethods 
{
		
	int number;
	
	long factorial;

	int readNumber() {
		return number;
	}
	
	void writeNumber(int newValue) {
		number = newValue ;
		factorial = Factorials.loopingFactorial(number);
	}	
	long readFactorial() {
		return factorial;
	}
}


