package lectures.exceptions;
/**
 * CONDITIONALS FOR ERROR DETECTION AND REPORTING
 * 
 * This program does the same task but uses something you already know - conditionals
 * to do better error reporting.
 * 
 */
public class SafeArgPrinter {
	public static void main(String[] args) {
		if (args.length == 0) {
			System.out
					.println("Did not specify the argument to be printed. Terminating program.");
			System.exit(-1);
		} else {
			System.out.println(args[0]);
		}
	}
}

/**
 * 
 * (T/F) For programmers testing the program to identify bugs, 
 * the error message of SafeArgPrinter is more useful than the one given by
 * ArgPrinter
 *  
 * (T/F) For end users trying to understand how to use the program, 
 * the error message of SafeArgPrinter is more useful than the one given by
 * ArgPrinter
 * 
 * (T/F) SafeArgPrinter is more inefficient than ArgPrinter as subscript
 * checking of args is done twice, once by the program and once by Java.
 * 
 * (T/F) For programmers not interested in understanding the error behavior
 * of programs, SafeArgPrinter is more readable than ArgPrinter as they have
 * to look at less code.
 *  
 * 
 * Go to {@link ExceptionHandlingArgPrinter}
 */