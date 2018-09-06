package lectures.class_dual_roles.instances;

import lectures.class_dual_roles.statics.Factorials;
import lectures.interfaces.FactorialSpreadsheet;

/**
 * This class is like ALoopingFactorialSpreadsheet but uses different method accesses
 */
public class NextTimeALoopingFactorialSpreadsheetWithNonPublicMethods 
{
		
	int number;
	
	long factorial;

	int getNumber() {
		return number;
	}
	
	void setNumber(int newValue) {
		number = newValue ;
		factorial = Factorials.loopingFactorial(number);
	}	
	long getFactorial() {
		return factorial;
	}
}


