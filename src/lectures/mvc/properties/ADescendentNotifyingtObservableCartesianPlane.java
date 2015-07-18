package lectures.mvc.properties;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import lectures.composite.objects_shapes.ACartesianPlane;
import lectures.composite.objects_shapes.CartesianPlane;
import bus.uigen.ObjectEditor;
public class ADescendentNotifyingtObservableCartesianPlane extends ACartesianPlane implements ObservableCartesianPlane {
    PropertyListenerSupport propertySupport = new APropertyListenerSupport();
    public ADescendentNotifyingtObservableCartesianPlane (int theAxesLength, int theOriginX, int theOriginY ) {
        super(theAxesLength, theOriginX, theOriginY);        
    } 
    public void setAxesLength(int newVal) {
    	int oldVal = getAxesLength();
    	super.setAxesLength(newVal);
    	int oldXAxisX = 0;
    	int newXAxisX = 0;
    	propertySupport.notifyAllListeners(new PropertyChangeEvent(this, "axesLength", oldVal,
				newVal));
        propertySupport. notifyAllListeners(new PropertyChangeEvent(xAxis, "X", oldXAxisX, newXAxisX));
       // ...
    }
    public void addPropertyChangeListener(PropertyChangeListener listener) {
		propertySupport.add(listener);
		
	}
    public static void main (String[] args) {
    	CartesianPlane plane = new ADescendentNotifyingtObservableCartesianPlane(200, 125, 125);
    	ObjectEditor.edit(plane);
    }	
}