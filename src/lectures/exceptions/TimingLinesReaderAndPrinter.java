package lectures.exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TimingLinesReaderAndPrinter {

	public static void main(String args[]) {
		long startTime = System.currentTimeMillis();
		try {
			echoLines(numberOfInputLines(args));
			System.out.println(System.currentTimeMillis() - startTime);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out
					.println("Did not enter an argument. Assuming a single input line.");
			try {
				echoLines(1);
				System.out.println(System.currentTimeMillis() - startTime);
			} catch (IOException ioe) {
				System.out
						.println("Did not input the one input string, which is the default in case of missing argument, before input was closed. ");
				System.out.println(System.currentTimeMillis() - startTime);
			}
		} catch (IOException e) {
			System.out
					.println("Did not input the correct number of input strings before input was closed. ");
			System.out.println(System.currentTimeMillis() - startTime);
		}
	}

	static BufferedReader input = new BufferedReader(
			new InputStreamReader(System.in));
	static void echoLines(int numberOfInputLines) throws IOException {
		for (int inputNum = 0; inputNum < numberOfInputLines; inputNum++) {
			System.out.println(input.readLine());
		}
	}
	static int numberOfInputLines(String[] args)
			throws ArrayIndexOutOfBoundsException {
		return Integer.parseInt(args[0]);
	}

}
