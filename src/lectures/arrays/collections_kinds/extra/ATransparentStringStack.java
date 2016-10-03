package lectures.arrays.collections_kinds.extra;

public class ATransparentStringStack implements TransparentStringStack  {
	final int MAX_SIZE = 50;
	String[] contents = new String[MAX_SIZE];
	int size = 0;

	public boolean isEmpty() {
		return size == 0;
	}
	
	
	public String get (int index) {
		return contents[index];
	}
	
//	public String getTop() {
//		return contents[size-1];
//	}
	boolean isFull() {
		return size == MAX_SIZE;
	}
	
	public int size() {
		return size;
	}
	public void push (String element) {
		if (isFull())
			System.out.println("Adding item to a full history");
		else {
			contents[size] = element;
			size++;
		}
	} 	

	public String pop() {
		size--;	
		return contents[size];
	}
	public static void main (String[] args) {
		TransparentStringStack stringStack = new ATransparentStringStack();
		stringStack.push("James Dean");
		stringStack.push("Joe Doe");
		stringStack.push("Jane Smith");
		stringStack.push("John Smith");
		bus.uigen.ObjectEditor.edit(stringStack);
		
	}
}
