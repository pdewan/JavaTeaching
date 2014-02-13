package lectures.iterator;

public class ReusingForwardReverseUpperCasePrinter {
	static final int MAX_CHARS = 5;
	static char[] upperCaseLetters = new char[MAX_CHARS];
	static int numberOfUpperCaseLetters = 0;

	public static void main(String[] args) {
		printAndStore(args[0]);
		printReverse();
	}

	public static void printAndStore(String s) {
		System.out.println("Upper Case Letters:");
		printAndStore(new AnUpperCaseIterator(s));
	}

	public static void printAndStore(CharIterator charIterator) {
		while (charIterator.hasNext()) {
			char inputChar = charIterator.next();
			System.out.print(inputChar);
			storeChar(inputChar);
		}
		System.out.println();
	}

	public static void storeChar(char c) {
		if (numberOfUpperCaseLetters == MAX_CHARS) {
			System.out
					.println("Too many upper case letters. Terminating program. ");
			System.exit(-1);
		}
		upperCaseLetters[numberOfUpperCaseLetters] = c;
		numberOfUpperCaseLetters++;
	}

	public static void printReverse() {
		System.out.println("Upper Case Letters in Reverse:");
		for (int index = numberOfUpperCaseLetters - 1; index >= 0; index--) {
			System.out.print(upperCaseLetters[index]);
		}
	}

}
