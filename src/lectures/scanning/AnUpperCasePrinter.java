package lectures.scanning;
public class AnUpperCasePrinter {
	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("Illegal number of arguments:" + args.length
					+ ". Terminating program.");
			System.exit(-1);
		}
		String scannedString = args[0];
		System.out.println("Upper Case Letters:");
		int index = 0;
		while (index < scannedString.length()) {
			char nextLetter = scannedString.charAt(index);
			if (nextLetter >= 'A' && nextLetter <= 'Z')
				System.out.print(nextLetter);
			index++;
		}
		System.out.println();
	}

}
