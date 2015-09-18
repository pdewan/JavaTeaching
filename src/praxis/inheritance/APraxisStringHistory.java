package praxis.inheritance;

import lectures.arrays.collections_implementation.StringHistory;

public class APraxisStringHistory implements PraxisStringHistory {
	public static final int MAX_SIZE = 50;
	protected String[] contents = new String[MAX_SIZE];
	protected int size = 0;
	int aUselessHistoryVariable = 1;
	// comment this out
	public APraxisStringHistory() {
		aUselessHistoryVariable = 2;
//		aUselessHistoryVariable = aUselessDatabaseVariable + 2;

    }
//	// uncomment this
//	public APraxisStringHistory(String anInitialElement) {
//	    System.out.println("String history constructor with an initialElement called:"+ anInitialElement);
//	    add(anInitialElement);
//    }


	public int size() {
		return size;
	}
	
	public String get (int index) {
		return contents[index];
	}

	protected boolean isFull() {
		return size == MAX_SIZE;

	}
	
	public void add(String element) {
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
	

}
