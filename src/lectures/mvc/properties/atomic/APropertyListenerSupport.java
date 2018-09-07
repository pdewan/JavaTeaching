package lectures.mvc.properties.atomic;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import lectures.mvc.properties.PropertyListenerSupport;

public class APropertyListenerSupport implements PropertyListenerSupport {
	public static final int MAX_SIZE = 50;
	
	// Here we see an array that is capable of storing listeners. Each observer will
	// register a listener with an observable.
	PropertyChangeListener[] contents = new PropertyChangeListener[MAX_SIZE];
	int size = 0;

	public int size() {
		return size;
	}
	
	public PropertyChangeListener get (int index) {
		return contents[index];
	}

	public boolean isFull() {
		return size == MAX_SIZE;

	}
	/*
	 * This is the method that adds to the list of registered listeners
	 */
	public void add(PropertyChangeListener l) {
		if (isFull())
			System.out.println("Adding item to a full collection");
		else {
			contents[size] = l;
			size++;
		}
	}
	
	
	public void notifyAllListeners(PropertyChangeEvent event) {
		for (int index = 0; index < size(); index++) {			
			get(index).propertyChange(event);
		}
	}
/*
 * propertChange() is the method called in an observer to inform
 * it of the change, and its parameter describes the kind of change.
 * 
 * Hover over the "propertyChange" to see its documentation
 * When the program is stopped at this statement,
 * hover over "event" to see its instance variables
 * What kind of object does get(index) return?
			
 * The method notifyAllListeners calls the propertyChange():
 *  (a) a single time on one of the registered observers.
 *  (b) once for each registered observer.
 *  (c) never.
 *  
 * The method propertyChange is:
 *  (a) a notification method invoked on a registered observer.
 *  (b) a registration method invoked on an observer.
 *  (c) a setter invoked on an observer.
 */
	public void remove(PropertyChangeListener element) {
		contents[indexOf(element)] = contents[size - 1];
		size--;
	}

	public void remove(int startIndex) {
		shiftUp(startIndex);
		size--;
	}

	void shiftUp(int startIndex) {
		for (int index = startIndex; index + 1 < size; index++)
			contents[index] = contents[index + 1];
	}

	public int indexOf(PropertyChangeListener element) {
		int index;
		for (index = 0; index < size && !element.equals(contents[index]); index++)
			;
		return index;
	}

	public boolean member(PropertyChangeListener element) {
		return indexOf(element) < size;

	}

	public void clear() {
		size = 0;
	}
}
