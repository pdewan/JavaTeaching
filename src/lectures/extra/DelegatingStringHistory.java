package lectures.extra;

import lectures.arrays.collections_implementation.StringHistory;

public interface DelegatingStringHistory extends StringHistory {
	public boolean isFull();
	public void uncheckedAddElement(String element);
}
