package lectures.scanning;
import java.util.Scanner;
/**
 * Here is another way to do the same scanning problem.
 * Consider why is it more modular than the previous class?
 * Study it. 
 *
 */
public class AModularConsoleReadingUpperCasePrinter {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println ("Please enter a string with uppercase and lower case letters.");
		String scannedString = scanner.nextLine();
		scanAndPrint(scannedString);	
		System.out.println ("Program ends.");
	}
	
	/*
	 * Experiment:
	 * 
	 * See what happens if scanAndPrint has no static in the header?
	 * 
	 */
	public static void scanAndPrint(String aScannedString) {
//	public  void scanAndPrint(String aScannedString) {

		int index = 0;
		while (index < aScannedString.length()) {
			char nextLetter = aScannedString.charAt(index);
			if (nextLetter >= 'A' && nextLetter <= 'Z') {
				System.out.println("Token:" + nextLetter); // + here means string concatenation
			}
			index++;
		}
		System.out.println();
	}
	/*
	 *
	 * 
	 * (T/F) The main method calls another method in the class.
	 * 
	 * (T/F) The main method is called by another method in the class.
	 * 
	 * (T/F) Input of the scanned string and scanning of the string are done in
	 * 		different methods.
	 * (T/F) Scanning of the string and output of token output are done
	 * 		different methods.
	 * (T/F) Input of the scanned string and token output are done in different 
	 * 		methods.
	 * 
	 * (T/F) The main method is static, that is, has the static keyword in its header.
	 * 
	 * (T/F) A static method can call both static and non-static methods.
	 *
	 */

}
