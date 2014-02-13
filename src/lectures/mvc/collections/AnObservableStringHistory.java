package lectures.mvc.collections;


import lectures.arrays.collections_implementation.AStringHistory;
import lectures.arrays.collections_implementation.StringHistory;
import util.annotations.ObserverRegisterer;
import util.annotations.ObserverTypes;
import util.models.VectorChangeEvent;
import util.models.VectorListener;
public class AnObservableStringHistory extends AStringHistory implements ObservableStringHistory {
	VectorListenerSupport vectorListenerSupport = new AVectorListenerSupport();
	
	public void addElement(String element) {
		if (isFull())
			System.out.println("Adding item to a full history");
		else {
			contents[size] = element;
			size++;
			vectorListenerSupport.notifyAllListeners(
				new VectorChangeEvent(this, VectorChangeEvent.AddComponentEvent, 
						size -1, null, element, size));
		}
	} 

	@ObserverRegisterer(ObserverTypes.VECTOR_LISTENER)
	public void addVectorListener(VectorListener aListener) {
		vectorListenerSupport.addElement(aListener);	
	}
	

	public static void main (String[] args) {
//		History<String> history = new AnObservableStringHistory();			
		StringHistory stringHistory = new AnObservableStringHistory();
		stringHistory.addElement("James Dean");
		stringHistory.addElement("Joe Doe");
		stringHistory.addElement("Jane Smith");
		stringHistory.addElement("John Smith");
		bus.uigen.ObjectEditor.edit(stringHistory);
		
	}

}
