package lectures.mvc.collections;

import util.models.VectorChangeEvent;
import util.models.VectorListener;

public interface VectorListenerSupport {
	public void addElement(VectorListener l);
	public VectorListener elementAt(int index); 
	public int size();
	public void notifyAllListeners(VectorChangeEvent event);
}
