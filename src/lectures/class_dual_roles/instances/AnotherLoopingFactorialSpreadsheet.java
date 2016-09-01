package lectures.class_dual_roles.instances;

import lectures.class_dual_roles.statics.Factorials;

/**
 * STORED VS COMPUTED PROPERTIES
 * If a property is stored, then an instance variable directly stores its value.
 * If a property is computed if it is not stored, its value is computed from variables
 * that do not directly store its value.
 * 
 *
 */

public class AnotherLoopingFactorialSpreadsheet 
{
	/*
	 * factorial is no longer an instance variable as it is computed
	 * each time getFactorial() is called  
     */ 
	int number;

	public int getNumber() {
		return number;
	}
	/*
	 * setNumber no longer computes the factorial as it is computed
	 * each time getFactorial() is called  
	 */
	
	public void setNumber(int newValue) {
		number = newValue ;
	}
	/*
	 * The getter computes the factorial only on demand
	 */	 
	public long getFactorial() {
		return Factorials.loopingFactorial(number);
	}
	/*
	 * So now you can answer the question:
	 * What are the pros and cons of making a property computed instead of stored?
	 */
}
