package lectures.exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * We see here several new features including two exception operations 
 * and instantiation and use of an exception defined by us.
 *
 * Consider the comments in main() and numberOfInputLines and answer the questions.
 *  
 * Go to {@link AMissingArgumentException} after that
 */
public class LinesReaderAndPrinterUsingProgrammerDefinedException {
	
	public static void main(String args[]) {
		try {
			echoLines(numberOfInputLines(args));
		} 
		/*
		 * Comment this out when asked
		 */
		catch (AMissingArgumentException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} 
		catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		/*
		 * Uncomment this when asked
		 */
//		catch (AMissingArgumentException e) {
//			System.out.println(e.getMessage());
//			e.printStackTrace();
//		}
	}

	static BufferedReader input = new BufferedReader(new InputStreamReader(
			System.in));

	public static void echoLines(int numberOfInputLines) throws IOException {
		for (int inputNum = 0; inputNum < numberOfInputLines; inputNum++) {
			System.out.println(input.readLine());
		}
	}
	
	public static int numberOfInputLines(String[] args)
		/*
		 * comment this out to see if it is checked on unchecked
		 */
			throws AMissingArgumentException
	{
		try {
			return Integer.parseInt(args[0]);
		} catch (ArrayIndexOutOfBoundsException e) {
			/*
			 * Comment the following and uncomment the 
			 * commented statement below
			 * 
			 */
			throw new AMissingArgumentException("First argument missing");
//			return -1;// error code
		}
	}
}
/**
 * EXCEPTION OPERATIONS
 * Run the program without supplying an argument and look at the output.
 * 
 * 
 * Which stack trace is printed:
 * (a) the one at the point the exception is thrown (in numberOfInputLines) - 
 * this would mean numberOfInputLines is the top element of the stack.
 * (b) the one at the point the exception is caught in main - this would mean main
 * is the top element of the stack.
 * 
 * Comment out the throws clause in numberOfInputLines.
 * 
 * Do you get an error?
 * 
 * (T/F) AMissingArgumentException is a checked exception.
 * 
 * (T/F) A suclass of a checked exception is also a checked exception.
 * 
 * Uncomment the throws clause
 * 
 * Look at the catch block in numberOfInputLines.
 * 
 * (T/F) It is possible for programmers to create and throw Exception objects.
 * 
 * (T/F) It is possible for a method that catches a certain kind of exception to
 * throw another kind of exception to its caller.
 * 
 * (T/F) It is possible for a method that catches an unchecked exception to throw
 * a checked exception to its caller
 * 
 * Follow the commenting and un-commenting instructions in the catch block.
 * 
 * (T/F) It makes sense to execute a statement after an exception is thrown.
 * 
 * 
 * Go to AMissingArgumentException and answer the question in it and return back.
 * 
 * 
 * CATCH AND IS-A
 * 
 * Comment out the first catch block and debug-run the program with no break point. 
 * 
 * 
 * Put breakpoint in the numberOfInputLines() try block.
 * 
 * Debug-Run the program and follow the control flow. 
 * 
 * (T/F) A catch block can handle exceptions of multiple types.
 * 
 * (T/F) A catch block that is declared to handle an exception of type T1 can handle
 * an exception of type T2, if T2 IS-A T1.
 * 
 * Remove the comments around the third catch block. What happens?
 * 
 * (T/F) When an exception is thrown in some try block, then it is caught by the
 * first catch block that can handle it regardless of the exact type of the parameter. 
 * 
 * Next class: IntraMethodPropagation
 */


