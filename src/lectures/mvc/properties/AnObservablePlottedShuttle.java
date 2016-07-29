package lectures.mvc.properties;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import util.annotations.StructurePattern;
import util.annotations.StructurePatternNames;
import lectures.composite.objects_shapes.APlottedShuttle;
import bus.uigen.ObjectEditor;
@StructurePattern(StructurePatternNames.BEAN_PATTERN)
public class AnObservablePlottedShuttle extends APlottedShuttle implements ObservablePlottedShuttle {
	PropertyListenerSupport propertySupport = new APropertyListenerSupport();	
	public AnObservablePlottedShuttle(int anX, int aY) {
		super(anX, aY);
		cartesianPlane = new AnObservableCartesianPlane (
				AXES_LENGTH, ORIGIN_X, ORIGIN_Y);
		shuttleImage = new AnObservableImageWithHeight(SHUTTLE_IMAGE_FILE_NAME);
//		propertySupport = new APropertyListenerSupport();	
		setShuttleX(anX);
		setShuttleY(aY);
	}
	public void setShuttleX(int newVal) {
		int oldVal = getShuttleX();
		super.setShuttleX(newVal);
		if (propertySupport != null) //why this check? Can we change super class so this check is not made
		  propertySupport.notifyAllListeners(new PropertyChangeEvent(this, "ShuttleX", oldVal,
				newVal));
	}
	public void setShuttleY(int newVal) {
		int oldVal = getShuttleY();
		super.setShuttleY(newVal);
		if (propertySupport != null) //why this check?
		  propertySupport.notifyAllListeners(new PropertyChangeEvent(this, "ShuttleY", oldVal,
				newVal));
	}
	public void addPropertyChangeListener(PropertyChangeListener listener) {
		propertySupport.add(listener);		
	}
	public static void main (String[] args) {
		ObservablePlottedShuttle shuttleLocation = new AnObservablePlottedShuttle(50, 100);	
		ObjectEditor.edit(shuttleLocation);
		shuttleLocation.setShuttleY(50);
		shuttleLocation.setShuttleX(100);
	}

}
