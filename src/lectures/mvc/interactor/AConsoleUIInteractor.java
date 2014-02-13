package lectures.mvc.interactor;

import lectures.main_consoleinput.Console;
import lectures.mvc.Counter;
public class AConsoleUIInteractor implements CounterInteractor {
	public void edit(Counter counter) {
		while (true) {
			int nextInput = Console.readInt();
			if (nextInput == 0)
				return;
			counter.add(nextInput);
			System.out.println("Counter: " + counter.getValue());
		}
	}
}
