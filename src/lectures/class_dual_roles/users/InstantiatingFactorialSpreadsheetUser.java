package lectures.class_dual_roles.users;

import lectures.class_dual_roles.ALoopingFactorialSpreadsheet;
import lectures.java_basics_overview.Factorials;

public class InstantiatingFactorialSpreadsheetUser {
	
	public static void main (String[] args) {
		ALoopingFactorialSpreadsheet factorial4 = new ALoopingFactorialSpreadsheet();
		factorial4.setNumber(4);		
		System.out.println(factorial4.getFactorial() 
				* factorial4.getFactorial());
		ALoopingFactorialSpreadsheet factorial2 = new ALoopingFactorialSpreadsheet();
		factorial2.setNumber(2);
		System.out.println(factorial2.getFactorial() 
				* factorial2.getFactorial());
		// we can  access 4! and 2! simultaneously without storing them in local variables
		System.out.println (factorial2.getFactorial()/factorial2.getFactorial());
		// we can create an arbitrary number of factorial spreadsheets

		

		
	}
}
