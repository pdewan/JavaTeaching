package lectures.class_dual_roles;


public class ThreeClassPermutations {
	
	public static void printNumPermutations(int n, int r, long numPermutations) {
		System.out.println ("N = " + n + " R = " + r + " Permuntations = " + numPermutations);
	}

	public static void main (String[] args) {
		// why do we need to declare n and r?
		int n = 4;
		int r = 2;		
		// click anywhere in the name Permutations and press F3 (command F3 on Macs) to see the
		// declaration of Permutations.
		// click anywhere in numPermutations and press F3 to go to the method directly
		long numPermutations4Choose2 = Permutations.numPermutations(n, r);
		// is it better to use the alternative below rather than declare n and r as variables
//		numPermutations4Choose2 = Permutations.numPermutations(4, 2);

		printNumPermutations(n, r, numPermutations4Choose2);
		// is it better to use the alternative below rather than declare n and r as variables
//		printNumPermutations(4, 2, numPermutations4Choose2);

		// we recompute 4!
		// useful to remember computed factorials, Factorial Spreadsheet examples will show how	
		r = 3;
		long numPermutations4Choose3 = Permutations.numPermutations(n, r);

		printNumPermutations(n, r, numPermutations4Choose3);

	}
}
