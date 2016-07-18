package lectures.dual_roles;

import lectures.java_basics_overview.Factorials;

public class TwoStaticFactorialSpreadsheetUser {
	
	public static void main (String[] args) {
		StaticLoopingFactorialSpreadsheet.setNumber(4);		
		System.out.println(StaticLoopingFactorialSpreadsheet.getFactorial() 
				* StaticLoopingFactorialSpreadsheet.getFactorial());
		AnotherStaticLoopingFactorialSpreadsheet.setNumber(2);
		System.out.println(AnotherStaticLoopingFactorialSpreadsheet.getFactorial() 
				* AnotherStaticLoopingFactorialSpreadsheet.getFactorial());
		// we can now access 4! and 2! simultaneously without storing them in local variables
		System.out.println (StaticLoopingFactorialSpreadsheet.getFactorial()/AnotherStaticLoopingFactorialSpreadsheet.getFactorial());

		
	}
}
