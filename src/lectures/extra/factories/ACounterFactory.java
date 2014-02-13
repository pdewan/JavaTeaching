package lectures.extra.factories;

import lectures.mvc.ACounterConsoleView;
import lectures.mvc.AnObservableCounter;
import lectures.mvc.CounterObserver;
import lectures.mvc.ObservableCounter;

public class ACounterFactory implements CounterFactory {	
	public ObservableCounter createCounterModel() {
		return new AnObservableCounter();
	}
	public CounterObserver createCounterConsoleView() {
		return new ACounterConsoleView();
	}
}
