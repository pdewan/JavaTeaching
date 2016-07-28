package lectures.mvc;

// Common interface for all observers of Counter
public interface CounterObserver {
	// Different observer classes can implement this method in arbitrary ways
	// So an observable does not really know how an observer works
	// and it is easy to change the latter without affecting the former
	
	public void update(ObservableCounter counter); 
}
