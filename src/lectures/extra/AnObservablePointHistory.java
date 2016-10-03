package lectures.extra;

import lectures.arrays.collections_kinds.extra.APointHistory;
import lectures.graphics.ACartesianPoint;
import lectures.graphics.Point;
import lectures.mvc.collections.AVectorListenerSupport;
import lectures.mvc.collections.VectorListenerSupport;
import util.annotations.ObserverRegisterer;
import util.annotations.ObserverTypes;
import util.models.VectorChangeEvent;
import util.models.VectorListener;


public class AnObservablePointHistory extends APointHistory  {
	transient VectorListenerSupport vectorListenerSupport = new AVectorListenerSupport();

	public void addElement(int x, int y) {
		if (isFull())
			System.out.println("Adding item to a full history");
		else {
			Point p = new ACartesianPoint(x, y);
			contents[size] = p;
			size++;
			vectorListenerSupport.notifyAllListeners(
					new VectorChangeEvent(this, VectorChangeEvent.AddComponentEvent, 
							size -1, null, p, size));
		}
	}   
	
	@ObserverRegisterer(ObserverTypes.VECTOR_LISTENER)
	public void addVectorListener(VectorListener aListener) {
		vectorListenerSupport.addElement(aListener);	
	}
}
