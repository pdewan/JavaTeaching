package praxis.mvc.properties;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import lectures.composite.objects_shapes.ACartesianPlane;
import lectures.composite.objects_shapes.CartesianPlane;
import bus.uigen.ObjectEditor;
public class APraxisObservableCartesianPlane extends ACartesianPlane implements PraxisObservableCartesianPlane {
//    Line xAxis;
//    Line yAxis;  
    PraxisPropertyListenerSupport propertySupport = new APraxisPropertyListenerSupport();
    public APraxisObservableCartesianPlane (int theAxesLength, int theOriginX, int theOriginY ) {
        super(theAxesLength, theOriginX, theOriginY);
        xAxis = new APraxisObservableLine(toXAxisX(), toXAxisY(), axesLength, 0);
        yAxis = new APraxisObservableLine(toYAxisX(), toYAxisY(), 0, axesLength); 
        xLabel = new AnObservableStringShape ("X", toXLabelX(), toXLabelY());
        yLabel = new AnObservableStringShape ("Y", toYLabelX(), toYLabelY());
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
    	CartesianPlane plane = new APraxisObservableCartesianPlane(200, 125, 125);
    	ObjectEditor.edit(plane);
    }	
}