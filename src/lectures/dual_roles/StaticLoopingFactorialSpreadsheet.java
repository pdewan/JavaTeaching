package lectures.dual_roles;

import lectures.java_basics_overview.Factorials;

public class StaticLoopingFactorialSpreadsheet {
	static int number;
	static long factorial;
	public static int getNumber() {
		return number;
	}
	public static void setNumber(int newValue) {
		number = newValue ;
		factorial = Factorials.loopingFactorial(number);
	}	
	// lots of different classes can access this
	public static long getFactorial() {
		return factorial;
	}
	public static void main (String[] args) {
		StaticLoopingFactorialSpreadsheet.setNumber(4);
		System.out.println(StaticLoopingFactorialSpreadsheet.getFactorial() 
				* StaticLoopingFactorialSpreadsheet.getFactorial());
	}
}
