package lectures.extra;

import java.beans.PropertyChangeListener;

public class APropertyChangeListenerHistory implements PropertyChangeListenerHistory {
	public final int MAX_SIZE = 50;
	PropertyChangeListener[] contents = new PropertyChangeListener[MAX_SIZE];
	int size = 0;

	public int size() {
		return size;
	}
	
	public PropertyChangeListener elementAt (int index) {
		return contents[index];
	}

	boolean isFull() {
		return size == MAX_SIZE;

	}

	public void addElement(PropertyChangeListener element) {
		if (isFull())
			System.out.println("Adding item to a full history");
		else {
			contents[size] = element;
			size++;
		}
	} 
	
}
