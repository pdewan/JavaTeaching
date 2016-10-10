package lectures.mvc.properties.atomic;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import lectures.mvc.properties.PropertyListenerSupport;

public class APropertyListenerSupport implements PropertyListenerSupport {
	public final int MAX_SIZE = 50;
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

	public void add(PropertyChangeListener l) {
		if (isFull())
			System.out.println("Adding item to a full collection");
		else {
			contents[size] = l;
			size++;
		}
	}
	/**
	 * The method notifAllListeners calls propertyChange():
	 * 	(a) a single time on one of the registered observers
	 *  (b) once for each registered observer
	 *  (c) never
	 *  
	 * The method propertyChange is:
	 *  (a) notification method invoked on a registered observer
	 *  (b) registration method invoked on an observer
	 *  (c) setter invoked on an observer
	 */
	public void notifyAllListeners(PropertyChangeEvent event) {
		for (int index = 0; index < size(); index++) {
			/*
			 * Hover over propertyChange to see its documentation
			 * Hover over event to see its instance variables
			 * What kind of object does get(index) return?
			 */
			get(index).propertyChange(event);
		}
	}
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
