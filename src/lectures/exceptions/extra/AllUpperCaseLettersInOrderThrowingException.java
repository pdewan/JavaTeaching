package lectures.exceptions.extra;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.NoSuchElementException;

import lectures.iterator.CharIterator;
/**
 * ITERATORS AND EXCEPTIONS
 * This class implements the general concept of an Iterator of which there
 * are many implementations - in fact two in Java called {@link Enumeration}
 * and {@link Iterator}. Look at the two definitions of these interfaces to get
 * an idea of the general concept.
 * 
 * Study the code and run it. 
 * 
 * Then comment out the println and run the program. Were you surprised?
 * 
 * WHEN TO USE EXCEPTION HANDLING
 *
 * Compare the two loops in exceptionCaught and noExceptionCaught.
 * Are they equivalent?
 * Which is faster in terms of the number of conditions checked?
 * Which is easier to understand? Why?
 *  
 *
 */
public class AllUpperCaseLettersInOrderThrowingException implements
		CharIterator {
	char nextLetter = 'A';

	public boolean hasNext() {
		return nextLetter <= 'Z';
	}
	/**
	 * This is a function (returns a value) but has "side effects".
	 * What is the side effect?
	 */
	public char next() 
	       // Hover over this exception name to see its description
		   // Press F4 on the name and see its type hierarchy
		   // Is its a checked or unchecked exception?
			throws NoSuchElementException { 
		if (!hasNext()) {
			throw new NoSuchElementException();
		}
		char retVal = nextLetter;
		nextLetter = (char) (nextLetter + 1);
		return retVal;
	}
	/**
	 * Use the hasNext() function to determine when to terminate loop. No exception caught,
	 */
	public static void noExceptionCaught() {
		CharIterator anUpperCasePrinter = new AllUpperCaseLettersInOrderThrowingException();
		while (anUpperCasePrinter.hasNext()) {
			System.out.println (anUpperCasePrinter.next());
			// 1. Comment the following code out and run. Were you surprised?
//			System.out.println ("Reprinting:" + anUpperCasePrinter.next());
		}
	}
	/**
	 * Use NoSuchElementException to determine when to terminate loop. An exception caight.
	 */
	public static void exceptionCaught() {
		CharIterator anUpperCasePrinter = new AllUpperCaseLettersInOrderThrowingException();
		try {
		while (true) {
			System.out.println (anUpperCasePrinter.next());
		}
		} catch (NoSuchElementException e) {
			// no more elements, not an error, do nothing
		}
	}
	public static void main (String[] args) {
		noExceptionCaught();
//		exceptionCaught();
	}
}
