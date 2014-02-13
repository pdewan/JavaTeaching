package lectures.java_basics_overview;
public class Permutations {
	public static long permutations(int n, int r) {
		return Factorials.recursingFactorial(n) / Factorials.recursingFactorial(n-r);
	}
}
