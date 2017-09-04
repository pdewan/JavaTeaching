package lectures.class_dual_roles.instances;

import lectures.class_dual_roles.statics.Factorials;
import lectures.interfaces.FactorialSpreadsheet;

/**
 * This class is like ALoppingFactorialSpreadsheet but uses different naming
 * conventions.
 */
public class ANonBeanLoopingFactorialSpreadsheet 
{
		
	int number;
	
	long factorial;

	public int readNumber() {
		return number;
	}
	
	public void writeNumber(int newValue) {
		number = newValue ;
		factorial = Factorials.loopingFactorial(number);
	}	
	public long readFactorial() {
		return factorial;
	}
}


