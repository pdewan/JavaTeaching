package lectures.mvc;


public class ARocketLaunchingCounterObserver implements CounterObserver {
	public void update(ObservableCounter counter) {
		if (counter.getValue() == 0)
			launch();
	}
	private void launch() {
		System.out.println("LIFT OFF!!!");
	}
}

