package lectures.class_dual_roles.statics;

// copy of StaticLoopingFactorialSpreadsheet, with just the class name changed
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
