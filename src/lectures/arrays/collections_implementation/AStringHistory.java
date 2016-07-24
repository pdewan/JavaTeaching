package lectures.arrays.collections_implementation;
// Try and understand the program and run it without any break points first
public class AStringHistory implements StringHistory {
	public static final int MAX_SIZE = 50;
	protected String[] contents = new String[MAX_SIZE];
	protected int size = 0;

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
			System.out.println("Adding item to a full history");
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
	// At the breakpoint, examine the array contents and look at its id and dimension (length) 
	// within brackets. Also look at the value of the size variable.
	// Step over the addElement() method.
	// Examine the variables in the same way? Did the size of the string history change?
	// What does that mean anyway? Did the size of the array change?
	// What is the purpose of the method isFull?
	
}
