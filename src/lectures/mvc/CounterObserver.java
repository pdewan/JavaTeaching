package lectures.mvc;

// Common interface for all observers of Counter
public interface CounterObserver {
	
	/*
	 * Different observer classes can implement this method in arbitrary ways
	 * So an observable does not really know how an observer works
	 * and it is easy to change the latter without affecting the former
	 * The arguments to this method are generally application specific - they
	 * describe something about the change in the model. Update is the
	 * name of the method from Smalltalk, which invented this idea.
	 * Other implementations give different names as we will see,
	 */	
	public void update(Counter counter); 
}
