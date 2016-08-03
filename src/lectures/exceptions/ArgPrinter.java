package lectures.exceptions;
/**
 * EXECPTIONS
 * The user of this program is expected to enter an argument to main, which this main simply prints.
 * Run this program. See the error message.
 * Execute Run Configuration, go to the Arguments tab, and in Program Arguments textbox enter some text within quotes if
 * if it has space. Run the program again, the error goes away.
 * 
 * Now that you understand program arguments, let us focus on the error. 
 *  
 * Do you like the fact that Java checks that an array subscript in in range
 * rather than, say, the error resulting in a blue screen? 
 * Some languages such as C do not do such checking? 
 * Any disadvantages of such checking? 
 * Would the user who ran this program understand the error message?
 * Can you improve on the error message?
 * 
 * Goto {@link SafeArgPrinter}
 */
public class ArgPrinter {
	public static void main(String[] args) {	
			System.out.println(args[0]);
	}
}
