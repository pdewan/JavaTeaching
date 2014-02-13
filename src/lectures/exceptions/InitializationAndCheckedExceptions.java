package lectures.exceptions;
import static lectures.exceptions.LinesReaderAndPrinterUsingProgrammerDefinedException.numberOfInputLines;


public class InitializationAndCheckedExceptions {
//	int  numberOfInputLines = numberOfInputLines(new String[] {"45"});
	int  numberOfInputLines;	
    public InitializationAndCheckedExceptions() {
    	try {
    	  numberOfInputLines = numberOfInputLines(new String[] {"45"});
    	} catch (AMissingArgumentException e) {
    		e.printStackTrace();
    	}
    }	
}
