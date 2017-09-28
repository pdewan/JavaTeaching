package lectures.inheritance_vs_delegation.mvc;

import lectures.main_consoleinput.Console;

public class ACounterWithConsoleViewAndController 
		extends ACounterWithConsoleView 
		implements CounterWithController  {
	public void processInput() {
		while (true) {
			int nextInput = Console.readInt();
			if (nextInput == 0) return;
			add(nextInput);			
		}
	}

}
