package praxis.mvc.properties;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import praxis.composite.objects_shapes.APraxisCartesianPlane;
import lectures.composite.objects_shapes.ACartesianPlane;
import lectures.composite.objects_shapes.ALineWithObjectProperty;
import lectures.composite.objects_shapes.CartesianPlane;
import bus.uigen.ObjectEditor;
public class APraxisObservableCartesianPlane extends APraxisCartesianPlane implements PraxisObservableCartesianPlane {
    PraxisPropertyListenerSupport propertySupport = new APraxisPropertyListenerSupport();
    public APraxisObservableCartesianPlane (int theAxesLength, int theOriginX, int theOriginY ) {
        super(theAxesLength, theOriginX, theOriginY);
        yAxis = new APraxisObservableLine(toYAxisX(), toYAxisY(), 0, axesLength); 
        xLabel = new AnObservableStringShape ("X", toXLabelX(), toXLabelY());
        yLabel = new AnObservableStringShape ("Y", toYLabelX(), toYLabelY());
    } 

    public void setAxesLength(int newVal) {
    	int oldVal = getAxesLength();
    	super.setAxesLength(newVal);
    	changeDependentProperties();
    	propertySupport.notifyAllListeners(new PropertyChangeEvent(this, "axesLength", oldVal,
				newVal));
    }
    public void addPropertyChangeListener(PropertyChangeListener listener) {
		propertySupport.add(listener);
		
	}  	
}