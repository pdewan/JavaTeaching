package lectures.mvc;

import util.trace.Tracer;
import bus.uigen.ObjectEditor;

public class AnObserverHistory implements ObserverHistory {
	public final int MAX_SIZE = 50;
	CounterObserver[] contents = new CounterObserver[MAX_SIZE];
	int size = 0;

	public int size() {
		return size;
	}
	
	public CounterObserver elementAt (int index) {
		return contents[index];
	}

	boolean isFull() {
		return size == MAX_SIZE;

	}

	public void addElement(CounterObserver element) {
		if (isFull())
			System.out.println("Adding item to a full history");
		else {
			contents[size] = element;
			size++;
		}
	} 
	
	public static void main (String[] args) {	
		Tracer.showWarnings(true);
		ObjectEditor.edit(new AnObserverHistory());
	}
}
