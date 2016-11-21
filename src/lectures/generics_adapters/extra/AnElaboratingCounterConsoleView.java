package lectures.generics_adapters.extra;

import lectures.generics_adapters.GenericObserver;
import lectures.mvc.Counter;

public class AnElaboratingCounterConsoleView implements GenericObserver<Counter> {
	
	@Override
	public void update(Counter aCounter) {
		System.out.println(aCounter.getValue());		
		
	}
}
