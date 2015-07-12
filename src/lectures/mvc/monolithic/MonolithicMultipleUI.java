package lectures.mvc.monolithic;

import java.util.Scanner;

import javax.swing.JOptionPane;

import lectures.main_consoleinput.Console;

public class MonolithicMultipleUI {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		int counter = 0;
		while (true) {
        	System.out.println("Counter: " + counter); 
			JOptionPane.showMessageDialog(null, "Counter: " + counter);
			int nextInput = scanner.nextInt();
			if (nextInput == 0)
				break;
			counter += nextInput;
		}
	}
}
