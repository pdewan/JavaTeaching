package lectures.class_dual_roles.instances;


public class NextTimeInstantiatingFactorialSpreadsheetUse {
	
	public static void main (String[] args) {
		/*		 
		 * The previous class is being instantiated now before use by doing a new
		 * Each new creates a new copy of the instance variables declared in the class
		 * It an instance of the class and can be assigned
		 * to a variable whose type is the name of the class of the instance.
		 * Instances are called objects.
		 * The class of an object is the class instantiated to create the object.
		 */
		
		ALoopingFactorialSpreadsheet factorial4 = new ALoopingFactorialSpreadsheet();
		/*
		 * Not all values in Java are objects. 
		 * ints, doubles, char, boolean are primitive values. 
		 * These are not instantiated and thus do not have classes.
		 * A primitive value is not an instance of any class, that is,
		 * does not have a class.
		 * 
		 * (T/F) One of the roles of a class is to define a new type and a 
		 * set of values (called instances) of that types.
		 * 
		 */
		
		/*
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
		/*
		 * (T/F) new ALoopingFactorialSpreadsheet() is an instance of ALoopingFactorialSpreadsheet.
		 * (T/F) "hello world" is an instance of ALoopingFactorialSpreadsheet.		 
		 * (T/F) "hello World" is an instance of a class.
		 * (T/F) 5 is an instance of a class.
		 * (T/F) 5 is a primitive value.
		 * (T/F) "hello World" is a primitive value.
		 */
		System.out.println(factorial4.getFactorial() 
				* factorial4.getFactorial());
		
		/*
		 * Creating another instance of our new type.
		 * We can create an arbitrary number of factorial spreadsheets, 
		 * possibly in a loop
		 */
		ALoopingFactorialSpreadsheet factorial2 = new ALoopingFactorialSpreadsheet();
		/*
		 * A class can be instantiated an arbitrary number of times (modulo
		 * memory constraints).
		 */
		factorial2.setNumber(2);
		System.out.println(factorial2.getFactorial() 
				* factorial2.getFactorial());
		
		System.out.println (factorial2.getFactorial()/factorial2.getFactorial());
		

	
//		ALoopingFactorialSpreadsheet.setNumber(3);
		/*
		 * Is uncommenting the above statement legal?
		 * 
		 * (T/F)An instance method can be invoked on a class, that is, it can be
		 * invoked by prefixing the method name with the (name of the class + ".').
		 * 
		 
		 * (T/F)A static method can be invoked on a class, that is, it can be
		 * invoked by prefixing the method name with the (name of the class + ".').
		 * 
		 * (T/F) A class C1 can call a static method declared in class C2 without 
				instantiating it.
		 * (T/F) A class C1 can call an instance method declared in class C2 without 
				instantiating it (assuming no inheritance).
		 *
		 */
	}
	 
}
/*
 * Go to:{PropertiesAnalyzer}
 */
 
