package lectures.main_consoleinput;

public class AFactorialList {

	public static void main (String[] args) {
		int n = Console.readInt();
		while (n >= 0) {
			System.out.println("factorial = " + factorial(n));
			n = Console.readInt();
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
