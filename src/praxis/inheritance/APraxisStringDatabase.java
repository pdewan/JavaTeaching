package praxis.inheritance;

import lectures.arrays.collections_implementation.AStringHistory;
import lectures.inheritance.StringDatabase;

public class APraxisStringDatabase extends APraxisStringHistory implements PraxisStringDatabase {
	int aUselessDatabaseVariable = 1;

	public APraxisStringDatabase() {
//		super("Joe Doe");
		aUselessDatabaseVariable = aUselessHistoryVariable + 2;
    }
//	public APraxisStringDatabase(String anElement) {
//		super(anElement);
//    }


//	protected int size = 0;

	public void clear() {
	    size = 0;
	}

	public void removeElement(String element) {
		shiftUp(indexOf(element));
	}

	void shiftUp(int startIndex) {
	    for (int index = startIndex; index + 1 < size; index++) {
	        contents[index] = contents[index + 1];
	    }
	    size--;
	}
	
	int indexOf(String element) {
	    int index = 0;
	    while ((index < size) && !element.equals(contents[index]))
	        index++;
	    return index;
	}

    
	
    
    public boolean member(String element) {
        return indexOf (element) < size;
    }
    
    
}
