package lectures.java_basics_overview;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

import lectures.class_dual_roles.statics.Factorials;
import lectures.main_consoleinput.Console;

// this code is for those who know conventional programming but are unfamilar with Java syntax
public class CodeSnippets {
	static char c = 'a'; // all global vars  start with static

	 static void primtiveAndStringLocalVariables() {		
		// primitives and string
		final double height = 1.77;
		final float weight = 75;
		final boolean overWeight = false;
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
		final int maxStringArrays = 20;
		String[][] stringArrays = new String[maxStrings][maxStringArrays];
	}

	 static void conditionalAndOutput(int aScore) {
		final int passCutoff = 50;
		if (aScore < passCutoff) {
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
	
	static char computeCharGrade(int aScore) {
		if (aScore >=90)
			return 'A';
		if (aScore >= 80)
			return 'B';
		if (aScore >= 70)
			return 'C';
		if (aScore >= 60)
			return 'D';
		return 'F';
	}
	static Grade computeEnumGrade(int aScore) {
		if (aScore >=90)
			return Grade.A;
		if (aScore >= 80)
			return Grade.B;
		if (aScore >= 70)
			return Grade.C;
		if (aScore >= 60)
			return Grade.D;
		return Grade.F;
	}
	 
	static void commentOnGrade(char aGrade) {
		switch (aGrade) {
		case 'A':
		case 'B':
			System.out.println("Good");
			break;
		case 'C':
			System.out.println ("OK");
			break;
		case 'D':
		case 'F':
			System.out.println("Bad");
			break;
		default:
			System.out.println("Illegal grade");
		}
	}
	
	static void commentOnGrade(Grade aGrade) {
		switch (aGrade) {
		case A:
		case B:
			System.out.println("Good");
			break;
		case C:
			System.out.println ("OK");
			break;
		case D:
		case F:
			System.out.println("Bad");
			break;
		}
	}

	 static void whileInputAndSingleLineComment() {
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

	

	

	 static void readAndPrintStrings() {
		// read the number of strings to be input
		System.out.println("Number of Strings:");
		int numElements = Console.readInt(); 
		// fill array with num elements numbers input by the user
		System.out.println("Please enter " + numElements + " strings");
		String[] strings = new String[numElements]; // dynamic array
		for (int elementNum = 0; elementNum < numElements; elementNum++)
			strings[elementNum] = Console.readString();
		/*
		 * Print the array input* in the previous loop
		 */
		for (int elementNum = 0; elementNum < strings.length; elementNum++)
			System.out.println(strings[elementNum]);
		// print 0th array element
		String s = strings[0]; // unsafe
		for (int i = 0; i < s.length(); i++)
			System.out.println(s.charAt(i));
	}
	
	 static void modularReadAndPrintStrings() {
		String [] strings = readStrings(readNumStrings());
		printStrings(strings);
		printString(strings[0]);// unsafe
	}
	
	 static int readNumStrings() {
		System.out.println("Number of Strings:");
		return Console.readInt(); // reads the next line as integer
	}
	 static String[] readStrings(int aNumElements) {
		System.out.println("Please enter " + aNumElements + " strings");
		String[] strings = new String[aNumElements]; // dynamic array
		for (int elementNum = 0; elementNum < aNumElements; elementNum++)
			strings[elementNum] = Console.readString();
		return strings;
	}
	 static void printStrings(String[] aStrings) {
		for (int elementNum = 0; elementNum < aStrings.length; elementNum++)
			System.out.println(aStrings[elementNum]);
	}
	
	 static void printString(String aString) {
		for (int i = 0; i < aString.length(); i++)
			System.out.println(aString.charAt(i));
	}
	

	static void subString() {
		 System.out.println("hello world".substring(4, 7));
		 System.out.println("hello world".substring(4, 4));
		 System.out.println("hello world".substring(7, 4));
	}

	static Scanner scanner = new Scanner(System.in);

	public static int readInt() {
		try { // program block that can cause an error
			return Integer.parseInt(scanner.nextLine());
		} catch (Exception e) { // program block that handles the error
			e.printStackTrace();
			System.out.println(e);
			return 0;
		}
	}

	public static String readString() {
		try {
			return scanner.nextLine();
		} catch (Exception e) {
			System.out.println(e);
			return "";
		}
	}
	

//	 static int factorial(int n) {
//		int product = 1;
//		while (n > 0) {
//			product *= n;
//			n -= 1;
//		}
//		return product;
//	}
//	static int product = 1;
//	 static void setFactorial(int n) {
//		
//		while (n > 0) {
//			product *= n;
//			n -= 1;
//		}
//	}
	static int[][] nestedAssignmentScores = { 
		       {100, 98, 99, 100, 90, 80},
		        {80, 70, 30}
	};


	 static void factorials() {
		while (true) { // loop condition never false
			int n = readInt();
			if (n < 0)
				break;
			System.out.println("factorial = " + Factorials.loopingFactorial(n));
		}
	}

	 static void main(String[] args) {
		System.out.println(Math.round(4.5));
		System.out.println(nestedAssignmentScores[0][0]);
//		System.out.println(factorial(4));
		long factorial = Factorials.loopingFactorial(4);
		if (args.length > 0)
			System.out.println(args[0]);
		factorials();
	}
}
