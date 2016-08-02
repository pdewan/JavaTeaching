package lectures.exceptions;
/**
 * EXECPTIONS
 * The user of this program is expected to enter an argument to main, which this main simply prints.
 * Run this program. See the error message.
 * Execute Run Configuration, go to the Arguments tab, and in Program Arguments textbox enter some text within quotes if
 * if it has space. Run the program again, the error goes away.
 * 
 * Now that you understand program arguments, let us focus on the error. 
 * Go back to run configuration and delete the argument string.
 * 
 * Do you like the fact that Java checks that an array subscript in in range
 * rather than, say, a blue screen?
 * Would the user who ran this program understand the error message?
 * Can you improve on the error message?
 */
public class ArgPrinter {
	public static void main(String[] args) {	
			System.out.println(args[0]);
	}
}
