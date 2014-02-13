package lectures.java_basics_overview;

import lectures.recursion.Factorial;
import bus.uigen.ObjectEditor;

public class ARecursiveFactorialSpreadsheet implements FactorialSpreadsheet {
	int number;
	long factorial;
	public int getNumber() {
		return number;
	}
	public void setNumber(int newVal) {
		number = newVal;
		factorial = Factorials.recursingFactorial(number);
	}
	public long getFactorial() {
		return factorial;
	}	
}
