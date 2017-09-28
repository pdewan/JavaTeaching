package lectures.inheritance_vs_delegation;

import lectures.mvc.AnObserverHistory;
import lectures.mvc.CounterObserver;
import lectures.mvc.ObservableCounter;
import lectures.mvc.ObserverHistory;

public class AnInheritingObservableResettingCounter extends AResettingCounter
			implements ObservableCounter {
	ObserverHistory observers = new AnObserverHistory();
	public void add (int amount) {
		super.add(amount);
		notifyObservers();
	}
	public void addObserver(CounterObserver observer) {
		observers.addElement(observer);
		observer.update(this);
	}	
	void notifyObservers() {
		for (int observerNum = 0; observerNum < observers.size();
			observerNum++)
		observers.elementAt(observerNum).update(this);
	}
}
