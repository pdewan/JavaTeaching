package lectures.exceptions;
public class ExceptionHandlingArgsPrinter {
	public static void main(String[] args) {
		try {
			System.out.println(args[0]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Did not specify the argument to be printed. Terminating program.");
			System.exit(-1);
		}
	}
}
