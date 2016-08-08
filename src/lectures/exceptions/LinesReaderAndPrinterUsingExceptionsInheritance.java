package lectures.exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LinesReaderAndPrinterUsingExceptionsInheritance {

	public static void main(String args[]) {
		//illegal initialization
//		int numberOfInputLines = numberOfInputLines(args);
		try {
			echoLines(numberOfInputLines(args));

		} catch (IOException e) {
			System.out.println(e);
			e.printStackTrace();
			System.exit(-1);
		}
		// catch (AMissingArgumentException e) {
		// System.out.println(e);
		// System.exit(-1);
		// }

	}

	static BufferedReader input = new BufferedReader(
			new InputStreamReader(System.in));

	static void echoLines(int numberOfInputLines) throws IOException {
		for (int inputNum = 0; inputNum < numberOfInputLines; inputNum++) {
			System.out.println(input.readLine());
		}
	}

	static int numberOfInputLines(String[] args)
			throws AMissingArgumentException {
		try {
			return Integer.parseInt(args[0]);
		} catch (ArrayIndexOutOfBoundsException e) {
			throw new AMissingArgumentException("First argument missing");
		}
	}

}
