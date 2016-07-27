package lectures.mvc;

// A non view observer faking a rocket liftoff in response to the counter reaching 0
public class ARocketLaunchingCounterObserver implements CounterObserver {
	public void update(ObservableCounter counter) {
		if (counter.getValue() == 0) {
			launch();
		}
	}
	private void launch() {
		System.out.println("LIFT OFF!!!");
	}
}

