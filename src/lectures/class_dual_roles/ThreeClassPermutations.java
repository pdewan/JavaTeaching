package lectures.class_dual_roles;

import lectures.java_basics_overview.Factorials;

public class ThreeClassPermutations {
	//public
	static long numPermutations4Choose2;
	static long numPermutations4Choose3; 
	public static void printNumPermutations(int n, int r, long numPermutations) {
		System.out.println ("N = " + n + " R = " + r + " Permuntations = " + numPermutations);
	}

	public static void main (String[] args) {
		// why do we need to declare n and r?
		int n = 4;
		int r = 2;		
		numPermutations4Choose2 = Permutations.numPermutations(n, r);
//		numPermutations4Choose2 = Permutations.numPermutations(4, 2);

//		printNumPermutations(n, r, numPermutations4Choose2);
		printNumPermutations(4, 2, numPermutations4Choose2);

		// we recompute 4!
		r = 3;
//		numPermutations4Choose3 = Permutations.numPermutations(n, r);
		numPermutations4Choose3 = Permutations.numPermutations(4, 3);

		printNumPermutations(n, r, numPermutations4Choose3);
//		printNumPermutations(4, 3, numPermutations4Choose3);

	}
}
