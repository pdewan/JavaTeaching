package lectures.class_dual_roles.statics;
/** 
 * 
 * Study what the class is doing without doing the exercises to understand 
 * why we use the term spreadsheet for it and what this class adds to Factorials.
 * 
 * This class has both public and non public methods.
 * 
 * Again, there is no main method here, so you cannot execute it.
 * 
 * STATIC VARIABLES
 * We now see a class with variables declared outside a specific method. *
 * They are labeled static - what that keyword means will be clear
 * when we see instance methods later.
 * 

 */
public class StaticLoopingFactorialSpreadsheet // public class access

{
/*
 * A global variable is external or global to methods, 
 * shared by/accessible to all methods in a class.
 * 
 * A variable that is not global is called a local variable. It can be a 
 * parameter of a method or a variable declared in it.
 * 
 * A class that has no global variable is a stateless class.
 * 
 * (T/F) Factorials is a stateless class.
 * 
 * (T/F) StaticLoopingFactorialSpreadsheet is a stateless class.
 * 
 * 
 * A static variable in a class
 * 		must be declared in the main method of a class.
 * 		must not be declared within any method
 * 
 * A static variable in a class
 * 		is a local variable referenced by only the main method
 * 		is a global variable that can be referenced by any method in the class
 * 		is a global variable that can accessed by only by public methods 
 * 		in the class
 *
 * (T/F) A parameter of a method is a local variable.
 * (T/F) A local variable can have the keyword static in its declaration.
 */
	/*
	 * 
	 * What happens when you switch to the alternate commented out declaration 
	 * of number, which has the final keyword?  
	 * Comment out the current declaration and uncomment the one
	 * below. CTRL / can comment and uncomment selected set of lines 
	 */
	static int number = 0;
//	static final int number = 0;

	/*
	 * 	A (non final) static variable declared in a class can be changed
	 * 		by any method in the class.
	 * 		only by certain methods called setters.
	 * 		only by the main method.
	 * 		only by public methods in the class		
	 * 
	 */
	
	static long factorial;
	/*
	 * 
	 * The following method is called a "getter", which returns the value in number, 
	 * we will formally define getters when we study properties.
	 */
	public static int getNumber() {
		/*
		 * Uncomment the next line. Does Java complain that your
		 * getter changes the number?
		 * Comment it back after your experiment to correct the program.		 
		 */
		
		// number = 0;
		/*		 
		 * (T/F) (In class StaticLoopingFactorialSpreadsheet)
		 *    getNumber() returns a (non void) value.
		 * (T/F) getNumber() can change a global variable.
		 * (T/F) getNumber() should change a global variable. 
		 */
		return number;
	}
	/*
	 * This is a "setter", it changes the number and associated factorial, 
	 * we will formally define setters when we study properties
	 */
	public static void setNumber(int newValue) {

		number = newValue ;
		/*	
		 *  Look at the assignment below and use commenting and uncommenting to
		 *  switch between it and the uncommented one below. Look at the error
		 *  messages if any when you do the swap.		 
		 */
		factorial = Factorials.loopingFactorial(number); 
//		factorial = loopingFactorial(number);
		/*		 
		 *  (T/F) To call a static method defined in C1 from class C2, 
		 *  the name of the method must be prefixed with class name C1.
		 *			  
		 *  
		 */

	}	
	/*
	 * A getter for factorial. We will define getters formally later.
	 */
	public static long getFactorial() {
		return factorial;
	}
	/*
	 * A non public method
	 */
	static void print() {
		System.out.println ("Number: " + number + " Factorial:" + factorial);
	}
}
/*
 * Next go to the package-info file in  package lectures.class_dual_roles.instances
 * 
 */
 
 

