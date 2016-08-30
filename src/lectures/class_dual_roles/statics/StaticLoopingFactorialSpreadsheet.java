package lectures.class_dual_roles.statics;
/** 
 * STATIC VARIABLES
 * We now see a class with variables declared outside a specific method. *
 * They are labeled static - what that keyword means will be clear
 * when we see instance methods later
 *
 */
/**
 * In the following class declaration, what happens if you remove the keyword public 
 * to specify default class access or replace it with private to give private access
 * Do you get any compile errors in this file or in the class
 * {@link StaticLoopingFactorialSpreadsheetUse}?
 * You can hover over an error marker to see the corresponding message
 * 
 */
public class StaticLoopingFactorialSpreadsheet // public class access
//class StaticLoopingFactorialSpreadsheet // default class access
//private class StaticLoopingFactorialSpreadsheet // private class access
{
	/**
	* Static variables are external or global to methods, shared by all static methods in a class.
	* What hapens when you switch to the alternate declaration of number? 
	*/
	static int number = 0;
//	static final int number = 0;
	static long factorial;
	/**
	 * 
	 * This is a "getter", which returns the number, we will formally define getters later
	 */
	public static int getNumber() {
		/**
		 * Uncomment the next line. Does Java complain?
		 * Comment it back after your experiment.
		 */
		// number = 0;
		return number;
	}
	/**
	 * This is a "setter", it changes the number and associated factorial, we will formally define setters later
	 */
	public static void setNumber(int newValue) {
		number = newValue ;
		/**		 
		 *  Does Java accept the alternate assignment statement below?
		 *  FYI: google for "import static" when you have spare time
		 *  Why did we not need to import the class Factorials?
		 */
		factorial = Factorials.loopingFactorial(number);
//		factorial = loopingFactorial(number);

	}	
	/**
	 * A getter for factorial.
	 */
	public static long getFactorial() {
		return factorial;
	}
	
	
}
