package lectures.exceptions;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ExpectedVsUnexpectedEvents {
//	static BufferedReader input = new BufferedReader(new InputStreamReader(
//			System.in));
	static Scanner scanner = new Scanner (System.in);
	public static void efficientReader() {
		try {
			for (;;) {
				System.out.println(Integer.parseInt(scanner.nextLine()));
			}
		} catch (NoSuchElementException e) {
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}
	
	public static void wellProgrammedReader() {
		try {
			for (;;) {
				if (!scanner.hasNext()) break;
				System.out.println(Integer.parseInt(scanner.nextLine()));
			}
		} catch (NoSuchElementException e) {
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}
}
