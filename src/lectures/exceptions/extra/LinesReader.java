package lectures.exceptions.extra;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import lectures.exceptions.AMissingArgumentException;

public class LinesReader {
//	public static void main(String args[]) {
//		
//	}

	static int numberOfInputLines(String[] args) throws AMissingArgumentException {
		try {
			return Integer.parseInt(args[0]);			
		} catch (ArrayIndexOutOfBoundsException e) {
			throw new AMissingArgumentException("Missing first argument");
		} catch (NumberFormatException e) {
			System.out.println("Non number argument. Returning 0.");
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
