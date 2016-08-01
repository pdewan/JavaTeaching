package lectures.inheritance;
import java.util.Vector;

import lectures.arrays.collections_implementation.AStringHistory;
import util.models.VectorChangeEvent;
import util.models.VectorListener;
public class AnObservableStringSet extends AStringDatabase {
	Vector<VectorListener> listeners = new Vector();
	public void addVectorListener(VectorListener vectorListener) {
		listeners.addElement(vectorListener);
	}
	public void addElement(String element) {
		super.addElement(element);
		notifyListeners(new VectorChangeEvent(this, VectorChangeEvent.AddComponentEvent, size -1, null, element, size));		
	} 
	public void removeElement(String element) {
		super.removeElement(element);
		notifyListeners(new VectorChangeEvent(this, VectorChangeEvent.DeleteComponentEvent, size + 1, null, element, size));		

	}
	void notifyListeners (VectorChangeEvent event) {
		for (int i = 0; i < listeners.size(); i++) {
			listeners.elementAt(i).updateVector(event);
		}
		
	}
}
