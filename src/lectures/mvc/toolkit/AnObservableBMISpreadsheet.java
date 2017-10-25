package lectures.mvc.toolkit;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import lectures.interfaces.ABMISpreadsheet;
import lectures.mvc.properties.ObservableBMISpreadsheet;
import lectures.mvc.properties.PropertyListenerSupport;
import lectures.mvc.properties.atomic.APropertyListenerSupport;
import util.annotations.ObserverRegisterer;
import util.annotations.ObserverTypes;
/*
 * Study this code for creating an observable BMI Spreadsheet. 
 *  
 */

public class AnObservableBMISpreadsheet extends ABMISpreadsheet implements ObservableBMISpreadsheet  {
	

    PropertyListenerSupport propertyListenerSupport = new APropertyListenerSupport();
	public AnObservableBMISpreadsheet() { }	
	public AnObservableBMISpreadsheet(
			double theInitialHeight, double theInitialWeight) {
		setHeight(theInitialHeight);
		setWeight(theInitialWeight);
	}
	
	// Write methods are overridden,  read methods are inherited without change
	@Override
	public void setWeight(double newValue) {		
		// record  variable values changed by the super call
		double oldWeight = getWeight();
		double oldBMI = getBMI();
		super.setWeight(newValue);	
		  propertyListenerSupport.notifyAllListeners(new PropertyChangeEvent(this, "Weight", oldWeight, newValue));
		  propertyListenerSupport.notifyAllListeners(new PropertyChangeEvent(this, "BMI", oldBMI, getBMI()));
		
	}
	@Override
	public void setHeight(double newValue) {
		double oldHeight = getHeight();
		double oldBMI = getBMI();
		super.setHeight(newValue);
		propertyListenerSupport.notifyAllListeners(new PropertyChangeEvent(this, "Height", oldHeight, newValue));
		propertyListenerSupport.notifyAllListeners(new PropertyChangeEvent(this, "BMI", oldBMI, getBMI()));
		
	}	
	
	public void addPropertyChangeListener(PropertyChangeListener listener) {
		propertyListenerSupport.add(listener);
		//inform observers about the initial value of the object
		listener.propertyChange(new PropertyChangeEvent(this, "Weight", 0, getWeight()));
		listener.propertyChange(new PropertyChangeEvent(this, "Height", 0, getHeight()));
		listener.propertyChange(new PropertyChangeEvent(this, "BMI", 0, getBMI()));		
	}
		
}
/*  
 *
 * Each write method in AnObservableBMISpreadsheet announces to the observers:
 *   (a) exactly one notification
 *   (b) at least one notification
 *   (c) no notification
 *  
 * (T/F) The registration method of AnObservableBMISpreadsheet notifies the 
 * registered observers.
 * 
 * An instances of AnObservableBMISpreadsheet informs its observes about:
 * (a) The initial values of its properties.
 * (b) Changes to the values of its properties.
 * (c) None of the above.
 *   
 *   Next class: MVCToolkitMain
 */
