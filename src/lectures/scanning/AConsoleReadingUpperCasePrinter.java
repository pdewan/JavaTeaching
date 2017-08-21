
/**
 * RUNNING A PROGRAM
 * This is an example of a Java program called a class in Java.
 * There are many ways to execute a class,
 * If you are editing the class and your insertion point is in it,
 * Right click->Debug As->Java Application is one way.
 * Use it or some other way you know to run this program.
 * 
 * If you do not see the Java Application option in Debug As, or your get a 
 * console message:
 * "Cannot run or load class"
 * then your project is misconfigured and you to delete the
 * oeall.jar file from the class path.
 * 
 * Look at the ObjectEditor PPT
 * http://www.cs.unc.edu/~dewan/comp401/current/Lectures/ObjectEditorLib.pdf
 * on importing JavaTeaching  on how to do so. You have to select
 * the project then Right Click->Properties->Build Path->Libraries. 
 * Select oeall22.jar (it should be red, and remove it. 
 * You will get a bunch of errors now but you can do the praxis. Look at
 * the objecteditor ppt on how to add your downloaded oeall to the class/build path.
 * 
 * PACKAGES
 * How is a package stored in the file system?
 * T/F For each class, a folder is created.
 * T/F For each class, a file is created.
 * 
 * How is a class stored in the file system?
 * T/F For each package, a folder is created.
 * T/F For each package, a file is created.
 * 
 * A class (named AConsoleReadingUpperCasePrinter below) may be contained in 
 * a named hierarchical package much as a file can be in a named hierarchical folder
 * This class is in a package called scanning which is a sub-package of lectures.
 * In fact, for each package, the OS creates a folder and for each class in a 
 * package it creates a file in the folder of its package.
 * This correspondence means that two different packages can 
 * contain classes with the same short name. However a package cannot 
 * contain two classes with the same name.
 * A package name should start with a lower case letter.
 * 
 * Why are packages useful?
 * 
 * FULL VS SHORT NAME
 * T/F The full name of a class contains its package and class name.
 * T/F The short name of a class is its package name.
 * 
 * The package name followed by . followed by the short name of the class is 
 * its full or long name.
 * The full name of this class is lectures.scanning.AConsoleReadingUpperCasePrinter 
 * (if you have made a copy
 * it is lectures.scanning.copy.AConsoleReadingUpperCasePrinter).
 * 
 */
package lectures.scanning; 
	/**	  
	 * 
	 * IMPORTS
	 * T/F It makes sense for a class to import only those classes that are 
	 * not in its package.
	 * 
	 * If a class C1 refers a class C2 in a different (external) package, 
	 * then it must use either the full name of class C2 or import C2.
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
	 * A class is like a file in non object oriented languages.
	 * A class name should be camelCase starting with an upper case letter.
	 * That is, the first word in the name should be a lowercase letter
	 * and  each subsequent word should start with an uppercase letter.
	 */
public class AConsoleReadingUpperCasePrinter { 
	
	/**
	 * EXECUTABLE CLASSES and MAIN METHOD HEADER
	 * T/F Only a class with a main method can be executed.  
     * T/F A main method is the: first method executed when its class is run.
     * T/F A main method is the last method executed when its class is run.
     * 
	 * Every runnable program must have at least one class that declares a main method.
	 * Syntax of main method shown below. This is the first method called when
	 * the program is run, and can of course call other methods.
	 * Methods correspond to procedures and functions in other languages.
	 * A method name should be camelCase 
	 * Everything before the first curly brace is the method header.
	 * 
	 * What is the purpose of the args parameter to the main method? 
	 * (It is ok if you do not know the answer).
	 */
	public static void main(String[] args) 
	/* MAIN METHOD CONSTRAINTS
	 * T/F A main method must have an argument named args.
	 * T/F A main method can have a int argument.
	 * T/F Constraints put on the header of the main method makes it easier for
	 *  a human being to find it in the containing main class
	 * T/F Constraints put on the header of the main main method make it easier
	 *     for the Java interpreter, which executes a main method, to find it in the containing class.
	 * T/F Constraints put on the header of the main method can prevent 
	 *     programming errors such as returning a value that is not processed by the interpreter.
	 * 
	 * What happens if you use each of the following headers for main instead? 
	 * Can you execute the program?
	 * You cannot execute the program if you do not see the Java Application option 
	 * in the Run As or Debug As menu command, or if you see the console message, 
	 * cannot find or load main method.
	 * 
	 * Comment out the header above and uncomment the following to see what happens?
	 * Does the program compile? 
	 * Can the program be executed - do you get an option to run it?
	 * You can comment and uncomment a set of selected lines using the 
	 * shortcut CTRL/
	 * In the case of a single line, it is sufficient to have the insertion point 
	 * in the line.
	 * 
	 * This exercise shows that a method with an arbitrary header cannot be
	 * considered a main method. To understand why such constraints are necessary,
	 * consider two entities, the Java interpreter and a human reading your code,
	 * that must be able to search for the main method.
	 * When you execute a class, the Java interpreter must find the method so
	 * it can execute it and pass it the expected parameters.
	 * When humans  reads your code, they must be able to determine the 
	 * starting method without relying on perhaps missing or obsolete comments.
	 * 	 
	 */
//	public static void main(String args) 
//	public static void main(String[] anArgs) 
//	public static void main(String anArgs[]) 
//	public void main(String anArgs[]) 
//	public static int main(String anArgs[]) 


	/**
	* METHOD BODY
	* The code between the outermost curly braces is the method body.
	* A method body is a sequence of statements terminated with semicolons;
	*/
	{
		System.out.println ("Please enter a string with uppercase and lower case letters.");
		 /* Use of library, nothing conceptual here, just some syntax */
		/*
		 * The next statement needs to be executed once per console reading program
		 */
		Scanner scanner = new Scanner(System.in);
		/*
		 * The Scanner nextLine() method:
		 * 	(a) returns the remainder of the current line input by the user 
		 *     and advances to the next line.
		 * 
		 *  (b) advances to the next line and returns all the characters in it.
		 * 
		 * The next statement gives the next line input by the user on the console. 
		 * Hover on method name, nextLine, to see its description and answer the 
		 * questions above.	
		 *
		 */
		String scannedString = scanner.nextLine(); 
		
		int index = 0; // variable names should be camel case starting with lower case letters 
		/**
		 * SCANNING AND WHILE LOOPS
		 * (T/F) A token produced by scanning a string can have non consecutive 
		 *       characters of the string.
		 * (T/F) A string scanned by a scanner is a concatenation of all the tokens 
		 * 		 detected by the scanner.
		 * 
		 * Syntax of Java while loop shown below
		 * The loop is  "scans" scannedString, that is, 
		 * it examines every character in the string and finds
		 * substrings of interest called tokens.
		 * A substring SS of a string S is a sequence of consecutive characters
		 * in S.
		 * Not every character of a scanned string S is of interest, and thus,
		 * part of an output token.
		 * 	
		 * Characters are letters, digits, spaces and other values you can enter 
		 * from the keyboard.
		 * A string can be considered an array or sequence of characters.
		 * 
		 * How many characters in each token identified by this loop?
		 * Is this use of the term "scanning" consistent with its use in the 
		 * English language?
		 */
		while (index < scannedString.length()) {
			
			/* 
			 * The charAt() operation returns a value of type:
			 * 	 (a) String.
			 *   (b) char.
			 *   (c) none of the above
			 *  If L is the length of the String on which charAt() is invoked,
			 * 		legal arguments of charAt() are in the range: 
			 *   (a) 0..L
			 *   (b) 1..L
			 *   (c) 0..L-1
			 *   (d) 1..L-1
			 *   (e) None of the above
			 * 			 * 
			 * charAt() gives character at index, hover over its name to get its 
			 * behavior and answer the questions.
			 * A char is a type defined to store characters.
			 */
			char nextLetter = scannedString.charAt(index);
			/**
			 * STRING + AND CHARACTER ORDERING
			 * 
			 * Which is true:
			 *     (a) The character 'a' is greater than the character 'b'.
			 *     (b) The character 'a' is smaller than the character 'b'.
			 *     (c) The character 'a' and 'b' cannot be compared.
			 *      
			 * Which is true:
			 * 	   (a) The character 'a' and '0' cannot be compared in Java.
			 *     (b) The character 'a' and '0' can be compared in Java but 
			 *         it is not good style to make this comparison.
			 *     (c) The character 'a' and '0' can be compared in Java and it
			 *         is good style to make this comparison.
			 *        
			 * (T/F) Given strings s1 and s2, s1 + s2 is 
			 * 		(a)the sum of the lengths of (number of characters in) s1 and s2.		 * 
			 * 		(b)the result of appending s2 to s1.
			 *      (c)none of the above.
			 * 
			 * Syntax of if statement with optional else shown below
			 * the if check shows that characters are ordered
			 * This ordering  preserves letter and digit ordering
			 * You should only compare digits, lowercase letters and upper case 
			 * letters with each other, not digits and letters or lower case 
			 * and upper case with each other as these orderings are not fundamental.
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
		 * When the String "Albert Einstein" is input, the tokens produced are
		 * the strings:
		 *     (a) "Albert" and "Einstein"
		 *     (b) "A" and "B"
		 *     (c) None of the above
		 *     
		 *  The values of variable, index, when the print is executed are:
		 *      (a) Each of the values in the range 0..scannedString.length()-1
		 *      (b) Each of the values in the range 0..scannedString.length()
		 *      (c) 0 and 7
		 *      (d) 1 and 8
		 *      (e) None of the above		
		 */
		
		scanner.close(); // we are done with the scanner, we are actually just done
		System.out.println ("Program ends.");
	}

}
