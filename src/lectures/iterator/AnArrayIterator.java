package lectures.iterator;
public class AnArrayIterator implements StringIterator {
	String[] elements;
	int nextIndex;
	public AnArrayIterator(String[] anElementArray) {
		elements = anElementArray;		
	}
	public String next() {
		String retVal = elements[nextIndex];
		nextIndex++;
		return retVal;
	}
	public boolean hasNext() {
		return nextIndex < elements.length;
	}
	public static void main(String[] args) {
		IteratedStringPrinter.print(new AnArrayIterator(new String[]{"hello", "goodbye"}));	
	}

}
