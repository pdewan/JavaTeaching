package lectures.exceptions.extra;

import java.io.IOException;


public class BlockExceptionHandlingIteratedStringPrinter {
	public static void print(StringIteratorThrowingIOException aStringIterator) {
		try {
		while (aStringIterator.hasNext())
			System.out.println(aStringIterator.next());
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}

}
