package lectures.mvc.interactor;

import java.util.Scanner;

import javax.swing.JOptionPane;

import lectures.main_consoleinput.Console;
import lectures.mvc.Counter;

public class AMixedUIInteractor implements CounterInteractor {
    static Scanner scanner = new Scanner(System.in);
	public void edit(Counter counter) {
		while (true) {
			JOptionPane.showMessageDialog(null,
					"Counter: " + counter.getValue());
			int nextInput = Console.readInt();
			if (nextInput == 0)
				return;
			counter.add(nextInput);			
		}
	}
}
