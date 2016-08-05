package lectures.exceptions;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/**
 * FINALLY
 * 
 * Look at the code below in which the replicated occurences of the print statement are reduced
 * to one in a finally clause.
 * 
 * What do you think is the exact semantics of finally?
 * 
 * Put the two break points,
 * 
 * Debug-run the program first without an argument or a wrong argument and then with a
 * correct argument that parses into an integer.
 * 
 * What is the next statement executed (F6) after the program stops at the breakpoint?
 * 
 * Can you give some broad meaning to finally that makes it useful even in programs without errors?
 * 
 * Go to 
 */
public class TimingLinesReaderWithFinally {
	static BufferedReader input = new BufferedReader(
			new InputStreamReader(System.in));
	static int numberOfInputLines(String[] args) throws AMissingArgumentException {
		long startTime = System.currentTimeMillis();
		try {
			return Integer.parseInt(args[0]); // put break point here
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(System.currentTimeMillis() - startTime);
			throw new AMissingArgumentException("Missing first argument"); //put breakpoint here
		} catch (NumberFormatException e) {
			System.out.println("Non number argument. Returning 0."); // put break point here
			return 0;
		}
		finally {
			System.out.println(System.currentTimeMillis() - startTime);
		}
	}
	public static void main(String args[]) throws AMissingArgumentException {
		System.out.println(numberOfInputLines(args));
	}
}
