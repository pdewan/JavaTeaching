package lectures.exceptions.extra;

import java.io.IOException;


public class IteratedStringPrinterCatchingException {
	public static void print(StringIteratorThrowingIOException aStringIterator) {
		try {
		while (aStringIterator.hasNext())
			System.out.println(aStringIterator.next());
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println();
		}
	}
}
