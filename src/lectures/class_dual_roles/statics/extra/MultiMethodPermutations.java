package lectures.class_dual_roles.statics.extra;

public class MultiMethodPermutations {
	// for now all methods will be static
	// non-static methods mean object-oriented programming, studied later
	
	public static long loopingFactorial(int aNumber) {
		long aFactorial = 1;
		while (aNumber > 0) {
			aFactorial *= aNumber;
			aNumber -= 1;
		}

		return aFactorial;
	}
	public static void printNumPermutations(int n, int r, long numPermutations) {
		System.out.println ("N = " + n + " R = " + r + " Permuntations = " + numPermutations);
	}

	public static void main (String[] args) {
		// compute n!/(n-r)!
		int n = 4;
		int r = 2;
		long nFactorial = loopingFactorial(n);
		
		long nMinusRFactorial = loopingFactorial(n-r);
		
		long numPermutations4Choose2 = nFactorial/nMinusRFactorial; // 4/(4-2)!
		printNumPermutations(n, r, numPermutations4Choose2);
		// now compute the permutations for 4/(4-3)! to see how permutations grow
		// we do not recompute 4!
		r = 3;
		nMinusRFactorial = loopingFactorial(n-r);		
		long numPermutations4Choose3 = nFactorial/nMinusRFactorial; // 4/(4-3)!
		printNumPermutations(n, r, numPermutations4Choose3);
	}
	// Problem: computing factorial, permutations and comparing permutations for different
	// values of n and r are all mixed together in this class, though thet are logically independent of each other.
}
