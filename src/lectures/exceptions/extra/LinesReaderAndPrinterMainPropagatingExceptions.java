package lectures.exceptions.extra;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LinesReaderAndPrinterMainPropagatingExceptions {

	public static void main(String args[]) throws IOException, ArrayIndexOutOfBoundsException {		
			echoLines(numberOfInputLines(args));		
	}

	static BufferedReader inputStream = new BufferedReader(
			new InputStreamReader(System.in));
//	static void echoLines(int numberOfInputLines)  {
	static void echoLines(int numberOfInputLines) throws IOException {
		for (int inputNum = 0; inputNum < numberOfInputLines; inputNum++)
			System.out.println(inputStream.readLine());
	}
//	static int numberOfInputLines(String[] args){
	static int numberOfInputLines(String[] args)
			throws ArrayIndexOutOfBoundsException {
		return Integer.parseInt(args[0]);
	}

}
