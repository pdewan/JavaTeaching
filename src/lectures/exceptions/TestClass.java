package lectures.exceptions;
/**
 * RELATIONSHIP BETWEEN THROWS CLAUSES IN CLASS AND INTERFACE METHOD HEADERS
 * 1. Comment out the throws clause in the class, leaving it in the interface.
 * 2. Do the reverse.
 * What errors did you get, if any, in each case. Do they make sense?
 * Remember you can overstate but not understate problems.
 * 
 * Can an interface force its implementations to handle certain checked exceptions?
 * Can interface force its implementations to not handle certain checked exceptions?
 */
public class TestClass implements TestInterface  {
	
	
	public void procesArgs(String[] args) 
			throws AMissingArgumentException // comment this out
	{
		// the code does not matter
	}
	
	
}
