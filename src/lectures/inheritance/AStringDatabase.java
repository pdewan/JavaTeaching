package lectures.inheritance;

import lectures.arrays.collections_implementation.AStringHistory;


public class AStringDatabase extends AStringHistory implements StringDatabase {
//	public AStringDatabase() {
//		System.out.println(MAX_SIZE);
//	}
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
    public static void main (String[] args) {
    	AStringDatabase stringDatabase = new AStringDatabase();
//    	System.out.println(stringDatabase.MAX_SIZE);
    	stringDatabase.addElement("James Dean");
		stringDatabase.addElement("Joe Doe");
		stringDatabase.addElement("Jane Smith");
		stringDatabase.addElement("John Smith");
		bus.uigen.ObjectEditor.edit(stringDatabase);
    	
    }
    
}
