package lectures.exceptions.extra;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.NoSuchElementException;

import lectures.iterator.StringIterator;

public class AnInputStreamScanner implements StringIterator, 
                                             StringIteratorThrowingIOException, 
                                             StringIteratorThrowingException {
	static BufferedReader inputStream = new BufferedReader(
			new InputStreamReader(System.in));
	public static final String QUIT_COMMAND = "quit";
	String nextLine;
	public AnInputStreamScanner() throws IOException {
		nextLine = inputStream.readLine();		
	}
	
	public boolean hasNext() {
		return nextLine.equals(QUIT_COMMAND);
	}
	public String next()  {	
		if (!hasNext()) throw new NoSuchElementException();		
		String retVal = nextLine;
		try {
			nextLine = inputStream.readLine();	
		} catch (IOException e) {
			e.printStackTrace();
		}
		return retVal;			
	}	
}
