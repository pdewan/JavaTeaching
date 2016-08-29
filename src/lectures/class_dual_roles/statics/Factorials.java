package lectures.class_dual_roles.statics;
/**
 * LOOPING and RECURSIVE FACTORIAL
 * This class shows how one can compute a factorial, both
 * in a loop and recursively.
 */
/**
 * In the following class declaration, what happens if you remove the keyword public 
 * to specify default class access.
 * Do you get any compile errors in this file or in the class
 * {@link StaticLoopingFactorialSpreadsheet}?
 * You can hover over an error marker to see the corresponding message
 * and click on it to see a possible fix
 *
 */
public class Factorials // public class access
//class Factorials // default class access
{
	/**
	 * In the following method declaration, what happens if you remove the keyword public 
	 * or replace it with private.
	 * Do you get any compile errors in this file or in the class
	 * StaticLoopingFactorialSpreadsheet?
	 * You can hover over an error marker to see the corresponding message
	 */	
	public static long loopingFactorial(int aNumber)
//	static long loopingFactorial(int aNumber) 
//	private static long loopingFactorial(int aNumber)

	{
		long aFactorial = 1;
		while (aNumber > 0) {
			aFactorial *= aNumber;
			aNumber -= 1;
		}
		return aFactorial;

	}
	public static long recursingFactorial(int aNumber) {
		/*
		 * Base case, this means no recursive call takes place.
		 * There can be multiple base cases in a recursive method
		 */
		if (aNumber <= 1) {
			return 1;
		}
		/*
		 * Recursive case
		 */
		return aNumber*recursingFactorial(aNumber-1);		
	}
}
