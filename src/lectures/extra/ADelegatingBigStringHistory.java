package lectures.extra;


public class ADelegatingBigStringHistory implements DelegatingStringHistory {
	public final int MAX_SIZE = 50;
	String[] contents = new String[MAX_SIZE];
	int size = 0;
	StringHistorySkeleton delegate = new AStringHistorySkeleton(this);
	public int size() {
		return size;
	}
	public String elementAt(int index) {
		return contents[index];
	}
	public boolean isFull() {
		return size == MAX_SIZE;
	}
	public void uncheckedAddElement(String element) {
		contents[size] = element;
		size++;
	}
	public void addElement(String element) {
		delegate.addElement(element);		
	}
}
