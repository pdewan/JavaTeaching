package lectures.exceptions;
/**
 * TRY-CATCH
 * Finally, we see something new, the try-catch statement.
 * Run the program without suppling an argument. 
 * Then run it again with an argument.
 * 
 * The code within the braces following try is called the try block.
 * The code within the braces following catch is called the catch block.
 * A catch block, like a method, also takes parameters. However it takes a single
 * parameter.
 * Can you figure out the behavior of the try and catch blocks when there is 
 * a subscript error and when there is not?
 * In particular, can you determine what parts of the try block and catch blocks are executed
 * when there is subscript error and when there is not? 
 * Uncomment the trace statements to confirm your deduction.
 * 
 * EXCEPTION TYPES
 *  
 * Can you relate the error message you got in (@link ArgPrinter} to the type of
 * the parameter e? 
 * 
 * Click F3 on the type of e. Is it a class, an interface, or some other special kind of type?
 *
 * TRY-CATCH FOR ERROR REPORTING
 * 
 * Can you compare this code with the one in {@link SafeArgPrinter} for clarity and efficiency.
 * Again think both of the person trying to understand the program without considering error
 * situations and the person focusing on the errors?
 *
 */
public class ExceptionHandlingArgPrinter {
	public static void main(String[] args) {
		try {
//			System.out.println ("Try block started");
			System.out.println(args[0]);
//			System.out.println ("Try block ended");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Did not specify the argument to be printed. Terminating program.");			
		}
	}
}
