package lectures.inheritance;

/**
 * Again first study and run the program and  try to understand what 
 * it does on your own.
 * 
 * This is like a ABaseStringHistory except that it also:
 * 	1) allows previously added elements to be deleted.
 * 	2) provides an operation to determine if an element exists
 * 		in the collection.
 * 	3) provides a clear operation to remove all elements.
 * 
 * Like ABaseStringHistory it uses an array to store the elements.
 * 
 * Deletion involves:
 * 	1) finding the index of the element to be removed,
 *   	2) shifting the elements after the deleted element up so that the filled and
 *  	unfilled elements of the array are separate sections of the array.
 *  
 * As this class extends the functionality and implementation of 
 * ABaseStringStringHistory, it will be nice if we do not have to duplicate
 * the implementation of ABaseStringStringHistory. 
 * 
 * Object-oriented languages provide inheritance to avoid such duplication.
 * 
 * Object-based programming involves declaring and instantiating classes.
 * 
 * Object-oriented programming involves also using inheritance.
 * 
 * So, we are going from object-based to object-oriented programming.
 * 
 * In Java, it involves using the "extends" keyword used below.
 * 
 * If class/interface C extends class/interface E, then E is a supertype of C 
 * and C is a subtype of E.
 * 
 * 
 * If C and E are classes, then we can use the terms superclass and subclass 
 * also for supertype and subtype.
 * 
 * A superclass is also sometimes called a base class.
 *  
 *
 */

public class AnInheritingStringDatabase 
	extends ABaseStringHistory // use of keyword "extends""
	implements InheritingStringDatabase {

/*
 * Re-declaration of inherited size, uncomment when asked later
 */
//	protected int size = 0;
	public AnInheritingStringDatabase() {
		super();
//		super(2);
		uselessVariable = 2;
//		super(2);
//		System.out.println("AnInheritingStingDatabase constructor called");
	}

	public void clear() {
//		super(2);
	    size = 0;
	}

	public void removeElement(String element) {
		shiftUp(indexOf(element));
	}

	void shiftUp(int startIndex) {
		if (startIndex < size){
		    for (int index = startIndex; index + 1 < size; index++) {
		        contents[index] = contents[index + 1];
		    }
		    size--;
		}
	}
	
	int indexOf(String element) {
	    int index = 0;
	    while ((index < size) && !element.equals(contents[index])) {
	        index++;
	    }
	    // Most implementations will count down and give a negative result in case 
		 // of failed search. Our implementation is different because of the way it is
	    // used in removeElement().
		    return index; 
		}    
    
    public boolean member(String element) {
        return indexOf (element) < size;
    }
   
   
    public static void main (String[] args) {
    	InheritingStringDatabase stringDatabase = new AnInheritingStringDatabase();
    	manipulateDatabase(stringDatabase); 	
    }
    public static void manipulateDatabase(InheritingStringDatabase aStringDatabase) {
    	final String EXAMPLE_ITEM = "James Dean";
    	aStringDatabase.addElement(EXAMPLE_ITEM);    	
    	aStringDatabase.addElement(EXAMPLE_ITEM); //adding item a second time
		System.out.println(aStringDatabase.member(EXAMPLE_ITEM)); 
		System.out.println(aStringDatabase);
		/*
		 * Set break point below
		 */
		aStringDatabase.removeElement(EXAMPLE_ITEM);
		System.out.println(aStringDatabase.member(EXAMPLE_ITEM)); // true or false?
		System.out.println(aStringDatabase);
		aStringDatabase.removeElement(EXAMPLE_ITEM); // removing a second time
		System.out.println(aStringDatabase);  
    }
/*
 * IMPLEMENTING MODIFIABLE COLLECTION
 * 
 *  Study the main method and run it.
 * 
 * Adding an item a second time to an instance of AnInheritingStringDatabase
 * results in:  
 * 	(a) an exception.
 * 	(b) the addition being ignored.
 * 	(c) a duplicate item.
 * 
 * Now set break point at the specified location in main. 
 * 
 * Examine the the size and contents variable (defined the superclass)
 * of aStringDatabase.
 * 
 * Step over the statement (F6) and examine the two variables again. If you find
 * something surprising, it will be made clear once you look at indexOf().
 * 
 * (T/F) If a is an instance of C, and C extends class E, then a has a copy of
 * the instance variables defined in E.
 * 
 * (T/F) Assuming O is at position I in the array, removeElement(O)
 * 	assigns the null value at position I in the array inside 
 * 	AnInheritingStringDatabase.
 * 
 * Study the code of indexOf() and clear().
 * 
 * Assuming O is at position I in the array, indexOf(O), searches (examines):
 * 	(a) only the first element of the array.
 * 	(b) only the last element of the array.
 * 	(c) all elements of the array
 * 	(d) none of the above.
 * 
 * 
 * (T/F) The clear() method uses removeElement() to remove the elements in the 
 * database.
 * 
 * 
 * EXTENDING INTERFACES AND CLASSES
 * 
 * Look at the operations performed on aStringDatabase in the main program.
 * 
 * Which of these operation are implemented in the class of 
 * AnInheritingStringDatabase?
 * 
 * Which of these operation are implemented in ABaseStringHistory?
 * 
 * If object a is an instance of class C, and C is a subclass of E, then it is 
 * possible to invoke, on a:
 * 	(a) only the methods implemented in C.
 * 	(b) the methods implemented in both C and E.
 * 	(c) only the methods implemented in E. 
 *  
 * Click on the addElement() method call in main() and press F3 (Open class
 * declaration) or Ctrl+click to go to the interface in which the header of the
 * method is defined. 
 * 
 * In which interface is the definition found?  Is it the same as the interface
 * of this class - InheritingStringDatabase? If not, what is the relationship
 * between the two interfaces? You may need to go to InheritingStringDatabase to see. 
 * 
 *  
 * METHOD INHERITANCE IN CLASSES AND INTERFACES 
 * 
 * Go to the declaration of BaseStringHistory.
 * 
 * Add an arbitrary method header in this interface by uncommenting the header: 
 * public void test();
 * 
 * What error messages, if any, do you get when you save (compile) the interface?
 * 
 * What error message, if any, do you get in the class ABaseStringHistory?
 * 
 * Fix the problem in ABaseStringHistory. You can click on the red error icon
 * to make Eclipse suggest and select fixes. Now go to AnInheritingStringDatabase
 * and comment out "extends ABaseStringHistory".
 * 
 * What error message, if any, do you now get in the class AnInheritingStringDatabase?
 * 
 * Uncomment the line you just commented out. Does the problem go away?
 * 
 * If interface I extends interface J, and class C implements I, then A must
 * implement the methods:
 * 	(a) declared only in I.
 * 	(b) declared only in J.
 * 	(c) declared in I and J.
 * 
 * If class C extends class E, then C is considered to implement the 
 * methods:
 * 	(a) defined only in C.
 * 	(b) defined only in E.
 * 	(c) defined in both C and E.
 * 
 * VARIABLE INHERITANCE
 * 
 * Click on the reference to the size variable in the "clear" method and press 
 * F3. In which class is the declaration found?  
 * 
 * (T/F) It is possible for a class to access and modify variables declared in 
 * its superclass.
 * 
 */
 /*
  * Next class: AnInheritingStringSet
  */
 
}
