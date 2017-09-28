package lectures.extra;

import lectures.arrays.collections_implementation.StringDatabase;

public class AStringSet implements StringDatabase {
	public final int MAX_SIZE = 50;
	String[] contents = new String[MAX_SIZE];
	int size = 0;

	public int size() {
		return size;
	}

	public String elementAt(int index) {
		return contents[index];
	}

	boolean isFull() {
		return size == MAX_SIZE;

	}


	public void removeElement(String element) {
		contents[indexOf(element)] = contents[size - 1];
		size--;
	}

	void removeElement(int startIndex) {
		shiftUp(startIndex);
		size--;
	}

	void shiftUp(int startIndex) {
		for (int index = startIndex; index + 1 < size; index++)
			contents[index] = contents[index + 1];
	}

	public int indexOf(String element) {
		int index;
		for (index = 0; index < size && !element.equals(contents[index]); index++)
			;
		return index;
	}

	public boolean member(String element) {
		return indexOf(element) < size;

	}

	public void clear() {
		size = 0;
	}
	public void addElement(String element) {
		if (isFull())
			System.out.println("Adding item to a full history");
		else if (!member(element)) {
			// check for duplicate
			contents[size] = element;
			size++;
		}
	}

}
