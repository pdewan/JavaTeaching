package lectures.exceptions;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class LinesReaderAndPrinter {
	static BufferedReader input = new BufferedReader(
			new InputStreamReader(System.in));
	public static void main (String args[])  {
	    echoLines(numberOfInputLines(args));
	} 	
	static void echoLines (int numberOfInputLines) {
	    try {
	        for (int inputNum = 0; inputNum < numberOfInputLines; inputNum++)
	            System.out.println(input.readLine());
	    } catch (IOException e) {
	        System.out.println("Did not input " + numberOfInputLines +  " input strings before input was closed. ");
	        System.exit(-1);
	    }
	}	
	static int numberOfInputLines(String[] args) {
	    try {
	        return Integer.parseInt(args[0]);
	    } catch (ArrayIndexOutOfBoundsException e) {
	        System.out.println("Did not enter an argument.");
	        return  0;
	     }
	}
}
