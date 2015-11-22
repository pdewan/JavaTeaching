package lectures.factories.counter;

import lectures.mvc.ACounterConsoleView;
import lectures.mvc.AnObservableCounter;
import lectures.mvc.Counter;
import lectures.mvc.CounterObserver;
import lectures.mvc.ObservableCounter;

public class AnIntCounterFactory implements CounterFactory {

	@Override
	public Counter createCounter(short initValue) {
		return new AnIntCounter(initValue);
	}

	@Override
	public Counter createCounter() {
		return createCounter((short) 0);
	}	

}
