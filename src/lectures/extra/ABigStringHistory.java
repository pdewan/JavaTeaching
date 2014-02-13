package lectures.extra;

import lectures.arrays.collections_implementation.StringHistory;

public class ABigStringHistory extends AnAbstractStringHistory implements StringHistory {
	public final int MAX_SIZE = 500;
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
	void uncheckedAddElement(String element) {
		contents[size] = element;
		size++;
	}
}
