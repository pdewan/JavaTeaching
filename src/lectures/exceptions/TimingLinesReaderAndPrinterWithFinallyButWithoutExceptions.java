package lectures.exceptions;


public class TimingLinesReaderAndPrinterWithFinallyButWithoutExceptions {

	public static int factorial(int n) {
		System.out.println("Started factorial:"+ n);
		try {
			if (n <= 1) {
				return 1;
			}
			return n * factorial(n-1);
		}
		finally {
			System.out.println("Ended factorial:" + n);
		}
	}
	
	public static void main (String[] args) {
		System.out.println(factorial(2));
	}
	




}
