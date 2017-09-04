package lectures.class_dual_roles.statics;


/**
 * SEPARATION OF CONCERNS
 * The separation of concerns principle says that if a set of methods and 
 * variables, S1, can be defined independently of another set of methods and 
 * variables, D2, then the two sets should be in different classes. Dependence
 * is not a commutative. S1 can depend on S2, but S2 can be independent of S1.
 * If one of these sets is independent of the other set, then different classes
 * C1 and C2 should be defined for them, with one class possibly using methods
 * from the the other.
 * 
 * 
 * (T/F) The class Permutations depends on the class Factorials.
 * (T/F) The class Factorials depends on the class Permutations.
 * (T/F) The separation of concerns principle implies that the  methods in
 * Factorials and Permutations should be in different classes.
 * 
 *
 */
public class Permutations {
	public static long numPermutations(int n, int r) {		
		return Factorials.loopingFactorial(n) / Factorials.loopingFactorial(n-r);
	}
	
}
/*
 * Go next to: {StaticLoopingFactorialSpreadsheet}(F3 or CTRL/Command Click on its name)
 */
