package lectures.class_dual_roles;


public class StaticLoopingFactorialSpreadsheet {
	// static variables are external to methods, shared by all static methods in a class
	static int number;
	static long factorial;
	// "getter", returns the number, we will formally define getters later
	public static int getNumber() {
		return number;
	}
	// setter, changes the number and associated factorial, we will formally define setters later
	public static void setNumber(int newValue) {
		number = newValue ;
		factorial = Factorials.loopingFactorial(number);
	}	
	// lots of different classes can access this computed factorial
	public static long getFactorial() {
		return factorial;
	}
	
	
}
