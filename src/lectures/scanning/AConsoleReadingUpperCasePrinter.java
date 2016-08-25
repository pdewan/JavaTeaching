
/**
 * RUNNING A PROGRAM
 * This is an example of a Java program called a class in Java.
 * There are many ways to execute a class,
 * If you are editing the class and your insertion pont is in it,
 * Right click->Debug As->Java Application is one way.
 * Use it or some other way you know to run this program.
 * 
 * PACKAGES
 * A class (named AConsoleReadingUpperCasePrinter below)  may be contained in a named hierarchical package much as a file can be in a named hierarchical folder
 * This class is in a package called scanning which is a sub-package of lectures.
 * In fact, for each package, the OS creates a folder and for each class in a package it creates a file in the 
 * folder of its package.
 * This correspondence means that two different packages can 
 * contain classes with the same short name. However a package cannot 
 * contain two classes with the same name.
 * A package name should start with a lower case letter.
 * 
 * Why are packages useful?
 * 
 * FULL VS SHORT NAME
 * The package name followed by . followed by the short name of the class is its full or long name.
 * The full name of this class is lectures.scanning.AConsoleReadingUpperCasePrinter
 * 
 */
package lectures.scanning; 
	/**	  
	 * 
	 * IMPORTS
	 * 
	 * If a class C1 refers a class C2 in a different (external) package, then it must use either the full name
	 * of class C2 or import C2.
	 * 
	 * Below, we are importing an external class not in the package of this class.
	 * What happens if you comment this import out?
	 * Now execute CTRL-SHIFT-O and make the selection. The import should reappear.
	 * This is a good way to import classes whose full names you do not remember or know.
	 * 
	 * Can a program that uses external packages not have imports?
	 * Why are imports useful?
	 */
import java.util.Scanner; 
	/**
	 * CLASSS
	 * Every runnable program must have at least one class that declares a main method.
	 * A class is like a file in non object oriented languages.
	 * A class name should be camel case starting with an upper case letter.
	 * That is, the first word in the name should be a lowercase letter
	 * and  each subsequent word should start with an uppercase letter.
	 */
public class AConsoleReadingUpperCasePrinter { 
	
	/**
	 * MAIN METHOD HEADER
	 * Syntax of main method shown below. This is the first method called when
	 * the program is run, and can of course call othe methods.
	 * Methods correspond to procedures and functions in other languages.
	 * A method name should be camelCase 
	 * Everything before the first curly brace is the method header.
	 * 
	 * What is the purpose of the args parameter to the main method?
	 */
	public static void main(String[] args) 
	/*
	 * What happens if you use each of the following headers for main instead, can you execute the program?
	 * Comment out the header above and uncomment the following to see what happens?
	 * Does the program compile? Can the program be executed - do you get an option to run it?
	 * You can comment and uncomment a set of selected lines using the shortcut CTRL/
	 * In the case of a single line, it is sufficient to have the insertion point in the line.
	 * 	 
	 */
//	public static void main(String args) {
//	public static void main(String[] anArgs) {
//	public static void main(String anArgs[]) {
//	public void main(String anArgs[]) {
//	public static int main(String anArgs[]) {


	/**
	* METHOD BODY
	* The code between the outermost curly braces is the method body.
	* A method body is a sequence of statements terminated with semi colons;
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
		 * substrings of interest called tokens.
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
			// just showing the else syntax below
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
