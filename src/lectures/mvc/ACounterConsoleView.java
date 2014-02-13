package lectures.mvc;
public class ACounterConsoleView implements CounterObserver {
	public void update(ObservableCounter counter) {
		System.out.println("Counter: " + counter.getValue());
	}
}
