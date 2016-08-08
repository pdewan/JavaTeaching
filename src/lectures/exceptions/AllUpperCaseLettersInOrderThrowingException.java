package lectures.exceptions;

import java.util.NoSuchElementException;

import lectures.iterator.CharIterator;

public class AllUpperCaseLettersInOrderThrowingException implements
		CharIterator {
	char nextLetter = 'A';

	public boolean hasNext() {
		return nextLetter <= 'Z';
	}

	public char next() throws NoSuchElementException {
		if (!hasNext()) {
			throw new NoSuchElementException();
		}
		char retVal = nextLetter;
		nextLetter = (char) (nextLetter + 1);
		return retVal;
	}
	
	public static void main (String[] args) {
		CharIterator anUpperCasePrinter = new AllUpperCaseLettersInOrderThrowingException();
		while (anUpperCasePrinter.hasNext()) {
			System.out.println (anUpperCasePrinter.next());
		}
	}
}
