package lectures.class_dual_roles;

import lectures.java_basics_overview.Factorials;
// copy of StaticLoopingFactorialSpreadsheet, ugh!
public class AnotherStaticLoopingFactorialSpreadsheet {
	static int number;
	static long factorial;
	public static int getNumber() {
		return number;
	}
	public static void setNumber(int newValue) {
		number = newValue ;
		factorial = Factorials.loopingFactorial(number);
	}	
	public static long getFactorial() {
		return factorial;
	}
	public static void main (String[] args) {
		AnotherStaticLoopingFactorialSpreadsheet.setNumber(4);
		System.out.println(AnotherStaticLoopingFactorialSpreadsheet.getFactorial() 
				* AnotherStaticLoopingFactorialSpreadsheet.getFactorial());
	}
}
