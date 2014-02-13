package lectures.iterator;

public class ReusingUpperCasePrinter {
	public static void main(String args[]) {
		printUpperCase(args[0]);
	}
	public static void printUpperCase(String s) {
		System.out.println("Upper Case Letters:");
		printChars(new AnUpperCaseIterator(s));
	}
	public static void printChars(CharIterator charIterator) {
		while (charIterator.hasNext())
			System.out.print(charIterator.next());
	}
}
