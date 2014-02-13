package lectures.mvc;


public class AnObservableCounter extends ACounter implements ObservableCounter {
	int counter = 0;
	ObserverHistory observers = new AnObserverHistory();
	public void add (int amount) {
		super.add(amount);
		notifyAllObservers();
	}
	
	public void addObserver(CounterObserver observer) {
		observers.addElement(observer);
		observer.update(this);
	}

	void notifyAllObservers() {
		for (int observerNum = 0; observerNum < observers.size();
			observerNum++)
		observers.elementAt(observerNum).update(this);
	}
}
	


