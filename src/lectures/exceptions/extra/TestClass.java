package lectures.exceptions.extra;

import java.io.IOException;

/**
 * RELATIONSHIP BETWEEN THROWS CLAUSES IN CLASS AND INTERFACE METHOD HEADERS
 * Tepeat the following steps for both IOException and ArrayIndexOutOfBoundsException.
 * 1. Uncomment the throws class for the  exception in this class but not in its interface.
 * 2. Do the reverse.
 * What errors did you get, if any, in each case. Do they make sense?
 * 
 * Can an interface force its implementations to handle certain exceptions?
 * Can interface force its implementations to not handle certain exceptions?
 */
public class TestClass implements TestInterface  {
	
	
	public void nothingMeaningful(String[] args) 
//			throws IOException 
//			throws ArrayIndexOutOfBoundsException
	{
		// the code does not matter
	}
	
	
}
