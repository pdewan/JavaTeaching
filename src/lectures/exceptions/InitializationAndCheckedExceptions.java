package lectures.exceptions;

/**
 * 
 * Initialization Alternatives
 * Usually it is a good idea to initialize a variable while declaring it, if its value
 * can be computed at declaration time.
 * 
 * How would you qualify this recommendation based on your knowledge of exceptions
 * and following the instructions below?
 *
 */
public class InitializationAndCheckedExceptions {
	
	 String[] anArgs = new String[] {"3"};
	 /*
	  * Try each of the three alternative declarations. 
	 */
//	int  numberOfInputLines = LinesReaderAndPrinterUsingProgrammerDefinedException.numberOfInputLines(anArgs);
//	int  numberOfInputLines = LinesReaderAndPrinter.numberOfInputLines(anArgs);
	int  numberOfInputLines; // no initialization
	
	/**
	 * Example of initialization in constructor.
	 */
    public InitializationAndCheckedExceptions() {
    	try {
    	  numberOfInputLines = LinesReaderAndPrinterUsingProgrammerDefinedException.numberOfInputLines(anArgs);
    	} catch (AMissingArgumentException e) {
    		e.printStackTrace();
    	}
    }	
}
