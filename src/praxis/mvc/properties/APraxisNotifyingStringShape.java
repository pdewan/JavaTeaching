package praxis.mvc.properties;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import util.annotations.Tags;
import lectures.graphics.AStringShape;
import lectures.graphics.StringShape;
@Tags({"Model", "Observable"})
public class APraxisNotifyingStringShape extends AStringShape implements PraxisObservableStringShape {

	PraxisPropertyListenerSupport propertySupport = new APraxisPropertyListenerSupport();

	public APraxisNotifyingStringShape(String initText, int initX, int initY) {
		super(initText, initX, initY);
	}
	public void addPropertyChangeListener(PropertyChangeListener l) {
		propertySupport.add(l);
	}	
	public void setX(int newVal) {
		int oldVal = getX();
		super.setX(newVal);
		propertySupport.notifyAllListeners(new PropertyChangeEvent(this, "X", oldVal,
				newVal));
	}
	public void setY(int newVal) {
		int oldVal = getY();
		super.setY(newVal);
		propertySupport.notifyAllListeners(new PropertyChangeEvent(this, "Y", oldVal,
				newVal));
	}

//	void notifyAllListeners(PropertyChangeEvent e) {
//		for (int i = 0; i < observers.size(); i++) {
//			observers.elementAt(i).propertyChange(e);
//		}
//	}

	
	
	
	public void setText(String newVal) {
		String oldVal = getText();
		super.setText(newVal);
		propertySupport.notifyAllListeners(new PropertyChangeEvent(this, "Text", oldVal,
				newVal));
		
	}
	public String toString() {
		return getText();
	}
	

	public static void main(String[] args) {
		StringShape label = new APraxisNotifyingStringShape("hello", 10, 20);
		bus.uigen.ObjectEditor.edit(label);
		label.setX(100);
		label.setY(50);
		label.setText("bye");
	}
}
