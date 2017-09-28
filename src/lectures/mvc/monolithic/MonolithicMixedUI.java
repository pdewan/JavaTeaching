package lectures.mvc.monolithic;

import java.util.Scanner;

import javax.swing.JOptionPane;

import lectures.main_consoleinput.Console;
//Run the program and try its user interface
public class MonolithicMixedUI {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		int counter = 0;
		while (true) {
			JOptionPane.showMessageDialog(null, "Counter: " + counter);
			System.out.println ("Please enter counter (positive or negative) increment");
			int nextInput = scanner.nextInt();
			if (nextInput == 0) {
				break;
			}
			counter += nextInput;
		}
	}
}
