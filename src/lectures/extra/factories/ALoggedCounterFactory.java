package lectures.extra.factories;
import lectures.factories.LoggedCounter;
public class ALoggedCounterFactory implements CounterFactory {	
	public LoggedCounter createCounterModel() {
		return new ALoggedCounter();
	}
//	public CounterObserver createCounterConsoleView() {
//		return new ALoggedCounterConsoleView();
//	}
}
