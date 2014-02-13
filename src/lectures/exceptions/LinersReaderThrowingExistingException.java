package lectures.exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LinersReaderThrowingExistingException {

	static BufferedReader input = new BufferedReader(
			new InputStreamReader(System.in));
	static int numberOfInputLines(String[] args) throws IOException {
		try {
		        return Integer.parseInt(args[0]);   
		} catch (ArrayIndexOutOfBoundsException e) {
		       throw new IOException ("First argument missing");
		}
	}


}
