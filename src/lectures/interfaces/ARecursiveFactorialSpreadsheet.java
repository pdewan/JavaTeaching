package lectures.interfaces;

import lectures.class_dual_roles.statics.Factorials;


// ignore the implements clause on first read
public class ARecursiveFactorialSpreadsheet implements FactorialSpreadsheet {
	int number;
	long factorial;
	public int getNumber() {
		return number;
	}	
	public void setNumber(int newValue) {
		number = newValue;
		// this class calls recursingFactorial instead of looping factorial
		factorial = Factorials.recursingFactorial(number);
	}
	public long getFactorial() {
		return factorial;
	}	
}
