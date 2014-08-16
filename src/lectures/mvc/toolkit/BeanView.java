package lectures.mvc.toolkit;

import java.beans.PropertyChangeListener;

import util.models.PropertyListenerRegistrar;

public interface BeanView extends PropertyChangeListener {
	public void register (PropertyListenerRegistrar aPropertyChangeRegister);

}
