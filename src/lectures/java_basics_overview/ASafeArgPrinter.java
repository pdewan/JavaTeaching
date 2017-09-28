package lectures.java_basics_overview;
public class ASafeArgPrinter {
	public static void main(String[] args) {
		if (args.length == 1)
			System.out.println(args[0]);
		else
			System.out.println("Illegal no of arguments:" + args.length
					+ ". Terminating program");
	}
}
