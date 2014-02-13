package lectures.inheritance_vs_delegation.mvc;

import lectures.mvc.ACounter;

public class ACounterWithConsoleView extends ACounter{
	void appendToConsole(int counterValue) {
		System.out.println("Counter: " + counterValue);
	}
	public void add (int amount) {
		super.add(amount);
		appendToConsole(getValue());
	}

}
