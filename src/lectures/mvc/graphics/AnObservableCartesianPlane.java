package lectures.mvc.graphics;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import util.annotations.StructurePattern;
import util.annotations.StructurePatternNames;
import lectures.composite.objects_shapes.ACartesianPlane;
import lectures.composite.objects_shapes.CartesianPlane;
import lectures.mvc.properties.AnObservableStringShape;
import lectures.mvc.properties.PropertyListenerSupport;
import lectures.mvc.properties.atomic.APropertyListenerSupport;
import lectures.mvc.properties.atomic.AnObservableLine;
import bus.uigen.ObjectEditor;

/**
 * So far our observables had non Bean properties
 * Some of the properties of this observable are themselves observable beans
 */
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
/*
 * AnObervableCartesianPlane sends notifications for changes to its:
 *   (a) AxesLength property
 *   (b) XAxis property
 *   (b) the X property of the object assigned to its XAxis property.
 *   (c) None of the above
 *   
 * (T/F) A model needs to send  notifications for editable properties in those 
 * nodes in its logical structure that are obervables.
 * 
 * An observer view displaying the entire logical structure of an observable
 * should be registered with:
 * 
 * (a) all nodes in the logical structure that are observables
 * (b) only the root node in the logical structure. 
 * 
 * We will revisit this question later if you cannot answer it right now.
 * 
 * Next Class: CartesianPlaneComposer
 */
    protected static final int INIT_AXES_LENGTH = 200;
    protected static final int INIT_ORIGIN_X = 125;
    protected static final int INIY_ORIGIN_Y = 125;
    public static void main (String[] args) {
    	CartesianPlane plane = 
    		new AnObservableCartesianPlane(INIT_AXES_LENGTH, INIT_ORIGIN_X, INIT_ORIGIN_Y);
    	ObjectEditor.edit(plane);
    }
/*
 * 
 */
}
 
