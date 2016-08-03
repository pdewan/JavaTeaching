package lectures.exceptions;
/*
 * CONDITIONALS FOR ERROR REPORTING
 * This program does the same task but uses something you already know - conditionals
 * to do better error reporting.
 * 
 * How may times is the array subscript (index) being checked to ensure that it is within range?
 * How easy is this program to understand compared to the previous program (@link ArgPrinter}
 * Think both of the person trying to understand the program without considering error
 * situations and the person focusing on the errors?
 * 
 * Go to {@link ExceptionHandlingArgPrinter}
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
