
/**
 * PACKAGES
 * A class may be in a named hierarchical package much as a file can be in a named hierarchical folder
 * this class is in a package called scanning which is a supackage of lectures
 * a package name should start with a lowe case letter
 */
package lectures.scanning; 
	/**
	 * IMPORTS
	 * Below, we are importing an external class not in the package of this class
	 * The last part of the import identify the short name of the class and the preceding parts the package of the class.
	 * the package name followed by . followed by the short name of the class is its full or long name
	 * What is the short name of the class declared below by us?
	 * What is the full name of this class?
	 * What if you comment this import out?
	 */
import java.util.Scanner; 
	/**
	 * CLASSS
	 * Every program must have at least one class that declares a main method.
	 * A class is like a file in non object oriented languages.
	 * A class name should be camel case starting with an upper case letter.
	 */
public class AConsoleReadingUpperCasePrinter { 
	
	/**
	 * MAIN METHOD HEADER
	 * Syntax of main method shown below.
	 * Methods correspond to procedures and functions in other languages.
	 * Method names should be camel case starting with lowercase letter.
	 * Everything before the first curly brace is the method header.
	 */
	public static void main(String[] args) 
	/*
	 * What happens if you use this header instead, can you execute the program?
	 */
//	public static void main(String args) {
	/**
	* METHOD BODY
	* The code between the outermost curly braces is the method body.
	* A method body is a sequene of statements teminated with semi colons;
	*/
	{

		 /* Use of library, nothing conceptual here, just some syntax */
		Scanner scanner = new Scanner(System.in);
		String scannedString = scanner.nextLine(); // gives next line input by the use, hover on method name
		
		int index = 0; // variable names should be camel case starting with lower case letters 
		/**
		 * WHILE LOOPS
		 * Syntax of Java while loop shown below
		 * The loop "scans" scannedString, that is, it examines every character in the string and finds
		 * substrings of interest called tokens
		 * How many characters in each token identified by this loop?
		 */
		while (index < scannedString.length()) {
			
			/* charAt() gives character at index, hover over its name to get its behavior */
			char nextLetter = scannedString.charAt(index);
			/**
			 * IF STATEMENTS
			 * Syntax of if statement with optional else shown below
			 * the if check shows that characters are ordered
			 * This ordering  preserves letter and digit ordering
			 * You should only compare digits, lowercase letters and upper case letters with each other
			 * not digits and letters or lower case and upper case with each other as these orderings are not fundamental
			*/
			if (nextLetter >= 'A' && nextLetter <= 'Z') {
				System.out.println("Token:" + nextLetter); // + here means string concatenation
			}			
//			else {
//				System.out.println("Skipping:" + nextLetter);
//			}
			index++;
		}
		/**
		 * What are the tokens printed when the input is Albert Einstein
		 * What are the values of index when the print is executed
		 */
		
		scanner.close(); // we are done with the scanner, we are actually just done
	}

}
