package lectures.exceptions;

public class WhyUncheckedExceptions {
	static void safeArrayIndexer() throws ArrayIndexOutOfBoundsException {
	    String args[] = {"hello", "goodbye"};
	    System.out.println(args[1]);
	}
}
