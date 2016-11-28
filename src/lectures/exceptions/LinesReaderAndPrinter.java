package lectures.exceptions;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * EXCEPTIONS IN PROGRAMS INVOLVING MULTIPE METHODS
 * The previous example involved one method, which both performed 
 * error-prone operations and handled the errors. 
 * 
 * It did not involve recovering from errors. 
 * 
 * Much of exception handling is about cooperative error handling/recovery 
 * in multi-method programs.
 * 
 * This is an example of a multi-method program, but it does not involve cooperative
 * multi-method processing or much error recovery. Each method processes the
 * exceptions thrown when it does its job. Is this the best strategy?
 * 
 * Look at the program and follow the instructions after main.
 * 
 *
 */
public class LinesReaderAndPrinter {
	
	/*
	 * BufferedReader is an alternative to Scanner that better suits our purpose
	 * as it throws an important Java exception, IOException, that we will study here.
	 * The readLine method of the class takes the place of the Scanner nextLine method.
	 * 
	 */
	static BufferedReader input = new BufferedReader(
			new InputStreamReader(System.in));
	
	/**
	 * Delegates two work two two methods, each of which can result in errors.	 
	 */
	public static void main (String args[])  {
		try {
		/* 
		 * set break point below
		 */
	    echoLines(numberOfInputLines(args));
		} catch (ArrayIndexOutOfBoundsException e) {
	        System.out.println("Catch block in main executed");	     
	    }
	} 
	
	/**
	 * Read from the console the number of lines specified in the argument
	 * and echo each of them to the console. 
	 * 
	 * Possible error: the user may not enter the expected number of lines. 
	 * For instance, the expected number is 2 and the user entered one and
	 * then entered the EOF character to close the console input.
	 * 
	 * This method can be called from main or some other method. So it does
	 * not know the context - that its argument is specified by the end
	 * user as a main argument.
	 */
	public static void echoLines (int numberOfInputLines) {
	    try {
	        for (int inputNum = 0; inputNum < numberOfInputLines; inputNum++) {
	            System.out.println("Please enter the line to be echoed");
	        	System.out.println(input.readLine());
	        }
	    } catch (IOException e) { // User entered the EOF (End of File) marker to close input before the read was executed
	        System.out.println("Did not input " + numberOfInputLines +  " input strings before input was closed. ");
	    }
	}
	
	/**
	 * Determine the number of lines to be echoed by converting the 
	 * zeroth main argument into an int.
	 * 
	 * Possible error: The user does not enter the main argument, as in the previous
	 * example.
	 * 
	 * Another error: The user does not specify a String that can be converted into an int.
	 * We will ignore this error.
	 * 
	 * Like the previous method, it can be called from main or some other method.
	 * So it does also does not know the context - that its result will be used
	 * in an interactive session by an end-user to echo lines. 
	 *  
	 * Is returning 0 the best error "recovery" strategy. 
	 * 
	 * Can you think of a better one, if the method had context and knew 
	 * what main is doing?
	 *
	 */
	public static int numberOfInputLines(String[] args) {
	    try {
	        return Integer.parseInt(args[0]);
	    } catch (ArrayIndexOutOfBoundsException e) {
	        System.out.println("Did not enter an argument");	     
	        return  0; 
	     }
	}
}
/*
 * EXCEPTIONS IN PROGRAMS INVOLVING MULTIPE METHODS
 * 
 * Set the breakpoint in main.
 * 
 * Debug-run the program with no argument, and use step into, step return and step over to
 * follow the program execution.
 * 
 * (T/F) LinesReaderAndPrinter with no argument executes (one or more statements in) a try 
 * block of numberOfInputLines.
 * 
 * (T/F) LinesReaderAndPrinter with no argument executes a catch 
 * block of numberOfInputLines. 
 * 
 *  
 * (T/F) LinesReaderAndPrinter with no argument executes (one or more statements in) a catch block of main.
 * 
 * (T/F) If method p calls method q, and the execution of q results in an exception 
 * of type E that is handled by a catch block of q, then control transfers to a 
 * catch block of q that can handle an exception of type E.
 * 
 * 
 * (T/F) LinesReaderAndPrinter with no argument executes (one or more statements in) a try 
 * block of echoLines.
 * 
 * (T/F) LinesReaderAndPrinter with no argument executes a catch 
 * block of echoLines. 
 * 
 * (T/F) LinesReaderAndPrinter with no argument prompts the use for input.
 * 
 * Now debug-run the program with an argument of 2 and follow the program
 * execution. Respond to the prompt in the console.
 * 
 * (T/F) LinesReaderAndPrinter with an argument of 2 executes (one or more statements in) a try 
 * block of numberOfInputLines.
 * 
 * (T/F) LinesReaderAndPrinter with an argument of 2 executes a catch 
 * block of numberOfInputLines. 
 * 
 * (T/F) LinesReaderAndPrinter with an argument of 2 executes (one or more statements in) a try 
 * block of echoLines.
 * 
 * (T/F) LinesReaderAndPrinter with an argument of 2 executes a catch 
 * block of echoLines.
 * 
 * 
 * 
 * In this example, is the operation that first detects an error the right one to
 * (completely) handle it? 
 * 
 * If not what do you need from Java to separate detection 
 * and handling and to provide error handling involving multiple methods?
 * 
 
 * 
 * Go to {@link LinesReaderAndPrinterPropagatingExceptions}
 *
 */
