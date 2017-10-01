package lectures.inheritance;

import bus.uigen.ObjectEditor;
import util.annotations.StructurePattern;
import util.annotations.StructurePatternNames;
/**
 * 
 * This is a "base" or super class class that is "extended" by other classes in 
 * this praxis.
 * 
 * Try to understand this class on your own first.
 * 
 * If you want to see the program without comments first, just collapse
 * them by clicking on the "-" symbol at the start of each comment block. 
 * 
 */ 
public class ABaseStringHistory implements BaseStringHistory {
	/*
	 * This collection has a fixed maximum size.
	 */
	public static final int MAX_SIZE = 50;
	
	/*
	 * The underlying array to store the elements
	 */
	protected String[] contents = new String[MAX_SIZE];
	
	/*
	 * number of filled elements
	 */
	protected int size = 0;	// number of filled elements (protected access)

/*
 * We will uncomment other variations of this later
 */
    public int uselessVariable = 0;
//  private int uselessVariable = 0;
//  protected int uselessVariable = 0;
//  int uselessVariable = 0;
     
	public ABaseStringHistory() {
		uselessVariable = 1;
//		System.out.println("ABaseStringHistory parameterless constructor called");
	}
	
	public ABaseStringHistory(int someParameter) {
		System.out.println("ABaseStringHistory Single-Parameter Constructor Called");
    }
	
	/*
	 * Number of filled elements
	 */
	public int size() {
		return size;
	}
	
	public String elementAt (int index) {
		return contents[index];
	}

	protected boolean isFull() {
		return size == MAX_SIZE;
	}
	
	public void addElement(String element) {
		if (isFull()) {
			System.out.println("Cannot add item to a full history");
		} else {
			contents[size] = element;
			size++;
		}
	} 
/*
 * (In a non-full history) the addElement() method of ABaseStringHistory assigns 
 * to a component of the underlying array, contents,  at the:
 *    (a) first index of the array (0)
 *    (b) the last index of the array (contents.size(0 - 1))
 *    (c) the first unfilled index of the array (size)
 *  
 * Adding a new element to a full history:
 *    (a) replaces the last element of the array with the new element.
 *    (b) replaces the first element of the array with the new element.
 *    (c) does not add the new element, and prints an error message
 * 
 */
	@Override
	public String toString() {
		String retVal = "";
		for (int i = 0; i < size; i++) {
			String separator = (i == 0)?"":":";
			retVal += separator + contents[i];
		}	
// We will switch these two returns later
		return retVal;
//		return super.toString();

	}
/*
 * The toString() method returns a String displaying:
 *    (a) all elements of the underlying array.
 *    (b) all filled elements of the underlying array.
 */
	final static String EXAMPLE_ITEM = "James Dean";

    protected static void manipulateHistory(BaseStringHistory aStringHistory) {
    	/*
		 set break point below
		 */
    	aStringHistory.addElement(EXAMPLE_ITEM);     	
    	aStringHistory.addElement(EXAMPLE_ITEM); //adding item a second time
	 }
	public static void main (String[] args) {
		BaseStringHistory aStringHistory = new ABaseStringHistory();
		manipulateHistory(aStringHistory);
		System.out.println(aStringHistory.size());
		System.out.println(aStringHistory);		
		System.out.println (aStringHistory.size());
		System.out.println(aStringHistory);	
		ObjectEditor.edit(aStringHistory);		
	}
}
/* 
 * As this class itself does not use inheritance, what is interesting about it is how
 * it allows us to go from fixed-length collection to a variable-length list
 * by defining our own type.
 * 
 * Answer the following general questions about histories based on your understanding
 * of the English term "history" and the fact that this is an example
 * of a history.
 * 
 * As it is variably-sized, it also provides an operation to add elements.
 *  
 * Its implementation uses a collection of a fixed size: an array.
 * 
 * The array has filled and unfilled elements, and the external world
 * sees the filled elements as the variable-size array.
 * 
 * As with strings, we do not access the elements using array syntax, 
 * since this class is defined by us and not understood by the language.
 * 
 * (T/F) A history has a variable external size, that is, public methods
 * of the object define a variable-size collection.
 * 
 * (T/F) A history implemented using a single array object has a changeable 
 * internal size, that is, the instance variables point to objects that can grow 
 * larger over the lifetime of the history.
 * 
 * (T/F) It is possible to access each element of a history. 
 * 
 * (T/F) We can define our own collection type that uses int indices  to 
 * access the elements of the collection.
 * 
 * (T/F) We can define our own collection type that uses array syntax to 
 * access the elements of the collection.  
 *   
 * (T/F) It is not possible to add new elements to a history.
 * 
 * (T/F) An element in a history cannot be deleted or modified.
 * 
 */ 
/*
 * After you have read the program, run it without any break 
 * points first to understood it better.
 * 
 * Set the breakpoint at the identified location, and debug-run the program.
 *  
 * At the breakpoint, examine the contents variable of aStringHistory and look
 * at its id and dimension (length) within brackets. 
 * 
 * Also look at the value of the size variable.
 * 
 * Step over the first call to addElement() method.
 * 
 * Examine the two variables in the same way.
 * 
 * Did the size variable change?
 * 
 * Did the size of the array change?
 * 
 * (T/F) A history implemented using a single array object has a maximum size.
 * 
 * The "add" operation in ABaseStringHistory:
 * 	(a) creates a new array with a larger size.
 * 	(b) replaces a null element in the existing array with the added element.
 * 	(c) replaces a non-null element in the existing array with the added element.
 * 
 * The "size" method in ABaseStringHistory returns:
 * 	(a) the length of the array object holding the history elements.
 * 	(b) the number of filled elements in the array.
 * 	(c) the number of unfilled elements in the array.
 * 
 * Step over the second call to addElement()
 * 
 * Adding an item a second time to an instance of AnInheritingStringDatabase
 *  results in:  
 * 	(a) an error.
 * 	(b) the addition being ignored.
 * 	(c) a duplicate item.
 * 
 */
/*
 * Next class AnInheritingStringDatabase
 */
