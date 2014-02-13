package lectures.arrays.collections_kinds;

import lectures.arrays.collections_implementation.StringStack;
import util.annotations.StructurePattern;
import util.annotations.StructurePatternNames;

@StructurePattern(StructurePatternNames.VECTOR_PATTERN)
//@StructurePattern(StructurePatternNames.BEAN_PATTERN)

public class AStringStack implements StringStack  {
	final int MAX_SIZE = 50;
	String[] contents = new String[MAX_SIZE];
	int size = 0;

	
	public boolean isEmpty() {
		return size == 0;
	}
	
//	public int size() {
//		return size;
//	}
	
	
//	public String elementAt (int index) {
//		return contents[index];
//	}
	
	public String getTop() {
		return contents[size-1];
	}
	boolean isFull() {
		return size == MAX_SIZE;
	}
	
	public void push (String element) {
		if (isFull())
			System.out.println("Adding item to a full history");
		else {
			contents[size] = element;
			size++;
		}
	} 	
	/* (non-Javadoc)
	 * @see examples.arrays.StringStack#pop()
	 */
	public void pop() {
		size--;		
	}
	public static void main (String[] args) {
		StringStack stringStack = new AStringStack();
		stringStack.push("James Dean");
		stringStack.push("Joe Doe");
		stringStack.push("Jane Smith");
		stringStack.push("John Smith");
		bus.uigen.ObjectEditor.edit(stringStack);
		
	}
}
