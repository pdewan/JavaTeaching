// a class may be in a named hierarchical package much as a file can be in a named hierarchical folder
// this class is in a package called scanning which is a supackage of lectures
// a package name should start with a lowe case letter
package lectures.scanning; 

// importing an external class not part of the language or our program
// the last part of the import identify the short name of the class and the preceding parts the package of the class.
// the package name followed by . followed by the short name of the class is its full or long name
// what is the short name of the class declared below by us?
// what is the full name of this class?
//what if you comment this import out?
import java.util.Scanner; 
//every program must have at least one class that declares a main method

//a class is like a file in non object oriented languages
// a class name should be camel case starting with an upper case letter
public class AConsoleReadingUpperCasePrinter { 
	
	
	//syntax of main method shown below
	//methods corresponds to procedures and functions in other languages
	// method names should be camel case starting with lowercase letter
	public static void main(String[] args) {
    // what happens if you use this header instead?
//	public static void main(String args) {

		// use of library, nothing conceptual here, just some syntax
		Scanner scanner = new Scanner(System.in);
		String scannedString = scanner.nextLine(); // gives next line input by the use
		int index = 0; // variable names should be camel case starting with lower case letters 
		// syntax of Java loop shown bellw
		// loop "scans" scannedString, that is,  it examines every character in the string and finds
		// substrings of interest called tokens
		// how many characters in each token identified by this loop?
		while (index < scannedString.length()) {
			// charAt() gives character at index, hover over it dipslay its begavior
			char nextLetter = scannedString.charAt(index);
			// syntax of if statement with optional else shown below
			// the if check shows that characters are ordered
			// they preserve letter and digit ordering
			// should only compare digits, lowercase letters and upper case letters with each other
			// not digits and letters or lower case and upper case with each other as these orderings are not fundamental
			if (nextLetter >= 'A' && nextLetter <= 'Z') {
				System.out.println("Token:" + nextLetter); // + here means string concatenation
			} 
			// the code below shows the else syntax
//			else {
//				System.out.println("Skipping:" + nextLetter);
//			}
			index++;
		}
		// what are the tokens printed when the input is John. F. Kennedy
		// what are the values of index when the print is executed
		
		scanner.close(); // we are done with the scanner, we are actually just done
	}

}
