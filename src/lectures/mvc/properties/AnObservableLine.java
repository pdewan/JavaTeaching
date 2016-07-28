package lectures.mvc.properties;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import lectures.graphics.ALine;
import lectures.graphics.Line;
import bus.uigen.ObjectEditor;
// PROPERTY-BASED NOTIFICATION - ANOTHER EXAMPLE
public class AnObservableLine extends ALine implements ObservableLine  {
	PropertyListenerSupport propertySupport = new APropertyListenerSupport();
	public AnObservableLine (int initX, int initY, int initWidth, int initHeight) {
		super(initX, initY, initWidth, initHeight);
	}
	public void setX(int newVal) {
		int oldVal = getX();
		super.setX(newVal);
		// Only one notification in this setter
		propertySupport.notifyAllListeners(new PropertyChangeEvent(this, "X", oldVal,
				newVal));
	}
	public void setY(int newVal) {
		int oldVal = getY();
		super.setY(newVal);
		propertySupport.notifyAllListeners(new PropertyChangeEvent(this, "Y", oldVal,
				newVal));
	}
	public void setWidth(int newVal) {
		int oldVal = getWidth();
		super.setWidth(newVal);
		propertySupport.notifyAllListeners(new PropertyChangeEvent(this, "Width", oldVal,
				newVal));
	}
	
	public void setHeight(int newVal) {
		int oldVal = getHeight();
		super.setHeight(newVal);
		propertySupport.notifyAllListeners(new PropertyChangeEvent(this, "Height", oldVal,
				newVal));
	}	
	@Override
	public void addPropertyChangeListener(PropertyChangeListener listener) {
		propertySupport.add(listener);
		
	}
	public static void main(String args[]) {
		ObservableLine observableLine = new AnObservableLine(10, 10, 20, 20);
		ObjectEditor.edit(observableLine);
		// No need to call refresh!
		observableLine.setX(50);
		observableLine.setY(100);
		observableLine.setWidth(150);
		observableLine.setHeight(200);
	}
}
