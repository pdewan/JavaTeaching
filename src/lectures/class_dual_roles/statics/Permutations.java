package lectures.class_dual_roles.statics;


public class Permutations {
	public static long numPermutations(int n, int r) {
		return Factorials.loopingFactorial(n) / Factorials.loopingFactorial(n-r);
	}
}
