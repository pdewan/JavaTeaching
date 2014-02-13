package lectures.exceptions;

import java.io.IOException;


public class IteratedStringPrinterCatchingIOException {
	public static void print(StringIteratorThrowingIOException aStringIterator) {
		try {
		while (aStringIterator.hasNext())
			System.out.println(aStringIterator.next());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
