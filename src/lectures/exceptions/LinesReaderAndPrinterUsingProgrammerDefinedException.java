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
	/**
	 * EXCEPTION OPERATIONS
	 * Run the program without supplying an argument and look at the output.
	 * Which stack trace is printed for {@link AMissingArgumentException}, 
	 * the one at the point the exception is thrown (in numberOfInputLines)
	 * or the one at the point the exception is caught in main?
	 * 
	 * Why would you print the stack trace rather than the message?
	 * 
	 * CATCH AND IS-A
	 * Comment the first catch block and debug-run the program with no break point. 
	 * Why do you not get an error message from the compiler? 
	 * 
	 * Put breakpoint in the numberOfInputLines() try block.
	 * Debug-Run the program. Press F6. Where do you land? Why? 
	 * 
	 * Remove the comments around the third catch block. Can you justify the error?
	 */
	public static void main(String args[]) {
		try {
			echoLines(numberOfInputLines(args));
		} 
		// Comment this out
		catch (AMissingArgumentException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} 
		catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		// Uncomment this 
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
	/**
	 * Study the code and follow the instructions below.
	 * 
	 * Based on the output of the previous run, given an exception e,
	 * what does e.getMessage() return?
	 * 
	 * Given an exception e, what does throw e mean - describe in your own words
	 * without using the word throw again?
	 * 
	 * In general, why not return an error code such as -1
	 * rather than throwing an exception? 
	 * 
	 * Does a function have to always return a legal value to its caller?

	 */
	public static int numberOfInputLines(String[] args)
		//comment this out to see if it is checked on unchecked
			throws AMissingArgumentException
	{
		try {
			return Integer.parseInt(args[0]);
		} catch (ArrayIndexOutOfBoundsException e) {
			// comment the following and uncomment the first and then both of the 
			// two commented statements below
			throw new AMissingArgumentException("First argument missing");
//			new AMissingArgumentException("First argument missing");
//			return -1;// error code
		}
	}

}
