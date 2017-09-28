package lectures.mvc.interactor;

import java.util.Scanner;

import lectures.main_consoleinput.Console;
import lectures.mvc.Counter;
public class AConsoleUIInteractor implements CounterInteractor {
    static Scanner scanner = new Scanner(System.in);
	public void edit(Counter counter) {
		while (true) {
			System.out.println("Counter: " + counter.getValue());
			int nextInput = scanner.nextInt();
			if (nextInput == 0)
				return;
			counter.add(nextInput);
		}
	}
}
