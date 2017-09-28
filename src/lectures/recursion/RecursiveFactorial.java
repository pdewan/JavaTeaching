package lectures.recursion;

public class RecursiveFactorial {

	public static void main(String[] args) {
		System.out.println(factorial(2));
	}
	
	public static int factorial(int n) {
		if (n == 0)
			return 1;
		else if (n < 0)
			return factorial(-n);
		else 
			return n*factorial(n-1);
	}
	
}
