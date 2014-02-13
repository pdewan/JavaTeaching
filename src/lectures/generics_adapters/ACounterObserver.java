package lectures.generics_adapters;

import lectures.mvc.Counter;

public class ACounterObserver implements GenericObserver<Counter> {
	public void update(Counter aCounter) {
		System.out.println(aCounter.getValue());		
	}
}
