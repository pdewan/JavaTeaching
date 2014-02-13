package lectures.mvc.properties;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import lectures.interfaces.ABMISpreadsheet;
import util.annotations.ObserverRegisterer;
import util.annotations.ObserverTypes;

public class AnObservableBMISpreadsheet extends ABMISpreadsheet implements ObservableBMISpreadsheet  {
//	double height;
//	double weight;
    PropertyListenerSupport propertyListenerSupport = new APropertyListenerSupport();
	public AnObservableBMISpreadsheet() { }	
	public AnObservableBMISpreadsheet(
			double theInitialHeight, double theInitialWeight) {
		super(theInitialHeight, theInitialWeight);
	}
	
	public void setWeight(double newWeight) {
		double oldWeight = getWeight();
		double oldBMI = getBMI();
		super.setWeight(newWeight);
		if (propertyListenerSupport != null) {
		  propertyListenerSupport.notifyAllListeners(new PropertyChangeEvent(this, "Weight", oldWeight, newWeight));
		  propertyListenerSupport.notifyAllListeners(new PropertyChangeEvent(this, "BMI", oldBMI, getBMI()));
		}

	}	
//	public double getHeight() {
//		return height;
//	}
	public void setHeight(double newHeight) {
		double oldHeight = getHeight();
		double oldBMI = getBMI();
		super.setHeight(newHeight);
		if (propertyListenerSupport != null) {
		  propertyListenerSupport.notifyAllListeners(new PropertyChangeEvent(this, "Height", oldHeight, newHeight));
		  propertyListenerSupport.notifyAllListeners(new PropertyChangeEvent(this, "BMI", oldBMI, getBMI()));
		}
	}	
	
	@ObserverRegisterer(ObserverTypes.PROPERTY_LISTENER)
	public void addPropertyChangeListener(PropertyChangeListener listener) {
		propertyListenerSupport.add(listener);
		listener.propertyChange(new PropertyChangeEvent(this, "Weight", 0, getWeight()));
		listener.propertyChange(new PropertyChangeEvent(this, "Height", 0, getHeight()));
		listener.propertyChange(new PropertyChangeEvent(this, "BMI", 0, getBMI()));		
	}
		
}
