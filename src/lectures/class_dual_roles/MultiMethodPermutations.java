package lectures.class_dual_roles;

public class MultiMethodPermutations {
	static long numPermutations4Choose2;
	static long numPermutations4Choose3; 
	public static long loopingFactorial(int aNumber) {
		long aFactorial = 1;
		while (aNumber > 0) {
			aFactorial *= aNumber;
			aNumber -= 1;
		}
//		numPermutations4Choose2 = 0; // this variable does not concern factorial computation		
// Problem: computing factorial, permutations and comparing permutations for different
// values of n and r are all mixed together in this problem.
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
		
		numPermutations4Choose2 = nFactorial/nMinusRFactorial; // 4/(4-2)!
		printNumPermutations(n, r, numPermutations4Choose2);
		// now compute the permutations for 4/(4-3)! to see how permutations grow
		// we do not recompute 4!
		r = 3;
		nMinusRFactorial = loopingFactorial(n-r);		
		numPermutations4Choose3 = nFactorial/nMinusRFactorial; // 4/(4-3)!
		printNumPermutations(n, r, numPermutations4Choose3);
	}

}
