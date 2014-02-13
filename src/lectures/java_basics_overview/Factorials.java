package lectures.java_basics_overview;
public class Factorials {
	static int number;
	static long factorial;
	public static void setNumber(int newVal) {
		number = newVal;
		factorial = loopingFactorial(number);
	}
	public static int getNumber(int newVal) {
		return number;
	}
	
	// what does Eclipse say if you replace the first long with int but do not replace the second one?
	// what does Eclipse say if you replace the second long with int but not replace the first one? 
	public static long loopingFactorial(int n) {
		long factorial = 1;
		while (n > 0) {
			factorial *= n;
			n -= 1;
		}
		return factorial;
	}
	// What happens to the times and results when you replace  long with int?
	// try factorial 16 and 17
	// what does Eclipse say if you delete public or static
	public static long recursingFactorial(int n) {
		// What happens if you delete or comment out the next two lines
		if (n <= 1)
			return 1;
		return n*recursingFactorial(n-1);
	}
	
	public static long getFactorial() {
		return factorial;
	}
	
	public static long factorialAfterNumberIncrement() {
		number++;
		return getFactorial();
	}
	
//
//	public static void setFactorial(int n) {
//		while (n > 0) {
//			product *= n;
//			n -= 1;
//		}
//	}
}
