package lectures.inheritance;

import lectures.arrays.collections_implementation.AStringHistory;

// Again study and run the program and  try to understand what it does on your own.

public class AStringDatabase extends AStringHistory implements StringDatabase {

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
	    while ((index < size) && !element.equals(contents[index])) {
	        index++;
	    }
	    return index; // most implementations will count down and give a negative result in case of failed search
	}

    
    
    public boolean member(String element) {
        return indexOf (element) < size;
    }
    public static void main (String[] args) {
    	final String EXAMPLE_ITEM = "James Dean";
    	AStringDatabase stringDatabase = new AStringDatabase();
    	stringDatabase.addElement(EXAMPLE_ITEM);
		System.out.println (stringDatabase.indexOf(EXAMPLE_ITEM));
		System.out.println(stringDatabase.member(EXAMPLE_ITEM));
		stringDatabase.removeElement(EXAMPLE_ITEM);
		System.out.println (stringDatabase.indexOf(EXAMPLE_ITEM));
		System.out.println(stringDatabase.member(EXAMPLE_ITEM));		
    	
    }
    // After you run the program, explore it in some more depth.

    // Look at the operation performed on a string database in the main program.
    // Which of these operation are performed also on the string history we saw earlier
        
    // One should sure these operations are not re-defined in the string database interface and class.
    // How does this class avoid this code duplication?
    
    // Click on the addElement method call in the main and press F3. In which interface is the 
    // definition found?
            
    // 
    // What do you think the extends clause means in the header of the class?
    // Click on the name of the interface (StringDatabase) and press F3.What do you think
    // the extends clause means in the header of the interface?
    
    // Go to the declaration of StringHistory.
    // Add a an arbitrary method header to in this interface such as:
    // public void test();
    // What error messages if any do you get when you save (compile) the interface?
    // What error message if any do you get in the class AStringHistory?
    // What error message if any do you get in the class AStringDatabase?
    // Fix the problem in AStringHistory. Does the problem go away also in AStringDatabase?
   
    
    // If class/interface C extends class/interface E, then
    // E is a supertype of C and C is a sub type of E
    // If C and E are classes, then we can use the terms superclass and subclass also

    
   
    
}
