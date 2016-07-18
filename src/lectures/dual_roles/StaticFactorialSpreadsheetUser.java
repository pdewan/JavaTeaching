package lectures.dual_roles;

import lectures.java_basics_overview.Factorials;

public class StaticFactorialSpreadsheetUser {
	
	public static void main (String[] args) {
		StaticLoopingFactorialSpreadsheet.setNumber(4);
		// no need to store value in a local variable
		// multiple classes in the program can access computed values of 4!
		System.out.println(StaticLoopingFactorialSpreadsheet.getFactorial() 
				* StaticLoopingFactorialSpreadsheet.getFactorial());
		// we can not access 4! and 2! simultaneously without storing them in local variables
		StaticLoopingFactorialSpreadsheet.setNumber(2);
		System.out.println(StaticLoopingFactorialSpreadsheet.getFactorial() 
				* StaticLoopingFactorialSpreadsheet.getFactorial());
		
	}
}
