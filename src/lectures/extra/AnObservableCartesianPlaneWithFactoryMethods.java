package lectures.extra;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import lectures.composite.objects_shapes.CartesianPlane;
import lectures.inheritance.virtual_abstract_factory_methods.ACartesianPlaneWithFactoryMethod;
import lectures.mvc.properties.APropertyListenerSupport;
import lectures.mvc.properties.AnObservableLine;
import lectures.mvc.properties.AnObservableStringShape;
import lectures.mvc.properties.ObservableCartesianPlane;
import lectures.mvc.properties.ObservableLine;
import lectures.mvc.properties.ObservableStringShape;
import lectures.mvc.properties.PropertyListenerSupport;
import bus.uigen.ObjectEditor;

public class AnObservableCartesianPlaneWithFactoryMethods 
                extends ACartesianPlaneWithFactoryMethod 
                implements ObservableCartesianPlane {
	PropertyListenerSupport propertySupport = new APropertyListenerSupport();
    public AnObservableCartesianPlaneWithFactoryMethods (int theAxesLength, int theOriginX, int theOriginY ) {
        super(theAxesLength, theOriginX, theOriginY);        
    } 
    
    protected ObservableLine createLine(int anX, int aY, int aWidth, int aHeight) {
    	return new AnObservableLine(anX, aY, aWidth, aHeight);
    }
    
    protected ObservableStringShape createStringShape(String aString, int anX,  int aY) {
    	return new AnObservableStringShape(aString, anX, aY); 
    }

    public void setAxesLength(int newVal) {
    	int oldVal = getAxesLength();
    	super.setAxesLength(newVal);
    	propertySupport.notifyAllListeners(new PropertyChangeEvent(this, "axesLength", oldVal,
				newVal));
    }
    public void addPropertyChangeListener(PropertyChangeListener listener) {
		propertySupport.add(listener);
		
	}
    public static void main (String[] args) {
    	CartesianPlane plane = new AnObservableCartesianPlaneWithFactoryMethods(200, 125, 125);
    	ObjectEditor.edit(plane);
    }	
}