package lectures.class_dual_roles.statics;
/**
 * LOOPING and RECURSIVE FACTORIAL
 * This class shows how one can compute a factorial, both
 * in a loop and recursively. 
 * There is no main method here.
 * The methods in this class are meant to be called directly or indirectly
 * by a main method in some other class.
 * As This class does not have a main method, do not try to run it.
 */
/**
 * The next exercises help you answer the questions:
	 
 * T/F If classes C1 and C2 are in the same package, and class C2 has default access, 
 * a method in C1 can call public methods  in C2. 
 * T/F One of the roles of a package is to create walls around its component classes to restrict accesses to
 * these classes (and its members) from classes in other packages.
 * 
 * 
 * In the following class declaration, what happens if you remove the keyword public 
 * to specify default class access rather than public access. 
 * (Please do not put the keyword protected, it is banned from discussion until
 * we learn inheritance.)
 * Do you get any compile errors in this file or in the class
 * {@link StaticLoopingFactorialSpreadsheet}, which is the same package as this class and calls
 * loopingFactorial() from the method setNumber in that class?
 * You can hover over an error marker to see the corresponding message
 * and click on it to see a possible fix. 
 * 
 * 
 *
 */
public class Factorials // public class access
//class Factorials // default class access, no access keyword
{
	/**
	 * In the following method declaration, what happens if you remove the keyword public
	 * to give default access to the method loopingFactorial.	
	 * Do you get any compile errors in this file or in the class
	 * {@link StaticLoopingFactorialSpreadsheet}?
	 * You can hover over an error marker to see the corresponding message.	
	 * 
	 */	
	public static long loopingFactorial(int aNumber)
//	static long loopingFactorial(int aNumber) // default access to loopingFactorial

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
// Go next to: {@link Permutations}

