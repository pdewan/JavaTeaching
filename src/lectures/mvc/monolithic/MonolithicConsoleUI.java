package lectures.mvc.monolithic;

import java.util.Scanner;

import lectures.main_consoleinput.Console;
// Run the program and try its user interface
public class MonolithicConsoleUI {
	static int counter = 0;
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		while (true) {
			System.out.println("Counter: " + counter);
			System.out.println ("Please enter counter (positive or negative) increment");
			int nextInput = scanner.nextInt();
			if (nextInput == 0) {
				return;
			}
			counter += nextInput;
		}
	}
}
