package lectures.mvc.toolkit.extra;

import java.beans.PropertyChangeListener;

import util.models.PropertyListenerRegisterer;

public interface BeanView extends PropertyChangeListener {
	public void register (PropertyListenerRegisterer aPropertyChangeRegister);

}
