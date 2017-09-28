package lectures.inheritance_vs_delegation;

import lectures.mvc.Counter;

public class AResettingCounter implements Counter {
	int counter = 0;
	public void add (int amount) {
		if ((counter  - amount) >= Integer.MAX_VALUE)
			counter = 0;
		else
			counter += amount;
	}
	public int getValue() {
		return counter;
	}
}
