package lectures.generics_adapters.extra;

import lectures.generics_adapters.AHistory;
import lectures.generics_adapters.GenericObserver;
import lectures.generics_adapters.History;
import lectures.mvc.ACounter;
import lectures.mvc.AnObserverHistory;
import lectures.mvc.Counter;
import lectures.mvc.ObservableCounter;

/*
ELABORATING OBSERVABLE CLASS and NESTED ELABORATIONS
This is like AnObservableCounter except that it stores observers implementing
elaborations of a generic observer interface. 

The history object is typed using a nested generic elaboration!

Notice that the interface is being elaborated with a specific class rather
than a type parameter.
 */

public class AnElaboratingObservableCounter extends ACounter implements ElaboratingObservableCounter  {
	int counter = 0;
	// We elaborate a generic history with an elaboration of a generic observer interface
	History<GenericObserver<Counter>> observers = new AHistory<GenericObserver<Counter>>();
	public void add (int amount) {
		super.add(amount);
		notifyAllObservers();
	}
	public void addObserver(GenericObserver<Counter> observer) {
		observers.addElement(observer);
		
		observer.update(this); 
	}
	void notifyAllObservers() {
		for (int observerNum = 0; observerNum < observers.size();
			observerNum++) {
			observers.elementAt(observerNum).update(this); 
		}
	}
}
	


