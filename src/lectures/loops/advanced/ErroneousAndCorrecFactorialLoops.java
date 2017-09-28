package lectures.loops.advanced;

import lectures.main_consoleinput.Console;

public class ErroneousAndCorrecFactorialLoops {
	
	public static void offByExtraandMissingOneFactorial() {
		int product = 1;
		int n = 2;
		int counter = 0; 
		while (counter < n) {
			product *= counter;
			counter += 1;
		}
		System.out.println (product);	
		
	}
	
	public static void offByMissingOneFactorial() {
		int product = 1;
		int n = 2;
		int counter = 1; 
		while (counter < n) {
			product *= counter;
			counter += 1;
		}
		System.out.println (product);	
		
	}
	
	public static void factorial() {
		int product = 1;
		int n = 2;
		int counter = 1; 
		while (counter <= n) {
			product *= counter;
			counter += 1;
		}
		System.out.println (product);	
		
	}
	
	public static void factorialBetterName() {
		int product = 1;
		int n = 2;
		int nextMultiplier = 1; 
		while (nextMultiplier <= n) {
			product *= nextMultiplier;
			nextMultiplier += 1;
		}
		System.out.println (product);		
	}
	
	public static void factorialEarlyIncrementingOffByOne() {
		int product = 1;
		int n = 2;
		int prevMultiplier = 0; 
		while (prevMultiplier <= n) {
			prevMultiplier += 1;
			product *= prevMultiplier;
		}
		System.out.println (product);		
	}
	public static void factorialEarlyIncrementing() {
		int product = 1;
		int n = 2;
		int prevMultiplier = 0; 
		while (prevMultiplier < n) {
			prevMultiplier += 1;
			product *= prevMultiplier;
		}
		System.out.println (product);
		
	}
	
	public static void factorialCheckingEqualityInfiniteLoop() {
		int product = 1;
		int n = -5;
		int prevMultiplier = 0; 
		while (prevMultiplier != n) {
			prevMultiplier += 1;
			product *= prevMultiplier;
		}
		System.out.println (product);

		
	}
	

	public static void factorialNoIncrementInfiniteLoop() {
		int product = 1;
		int n = -5;
		int prevMultiplier = 0; 
		while (prevMultiplier != n) {
			product *= prevMultiplier;
		}
		System.out.println (product);		
	}
	
	public static void incrementInWrongDirection() {
		int product = 1;
		int n = 2;
		int prevMultiplier = 0; 
		while (prevMultiplier < n) {
			 prevMultiplier -= 1;
			product *= prevMultiplier;
		}
		System.out.println (product);		
	}
	
	public static void decrementingFactorial() {
		int n = 2;
		int product = 1;
		while (n > 0) {
			product *= n;
			n -= 1;
		}
		System.out.println(product);	
	}
	
	public static void DecrementingFactorialDecrementingAssignment() {
		int n = 2;
		int product = 1;
		while (n > 0) {
			product *= n;
			n--;
		}
		System.out.println(product);	
	}
	
	public static int factorial(int n) {
		int product = 1;
		while (n > 0) {
			product *= n;
			n -= 1;
		}
		return product;
	}

	public static void factorialsWithDuplicateReadInt() {
		int newVal = Console.readInt();
		while (newVal >= 0) {
			System.out.println("factorial =" + factorial(newVal));
			newVal = Console.readInt();
		}

	}
	public static void factorialsWithBreak() {
		while (true) { // loop condition never false
			int n = Console.readInt();
			if (n < 0)
				break;
			System.out.println("factorial = " + factorial(n));
		}
	}

	public static void main(String[] args) {
		if (args.length > 0)
			System.out.println(args[0]);
		factorialsWithBreak();
	}

}
