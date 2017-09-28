package lectures.class_dual_roles.users;

import lectures.class_dual_roles.statics.StaticLoopingFactorialSpreadsheet;


public class SharedStaticFactorialSpreadsheetUse {
	public static void main (String[] args) {
		StaticLoopingFactorialSpreadsheet.setNumber(4);		
		System.out.println(StaticLoopingFactorialSpreadsheet.getFactorial() 
				* StaticLoopingFactorialSpreadsheet.getFactorial());			
		StaticLoopingFactorialSpreadsheet.setNumber(2);		
		// we just erased the previous factorial for this class and other classes using it
		System.out.println(StaticLoopingFactorialSpreadsheet.getFactorial() 
						* StaticLoopingFactorialSpreadsheet.getFactorial());
		// we can not access 4! and 2! simultaneously without storing them in local variables
		// problem: how to allow multiple stored factorals to be shared by multiple classes
		// Think about it and go to TwoStaticFactorialSpreadsheetUse
	}
	
}
