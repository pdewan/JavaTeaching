package lectures.class_dual_roles.statics;
/** 
 * Study what the class is doing without doing the exercises to understand 
 * why we use the term spreadsheet for it and what this class adds to Factorials.
 * 
 * Again, there is no main method here, so you cannot execute it.
 * 
 * STATIC VARIABLES
 * We now see a class with variables declared outside a specific method. *
 * They are labeled static - what that keyword means will be clear
 * when we see instance methods later.
 * 
 * ACCESS
 * We also see the kind of access classes have to each other when they are in 
 * different packages.
 *

 */
/** 
 * In the following class declaration, what happens if you remove the 
 * keyword public or specify default class access.
 * Do you get any compile errors in this file or in the class
 * {lectures.class_dual_roles.users.StaticFactorialSpreadsheetUse}
 * which is a different package from this one (it has the extra suffix, users)
 * and refers to this class in the main method?
 * You can hover over an error marker to see the corresponding message.
 * You can see errors on the right of the scrollbar. Clicking on a marker 
 * will take you to corresponding line.
 * Restore public in the class declaration and remove it from setNumber().
 * Do you get any compile errors in this file or in the class
 * {lectures.class_dual_roles.users.StaticFactorialSpreadsheetUse}
 * which is a different package from this one (it has the extra suffix, use)
 * and refers to this class in the main method? 
 * 
 * T/F If public classes C1 and C2 are in different packages, a method in C1 can
 * call methods in C2 with public and default access.
 *  
 * T/F If classes C1 and C2 are in different packages, and class C2 has 
 * default access, a method in C1 can call public methods in C2.
 * 
 * T/F One of the roles of a class is to create walls around its members 
 * (variables and methods) that can restrict access to these members 
 * from other classes.
 * 
 */
public class StaticLoopingFactorialSpreadsheet // public class access
//class StaticLoopingFactorialSpreadsheet // default class access
{
/*
 * Static variables are external or global to methods, 
 * shared by all methods in a class.
 * 
 * A static variable in a class
 * 		must be declared in the main method of a class.
 * 		must not be declared within any method
 * 
 * A static variable in a class
 * 		is a local variable that can be referenced by only the main method
 * 		is a global variable that can be referenced by any method in the class
 * 		is a global variable that can accessed only by public methods 
 * 		in the class
 *
 */
/**
* Look at the comments about getters and setters to understand them.
* 
* What happens when you switch to the alternate commented out declaration 
* of number, which has the final keyword?  
* Comment out the current declaration and uncomment the one
* below. CTRL / can comment and uncomment selected set of lines.
* 
* 	A (non final) static variable declared in a class can be changed
* 		by any method in the class.
* 		only by certain methods called setters.
* 		only by the main method.
* 		only by public methods in the class		
* 
*/
	static int number = 0;
//	static final int number = 0;
	static long factorial;
	/**
	 * 
	 * This is a "getter", which returns the value in number, 
	 * we will formally define getters when we study properties.
	 */
	public static int getNumber() {
/*
 * Uncomment the next line. Does Java complain that your
 * getter changes the number?
 * Comment it back after your experiment to correct the program.
 * 
 * (T/F) getNumber() returns a (non void) value
 * (T/F) getNumber() can change a value.
 * (T/F) getNumber() should change the value (given how it is being used)
 */
		
		// number = 0;
		return number;
	}
	/**
	 * This is a "setter", it changes the number and associated factorial, 
	 * we will formally define setters when we study properties
	 */
	public static void setNumber(int newValue) {
//	static void setNumber(int newValue) {

		number = newValue ;
/*	
 *  Since loopingFactorial is in a different class, we need to 
 *  prefix it with the name of the class in which it is declared.
 *  	 
 *  Does Java accept the alternate assignment statement below?
 *  FYI: google for "import static" when you have spare time.
 *  
 *  (T/F) To call a static method defined in C1 from class C2, 
 *  the name of the method	must be prefixed with class name C1.
 *  
 *  (T/F) To call a static method from C1 in class C1, 
 *  the name of the method must be prefixed with class name C1.
 *  
 *  Look at the name of the package of Factorials and this class?
 *  
 *  (T/F) If class C2 calls a method in class C1, then C2 must import C1
 */
		factorial = Factorials.loopingFactorial(number); 
//		factorial = loopingFactorial(number);
/*
 * 
 */
	}	
	/**
	 * A getter for factorial.
	 */
	public static long getFactorial() {
		return factorial;
	}	
}
/*
 * Next class: {@lectures.class_dual_roles.users.StaticFactorialSpreadsheetUse}
 * (F3 or CTRL/Command Click on its name)
 * 
 */
 
 

