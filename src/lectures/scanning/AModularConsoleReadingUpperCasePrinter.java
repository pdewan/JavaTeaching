package lectures.scanning;
import java.util.Scanner;
/**
 * Here is another way to do the same problem.
 * Why is it more modular than the other approach?
 * Can you make this program even more modular?
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
	
	/**
	 * What happens if you delete the keyword static in scanAndPrint?
	 */
	public static void scanAndPrint(String aScannedString) {
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

}
