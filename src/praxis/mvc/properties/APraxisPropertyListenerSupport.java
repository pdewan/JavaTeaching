package praxis.mvc.properties;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class APraxisPropertyListenerSupport implements PraxisPropertyListenerSupport {
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
	public void notifyAllListeners(PropertyChangeEvent event) {
		for (int index = 0; index < size(); index++) {
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
