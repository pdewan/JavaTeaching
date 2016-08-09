package lectures.iterator;

import java.util.NoSuchElementException;
/**
 * Comment out the throws declaration.
 * Look at the errors, if any.
 * Are you surprised?
 */
public interface CharIterator {
	public char next();
	public boolean hasNext() 			
			throws NoSuchElementException // comment this out
			;
	
}
