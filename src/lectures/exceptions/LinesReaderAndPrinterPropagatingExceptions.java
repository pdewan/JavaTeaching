package lectures.exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * COOPERATIVE EXECEPTION PROCESSING
 * We finally see cooperative exception processing, exceptions thrown in called. * 
 * Look first at echoLines and numberOfInputLines, then at main.
 * 
 * But breakpoint as instructed and debug-run the code without entering an argument.
 * 
 * Answer the questions in the comments below
 * 
 * TRUTH IN ADVERTISEMENT
 * What happens if you uncomment the throws clause in the header of main?
 * 
 * Can an IOException ever be thrown by main to its caller?
 * What does this say about Java's capability of determining 
 * whether an exception can be thrown by your code? 
 * There is a problem called the Halting problem that explains this feature:
 * It is not possible to write a program such as a Java compiler that determines
 * if some statement in your program is ever reached?
 * 
 * When in doubt, is it better to be conservative and over advertise the thrown
 * exceptions or under-advertise the exceptions.
 * 
 * Think of a medicine and its side effects.
 * 
 * CHECKED VS UNCHECKED EXCEPTIONS
 * 
 * Comment out the two throws clauses and see what compile errors you get.
 * Comment them out again.  
 * Now comment out the two catch blocks and see what compile errors you get?
 * Now comment out the two throws clauses again and see what happens to the errors.
 * 
 * Can you make sense out of this>
 *  * 
 * When a possible exception must either be caught or acked in header, it is a checked
 * exception, Otherwise it is an unchecked- Java forces it to be acked or caught.
 * Other exceptions are called unchecked.
 * 
 * As you should have seen {@link ArrayIndexOutBoundsException} is unchecked while 
 * {@link IOException} is checked.
 * 
 * Two questions that arise are:
 * 
 * How do programmers tell Java which exceptions are checked and which are not?
 * Why two kinds of exceptions?
 * 
 * HOW TO SPECIFY CHECKED VS UNCHECKED
 * 
 * Press F$ on each of these exceptions and see the type hierarchy. 
 * You will see that the unchecked exception has {@link RuntimeException} as a superclass.
 * Hover over the class name and see the documentation. 
 * Now the more interesting question:
 * 
 *
 * WHY TWO KINDS OF EXCEPTIONS

 * Would you revolt if {@link ArrayIndexOutBoundsException} was checked, regardless of context? 
 * if so, why?
 * 
 * Hint: There certain kinds of exceptions that can never be avoided no matter
 * how well you program because of external forces such as users and other remote programs. 
 * Certain exceptions can be avoided, at least in some cases.
 *  
 * In this example, can either of the two exceptions be ever avoided - at least in some situations?
 *   
 * Which of the two exceptions in our example should checked?
 * 
 * TWO PROBLEMS
 * Logically speaking, in this example, the cause of the exception in numberOfInputLines
 * cannot be eliminated? In other words, if Java could make the checked-unchecked
 * division based on context,  the exception should be checked. Why?
 * 
 * Problem 1: Given that how does the programmer of numberOfInputLines (who does not want to 
 * handle the exception because of lack of context) inform its callers about
 * this uncaught exception so one or more of them can handle it.
 * 
 * Problem 2: How does the programmer also force some caller in the stack of
 * calls to handle the lack of a user argument?
 * 
 * Problem 3: The exception ArrayIndexOutBoundsException can be as unindicative about the cause
 * of the exception - missing argument - to the caller * as the error message about 
 * array index out of bounds was to the end user.
 * 
 * How to solve these two problems, individually and collectively?
 * 
 * Which of these problems does acking the exception as ArrayIndexOutOfBoundsException 
 * in the header solve?
 * 
 * Which of these problems does acking the exception as IOException in the header solve?
 * 
 * Any better alternative?
 */
public class LinesReaderAndPrinterPropagatingExceptions {
	
	static BufferedReader input = new BufferedReader(new InputStreamReader(
			System.in));
	/**
	 * This method no longer has code to "catch" the IOException that can
	 * result from readLine as it does not have enough context to handle the exception. 
	 * To document this, it has a header with the throws clause, to warn its caller about this.
	 */
	static void echoLines(int numberOfInputLines) 
			throws IOException // what happens if you comment out this clause?
	{
		for (int inputNum = 0; inputNum < numberOfInputLines; inputNum++) {
			System.out.println(input.readLine());
		}
	}
	/**
	 * This method too no longer has code to "catch" the exception and documents this fact 
	 * for its caller.
	 */
	static int numberOfInputLines(String[] args)
			throws ArrayIndexOutOfBoundsException // what happens if you comment out this clause?
		{
		// put breakpoint on the next line and press F6 to see where the program goes next
		return Integer.parseInt(args[0]); 
	}
	/**	 
	 * This main now handles exceptions not caught in the two methods it calls.		 
	 */
	public static void main(String args[]) 
//		throws IOException, ArrayIndexOutOfBoundsException // what happens if you uncomment this
	{		
		// How many catches associated with this try?		
		try { 
			echoLines(numberOfInputLines(args)); // if this echoLines fails where will the program go next?
		} 
		// What happens if you comment out this entire catch?
		catch (ArrayIndexOutOfBoundsException e) { 
			System.out
					.println("Did not enter an argument. Assuming a single input line.");
			// Why is this try in a catch?
			try {
				echoLines(1);  // if this echoLines fails where will the program go next?
			} catch (IOException ioe) {
				System.out
						.println("Did not input the one input string, which is the default in case of missing argument, before input was closed. ");
			}
		} 
		// what happens if you comment out this entire catch (header and block}?
		catch (IOException e) 
		{
			System.out
					.println("Did not input the correct number of input strings before input was closed. ");
		}
	}

}
