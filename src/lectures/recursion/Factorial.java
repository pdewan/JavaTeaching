package lectures.recursion;

import lectures.main_consoleinput.Console;

public class Factorial {

	public static void main (String[] args) {
		while (true) {// loop condition never false
			System.out.println("Compute factorial of?");
			int n = Console.readInt();
			if (n < 0)
				 break;
			System.out.println("factorial = " + factorial(n));
		}
	}
	
	public static int factorial (int n) {
	     int product = 1;
	     while (n > 0) {
	         product *= n;
	         n -= 1;
	     }
	     return product;
	 }


	
}
