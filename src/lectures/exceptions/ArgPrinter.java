package lectures.exceptions;
/**
 * EXECPTIONS
 * The user of this program is expected to enter an argument to main, which this main simply prints.
 * Run this program. See the error message.
 * 
 * Execute Run Configuration, go to the Arguments tab, and in Program Arguments textbox enter some text within quotes if
 * if it has space. Run the program again, the error goes away.
 * 
 *
 */
public class ArgPrinter {
	public static void main(String[] args) {	
			System.out.println(args[0]);
	}
}
/**
 * Now that you understand program arguments, let us focus on the error when you
 * do not provide an argument. 
 * 
 * (T/F) Java does subscript checking, that is, checks if the index used to 
 * access array, a, is in the range 0..a.length-1.
 * 
 * (T/F) Subscript checking is inefficient if programmers if it never gives an error.
 *  
 * 
 * 
 * Not all languaqes do subscript checking. If an array is accessed illegally, 
 * the program fails silently or manifests some later error 
 * caused by the illegal access.
 * 
 * (T/F) For programmers testing the program to identify bugs, 
 * the array index out of bounds error message is more useful that one than 
 * simply says "program failed".
 *  
 * (T/F) For end users trying to understand how to use the program, 
 * the error message is more useful than one that simply says "program failed"
 * 
 * 
 * Goto {@link SafeArgPrinter}
 */
