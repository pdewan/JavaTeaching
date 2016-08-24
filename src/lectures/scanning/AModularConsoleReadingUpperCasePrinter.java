package lectures.scanning;
import java.util.Scanner;
/**
 * Here is another way to do the same problem.
 * Why is  it more modular than the other approach?
 *
 */
public class AModularConsoleReadingUpperCasePrinter {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String scannedString = scanner.nextLine();
		scanAndPrint(scannedString);		
	}
	
	/**
	 * What happens if you delete the term keyword in scanAndPrint?
	 */
	public static void scanAndPrint(String aScannedString) {
		System.out.println("Upper Case Letters:");
		int index = 0;
		while (index < aScannedString.length()) {
			char nextLetter = aScannedString.charAt(index);
			if (nextLetter >= 'A' && nextLetter <= 'Z') {
				System.out.print(nextLetter);
			}
			index++;
		}
		System.out.println();
	}

}
