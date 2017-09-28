package praxis.inheritance;

import lectures.arrays.collections_implementation.StringHistory;

public interface PraxisStringDatabase extends PraxisStringHistory {
	public static final int MAX_SIZE = 10;

	public void removeElement(String element);
    public void clear();
    public boolean member(String element);

}
