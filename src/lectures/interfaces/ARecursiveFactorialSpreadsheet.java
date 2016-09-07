package lectures.interfaces;

import lectures.class_dual_roles.statics.Factorials;

/*
 * The only difference between this class and 
 * {@link ALoopingFactorialSpreadsheet} is in setNumber()
 * 
 */
public class ARecursiveFactorialSpreadsheet implements FactorialSpreadsheet {
	int number;
	long factorial;
	public int getNumber() {
		return number;
	}	
	public void setNumber(int newValue) {
		number = newValue;
		/*
		 * This class calls recursingFactorial instead of looping factorial
		 */		
		factorial = Factorials.recursingFactorial(number);
	}
	public long getFactorial() {
		return factorial;
	}	
}
