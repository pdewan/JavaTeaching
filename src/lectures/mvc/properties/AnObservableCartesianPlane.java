package lectures.mvc.properties;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import util.annotations.StructurePattern;
import util.annotations.StructurePatternNames;
import lectures.composite.objects_shapes.ACartesianPlane;
import lectures.composite.objects_shapes.CartesianPlane;
import lectures.mvc.properties.atomic.APropertyListenerSupport;
import lectures.mvc.properties.atomic.AnObservableLine;
import bus.uigen.ObjectEditor;
// PROPERTY-BASED NOTIFICATION IN COMPOSITE OBJECTS
// So far our observables had atomic properties
// How does the observable change when it has Object properties
@StructurePattern(StructurePatternNames.BEAN_PATTERN)
public class AnObservableCartesianPlane extends ACartesianPlane implements ObservableCartesianPlane {
 
    PropertyListenerSupport propertySupport = new APropertyListenerSupport();
    public AnObservableCartesianPlane (int theAxesLength, int theOriginX, int theOriginY ) {
        super(theAxesLength, theOriginX, theOriginY);
        // Need to make sure the object components are themselves observable
        xAxis = new AnObservableLine(toXAxisX(), toXAxisY(), axesLength, 0);
        yAxis = new AnObservableLine(toYAxisX(), toYAxisY(), 0, axesLength); 
        xLabel = new AnObservableStringShape ("X", toXLabelX(), toXLabelY());
        yLabel = new AnObservableStringShape ("Y", toYLabelX(), toYLabelY());
    } 
    // Overriding only the setAxesLength method, which changes an atomic property  
    @Override
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
    	CartesianPlane plane = new AnObservableCartesianPlane(200, 125, 125);
    	ObjectEditor.edit(plane);
    }	
}