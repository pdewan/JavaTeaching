package lectures.arrays.collections_implementation;

import util.annotations.StructurePattern;
import util.annotations.StructurePatternNames;

// Try and understand the program and run it without any break points first

@StructurePattern(StructurePatternNames.VECTOR_PATTERN) // Method headers follow Java's Vector class
public class AStringHistory implements StringHistory {
	public static final int MAX_SIZE = 50;
	protected String[] contents = new String[MAX_SIZE];
	protected int size = 0;	
//	public AStringHistory() {
//		System.out.println("AStringHistory Parameterless Constructor Called");
//	}
//	public AStringHistory(int aMaxSize) {
//		contents = new String[MAX_SIZE];
//		System.out.println("AStringHistory Single-Parameter Constructor Called");
//   }
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
//		return retVal;
		return super.toString();

	}	

	public static void main (String[] args) {
		StringHistory aStringHistory = new AStringHistory();
		aStringHistory.addElement("James Dean");
		System.out.println(aStringHistory.size());
		System.out.println(aStringHistory);
		// set break point below
		aStringHistory.addElement("Joe Doe");	
		System.out.println (aStringHistory.size());
		System.out.println(aStringHistory);	
		bus.uigen.ObjectEditor.edit(aStringHistory);		
	}
    // COLLECTION KINDS
	// Why do you think this object is called a history?
	
	// DYNAMIC COLLECTIONS vs. STATIC ARRAYS
	// At the breakpoint, examine the contents variable and look at its id and dimension (length) 
	// within brackets. Also look at the value of the size variable.
	// Step over the addElement() method.
	// Examine the variables in the same way? Did the size of the string history change?
	// What does that mean anyway? Did the size of the array change?
	// What is the purpose of the method isFull?
	
}
