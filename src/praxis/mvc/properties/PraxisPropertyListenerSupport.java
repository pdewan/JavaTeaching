package praxis.mvc.properties;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public interface PraxisPropertyListenerSupport {
	public void add(PropertyChangeListener l);
	public PropertyChangeListener get(int index); 
	public int size();
	public void notifyAllListeners(PropertyChangeEvent event);
	public void remove(PropertyChangeListener element) ;
	public void remove(int startIndex) ;
	public int indexOf(PropertyChangeListener element);
	public boolean member(PropertyChangeListener element);
}
