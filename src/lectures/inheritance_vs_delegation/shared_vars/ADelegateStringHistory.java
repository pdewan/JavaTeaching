package lectures.inheritance_vs_delegation.shared_vars;

import lectures.arrays.collections_implementation.StringHistory;

public class ADelegateStringHistory implements StringHistory {
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
		if (isFull())
			System.out.println("Adding item to a full history");
		else {
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
		ADelegateStringHistory stringHistory = new ADelegateStringHistory();
		stringHistory.addElement("James Dean");
		stringHistory.addElement("Joe Doe");
		stringHistory.addElement("Jane Smith");
		stringHistory.addElement("John Smith");
		bus.uigen.ObjectEditor.edit(stringHistory);
		System.out.println(stringHistory);
		
	}
}
