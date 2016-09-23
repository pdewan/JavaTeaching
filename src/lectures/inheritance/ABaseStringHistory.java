package lectures.inheritance;

import util.annotations.StructurePattern;
import util.annotations.StructurePatternNames;
/*
 * This is a "base" class that is extended by other classes here.
 *
 * 
 * It demonstrates how we can define our type to create a collection of
 * variable size.
 * 
 * It uses  a collection of fixed size - an array.
 * 
 * The array has filled and unfilled elements, and the external world
 * sees the filled elements as the variable size array.
 * 
 * We do not access the elements as using array syntax, since this class
 * is not understood by the language. 
 * 
 * Try and understand the program and run it without any break 
 * points first.
 */ 
public class ABaseStringHistory implements BaseStringHistory {
	/*
	 * This collection has a fixed max size.
	 */
	public static final int MAX_SIZE = 50;
	
	/*
	 * The underlying array to store
	 */
	protected String[] contents = new String[MAX_SIZE];
	protected int size = 0;	// number of filled elements
	
//	public AStringHistory() {
//		System.out.println("AStringHistory Parameterless Constructor Called");
//	}
//	public AStringHistory(int aMaxSize) {
//		contents = new String[MAX_SIZE];
//		System.out.println("AStringHistory Single-Parameter Constructor Called");
//   }
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
	
	public String toString() {
		String retVal = "";
		for (int i = 0; i < size; i++) {
			String separator = (i == 0)?"":":";
			retVal += separator + contents[i];
		}		
		return retVal;
//		return super.toString();

	}	

	public static void main (String[] args) {
		BaseStringHistory aStringHistory = new ABaseStringHistory();
		aStringHistory.addElement("James Dean");
		System.out.println(aStringHistory.size());
		System.out.println(aStringHistory);
		// set break point below		
		aStringHistory.addElement("Joe Doe");
		/*
		 * If aStringHistory was an array, this would be 
		 * aStringHistory.length
		 */
		System.out.println (aStringHistory.size());
		System.out.println(aStringHistory);	
		bus.uigen.ObjectEditor.edit(aStringHistory);		
	}

	
}
/*
 * COLLECTION KINDS
 * Why do you think this object is called a history?

 * DYNAMIC COLLECTIONS vs. STATIC ARRAYS
 * At the breakpoint, examine the contents variable and look at its id and dimension (length) 
 * within brackets. Also look at the value of the size variable.
 * Step over the addElement() method.
 * Examine the variables in the same way? Did the size of the string history change?
 * What does that mean anyway? Did the size of the array change?
 * What is the purpose of the method isFull?
 * 
 */
