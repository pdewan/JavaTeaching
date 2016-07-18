package lectures.class_dual_roles;

public class SingleMethodPermutations {
	static long numPermutations4Choose2;
	static long numPermutations4Choose3; 
	public static void main (String[] args) {
		// compute n!/(n-r)!
		int n = 4;
		int r = 2;
		// compute n!
		long nFactorial = 1; // had to change int to long multiple times
		int nextMultiplier = n;
		while (nextMultiplier > 0) {
			nFactorial *= nextMultiplier;
			nextMultiplier -= 1; // decrement operation
		}
		// compute n-r!
		long nMinusRFactorial = 1;
		nextMultiplier = n-r;
		while (nextMultiplier > 0) {
			nMinusRFactorial *= nextMultiplier;
			nextMultiplier -= 1;
		}
		numPermutations4Choose2 = nFactorial/nMinusRFactorial; // 4/(4-2)!
		System.out.println ("N = " + n + " R = " + r + " Permuntations = " + numPermutations4Choose2);

		// now compute the permutations for 4/(4-3)! to see how permutations grow
		r = 3;
		nMinusRFactorial = 1; // O forgot to patse this line
		nextMultiplier = n-r;
		while (nextMultiplier > 0) {
			nMinusRFactorial *= nextMultiplier;
			nextMultiplier -= 1;
		}
		numPermutations4Choose3 = nFactorial/nMinusRFactorial; // 4/(4-3)!
		System.out.println ("N = " + n + " R = " + r + " Permuntations = " + numPermutations4Choose3);
		
		

	}

}
