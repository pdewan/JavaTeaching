package lectures.exceptions.extra;
/**
 * FINALLY FOR ARBITRAY BRANCHING
 * 
 * Study the program. Can you understand what finally does here.
 * 
 * Debug-Run the program and press F6 to see where you land after the break
 * and see the output.
 * 
 * A post condition is a condition that is also a precondition
 *
 */

public class FactorialWithFinallyButWithoutExceptions {
	/**
	 * Use of finally to not replicate shared exit code
	 */
	public static int factorial(int n) {
		System.out.println("Started factorial:"+ n);
		try {
			if (n <= 1) {
				return 1; // put break point here
			}
			return n * factorial(n-1); // put break point here
		}
		finally {
			System.out.println("Ended factorial:" + n);
		}
	}	
	public static void main (String[] args) {
		System.out.println(factorial(2));
	}
}
