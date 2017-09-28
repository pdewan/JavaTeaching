package lectures.generics_adapters.extra;


public class AnIntegerHistory implements IntegerHistory {
	public static final int MAX_SIZE = 50;
	
	Integer[] contents = new Integer[MAX_SIZE]; 
	int size = 0;
	public int size() {return size;	}	
	public Integer elementAt (int index) {
		return contents[index]; 
	}
	boolean isFull() {return size == MAX_SIZE;	}

	public void addElement(Integer element) {
		if (isFull()) {
			System.out.println("Adding item to a full history");
		} else {
			contents[size] = element;
			size++;
		}
		/*
		 Can we invoke a non object operation on a variable whose type is a parameter?
		 */
//		element.charAt(0);
		
	} 
	
	
}
