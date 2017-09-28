package lectures.extra;

import lectures.equals_polymorphism_overloading.StringHistoryWithCustomEquals;

public abstract class AnAbstractStringHistoryOld implements StringHistoryWithCustomEquals{
	String[] contents = new String[maxSize()];
	int size = 0;
	
	public AnAbstractStringHistoryOld() {
		
	}

	public int size() {
		return size;
	}

	public String elementAt(int index) {
		return contents[index];
	}

	boolean isFull() {
		return size == maxSize();
	}

	public void addElement(String element) {
		if (isFull())
			System.out.println("Adding item to a full history");
		else {
			contents[size] = element;
			size++;
		}
	}
	abstract int  maxSize();

}
