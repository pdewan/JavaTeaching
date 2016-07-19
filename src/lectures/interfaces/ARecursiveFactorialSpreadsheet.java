package lectures.interfaces;

import lectures.java_basics_overview.Factorials;


public class ARecursiveFactorialSpreadsheet implements FactorialSpreadsheet {
	int number;
	long factorial;
	public int getNumber() {
		return number;
	}
	public void setNumber(int newValue) {
		number = newValue;
		factorial = Factorials.recursingFactorial(number);
	}
	public long getFactorial() {
		return factorial;
	}	
}
