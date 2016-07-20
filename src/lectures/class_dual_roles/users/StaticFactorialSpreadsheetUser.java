package lectures.class_dual_roles.users;

import lectures.class_dual_roles.StaticLoopingFactorialSpreadsheet;


public class StaticFactorialSpreadsheetUser {
	// study this program. run it, Then follow the commented instructions and see the behavior.
	public static void main (String[] args) {
		StaticLoopingFactorialSpreadsheet.setNumber(4);
		// no need to store value in a local variable
		// multiple classes in the program can access computed values of 4!
		System.out.println(StaticLoopingFactorialSpreadsheet.getFactorial() 
				* StaticLoopingFactorialSpreadsheet.getFactorial());
		// what error do we get if we uncomment the following?
//		StaticLoopingFactorialSpreadsheet.factorial = 0;
		// click on the error and say yes to making the variable public or go to the class
		// and declare the variable factorial public. Does the following println make sense now?
		// The principle of least privilege says do not give any code more rights than it needs.
		// Did AFactorualSpreadsheetUser need to be able to access the variable factorial directly?
		System.out.println ("The factorial of " + StaticLoopingFactorialSpreadsheet.getNumber() +
				" is " + StaticLoopingFactorialSpreadsheet.getFactorial());
		StaticLoopingFactorialSpreadsheet.setNumber(2);
		// we just erased the previous factorial for this class and other classes using it
		System.out.println(StaticLoopingFactorialSpreadsheet.getFactorial() 
				* StaticLoopingFactorialSpreadsheet.getFactorial());
		// we can not access 4! and 2! simultaneously without storing them in local variables
		// problem: how to allow multiple stored factorals to be shared by multiple classes
		
	}
	
}
