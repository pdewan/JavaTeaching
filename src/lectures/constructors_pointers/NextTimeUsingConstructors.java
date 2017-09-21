package lectures.constructors_pointers;

public class NextTimeUsingConstructors {
/*
 * We see below examples of named constants.
 */
	 static final double EXAMPLE_HEIGHT = 1.77;
	 static final double EXAMPLE_WEIGHT = 75;
 /*
  * A named constant is a final variable- a variable that that cannot be changed later
  * and whose value is known at program writing time.
  * 
  * An unnamed constant or literal is a value such as the
  * the double 1.77 and the String "hello" that literally or directly
  * denotes a value. 
  * 
  * A named constant gives a name to a literal that would otherwise be 
  * magic to the program reader.
  * 
  * Make sure magic literals (numbers and strings) do not appear in the program.
  * Named constants should be static as they do not change from instance to instance. 
  * (T/F) A named constant is a final variable whose value is known at program 
  * writing time.
  * (T/F) A magic literal is a number, string or some other literal
  *  whose meaning/purpose is not clear.
  * (T/F) Named constants increase magic literals.
  */
	 
 /**
  * Example of a method that takes a parameter
  * whose type is a class. Invokes getters.
  */
	public static void print(ABMISpreadsheet aBMISpreadsheet) {
		System.out.println ("Height:" + aBMISpreadsheet.getHeight() + 
				" Weight:" + aBMISpreadsheet.getWeight() +
				" BMI " + aBMISpreadsheet.getBMI());
	}

	public static void callPrintln(ABMISpreadsheet aBMISpreadsheet) {
		System.out.println ("aBMISpreadsheet hashcode:" + 
				Integer.toHexString(aBMISpreadsheet.hashCode()));
		System.out.println ("aBMISpreadshee:" + aBMISpreadsheet);
	}
	
	/**
	 * Example of use of setters
	 */
	public static void set(ABMISpreadsheet aBMISpreadsheet){
		aBMISpreadsheet.setWeight(EXAMPLE_WEIGHT);
		aBMISpreadsheet.setHeight(EXAMPLE_HEIGHT);
	}
/*
 * Study main, run it, and understand its output.
 */
	public static void main (String[] args) {
	
		// Instantiate the class ABMISpreadsheet
		ABMISpreadsheet aBMISpreadsheet = new ABMISpreadsheet();
		
		// understand println
		callPrintln(aBMISpreadsheet);
		
		// understand instantiation vs initialization
		System.out.println("Instantiated object:");
		print(aBMISpreadsheet);
		
		set(aBMISpreadsheet);
		System.out.println("Initialized object:");
		print(aBMISpreadsheet);
		
		// understand use of (parameterized) constructors
		System.out.println("Instantiated and initialized object:");
		/*
		 * Does it make sense for the height or weight to ever be 0?
		 * The following uses a different syntax for new.
		 * It initialized the height and weight when instantiating the class.
		 * It makes sure the instance variables in the class are initialized to values 
		 * specified  by the use of the class
		 */
		aBMISpreadsheet = new ABMISpreadsheet(EXAMPLE_HEIGHT, EXAMPLE_WEIGHT);
		print(aBMISpreadsheet);		
	}
/*
 * A memory address is an int from 0 to MemorySize -1. 
 * Every object loaded in memory has a unique memory address
 * A hashcode is also a number, about which you will learn in great depth
 * in your data structure course. 
 * Multiple objects can have the same hashcode.
 * Both memory addresses and hashcodes can be printed using hex, in which case
 * you will find both digits and letters in their representation.
 * To answer the question below, you need to see the printouts created by
 * print().
 * 
 * Look at 
 * If c is an instance of C, one of the things println(c) displays is:
 *     a) the properties of c.
 *     b) the memory address of c.
 *     c) the hashcode of c.
 */
	
/*
 * In UsingConstructors, print() displays:
 *    a) the properties of its argument.
 *    b) the memory address of its argument.
 *    c) the hashcode of its argument.     
 */

/*
 * (T/F) It is possible to create an instance of ABMISpreadsheet whose
 * height and weight properties are 0.
 * (T/F) It is possible to create an instance of ABMISpreadsheet whose
 * BMI property is not a number (NaN).
 * 
 * (T/F) It makes sense for an instance of ABMISpreadsheet to have height and
 * weight set to 0.  
 * 
 * (T/F) (Without *directly* calling setters) It is possible to create an instance of 
 * ABMISpreadsheet whose height and weight properties are initialized to values 
 * chosen by the instantiator.
 */
/*
 * Next class {ABMISpreadsheet}
 * to constructor implementation.
 */
}
