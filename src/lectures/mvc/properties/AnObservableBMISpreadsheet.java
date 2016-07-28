package lectures.mvc.properties;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import lectures.interfaces.ABMISpreadsheet;
import util.annotations.ObserverRegisterer;
import util.annotations.ObserverTypes;
// PROPERTY_BASED OBSERVABLES
// Among other things, the observer pattern can be used to avoid the useof refresh in ObjectEditor

// This example answers the questions:
// How does one change the notification method when the model has many logical components -
// in particular when these components are Bean properties?
// How does one put notification code in a separate class?

public class AnObservableBMISpreadsheet extends ABMISpreadsheet implements ObservableBMISpreadsheet  {
	
	// Class and interface supporting notification.
	// The Bean framework also has such a class, this one is simpler and hence more understandable
	// Press F3 on the interface and see what it does
    PropertyListenerSupport propertyListenerSupport = new APropertyListenerSupport();
	public AnObservableBMISpreadsheet() { }	
	public AnObservableBMISpreadsheet(
			double theInitialHeight, double theInitialWeight) {
		super(theInitialHeight, theInitialWeight);
	}
	
	// Write methods are overridden,  read methods are inherited without change
	@Override
	public void setWeight(double newValue) {
		
		// record  variable values changed by the super call
		double oldWeight = getWeight();
		double oldBMI = getBMI();
		super.setWeight(newValue);

		// PropertyChangeEvent is a type defined by the standard Bean framework.
		// Hover over it and it will tell you what the various constructor parameters mean
		  propertyListenerSupport.notifyAllListeners(new PropertyChangeEvent(this, "Weight", oldWeight, newValue));
		  propertyListenerSupport.notifyAllListeners(new PropertyChangeEvent(this, "BMI", oldBMI, getBMI()));
		// The write method of a counter sent one notification.
		// Why does this method and the next one send two notifications?
	}
	@Override
	public void setHeight(double newValue) {
		double oldHeight = getHeight();
		double oldBMI = getBMI();
		super.setHeight(newValue);
		propertyListenerSupport.notifyAllListeners(new PropertyChangeEvent(this, "Height", oldHeight, newValue));
		propertyListenerSupport.notifyAllListeners(new PropertyChangeEvent(this, "BMI", oldBMI, getBMI()));
		
	}	
	// This method header is defined in PropertyListenerRegisterer, which is our own interface 
	// that includes a standard header defined by the Bean framework
	// This registration method should be called by every observer
	// Since it is a standard method, ObjectEditore understands it
	// and calls it, and is thus notified by the write methods.
	// No need to call refresh any longer.
	public void addPropertyChangeListener(PropertyChangeListener listener) {
		propertyListenerSupport.add(listener);
		listener.propertyChange(new PropertyChangeEvent(this, "Weight", 0, getWeight()));
		listener.propertyChange(new PropertyChangeEvent(this, "Height", 0, getHeight()));
		listener.propertyChange(new PropertyChangeEvent(this, "BMI", 0, getBMI()));		
	}
		
}
