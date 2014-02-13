package lectures.mvc.collections;
import util.models.VectorChangeEvent;
import util.models.VectorListener;

public class AVectorListenerSupport implements VectorListenerSupport {
	public final int MAX_SIZE = 50;
	VectorListener[] contents = new VectorListener[MAX_SIZE];
	int size = 0;

	public int size() {
		return size;
	}
	
	public VectorListener elementAt (int index) {
		return contents[index];
	}
	boolean isFull() {
		return size == MAX_SIZE;
	}
	public void addElement(VectorListener l) {
		if (isFull())
			System.out.println("Adding item to a full history");
		else {
			contents[size] = l;
			size++;
		}
	}   
	public void notifyAllListeners(VectorChangeEvent event) {
			for (int index = 0; index < size(); index++) {
				elementAt(index).updateVector(event);
			}
	}	
}
