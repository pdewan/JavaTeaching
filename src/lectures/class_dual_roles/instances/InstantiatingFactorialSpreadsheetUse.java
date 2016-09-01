package lectures.class_dual_roles.instances;


public class InstantiatingFactorialSpreadsheetUse {
	
	public static void main (String[] args) {
		/**
		 *
		 * The previous class is being instantiated now before use by doing a new
		 * Each new creates a new copy of the instance variables declared in the class
		 * It an instance of the class and can  be assigned
		 * to a variable whose type is the name of the class of the instance
		 * Instances are called objects
		 * The class of an object is the class instantiated to create the object.
		 * 
		 * Not all values in Java are objects. ints, doubles, char, boolean are primitive values. 
		 * These are not instantiated and thus do not have classes.
		 * 
		 * So you can now answer:
		 * (T/F) A primitive value such as 5 is not an instance of any class.
		 * (T/F) One of the roles of a class is to define a new type and an infinite set of values (called instances) of that type.
		 * 
		 */
		ALoopingFactorialSpreadsheet factorial4 = new ALoopingFactorialSpreadsheet();
		/**
		 * 		
		 * What do you expect from the following prints when you uncomment them
		 * An easy way comment and uncomment a line or a group of lines
		 * is to click on the first character of the line or select the lines
		 * and press CTRL/ 
		 * 
		 */
		
//		System.out.println(factorial4 instanceof ALoopingFactorialSpreadsheet);
//		System.out.println(new ALoopingFactorialSpreadsheet() instanceof ALoopingFactorialSpreadsheet);
//		System.out.println("hello world" instanceof ALoopingFactorialSpreadsheet);
//		System.out.println("hello world" instanceof String);
//		System.out.println (factorial4.getClass());
//		System.out.println ("hello world".getClass());
//		System.out.println (5.getClass()); // 5 is a primitive
		factorial4.setNumber(4);		
		System.out.println(factorial4.getFactorial() 
				* factorial4.getFactorial());
		ALoopingFactorialSpreadsheet factorial2 = new ALoopingFactorialSpreadsheet();
		factorial2.setNumber(2);
		System.out.println(factorial2.getFactorial() 
				* factorial2.getFactorial());
		/**
		 * We can access 4! and 2! simultaneously without storing them in local variables
		 */
		System.out.println (factorial2.getFactorial()/factorial2.getFactorial());
		/**
		 * We can create an arbitrary number of factorial spreadsheets, possibly in a loop
		 */

		/*
		 * Is the following legal
		 */
//		ALoopingFactorialSpreadsheet.setNumber(3);
		/*
		 * So you can now answer:
		 * 
		 * Think of operations that you can perform on a 
		 * car (howManyMilesDriven) and on a car factory (howManyCarsProduced). 
		 * Draw analogies between these operations and static and instance methods.
		 * Draw analogies between a car/factory and class/instance.
		 * Does it make sense to allow instance methods to access static variables?
		 * Does it make sense to allow static methods to access instance variables?
		 */		
	}
	// Go to:{@link lectures.class_dual_roles.instances.PropertiesAnalyzer}
}
