package lectures.class_dual_roles.instances;

import lectures.class_dual_roles.statics.Factorials;
import lectures.interfaces.FactorialSpreadsheet;

/**
 * This class serves a new role - a template for creating multiple instances of the same behavior.
 */
public class ALoopingFactorialSpreadsheet 
{
	/**
	 * No static n variable declaration, this means these variables are  
	 * created in memory dynamically when we do new ALoopinFactorialSpreadsheet()
	 * to "instantiate" the class. Such a variable is called an instance variable.	
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
