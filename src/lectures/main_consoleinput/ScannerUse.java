package lectures.main_consoleinput;
import java.util.Scanner;
public class ScannerUse {
	public static void main (String[] args) {
		Scanner scanner = new Scanner (System.in);
		String line1 = scanner.nextLine();
		String line2 = scanner.nextLine();
		System.out.println(line1 + " " + line2);		
	}
}
