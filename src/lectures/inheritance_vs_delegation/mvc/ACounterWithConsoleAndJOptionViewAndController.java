package lectures.inheritance_vs_delegation.mvc;

import lectures.main_consoleinput.Console;

public class ACounterWithConsoleAndJOptionViewAndController extends ACounterWithConsoleAndJOptionView {
	public void processInput() {
		while (true) {
			int nextInput = Console.readInt();
			if (nextInput == 0) return;
			add(nextInput);			
		}
	}

}
