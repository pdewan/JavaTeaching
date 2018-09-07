package lectures.inheritance;

/**
 * This class uses inheritance by extending the previous class.
 * In Java, it involves using the "extends" keyword used below. 
 * 
 * It also shows how one can create a modifiable collection.
 * 
 * Again first study and run the program and try to understand what 
 * it does on your own.  
 */

public class AnInheritingStringDatabase 
	extends ABaseStringHistory // use of keyword "extends""
	implements InheritingStringDatabase {
/*
 * Since AnInheritingStringDatabase extends ABaseStringHistory 
 * AnInheritingStringDatabase is a subclass/subtype of ABaseStringHistory
 * ABaseStringHistory is a base class/superclass/supertype of
 * AnInheritingStringDatabase.
 * 
 * Which of the following is consistent with the above statements.
 *
 * If class A extends class B:
 *     (a) A is a superclass of B.
 *     (b) B is a supertype of A.
 *     (c) A is a subclass of B.
 *     (d) B is a base class of A.
 */
/*
 * Go to the interface of this class, InheritingStringDatabase and answer the
 * questions there.
 * 
 * (T/F) If class C1 implementing I1 is a subclass of C2 implementing I2, then I1
 * can be a subtype of I2.	
/*
 * Re-declaration of size of base class, uncomment when asked later
 */
//	protected int size = 0;
	protected int anotherUselessVariable = uselessVariable - 1;
	
	public AnInheritingStringDatabase() {
		super();
//		super(2);
		uselessVariable = 2;
		anotherUselessVariable = 1;
//		super(2);
//		System.out.println("AnInheritingStingDatabase constructor called");
	}
	
/*
 * Comment and uncomment when asked in the next class
 */
//	@Override
//	public void addElement(String element) {
//		super.addElement(element);
//	}
	
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
/* 
 * Click on the reference to the instance variables (in blue) and press 
 * F3 (ctrl/command-click). In which class is the declaration found?    
 * 
 * shiftUp in AnInheritingStringDatabse refers to instance variables declared 
 * in class:
 *    (a) the class itself, AnInheritingStringDatabase
 *    (b) its superclass ABaseStringHistory
 *    
 * (T/F) It is possible for a class to access and modify variables declared in 
 * its superclass.
 * 
 * Element removal in AnInheritingStringDatabse involves:
 *  1) shifting the elements after the deleted element up so that the filled and
 *  	unfilled elements of the array are separate sections of the array.
 *  2) assigning the null value to the element at the deleted index so that the
 *  filled and unfilled elements are not separate sections of the array.  
*/

	protected int indexOf(String element) {
	    int index = 0;
	    while ((index < size()) && !element.equals(contents[index])) {
	        index++;
	    }
	    // Most implementations will count down and give a negative result in case 
		// of failed search. 
		return index; 
	}  
/*
 * A target of a (class) instance method is the (class) instance on which the 
 * method is invoked.
 * 
 * (T/F) the index() method of AnInheritingStringDatabase calls an instance method
 * in its superclass without specifying the target of the call.
 * 
 * (T/F) The syntax for calling inherited instance (superclass) methods of class C is the
 * same as the syntax for calling instance methods declared in the class.
 */
/*
 * if indexOf(element) cannot find element, it returns:
 *    (a) 0
 *    (b) -1
 *    (c) the number of filled elements (size) in the underlying array
 *    (c) the size of the underlying array
 *    
 * Assuming O is at position I in the array, indexOf(O), searches (examines):
 * 	  (a) only the first element of the array.
 * 	  (b) only the last element of the array.
 * 	  (c) all elements of the array  
 * 	  (d) none of the above.
 *    
 * The method indexOf(element) of AnInheritingStringDatabase is called by:
 *    (a) no public method of AnInheritingStringDatabase.
 *    (b) exactly one public method of AnInheritingStringDatabase.
 *    (c) more than one public method of AnInheritingStringDatabase.
 *    
 *  The method indexOf(element) is a:
 *    (a) part of the external (public) behavior AnInheritingStringDatabase
 *    (b) reusable piece of code. 
 */	

     public void clear() {
//			super(2);
		    size = 0;
	}
/*
 * The clear() method in AnInheritingStringDatabase:
 * 	 (a) uses removeElement() to remove the elements in the database.
 *   (b) sets all elements in the underlying array to null.
 *   (c) changes the value of the variable returned by the size() method.
 *   (d) none of the above
 */
    
    public boolean member(String element) {
        return indexOf (element) < size;
    }    
/* 
 * The method member(element) in AnInheritingStringDatabase:
 *   (a) adds its argument (element) to the database.
 *   (b) determines if its argument exists in the database
 *   (c) determines if its argument can be added to the database.
 *  
 *       
 */
    
    protected static void manipulateDatabase(InheritingStringDatabase aStringDatabase) {
    	manipulateHistory(aStringDatabase);
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
 * A target of a (class) instance method is the (class) instance on which the 
 * method is invoked.
 * 
 * (T/F) The static method manipulateDatabase() calls a method declared in the superclass
 * without explicitly specifying the target of the class.  
 * 
 * (T/F) The syntax for calling inherited static (superclass) methods of class C is the
 * same as the syntax for calling static methods declared in the class.  
 *     
 */
   
    public static void main (String[] args) {
    	InheritingStringDatabase stringDatabase = new AnInheritingStringDatabase();
    	manipulateDatabase(stringDatabase); 	
    }
   

/*  
 * PHYSICAL STRUCTURE
 * 
 * Study the main method and run it.
 *
 * Now set break point at the specified location. 
 * 
 * Examine the the size and contents variable.
 * 
 * (T/F) The physical structure of AnInheritingStringDatabase (shown by the 
 * debugger) includes variables declared in the superclass.
 * 
 * (T/F) If a is an instance of C, and C extends class E, then a has a copy of
 * the instance variables defined in E.
 * 
 * Step over the removeElement statement (F6) and examine the two variables again. If you find
 * something surprising, it will be made clear once you look at indexOf().
 * 
 * (T/F) Assuming O is at position I in the array, removeElement(O)
 * 	assigns the null value at position I in the array.
 *  
 */
/*
 *  KIND OF COLLECTION
 * 
 * AnInheritingStringDatabase :
 *  a) supports addition of elements
 * 	b) allows previously added elements to be deleted.
 * 	c) provides an operation to determine if an element exists
 * 		in the collection.
 * 	d) provides an operation to remove all elements in the collection.
 *  e) provides an operation to replace an existing element with a new one.
 *  
 * (T/F) In AnInheritingStringDatabase an array is used to store the database elements.
 */

/*
 * EXTENDING INTERFACES AND CLASSES
 * 
 * If object a is an instance of class C, and C is a subclass of E, then it is 
 * possible to invoke, on a:
 * 	(a) only the methods implemented in C.
 * 	(b) the methods implemented in both C and E.
 * 	(c) only the methods implemented in E. 
 *  
 * Click on the addElement() method call in main() and press F3 (Open class
 * declaration) or Ctrl/command+click to go to the interface in which the header of the
 * method is defined. 
 * 
 * In which interface is the definition found?  Is it the same as the interface
 * of this class - InheritingStringDatabase? If not, what is the relationship
 * between the two interfaces? You may need to go to InheritingStringDatabase to see. 
 *  
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
 * If interface I extends interface J, and class C implements I, then C must
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
 */
 /*
  * Next class: AnInheritingStringSet
  */
 
}
