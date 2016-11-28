package lectures.exceptions;
/**
 * TRY-CATCH
 * 
 * Finally, we see something new, the try-catch-finally statement.
 *   
 * The code within the braces following try is called the try block.
 * 
 * The code within the braces following catch is called the catch block.
 * 
 * A catch block, like a method, also takes parameters. However it takes a single
 * parameter whose type is an exception class. 
 * 
 * An exception class is a class whose instances represent
 * runtime errors.
 * 
 * Different exception classes repersent different kinds of errors.
 * 
 *
 * The code within the braces following finally is called the finally block.
 *
 */
public class ExceptionHandlingArgPrinter {
	public static void main(String[] args) {
		try {
//			System.out.println ("Try block started");
			/*
			 * Put break point below
			 */
			System.out.println(args[0]); //put break point here
//			System.out.println ("Try block ended");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Did not specify the argument to be printed. Terminating program.");			
		} finally {
			System.out.println ("Program terminates at time:" + System.currentTimeMillis());
		}
	}
}
/**
 * TRY-CATCH
 * 
 * Your next catch is to understand the nature of a try-catch block.
 * 
 * Uncomment the two printlns and put a break point where instructed.
 * 
 * Debug-run the program without supplying an argument
 * and step-over the array access to follow the control flow.
 * 
 * Look also at the console to understand the control flow.
 * 
 * Repeat the two steps, but this time provide an argument.
 * 
 * Answer the questions below based on the behavior you see, that is,
 * your answers should be consistent with the behavior.
 * 
 * (T/F) If no statement in a try block results in a runtime error (exception), 
 * then the catch block is *not* executed.
 * 
 * (T/F) If no statement in a try block results in a runtime error, 
 * then the finally block is *not executed.
 * 
 * (T/F) If some statement in a try block causes an exception of some type 
 * (e.g. ArrayIndexOutOfBoundsException), then the program jumps to the
 * catch block that takes the exception (e.g. V)  as an argument, 
 * abandoning the remaining statements in the try block.
 * 
 * 
 * (T/F) If some statement in a try block causes an exception of some type 
 * then the finally block is *not* executed.
 * 
 * (T/F) It is possible for a try block to be partially executed.
 * 
 * (T/F) It is possible for the program to execute a catch block
 * without attempting execution of some statement in the corresponding
 * try block. 
 * 
 * Comment out the two lines of the catch block without commenting out the two
 * lines of the finally block.
 * 
 * (T/F) It is possible for a try block to not have a corresponding catch block.
 * 
 * Comment out the two lines of the finally block without commenting out the two
 * lines of the catch block.
 * 
 * (T/F) It is possible for a try block to not have a corresponding finally block.
 * 
 * Comment out both the catch and finally blocks.
 * 
 * (T/F) A try block must have a corresponding catch or finally block.
 * 
 * Restore the program to its original state.
 * 
 * Look at the code again now that you understand it.
 * 
 * 
 * (T/F) ExceptionHandlingArgPrinter is more inefficient than ArgPrinter as subscript
 * checking of args is done twice, once by the program and once by Java.
 * 
 * (T/F) For programmers not interested in understanding the error behavior
 * of programs, ExceptionHandlingArgPrinter is more readable than SafeArgPrinter as 
 * they can more easily find and hence ignore error handling code.
 *  
 * Next Class LinesReaderAndPrinter
 *
 */
