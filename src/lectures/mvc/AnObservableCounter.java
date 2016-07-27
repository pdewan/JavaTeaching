package lectures.mvc;

//OBSERVABLE-OBSERVER PATTERN
// This is a subpattern of MVC
// A model is an observable.
// A view is an observer.
// Not all observables are models.
// Not all observers are  views.
// An observable notifies registered observers about changes made by its write methods.
// The notification is done by calling notification methods in the observers.
// It provides an additional method to register observers.
// Ideally, it also provides methods to unregister observers.

// Identify the registration and notification code in this class.
// Is there an unregistration methpd

public class AnObservableCounter extends ACounter implements ObservableCounter {
	int counter = 0;
	ObserverHistory observers = new AnObserverHistory();
	public void add (int amount) {
		super.add(amount);
		notifyAllObservers();
	}
	// Go to CounterObserver (F3)
	public void addObserver(CounterObserver observer) {
		observers.addElement(observer);
		observer.update(this); // does the model know how the view will display the new state
	}

	void notifyAllObservers() {
		for (int observerNum = 0; observerNum < observers.size();
			observerNum++) {
		observers.elementAt(observerNum).update(this);
		}
	}
}
	


