package lectures.inheritance_vs_delegation.mvc;

import lectures.mvc.Counter;

public interface CounterWithController extends Counter {
	public void processInput();
}
