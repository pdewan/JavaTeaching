package lectures.generics_adapters;

import lectures.mvc.Counter;

public class AnElaboratingCounterConsoleView implements GenericObserver<ElaboratingObservableCounter> {
	

	@Override
	public void update(ElaboratingObservableCounter aCounter) {
		System.out.println(aCounter.getValue());		
		
	}
}
