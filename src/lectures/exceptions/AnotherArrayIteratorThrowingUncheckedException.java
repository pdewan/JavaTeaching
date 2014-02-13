package lectures.exceptions;

import java.util.NoSuchElementException;

import lectures.iterator.IteratedStringPrinter;
import lectures.iterator.StringIterator;

public class AnotherArrayIteratorThrowingUncheckedException implements StringIteratorThrowingIOException {
	String[] elements;
	int nextIndex;
	public AnotherArrayIteratorThrowingUncheckedException(String[] anElementArray) {
		elements = anElementArray;		
	}
	public String next() throws NoSuchElementException {
		if (!hasNext())
			throw new NoSuchElementException();
		String retVal = elements[nextIndex];
		nextIndex++;
		return retVal;
	}
	public boolean hasNext() {
		return nextIndex < elements.length;
	}
	public static void main(String[] args) {
		IteratedStringPrinterCatchingException.print(new AnotherArrayIteratorThrowingUncheckedException(new String[]{"hello", "goodbye"}));	
	}

}
