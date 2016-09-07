package lectures.class_dual_roles.statics;


/**
 * SEPARATION OF CONCERNS
 * The separation of concerns principle says that if a set of methods and variables can
 * be defined independently of another set of methods and variables, then the two sets
 * should be in different classes.
 * 
 * Based on this principle, should this class and {@link Factorials} be combined into one class
 * or different classes?
 *
 */
public class Permutations {
	public static long numPermutations(int n, int r) {
		return Factorials.loopingFactorial(n) / Factorials.loopingFactorial(n-r);
	}
	
}
/*
 * Go next to: {@link StaticLoopingFactorialSpreadsheet}
 */
