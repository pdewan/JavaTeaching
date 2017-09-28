package lectures.iterator;

public class MonolithicUpperCasePrinter {
	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("Illegal number of arguments:" + args.length
					+ ". Terminating program.");
			System.exit(-1);
		}
		System.out.println("Upper Case Letters:");
		int index = 0;
		while (index < args[0].length()) {
			if (Character.isUpperCase(args[0].charAt(index)))
				System.out.print(args[0].charAt(index));
			index++;
		}
		System.out.println();
	}

}
