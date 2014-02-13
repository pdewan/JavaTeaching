package lectures.inheritance_vs_delegation;

import lectures.mvc.ACounter;
import lectures.mvc.AnObserverHistory;
import lectures.mvc.Counter;
import lectures.mvc.CounterObserver;
import lectures.mvc.ObservableCounter;
import lectures.mvc.ObserverHistory;

public class ADelegatingObservableCounter implements ObservableCounter{
	Counter counter = new ACounter();
	ObserverHistory observers = new AnObserverHistory();
	public void add (int amount) {
		counter.add(amount);
		notifyObservers();
	}
	public int getValue() {
		return counter.getValue();
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
