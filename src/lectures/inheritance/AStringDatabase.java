package lectures.inheritance;

import lectures.arrays.collections_implementation.AStringHistory;

// Again first study and run the program and  try to understand what it does on your own.

public class AStringDatabase extends AStringHistory implements StringDatabase {
	protected int uselessVariable = 0;
//    int size = 0;
//	public AStringDatabase() {
//		uselessVariable = 2;
//		System.out.println (uselessVariable); // what is its value, 0 or 2
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
	    while ((index < size) && !element.equals(contents[index])) {
	        index++;
	    }
	    return index; // most implementations will count down and give a negative result in case of failed search
	}    
    
    public boolean member(String element) {
        return indexOf (element) < size;
    }
   
   
    public static void main (String[] args) {
    	StringDatabase stringDatabase = new AStringDatabase();
    	manipulateDatabase(stringDatabase); 	
    }
    public static void manipulateDatabase(StringDatabase aStringDatabase) {
    	final String EXAMPLE_ITEM = "James Dean";
    	aStringDatabase.addElement(EXAMPLE_ITEM);    	
    	aStringDatabase.addElement(EXAMPLE_ITEM); //adding item a second time
		System.out.println(aStringDatabase.member(EXAMPLE_ITEM)); 
		System.out.println(aStringDatabase);
		aStringDatabase.removeElement(EXAMPLE_ITEM);
		System.out.println(aStringDatabase.member(EXAMPLE_ITEM)); // true or false?
		System.out.println(aStringDatabase);
		aStringDatabase.removeElement(EXAMPLE_ITEM); // removing a second time
		System.out.println(aStringDatabase);  
    }
    // COLLECTION KINDS
   // Why do you think this object is not called a history and called a database?
    
    // EXTENDING INTERFACES AND CLASSES
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
    
    // If class/interface C extends class/interface E, then
    // E is a supertype of C and C is a sub type of E
    // If C and E are classes, then we can use the terms superclass and subclass also

    // IMPlEMENTING INHERITED INTERFACE HEADERS AND INHERITING  METHOD IMPLEMENTATIONS IN CLASSES
    
    // Go to the declaration of StringHistory.
    // Add a an arbitrary method header to in this interface such as:
    // public void test();
    // What error messages if any do you get when you save (compile) the interface?
    // What error message if any do you get in the class AStringHistory?
    // What error message if any do you get in the class AStringDatabase?
    // Fix the problem in AStringHistory. Does the problem go away also in AStringDatabase?
    
    
    // Click on the reference to the size variable in sat the clear method and press F3.
    // In which class is the declaration found?
    
    // Uncomment the declarations of the size and uselessVariable declarations in this class.
    // Run the program again - the member() and removeElement() no longer work. Can you explain why?
    // Set a break point at the end of the addElement() method. Set a breakpoint also on at the start
    // of the indexOf method.
    
    // When the program stops at the addElement() method, hover over the value of the size variable
    // referenced in the method. What value does it have when the method finishes? Press F8 to resume
    // the program.
    
    // When the program stops next in the indexOf() method, hover over the size variable in the
    // method declaration. What value is it at the start of  the method? Can you explain why it is different?
    
    // Go to the debug window and look at the variables of the instance of AStringDatabase.
    // How many size variables does it have and what are their values?
    
    // Comment out the duplicate size variable declaration and debug-run the program again.
    // When the program stops at indexOf, hover over the size variable declaration again in the method
    // and look at it again.
    
    // Will you ever re-declare a variable again in a subclass?
     

   
    
    
    
   
    
}
