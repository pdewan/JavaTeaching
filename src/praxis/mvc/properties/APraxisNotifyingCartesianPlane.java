package praxis.mvc.properties;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import util.annotations.Tags;
import lectures.composite.objects_shapes.ACartesianPlane;
@Tags({"Model", "Observable"})
public class APraxisNotifyingCartesianPlane extends ACartesianPlane implements PraxisObservableCartesianPlane {
    PraxisPropertyListenerSupport propertySupport = new APraxisPropertyListenerSupport();
    public APraxisNotifyingCartesianPlane (int theAxesLength, int theOriginX, int theOriginY ) {
        super(theAxesLength, theOriginX, theOriginY);
        xAxis = new APraxisNotifyingLine(toXAxisX(), toXAxisY(), axesLength, 0); 
        yAxis = new APraxisNotifyingLine(toYAxisX(), toYAxisY(), 0, axesLength); 
        xLabel = new APraxisNotifyingStringShape ("X", toXLabelX(), toXLabelY());
        yLabel = new APraxisNotifyingStringShape ("Y", toYLabelX(), toYLabelY());
    } 

    public void setAxesLength(int newVal) {
    	// put break point below
    	int oldVal = getAxesLength();
    	super.setAxesLength(newVal);
    	propertySupport.notifyAllListeners(new PropertyChangeEvent(this, "AxesLength", oldVal,
				newVal));
    }
	//register observer
    public void addPropertyChangeListener(PropertyChangeListener listener) {
		// put break here
		propertySupport.add(listener);
		
	}  	
}