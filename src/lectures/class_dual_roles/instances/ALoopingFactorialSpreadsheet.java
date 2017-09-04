package lectures.class_dual_roles.instances;

import lectures.class_dual_roles.statics.Factorials;
import lectures.interfaces.FactorialSpreadsheet;

/**
 * This class serves a new role - a template for creating multiple instances with the same
 *  behavior.
 */
public class ALoopingFactorialSpreadsheet 
{
	/*
	 * No static in global variable declaration below, this means these variables are  
	 * created in memory dynamically when we do new ALoopinFactorialSpreadsheet()
	 * to "instantiate" the class. Such a global variable is called an instance variable.	
	 * A static variable is created once the first time the class is accessed by main()
	 * or some method called by main(). It is not by default a final variable,
	 * it value is dynamic (can change) but there is only instance of it is created for a 
	 * particular program.
	 */
	
	int number;
	
	long factorial;
//	static long factorial;
	/*
	 * 
	 * An instance variable is any variable
	 * 	that does not have the keyword static next to it.
	 *  that is declared outside a method and does not have the keyword static next to it.
	 *	
	 *  
	 * For each instance variable in a class of a program:
	 *   Memory space is allocated at most once.
	 *   Memory space is allocated multiple times,depending on how many times the class 
	 *   is instantiated in the program.
	 * 
	 * For each static variable in a class of a program:
	 *   Memory space is allocated at most once.
	 *   Memory space is allocated multiple times,depending on how many times the 
	 *   class is instantiated in the program.
	 */
	
	/*
	 * No static in method declarations below as these methods access instance variables.
	 * They are called instance methods.
	 * What happens if you make the variable, factorial, static?
	 * Can this static variable still be accessed by the instance methods.
	 * What happens if you make the method getNumber static.
	 * Can you still directly access the instance variables? 
	 */	
	public int getNumber() {
//	static public int getNumber() {

		return number;
	}
	/*	 
	 * (T/F) An instance variable can be accessed by only instance methods.
	 * (T/F) A static variable can be accessed by only static methods.
	 */	
	public void setNumber(int newValue) {
		number = newValue ;
		factorial = Factorials.loopingFactorial(number);
	}	
	public long getFactorial() {
		return factorial;
	}
}
/*
 * Go to{InstantiatingFactorialSpreadsheetUse}
 */


