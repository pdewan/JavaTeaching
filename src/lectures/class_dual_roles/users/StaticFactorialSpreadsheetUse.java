package lectures.class_dual_roles.users;

import lectures.class_dual_roles.StaticLoopingFactorialSpreadsheet;


public class StaticFactorialSpreadsheetUse {
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
		// and declare the variable factorial public. Does the following println make logical sense now?
		System.out.println ("The factorial of " + StaticLoopingFactorialSpreadsheet.getNumber() +
				" is " + StaticLoopingFactorialSpreadsheet.getFactorial());
		
		// Remove the public keyword from getFactorial.
		// What errors do you get?
		// Restore the keyword to remove the keyword
		
		// The principle of least privilege says do not give any code more rights than it needs.
		// What should be public and not public in StaticLoopingFactorialSpreadsheet
		StaticLoopingFactorialSpreadsheet.setNumber(2);
		System.out.println(StaticLoopingFactorialSpreadsheet.getFactorial() 
				* StaticLoopingFactorialSpreadsheet.getFactorial());
		// We just erased the previous factorial for this class and other classes using it
		// We can not access 4! and 2! simultaneously without storing them in local variables
		// Problem: how to allow multiple stored factorals to be shared by multiple classes
		// Go to TwoStaticFactorialSpreadsheetUse
		
	}
	
}
