package lectures.mvc.properties;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import lectures.mvc.properties.atomic.APropertyListenerSupport;
import bus.uigen.ObjectEditor;


public class AnObservableStringHolder {
	String object;
	PropertyListenerSupport propertyListenerSupport = new APropertyListenerSupport();	
//	@Override
	public Object getString() {
		return object;
	}
//	@Override
	public void setObject(String newVal) {
		Object oldVal = object;
		object = newVal;
		propertyListenerSupport.notifyAllListeners(
				new PropertyChangeEvent(this, "Object", oldVal, newVal));		
	}	
//	@Override
	public void addPropertyChangeListener(PropertyChangeListener aListener) {
		propertyListenerSupport.add(aListener);
	}
	
	public static void main (String[] args) {
		AnObservableStringHolder stringHolder = new AnObservableStringHolder();
		stringHolder.setObject("Hello");
		ObjectEditor.edit(stringHolder);
	}
}
