package lectures.exceptions;

import java.io.IOException;

public class ExceptionHandlingIteratedStringPrinter {
	public static void print(StringIteratorThrowingIOException aStringIterator) {
		while (aStringIterator.hasNext())
			try {
				System.out.println(aStringIterator.next());

			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
	}

}
