package lectures.iterator;

import java.util.NoSuchElementException;
public interface CharIterator {
	public char next();
	public boolean hasNext() 			
			throws NoSuchElementException 
			;
	
}
