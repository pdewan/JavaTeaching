package lectures.mvc.monolithic;

import java.util.Scanner;

import javax.swing.JOptionPane;

import lectures.main_consoleinput.Console;
//Run the program and try its user interface
public class MonolithicMultipleUI {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		int counter = 0;
		while (true) {
        	System.out.println("Counter: " + counter); 
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
// PROBLEMS ADDRESSED BY MVC
// Do you see any problems with the way the three programs are implemented?
// What parts of code here can be shared with one ore more of the other programs?
// The code of an interactive program can be divided into input, output and computation code.
// Which parts of the program are input, output, and computation here?
// With which of the two other programs can one share:
// Input code,
// Output code,
// Computation code?
// The separation of concerns principle says if code A can be changed independently of
//  code B, then A and B should be in different classes.
// Can the input/output/computation code be changed independently of other two kinds of code?
// How can one restructure the three programs so we have the same three user-interfaces, 
// running possibly concurrently, without code duplication?
// The MVC (Model/View/Controller) design pattern answers this question.
// A design pattern desribes a way to decompose code into multiple classes,
// The MVC design pattern tells us how to decompose computation, output and input code
// into model, view, and controller classes.


