package lectures.class_dual_roles.users;

import lectures.class_dual_roles.AnotherStaticLoopingFactorialSpreadsheet;
import lectures.class_dual_roles.Factorials;
import lectures.class_dual_roles.StaticLoopingFactorialSpreadsheet;

public class TwoStaticFactorialSpreadsheetUse {
	
	public static void main (String[] args) {
		StaticLoopingFactorialSpreadsheet.setNumber(4);		
		System.out.println(StaticLoopingFactorialSpreadsheet.getFactorial() 
				* StaticLoopingFactorialSpreadsheet.getFactorial());
		AnotherStaticLoopingFactorialSpreadsheet.setNumber(2);
		// We are using a different class now - AnotherStaticLoopingFactorialSpreadsheet
		// Have a quick look at it to confirm it is a copy of the AnotherStaticLoopingFactorialSpreadsheet
		System.out.println(AnotherStaticLoopingFactorialSpreadsheet.getFactorial() 
				* AnotherStaticLoopingFactorialSpreadsheet.getFactorial());
		// We can now access 4! and 2! simultaneously without storing them in local variables
		System.out.println (StaticLoopingFactorialSpreadsheet.getFactorial()/AnotherStaticLoopingFactorialSpreadsheet.getFactorial());
		// Copy and paste, slution - ugh!
		// What if we want an arbitrary number of store factorials, not known before we start the program
		// Go to InstantiatingFactorialSpreadsheetUse

		
	}
}
