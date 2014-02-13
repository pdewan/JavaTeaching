package lectures.exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TimingLinesReader {
//	public static void main(String args[]) {
//		
//	}

	static int numberOfInputLines(String[] args) throws AMissingArgumentException {
		long startTime = System.currentTimeMillis();
		try {
			int retVal = Integer.parseInt(args[0]);
			System.out.println(System.currentTimeMillis() - startTime);
			return retVal;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(System.currentTimeMillis() - startTime);
			AMissingArgumentException missingArgumentException = new AMissingArgumentException("Missing first argument");
			throw missingArgumentException;
		} catch (NumberFormatException e) {
			System.out.println("Non number argument. Returning 0.");
			System.out.println(System.currentTimeMillis() - startTime);
			return 0;
		}		
	}
	public static void main(String args[]) throws AMissingArgumentException {
		System.out.println(numberOfInputLines(args));
	}

	static BufferedReader input = new BufferedReader(
			new InputStreamReader(System.in));
////	static void echoLines(int numberOfInputLines)  {
//	static void echoLines(int numberOfInputLines) throws IOException {
//		for (int inputNum = 0; inputNum < numberOfInputLines; inputNum++)
//			System.out.println(input.readLine());
//	}
////	static int numberOfInputLines(String[] args){
//	static int numberOfInputLines(String[] args)
//			throws ArrayIndexOutOfBoundsException {
//		return Integer.parseInt(args[0]);
//	}

}
