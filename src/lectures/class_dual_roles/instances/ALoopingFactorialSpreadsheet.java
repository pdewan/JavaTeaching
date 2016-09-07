package lectures.class_dual_roles.instances;

import lectures.class_dual_roles.statics.Factorials;
import lectures.interfaces.FactorialSpreadsheet;

/**
 * This class serves a new role - a template for creating multiple instances of the same behavior.
 */
public class ALoopingFactorialSpreadsheet 
{
	/*
	 * 
	 * No static in variable declaration below, this means these variables are  
	 * created in memory dynamically when we do new ALoopinFactorialSpreadsheet()
	 * to "instantiate" the class. Such a variable is called an instance variable.	
	 * A static variable is created once the first time the class is accessed by main()
	 * or some method called by main().
	 * 	 
	 * Did you have to instantiate a class to execute static methods or access static
	 * variables? 
	 * 
	 * 
	 * 
	 * So you can now answer:
	 * 
	 * An instance variable is any variable
	 * 	that does not have the keyword static next to it.
	 *  that is declared outside a method and does not have the keyword static next to it.
	 *	
	 *  
	 * For each instance variable in a class of a program:
	 *   Memory space is allocated at most once.
	 *   Memory space is allocated multiple times,depending on how many times the class is instantiated in the program.
	 * 
	 * For each static variable in a class of a program:
	 *   Memory space is allocated at most once.
	 *   Memory space is allocated multiple times,depending on how many times the class is instantiated in the program.
	 
	 * (T/F) It is possible to call a static method directly on a class without instantiating it.
	 * (T/F) It is possible to call an instance method directly on a class without instantiating it. 
	 * 
	 * The next two exercises involve changing the delcration of number and getNumber() help you answer
	 * the questions:
	 * 
	 * (T/F An instance variable can be accessed by only instance methods.
	 * (T/F) A static variable can be accessed by only static methods.
	 * 	
	 */
	int number;
	/*
	 * What happens if you switch to the alternate declaration below?
	 */
	long factorial;
//	static long factorial;
	/*
	 * No static in method declarations as these methods access instance variables.
	 * They are called instance methods.
	 * What happens if you switch to the alternate declaration below? 
	 */
	public int getNumber() {
//	static public int getNumber() {

		return number;
	}
	public void setNumber(int newValue) {
		number = newValue ;
		factorial = Factorials.loopingFactorial(number);
	}	
	public long getFactorial() {
		return factorial;
	}
}
/*
 * Go to{@link InstantiatingFactorialSpreadsheetUse}
 */
 

