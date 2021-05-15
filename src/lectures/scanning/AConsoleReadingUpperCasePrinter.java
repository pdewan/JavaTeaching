
/*
 * RUNNING A PROGRAM
 * This is an example of a Java program containing an executable class.
 * Let us start by executing this class.
 * 
 * There are many ways to execute a class,
 * If you are editing the class and your insertion point is in it,
 * Right click->Debug As->Java Application provides one way.
 * Use it or some other way you know to run this program.
 * Enter some input and observe the output.
 * 
 * Let us now look at the code 
 * 
 */

package lectures.scanning; 
	
import java.util.Scanner; //comment out when asked
	
public class AConsoleReadingUpperCasePrinter { 
	/*
	 * Lesson Comment
	 * 
	 * CLASS	
	 *  
	 * A class is like a file in non object oriented languages.
	 * A class name should be camelCase starting with an upper case letter.
	 * That is, the first word in the name should be a lowercase letter
	 * and  each subsequent word should start with an uppercase letter.
	 */
	/*
	 * Lesson Comment:
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
	 */
	/*
	 * Sakai questions you can now answer
	 *
	 * T/F For each class, a folder is created.
	 * T/F For each class, a file is created.
	 * 	 
	 * T/F For each package, a folder is created.
	 * T/F For each package, a file is created.
	 */
	/*
	 * 
	 * FULL vs SHORT NAME	 
	 * 
	 * The package name followed the short name of the class is 
	 * its full or long name.
	 * 
	 * The full name of this class is lectures.scanning.AConsoleReadingUpperCasePrinter 
	 * (if you have made a copy
	 * it is lectures.scanning.copy.AConsoleReadingUpperCasePrinter).
	 *
	 * 
	 */
	/*
	 * Sakai questions you can now answer
	 * 
	 * FULL VS SHORT NAME
	 * T/F The full name of a class contains its package and class name.
	 * T/F The short name of a class is its package name.
	 */
	/*
	 * Lesson Comment  
	 * 
	 * IMPORTS	 *
	 * 
	 * If a class C1 refers a class C2 in a different (external) package, 
	 * then it must use either the full name of class C2 or import C2.
	 * 
	 * Above, we are importing an external class not in the package of this class.
	 * Experiment:
	 * 
	 * Do you get any errors  if you comment this import out?
	 * 
	 * Now execute CTRL-SHIFT-O and make the selection of the
	 * commented out class. 
	 * The import should reappear.
	 * 
	 * This is a good way to import classes whose full names you do not remember or know.
	 */
	/*
	 * Sakai questions you can now answer
	 * 
	 * T/F It makes sense for a class to import only those classes that are 
	 * not in its package.
	 */
	
		
	public static void main(String[] args) 
	/*
	 * Every runnable program must have at least one class that declares a main method.
	 * The syntax of main method header is shown above. This is the first method called when
	 * the program is run, and can of course call other methods.
	 * Methods correspond to procedures and functions in other languages.
	 * A method name should be camelCase 
	 * Everything before the first curly brace is the method header.
	 * 
	 */
	
	/*
	 * Sakai Quiz Questions you can now answer
	 *  
	 * T/F Only a class with a main method can be executed.  
     * T/F A main method is the: first method executed when its class is run.
     * T/F A main method is the last method executed when its class is run.
     */
	
	
	
//	public static void main(String args) 
//	public static void main(String[] anArgs) 
//	public static void main(String anArgs[]) 
//	public void main(String anArgs[]) 
//	public static int main(String anArgs[]) 
	/*
	 * We see above alternative ways to declare the main method headers
	 * We will now perform  experiments involving commenting out 
	 * the current header uncommenting each the above headers
	 * You can comment and uncomment a set of selected lines using the 
	 * shortcut CTRL-/ (CTRL and / pressed together)
	 * In the case of a single line, it is sufficient to have the insertion point 
	 * in the line.
	 * 
	 * Experiment with each of the above headers and see if you can run the
	 * program with each alternative header.
	 * 
	 * You cannot execute the program if you do not see the Java Application option 
	 * in the Run As or Debug As menu command, or if you see the console message, 
	 * cannot find or load main method.
	 */
	/*
	 * You can now answer the following questions.
	 * 
	 *  MAIN METHOD CONSTRAINTS
	 * T/F A main method must have an argument named args.
	 * T/F A main method can have a int argument.
	 * 
	 */
	/*
	 
	 * 
	 * The above exercise shows that a method with an arbitrary header cannot be
	 * considered a main method. To understand why such constraints are necessary,
	 * consider two entities, the Java interpreter and a human reading your code,
	 * that must be able to search for the main method.
	 * When you execute a class, the Java interpreter must find the method so
	 * it can execute it and pass it the expected parameters.
	 * When humans  reads your code, they must be able to determine the 
	 * starting method without relying on perhaps missing or obsolete comments.
	 * 	 
	 */
	/*
	 * You can now answer the following questions.
	 * 
	 *  RATIONALE FOR MAIN METHOD CONSTRAINTS
	 *
	 * T/F Constraints put on the header of the main method makes it easier for
	 *  a human being to find it in the containing main class
	 * T/F Constraints put on the header of the main main method make it easier
	 *     for the Java interpreter, which executes a main method, to find it in the containing class.
	 * T/F Constraints put on the header of the main method can prevent 
	 *     programming errors such as returning a value that is not processed by the interpreter.
	 * 
	 */

	/*
	* Lesson Comment
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
		 * The next statement gives the next line input by the user on the console. 
		 * Hover on method name, nextLine, to see its description and answer the 
		 * questions below	
		 *
		 */
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
		
		while (index < scannedString.length()) {
		/*
		 * Lesson Comment
		 * 
		 * Syntax of Java while loop shown above
		 * The loop  "scans" scannedString, that is, 
		 * it examines every character in the string and finds
		 * substrings of interest called tokens.
		 * 
		 * A substring SS of a string S is a sequence of consecutive characters
		 * in S.
		 * 
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
		/*
		 * Sakai Quiz Questions
		 * 
		 * SCANNING AND WHILE LOOPS
		 * 
		 * (T/F) A token produced by scanning a string can have non consecutive 
		 *       characters of the string.
		 * (T/F) A string scanned by a scanner is a concatenation of all the tokens 
		 * 		 detected by the scanner.
		 */
			
			
			char nextLetter = scannedString.charAt(index);
			
			/* 
			 *
			 * charAt() gives character at index, hover over its name to get its 
			 * behavior and answer the questions below.
			 * A char is a type defined to store characters.
			 */
			/* 
			 * Sakai Questions
			 * 
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
			 *
			 */
			
			
			if (nextLetter >= 'A' && nextLetter <= 'Z') {
				System.out.println("Token:" + nextLetter); // + here means string concatenation
			}
			// just showing the else syntax below
//			else {
//				System.out.println("Skipping:" + nextLetter);
//			}
			index++;
			/*
			 * Lesson Comment: STRING + AND CHARACTER ORDERING
			 * 
			 *
			 * Syntax of if statement with optional else shown above.
			 * 
			 * The if statement check shows that characters are ordered
			 * This ordering  preserves letter and digit ordering
			 * You should only compare digits, lowercase letters and upper case 
			 * letters with each other, not digits and letters or lower case 
			 * and upper case with each other as these orderings are not fundamental.
			*/
			/*
			 * Sakai Questions
			 * 
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
			 *
			*/
		}
		/*
		 * Experiment:
		 * 
		 * Now that you understand tokens and how this program executes
		 * run the program to answer the following Sakai questions
		 * 
		 * Sakai Questions
		 * 
		 * When the String "Albert Einstein" is input, the tokens produced are
		 * the strings:
		 *     (a) "Albert" and "Einstein"
		 *     (b) "A" and "E"
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
