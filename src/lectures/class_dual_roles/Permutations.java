package lectures.class_dual_roles;

import lectures.java_basics_overview.Factorials;

public class Permutations {
	public static long numPermutations(int n, int r) {
		return Factorials.recursingFactorial(n) / Factorials.recursingFactorial(n-r);
	}
}
