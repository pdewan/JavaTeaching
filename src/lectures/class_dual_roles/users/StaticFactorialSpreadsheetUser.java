package lectures.class_dual_roles.users;

import lectures.class_dual_roles.StaticLoopingFactorialSpreadsheet;


public class StaticFactorialSpreadsheetUser {
	
	public static void main (String[] args) {
		StaticLoopingFactorialSpreadsheet.setNumber(4);
		// no need to store value in a local variable
		// multiple classes in the program can access computed values of 4!
		System.out.println(StaticLoopingFactorialSpreadsheet.getFactorial() 
				* StaticLoopingFactorialSpreadsheet.getFactorial());
		// what error do we get if we uncomment the following?
		// declare the variable factorial public.Do we still get the error
//		System.out.println(StaticLoopingFactorialSpreadsheet.factorial 
//				* StaticLoopingFactorialSpreadsheet.factorial);
		StaticLoopingFactorialSpreadsheet.setNumber(2);
		// we just erased the previous factorial for this class and other classes using it
		System.out.println(StaticLoopingFactorialSpreadsheet.getFactorial() 
				* StaticLoopingFactorialSpreadsheet.getFactorial());
		// we can not access 4! and 2! simultaneously without storing them in local variables
		// problem: how to allow multiple stored factorals to be shared by multiple classes
		
	}
	
}
