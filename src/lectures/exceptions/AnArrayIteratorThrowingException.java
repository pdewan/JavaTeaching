package lectures.exceptions;

import java.util.NoSuchElementException;

import lectures.iterator.StringIterator;

public class AnArrayIteratorThrowingException implements StringIterator {
	String[] elements;
	int nextIndex;
	public AnArrayIteratorThrowingException(String[] anElementArray) {
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
		StringIterator stringIterator = new AnArrayIteratorThrowingException(new String[]{"hello", "goodbye"});
		while (stringIterator.hasNext())
			System.out.println(stringIterator.next());
	}

}
