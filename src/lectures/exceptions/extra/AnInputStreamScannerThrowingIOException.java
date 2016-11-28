package lectures.exceptions.extra;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.NoSuchElementException;

public class AnInputStreamScannerThrowingIOException implements StringIteratorThrowingIOException, 
                                                                StringIteratorThrowingException {
    BufferedReader inputStream = new BufferedReader(
			new InputStreamReader(System.in));
	public static final String QUIT_COMMAND = "quit";
	String nextLine;
	public AnInputStreamScannerThrowingIOException() throws IOException {
		nextLine = inputStream.readLine();		
	}	
	public boolean hasNext() {
		return nextLine.equals(QUIT_COMMAND);
	}
	public String next() throws IOException, NoSuchElementException  {	
		if (!hasNext()) throw new NoSuchElementException();
		String retVal = nextLine;
		nextLine = inputStream.readLine();	
		return retVal;			
	}
}
