package lectures.mvc.properties;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import lectures.composite.objects_shapes.ACartesianPlane;
import lectures.composite.objects_shapes.CartesianPlane;
import lectures.mvc.properties.atomic.APropertyListenerSupport;
import bus.uigen.ObjectEditor;
// HOW NOT TO CREATE COMPOSITE OBSERVABLES
public class AnInefficientObservableCartesianPlane extends ACartesianPlane implements ObservableCartesianPlane {
    PropertyListenerSupport propertySupport = new APropertyListenerSupport();
    public AnInefficientObservableCartesianPlane (int theAxesLength, int theOriginX, int theOriginY ) {
        super(theAxesLength, theOriginX, theOriginY);
        // Not creating observable Object components
    } 
    public void setAxesLength(int newVal) {
    	int oldVal = getAxesLength();
    	super.setAxesLength(newVal);
    	propertySupport.notifyAllListeners(new PropertyChangeEvent(this, "axesLength", oldVal,
				newVal));
    	// Instead, sending a new Object component on each change.
    	// Why is this an undesirable approach
        propertySupport. notifyAllListeners(new PropertyChangeEvent(this, "XAxis", xAxis, xAxis));
        propertySupport. notifyAllListeners(new PropertyChangeEvent(this, "YAxis", yAxis, yAxis));
        propertySupport.notifyAllListeners(new PropertyChangeEvent( this, "XLabel", xLabel, xLabel));	
        propertySupport.notifyAllListeners(new PropertyChangeEvent(
   this, "YLabel", yLabel, yLabel));
    }
    public void addPropertyChangeListener(PropertyChangeListener listener) {
		propertySupport.add(listener);
		
	}
    public static void main (String[] args) {
    	CartesianPlane plane = new AnInefficientObservableCartesianPlane(200, 125, 125);
    	ObjectEditor.edit(plane);
    }	
}