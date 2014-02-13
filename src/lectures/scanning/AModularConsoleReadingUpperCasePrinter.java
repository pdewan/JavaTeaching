package lectures.scanning;
import java.util.Scanner;
public class AModularConsoleReadingUpperCasePrinter {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String scannedString = scanner.nextLine();
		scanAndPrint(scannedString);		
	}
	
	public static void scanAndPrint(String scannedString) {
		System.out.println("Upper Case Letters:");
		int index = 0;
		while (index < scannedString.length()) {
			char nextLetter = scannedString.charAt(index);
			if (nextLetter >= 'A' && nextLetter <= 'Z')
				System.out.print(nextLetter);
			index++;
		}
		System.out.println();
	}

}
