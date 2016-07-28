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
	// List of registered observers -much like StringHistory except that it holds
	// Observers instead of strings.
	ObserverHistory observers = new AnObserverHistory();
	public void add (int amount) {
		super.add(amount);
		notifyAllObservers();
	}
	// Go to CounterObserver (F3)
	public void addObserver(CounterObserver observer) {
		observers.addElement(observer);
		// why call update here? Hint: an observer can be added after the model changes
		// and some object other than the observer can call this method for the observer
		observer.update(this); 
	}
	// Can the notification code be put in another class?
	void notifyAllObservers() {
		for (int observerNum = 0; observerNum < observers.size();
			observerNum++) {
		// Should/does the model know how each observable will react to the new state
			observers.elementAt(observerNum).update(this); 
		}
	}
}
	


