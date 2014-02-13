package lectures.extra;

import java.awt.Component;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class AFancyCartesianPlaneView implements PropertyChangeListener  {
	Component drawingComponent;
	public AFancyCartesianPlaneView(Component theDrawingComponent) {
		drawingComponent = theDrawingComponent;
	}
	public void propertyChange(PropertyChangeEvent evt) {
		drawingComponent.repaint(); // causes paint to be called
	}

}
