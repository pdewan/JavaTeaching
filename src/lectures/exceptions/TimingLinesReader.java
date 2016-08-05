package lectures.exceptions;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/**
 * Look at the code and associated documentation by hovering.
 * 
 * PARSE INT ERROT
 * Run the program with a String argument that cannot be converted into an integer such as
 * "zero"?
 * 
 * Look at the output to understand this new exception.
 * 
 * CURRENT TIME PROCESSING
 * 
 * What to you think is the purpose of the three instances of the statement:
 * 			System.out.println(System.currentTimeMillis() - startTime);
 *
 * Can you think of some way or some new Java concept that can reduce the three
 * instances to one?
 *
 * Go to {@link TimingLinesReaderWithFinally}
 */
public class TimingLinesReader {

	static BufferedReader input = new BufferedReader(
			new InputStreamReader(System.in));
	static int numberOfInputLines(String[] args) throws AMissingArgumentException {
		long startTime = System.currentTimeMillis(); // Hover this method call to see its description
		try {
			int retVal = Integer.parseInt(args[0]);
			System.out.println(System.currentTimeMillis() - startTime);
			return retVal;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(System.currentTimeMillis() - startTime);
			AMissingArgumentException missingArgumentException = new AMissingArgumentException("Missing first argument");
			throw missingArgumentException;
		} catch (NumberFormatException e) { // Hover over the exception name to see its description
			System.out.println("Non number argument. Returning 0.");
			System.out.println(System.currentTimeMillis() - startTime);
			return 0;
		}		
	}
	public static void main(String args[]) throws AMissingArgumentException {
		System.out.println(numberOfInputLines(args));
	}



}
