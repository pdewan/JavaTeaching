package lectures.class_dual_roles;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import lectures.interfaces.FactorialSpreadsheet;

public class FactorialSpreadsheetDriver {
	static final int NUMBER_WITH_LARGE_FACTORIAL = 8000;
	// what happens to the times when you change this number to say 2, 100000, and 2000000?
	//  in which cases could you perceive the  time delays?
	public static final long NUMBER_OF_LARGE_FACTORIAL_COMPUTATIONS = 100000;
	// what happens to the output when you switch between the following two initializing-declarations
	// what do you think is happening when you do the switch?
//	static FactorialSpreadsheet factorialSpreadsheet = new ARecursiveFactorialSpreadsheet();
	static ALoopingFactorialSpreadsheet factorialSpreadsheet = new ALoopingFactorialSpreadsheet();
	static BufferedReader inputStream = new BufferedReader(
			new InputStreamReader(System.in));
	public static int readInt() {		
		try { 
			return Integer.parseInt(inputStream.readLine());
		} catch (Exception e) { 
			e.printStackTrace();
			System.out.println(e);
			return 0;
		}
	}	
	public static void testInstanceOf() {
		System.out.println("Is FactorialSpreadsheet:" + (factorialSpreadsheet instanceof FactorialSpreadsheet));
		System.out.println("Is ALoopingFactorialSpreadsheet:" + (factorialSpreadsheet instanceof ALoopingFactorialSpreadsheet));
//		System.out.println("Is ARecursiveFactorialSpreadsheet:" + (factorialSpreadsheet instanceof ARecursiveFactorialSpreadsheet));
	}
	
	public static void main (String[] args) {
		testInstanceOf();
		timeLargeFactorialComputations();
		readNumbersAndPrintFactorials();
	}
	public static void timeLargeFactorialComputations() {
		long startTime = System.currentTimeMillis();
		for (int index = 0; index < NUMBER_OF_LARGE_FACTORIAL_COMPUTATIONS; index++) {
			factorialSpreadsheet.setNumber(NUMBER_WITH_LARGE_FACTORIAL);			
			factorialSpreadsheet.getFactorial() ;
		}
		long endTime = System.currentTimeMillis();
		System.out.println (NUMBER_OF_LARGE_FACTORIAL_COMPUTATIONS + 
				" computations of factorial(" + NUMBER_WITH_LARGE_FACTORIAL + ") took " + 
				 (endTime - startTime) + "ms");
	}
	public static void readNumbersAndPrintFactorials() {
		while (true) { 
			System.out.println("Please enter a non-negative number if you want to continue and a negative number if you want to terminate.");
			int number = readInt();
			if (number < 0)
				// what happens if you delete or comment out the following line
				break; 
			factorialSpreadsheet.setNumber(number);
			System.out.println("Factorial(" + number + ")= " + 
					factorialSpreadsheet.getFactorial());			
		}
	}
}
