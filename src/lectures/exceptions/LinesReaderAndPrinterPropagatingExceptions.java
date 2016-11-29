package lectures.exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * COOPERATIVE EXECEPTION PROCESSING
 * We finally see cooperative exception processing, exceptions thrown in called
 * methods being handled by calling methods.
 * 
 * Look first at echoLines and numberOfInputLines, then at main.
 *  
 * 
 */
public class LinesReaderAndPrinterPropagatingExceptions {
	
	static BufferedReader input = new BufferedReader(new InputStreamReader(
			System.in));
	/**
	 * This method no longer has code to "catch" the IOException that can
	 * result from readLine as it does not have enough context to handle the exception. 
	 * To document this, it has a header with the throws clause, to warn its caller about this.
	 * 
	 * (The throws clause is usually on the same line as the rest of the header, it is
	 * just on a different line here to make it easier to comment out later)
	 */
	static void echoLines(int numberOfInputLines) 
	 /*
	  * Comment out the throws class when instructed
	  */
			throws IOException 
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
	 /*
	  * Comment out the throws class when instructed
	  */
			throws ArrayIndexOutOfBoundsException 
		{
		/*
		 * Put breakpoint on the next line.
		 * 
		 */
		return Integer.parseInt(args[0]); 
	}
	
	/**	 
	 * This main now handles exceptions not caught in the two methods it calls.		 
	 */
	public static void main(String args[]) 
	 /*
	  * Uncomment the throws clause when instructed.
	  */
//		throws IOException, ArrayIndexOutOfBoundsException 
	{		
				
		try { 
			echoLines(numberOfInputLines(args)); // if this echoLines fails where will the program go next?
		} 
		/*
		 * Comment out this catch when instructed
		 */
		catch (ArrayIndexOutOfBoundsException e) { 
			System.out
					.println("Did not enter an argument. Assuming a single input line.");
			// Why is this try in a catch?
			try {
				echoLines(1);  // if this echoLines fails where will the program go next?
			} catch (IOException ioe) {
				System.out
						.println("Did not input the one input string, which is the default"
								+ " in case of missing argument, before input was closed. ");
			}
		} 
		/*
		 * Comment out this catch when instructed
		 */
		catch (IOException e) 
		{
			System.out
					.println("Did not input the correct number of input strings before input was closed. ");
		}
	}
}
/*
 * 
 * Put breakpoint in numberOfInputLine and debug-run the code without 
 * entering a main argument. Press F6 (step over) to follow the control flow
 * when the statement is executed.
 * 
 * (T/F) LinesReaderAndPrinterPropagatingExceptions with no argument executes 
 * (one or more statements in) a try block of numberOfInputLines. 
 * 
 * (T/F) LinesReaderAndPrinterPropagatingExceptions with no argument executes 
 * (one or more statements in) a catch block of numberOfInputLines. 
 * 
 * (T/F) LinesReaderAndPrinterPropagatingExceptions with no argument executes
 *  (one or more statements in) a try block of main.
 * 
 * (T/F) LinesReaderAndPrinterPropagatingExceptions with no argument executes
 *  (one or more statements in) a catch block of main.
 * 
 * (T/F) If method p calls method q, and the execution of q results in an exception 
 * of type E not handled by a catch block of q, then control transfers to a 
 * catch block of p that can handle an exception of type E.
 * 
 * (T/F) LinesReaderAndPrinterPropagatingExceptions with no argument executes
 * (one or more statements in) a try block of echoLines.
 * 
 * (T/F) LinesReaderAndPrinterPropagatingExceptions with no argument reads input
 * from user.
 *  
 * (T/F) A catch block can recover from an exception thrown by executing some 
 * error-prone method by nesting it in a try block.
 *  
 * Comment out throws clause in the header of echoLines.
 * 
 * What happens?  
 * 
 * (T/F) If a method p executes a statement that can throw an IOException, 
 * then p must either catch the exception or acknowledge in the header 
 * that it is not catching the exception.  
 * 
 * Uncomment the throws clause in the header of echoLines.
 * 
 * Comment out the throws clause in the header of numberOfInputLines.
 * 
 * What happens?  
 * 
 * (T/F) If a method p executes a statement that can throw an ArrayIndexOutOfBoundsException, 
 * then p must either catch the exception or acknowledge in the header 
 * that it is not catching the exception.  
 * 
 * Uncomment the throws clause in the header of numberOfInputLines.
 * 
 * Java has two kinds of exceptions, checked and unchecked.
 * 
 * If a method p executes a statement that can throw a checked exception 
 * then p must either catch the exception or acknowledge in the header 
 * that it is not catching the exception.  
 * 
 * Unchecked exceptions do not have to be acknowledged in headers or caught in
 * catch blocks.
 * 
 * (T/F) IOException is a checked exception.
 * 
 * (T/F) ArrayIndexOutOfBoundsException is a checked exception. 
 *  
 * Comment out the IOException catch block in main. 
 * What happens?
 * 
 * Uncomment the throws clause in the header of main.
 * What happens?
 * 
 * (T/F) If a method p can execute a statement that directly or indirectly can throw
 * an IOException that is catchable in p, then p must either catch the exception or
 * acknowledge in the header that it is not catching the exception and thus propagating
 * or throwing the exception to its caller. 
 * 
 *  
 *  Uncomment the IOException catch block in main.
 *  
 *  So now both the throws clause and the corresponding catch block are in the
 *  program.
 *  
 *  (T/F) It is possible for an IOException to be both caught by main and 
 *  propagated to its caller.
 *  
 *  Hint: You can answer this question based on what Java allows, or you could try adding
 *  "throw e;" at the end of the IOException catch block.
 *  
 *  (T/F) Java allows checked exceptions to be acknowledged in method headers even
 *  if they are not propagated to callers.
 *  
 *  The Halting problem says that it is not possible for Java to always know if some
 *  statement will actually be executed at runtime.
 *  
 *  (T/F) The halting problem prevents Java from always knowing if an exception will actually 
 *  be thrown by a try block.
 *  
 *  As we have seen, at compile time we do not know which implementation of  a
 *  method will actually be invoked to service a method call. If the call is an external call
 *  targeted at a variable typed using an interface, then answer depends on the class of 
 *  the object assigned to the variable. If the call is made in class C to an 
 *  internal (inherited or declared) method m of C, then the method actually invoked 
 *  may be an overriding method m in some subclass of C. In both cases, the method
 *  call is dynamically dispatched at runtime. This means the header of a method
 *  in an interface or class must advertise the union of all exceptions
 *  thrown by implementing and overriding methods respectively.
 *   
 *  (T/F) Dynamic dispatching prevents Java from always knowing which exceptions will be
 *  thrown by a method call.
 *   
 *  (T/F) When in doubt, is it better to be conservative and over advertise the thrown
 * checked exceptions in a method header so that the a caller can always handle an exception 
 * that propagates to it.
 * 
 *

 * Two questions that arise are:
 * 
 * How do programmers tell Java which exceptions are checked and which are not?
 * Why two kinds of exceptions?
 * 
 * 
 * An unchecked exception has {@link RuntimeException} as a superclass, a checked
 * exception does not. Hover over the name to see the full description.
 * 
 * Now the more interesting question: Why two kinds of exceptions?

 * Would you revolt if all exceptions were checked, regardless of context? 
 * If so, why?
 * 
 * Hint: There certain kinds of exceptions that can never be avoided no matter
 * how well you program because of external forces such as users and other remote programs. 
 * Certain kinds of exceptions can be avoided, at least in some cases.
 * 
 * In this example, the ArrayIndexOutOfBoundsException is a result of user
 * error but it can be avoided in other contexts.
 *  
 * Problem 1: Given the above, how does the programmer of numberOfInputLines (who
 * does not want to handle the exception because of lack of context) inform its callers about
 * this uncaught exception so one or more of them can handle it?
 * 
 * Problem 2: How does the programmer also force some caller in the stack of
 * calls to handle the lack of a user argument (since the current exception is
 * unchecked)?
 * 
 * Problem 3: The exception ArrayIndexOutBoundsException can be as unindicative of the cause
 * of the exception - missing argument - to the caller as the error message about 
 * array index out of bounds was to the end user.
 * 
 * Go to LinesReaderAndPrinterUsingProgrammerDefinedException
 * 
 * 
 *  
 */
