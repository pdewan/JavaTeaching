package lectures.iterator_scanning;

public class MonolithicForwardReverseUpperCasePrinter {
	static final int MAX_CHARS = 5;
	static char[] upperCaseLetters = new char[MAX_CHARS];
	static  int numberOfUpperCaseLetters = 0;
	public static void main(String[] args){
		int index = 0;
		System.out.println("Upper Case Letters:");
		while (index < args[0].length()) {
			if (Character.isUpperCase(args[0].charAt(index))) {
				System.out.print(args[0].charAt(index));
				storeChar(args[0].charAt(index));
			}
			index++;
		}
		System.out.println();
		printReverse();
	}
	public static void storeChar(char c) {
		if (numberOfUpperCaseLetters == MAX_CHARS) {
			System.out.println("Too many upper case letters. Terminating program. ");
			System.exit(-1);
		}
		upperCaseLetters[numberOfUpperCaseLetters] = c;
		numberOfUpperCaseLetters++;
	}
	public static void printReverse() {		
		System.out.println("Upper Case Letters in Reverse:");
		for (int index =numberOfUpperCaseLetters - 1; index >= 0; index--) {
			System.out.print(upperCaseLetters[index]);
		}
		System.out.println();
	}
	


}
