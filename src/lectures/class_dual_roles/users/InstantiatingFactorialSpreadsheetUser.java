package lectures.class_dual_roles.users;

import lectures.class_dual_roles.ALoopingFactorialSpreadsheet;
import lectures.java_basics_overview.Factorials;

public class InstantiatingFactorialSpreadsheetUser {
	
	public static void main (String[] args) {
		// the class is being instantiated now before use by doing a new
		// each new creates a new copy of the instance variables declared in the class
		// It an instance of the class and can  be assigned
		// to a variable whose type is the name of the class of the instance
		// Instances are called objects
		// The class of an object is the class instantiated to create the object
		// not all values in Java are objects. ints, doubles, char, boolean are primitive values 
		// that are not instantiated and thus do not have classed
		ALoopingFactorialSpreadsheet factorial4 = new ALoopingFactorialSpreadsheet();
		// what do you expect from the following prints when you uncomment them
		// an easy way comment and uncomment a line or a group of lines
		// is to click on the first character of the line or select the lines
		// and press CTRL/ 
//		System.out.println(factorial4 instanceof ALoopingFactorialSpreadsheet);
//		System.out.println(new ALoopingFactorialSpreadsheet() instanceof ALoopingFactorialSpreadsheet);
//		System.out.println("hello world" instanceof ALoopingFactorialSpreadsheet);
//		System.out.println("hello world" instanceof String);
//		System.out.println (factorial4.getClass());
//		System.out.println ("hello world".getClass());
//		System.out.println (5.4.getClass());
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
