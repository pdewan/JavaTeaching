package lectures.exceptions;
/**
 * EXECPTIONS
 * The user of this program is expected to enter an argument to main, which this program simply prints.
 * Run this program. See the error message.
 * 
 * In the Eclipse menu, go to Run->"Run Configurations...", go to the Arguments tab, and in
 * Program Arguments textbox enter some text within quotes if if it has space. Run the
 * program again- the error goes away.
 * 
 *
 */
public class ArgPrinter {
	public static void main(String[] args) {	
			System.out.println(args[0]);
	}
}

/**
 * Now you understand how to give a program arguments in Eclipse. If you were running
 * your program outside of Eclipse, you would just write the arguments in the command
 * line after the name of your program, like this: 
 * "java ArgPrinter argument"
 * Let us focus on the error when you get when you do not provide an argument.
 * Remove the command line argument in run configurations and run the program
 * again.
 * 
 * (T/F) Java does subscript checking, that is, it checks whether the index used to 
 * access an array named a is in the range 0 to a.length-1.
 * 
 * (T/F) Subscript checking is inefficient if programmers code carefully enough to
 *  never get an error.
 *  
 * 
 * Not all languaqes do subscript checking. In those languages, if an array is accessed
 * illegally, the program often fails silently or manifests some later error 
 * caused by the illegal access, if some nonsensical value gets read past the
 * end of the array.
 * 
 * (T/F) For programmers testing the program to identify bugs, 
 * the array index out of bounds error message is more useful than one that
 * simply says "program failed".
 *  
 * (T/F) For end users trying to understand how to use the program, 
 * the error message is more useful than one that simply says "program failed"
 * 
 * In regards to the last question, consider whether a user of a program (who probably
 * does not have the source code and might not even know how to code) would find it
 * useful to know that the program crashed due to an "array index out of bounds".
 * 
 * Goto {@link SafeArgPrinter}
 */
