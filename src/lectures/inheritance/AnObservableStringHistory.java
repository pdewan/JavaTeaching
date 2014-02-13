package lectures.inheritance;
import java.util.Vector;

import lectures.arrays.collections_implementation.AStringHistory;
import util.models.VectorChangeEvent;
import util.models.VectorListener;
public class AnObservableStringHistory extends AStringHistory {
	Vector<VectorListener> listeners = new Vector();
	public void addVectorListener(VectorListener vectorListener) {
		listeners.addElement(vectorListener);
	}
	public void addElement(String element) {
		super.addElement(element);
		notifyListeners(new VectorChangeEvent(this, VectorChangeEvent.AddComponentEvent, size -1, null, element, size));		
	} 
	void notifyListeners (VectorChangeEvent event) {
		for (int i = 0; i < listeners.size(); i++) {
			listeners.elementAt(i).updateVector(event);
		}
		
	}
}
