package lectures.factories.counter;

import lectures.mvc.ACounterConsoleView;
import lectures.mvc.AnObservableCounter;
import lectures.mvc.Counter;
import lectures.mvc.CounterObserver;
import lectures.mvc.ObservableCounter;

public class AnInstanceCountingIntCounterFactory implements InstanceCountingCounterFactory {
	public Counter createCounter(short initValue, Counter anInstanceCounter) {
		return new AnInstanceCountingIntCounter(initValue, anInstanceCounter);
	}
	public Counter createCounter(Counter anInstanceCounter) {
		return createCounter((short) 0, anInstanceCounter);
	}
}
