package lectures.class_dual_roles.users;
/*
 * Change this import to refer to the copied package as shown
 * in the comment.
 * Can you have both imports in a package?
 */
import lectures.class_dual_roles.statics.StaticLoopingFactorialSpreadsheet;
//import ctures.class_dual_roles.statics.copy.StaticLoopingFactorialSpreadsheet;

public class StaticFactorialSpreadsheetUse {
	/*
	 * Study this program. run it, Then follow the commented instructions and see the behavior.
	 */
	public static void main (String[] args) {
		StaticLoopingFactorialSpreadsheet.setNumber(4);		
		System.out.println(StaticLoopingFactorialSpreadsheet.getFactorial() 
				* StaticLoopingFactorialSpreadsheet.getFactorial());
		/*
		 * What error do we get if we uncomment the following?
		 *
		 */
//		StaticLoopingFactorialSpreadsheet.factorial = 0;
		/*
		 * Click on the error and say yes to making the variable public or go to the class
		 * and declare the variable factorial public. Does the following println make logical sense now?
		 * 
		 */
		System.out.println ("The factorial of " + StaticLoopingFactorialSpreadsheet.getNumber() +
				" is " + StaticLoopingFactorialSpreadsheet.getFactorial());
		
		/*
		 * The principle of least privilege says do not give any code more rights than it needs.
		 * What variables and methods should be public and not public in StaticLoopingFactorialSpreadsheet
		 * 
		 */
		StaticLoopingFactorialSpreadsheet.setNumber(2);
		System.out.println(StaticLoopingFactorialSpreadsheet.getFactorial() 
				* StaticLoopingFactorialSpreadsheet.getFactorial());
		/**
		 * We just erased the previous factorial (4!) in StaticLoopingFactorialSpreadsheet.
		 * A class cannot access 4! and 2! simultaneously without storing them in local variables
		 * Problem: how to allow multiple stored factorials to be shared by multiple classes or the same clas.
		 * Go to {@link lectures.class_dual_roles.users.TwoStaticFactorialSpreadsheetUse}
		 * 
		 */
		
	}
	
}
