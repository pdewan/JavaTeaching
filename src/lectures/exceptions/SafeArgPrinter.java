package lectures.exceptions;
public class SafeArgPrinter {
	public static void main(String[] args) {
		if (args.length == 0) {
			System.out
					.println("Did not specify the argument to be printed. Terminating program.");
			System.exit(-1);
		} else {
			System.out.println(args[0]);
		}
	}
}
