package lectures.extra;

import java.beans.PropertyChangeListener;

public interface PropertyChangeListenerHistory {
	public void addElement(PropertyChangeListener aListener);
	public PropertyChangeListener elementAt(int index); 
	public int size();


}
