package lectures.java_basics_overview;


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
