package lectures.inheritance;

import bus.uigen.ObjectEditor;
import util.annotations.StructurePattern;
import util.annotations.StructurePatternNames;
/*
 * 
 * This is a "base" or super class class that is extended by other classes here.
 * 
 * Try to understand this class on your own first.
 * 
 * If you do not want to see the program without comments first, just collapse
 * them by clicking on the - symbol at the start of each comment block.
 * 
 * As it does not itself use inheritance, what is interesting about it is how
 * it allows us to go from fixed-length collection to a variable-length list
 * by defining our own type.
 * 
 * Once a item is added to the list, it cannot be removed or changed, so this
 * variable-size collection is a history.
 * 
 * Like any collection, a history provided operations to access or read its 
 * elements.
 * 
 * As it is variable sized, it also provides an operation to add elements.
 *  
 * Its implementation uses  a collection of fixed size - an array.
 * 
 * The array has filled and unfilled elements, and the external world
 * sees the filled elements as the variable size array.
 * 
 * We do not access the elements as using array syntax, since this class
 * is not understood by the language and defined by us.
 * 
 * Try and understand the program and run it without any break 
 * points first.
 * 
 * (T/F) We can define our own collection type that uses array syntax to 
 * manipulate the elements of the collection.  
 *  
 * (T/F) It is possible to access each element of a history.
 * 
 * (T/F) It is not possible to add new elements to a history.
 * 
 * (T/F) An element in a history cannot be deleted or modified. *  
 * 
 */ 
public class ABaseStringHistory implements BaseStringHistory {
	/*
	 * This collection has a fixed max size.
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
 * We will uncomment this later.	
 */
     public int uselessVariable = 0;

//    protected int uselessVariable = 0;
//    int uselessVariable = 0;
//    private int uselessVariable = 0;
//
	public ABaseStringHistory() {
		uselessVariable = 1;
//		System.out.println("Useless variable:" + uselessVariable);
	}
	public ABaseStringHistory(int aMaxSize) {
		contents = new String[MAX_SIZE];
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
	@Override
	public String toString() {
		String retVal = "";
		for (int i = 0; i < size; i++) {
			String separator = (i == 0)?"":":";
			retVal += separator + contents[i];
		}	
// We will switch these two returns
		return retVal;
//		return super.toString();

	}	

	public static void main (String[] args) {
		BaseStringHistory aStringHistory = new ABaseStringHistory();
		aStringHistory.addElement("James Dean");
		System.out.println(aStringHistory.size());
		System.out.println(aStringHistory);
		/*
		 set break point below
		 */
		aStringHistory.addElement("Joe Doe");
		/*
		 * If aStringHistory was an array, we would say aStringHistory.length
		 * rather than aStringHistory.size()
		 */
		System.out.println (aStringHistory.size());
		System.out.println(aStringHistory);	
		ObjectEditor.edit(aStringHistory);		
	}
}
/*
 * 
 * Set the breakpoint at the identified location, and debug-run the program.
 *  
 * At the breakpoint, examine the contents variable and look at its id and 
 * dimension (length) within brackets. 
 * 
 * Also look at the value of the size variable.
 * 
 * Step over the call to addElement() method.
 * 
 * Examine the two variables in the same way.
 * 
 * Did the size variable change?
 * 
 * Did the size of the array change?
 * 
 * (T/F) A history implemented using a single array object has a maximum size.
 * 
 * (T/F) The add operation ABaseStringHistory:
 * 	(a) creates a new array with a larger size.
 * 	(b) replaces a null element in the existing array with the added element.
 * 	(c) replaces a non-null element in the existing array with the added element.
 * 
 * (T/F) The size method in ABaseStringHistory returns:
 * 	(a) the length of the array object holding the history elements
 * 	(b) the number of filled elements in the history.
 * 	(c) returns the number of unfilled elements in the history.
 * 
 */
/*
 * Next class AnInheritingStringDatabase
 */
