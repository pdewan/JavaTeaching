package lectures.java_syntax_overview;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import lectures.main_consoleinput.Console;

// this code is for those who know conventional programming but are unfamilar with Java syntax
public class JavaSyntaxDemoer {
	static char c = 'a'; // all global vars  start with static

	public static void primtiveAndStringLocalVariables() {		
		// primitives and string
		double height = 1.77;
		float weight = 75;
		boolean overWeight = false;
		final int highBMI = 27;
		String name = "joe";
		char firstChar = name.charAt(0);
		int bmi = (int) (weight / (height * height));

		// arrays
		int[] ints;
		final int maxInts = 20;
		int[] ints2 = new int[maxInts];
		final int maxChars = 20;
		char[] chars = new char[maxChars];
		final int maxStrings = 20;

		char[] strings = new char[maxStrings];
		final int maxStringsArray = 20;
		String[][] stringArrays = new String[maxStrings][maxStringsArray];
	}

	public static void conditionalAndOutput(int score) {
		final int passCutoff = 50;
		if (score < passCutoff) {
			System.out.println("**************");
			System.out.println("FAILED");
			System.out.println("**************");
		} else {
			System.out.println("**************");
			System.out.println("PASSED");
			System.out.println("Congratulations!");
			System.out.println("**************");
		}
		switch (c) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("Vowel");
			break;
		default:
			System.out.println("Consonant");
		}
	}

	public static void whileInputAndSingleLineComment() {
		int product = 1;
		int nextNum = readInt();
		while (nextNum >= 0) {
			product = product * nextNum;
			nextNum = readInt();
		}
		System.out.print(product);
	}

	static BufferedReader inputStream = new BufferedReader(
			new InputStreamReader(System.in));

	public static int readInt() {
		try { // program block that can cause an error
			return Integer.parseInt(inputStream.readLine());
		} catch (Exception e) { // program block that handles the error
			e.printStackTrace();
			System.out.println(e);
			return 0;
		}
	}

	

	public static void forArrayComments() {
		System.out.println("Number of Strings:");
		int numElements = Console.readInt(); // reads the next line as integer
		System.out.println("Please enter " + numElements + " strings");
		String[] strings = new String[numElements]; // dynamic array
		for (int elementNum = 0; elementNum < numElements; elementNum++)
			strings[elementNum] = Console.readString();
		/*
		 * This loop uses the array input* in the previous loop
		 */
		for (int elementNum = 0; elementNum < strings.length; elementNum++)
			System.out.println(strings[elementNum]);
		String s = strings[0]; // unsafe
		for (int i = 0; i < s.length(); i++)
			System.out.println(s.charAt(i));

	}
	
	public static void forArrayCommentsWithMethodDecomposition() {
		String [] strings = readStrings(readNumStrings());
		printStrings(strings);
		printString(strings[0]);// unsafe
	}
	
	public static int readNumStrings() {
		System.out.println("Number of Strings:");
		return Console.readInt(); // reads the next line as integer
	}
	public static String[] readStrings(int numElements) {
		System.out.println("Please enter " + numElements + " strings");
		String[] strings = new String[numElements]; // dynamic array
		for (int elementNum = 0; elementNum < numElements; elementNum++)
			strings[elementNum] = Console.readString();
		return strings;
	}
	public static void printStrings(String[] strings) {
		for (int elementNum = 0; elementNum < strings.length; elementNum++)
			System.out.println(strings[elementNum]);
	}
	
	public static void printString(String s) {
		for (int i = 0; i < s.length(); i++)
			System.out.println(s.charAt(i));
	}
	

	void subString() {
		 System.out.println("hello world".substring(4, 7));
		 System.out.println("hello world".substring(4, 4));
		 System.out.println("hello world".substring(7, 4));
	}

	public static int factorial(int n) {
		int product = 1;
		while (n > 0) {
			product *= n;
			n -= 1;
		}
		return product;
	}

	public static void factorials() {
		while (true) { // loop condition never false
			int n = readInt();
			if (n < 0)
				break;
			System.out.println("factorial = " + factorial(n));
		}
	}

	public static void main(String[] args) {
		if (args.length > 0)
			System.out.println(args[0]);
		factorials();
	}
}
