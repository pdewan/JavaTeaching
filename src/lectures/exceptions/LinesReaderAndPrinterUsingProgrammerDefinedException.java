package lectures.exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LinesReaderAndPrinterUsingProgrammerDefinedException {

	public static void main(String args[]) {
		try {
		    echoLines(numberOfInputLines(args));
		 } catch (AMissingArgumentException e) {
//		         System.out.println(e);
		         e.printStackTrace();
		         System.exit(-1);      
		 } catch (IOException e) {
//		        System.out.println(e);
		        e.printStackTrace();
		        System.exit(-1);
		 } 
	}
//	public static void main(String args[]) {
//		try {
//			echoLines(numberOfInputLines(args));
//		} catch (AMissingArgumentException e) {
//			System.out
//					.println("Did not enter an argument. Assuming a single input line.");
//			try {
//				echoLines(1);
//			} catch (IOException ioe) {
//				System.out
//						.println("Did not input the one input string, which is the default in case of missing argument, before input was closed. ");
//			}
//		} catch (IOException e) {
//			System.out
//					.println("Did not input the correct number of input strings before input was closed. ");
//		}
//	}

	static BufferedReader input = new BufferedReader(
			new InputStreamReader(System.in));
	public static void echoLines(int numberOfInputLines) throws IOException {
		for (int inputNum = 0; inputNum < numberOfInputLines; inputNum++)
			System.out.println(input.readLine());
	}
	public static int numberOfInputLines(String[] args) throws AMissingArgumentException {
		try {
	        	return Integer.parseInt(args[0]);   
		} catch (ArrayIndexOutOfBoundsException e) {
	       throw new AMissingArgumentException("First argument missing");
	}
	}


}
