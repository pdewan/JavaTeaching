package lectures.mvc.graphics;

import java.awt.Component;
import java.beans.PropertyChangeListener;

import javax.swing.JFrame;

import lectures.mvc.properties.AnObservableCartesianPlane;
import lectures.mvc.properties.ObservableCartesianPlane;
import lectures.mvc.properties.ObservableStringShape;
import lectures.mvc.properties.atomic.ObservableLine;
import bus.uigen.ObjectEditor;
// GRAPHICS AND MVC
// We have creates using predefined widgets, which are windows with canned behavior.
// Now we will use window directly to do implement custom graphics.
// Run the program, change the AxesLength property in the ObjectEditor user-interface
// and and see what happens to the custom view
public class CartesianPlaneComposer {
	public static void main(String[] args) {
		// As before we ceaate a model
		ObservableCartesianPlane cartesianPlane = new AnObservableCartesianPlane(50, 100, 100);	
		// As before we create a view, but this time we do not pass it it any window/widget
		// to the view. The view itself is a window that our code converts to a widget
		// It is a single window that shows the whole logical structure of our model,
		// we do not create different windows for different parts of the logical structure
		
		// In the BMI example, multiple widgets displayed the same BMI property value.
		// This is the dual situation where a single window displays multiple property values
		PropertyChangeListener view = new ACartesianPlaneView(cartesianPlane);
		// Make the view an observer of the root of the model logical structure
		cartesianPlane.addPropertyChangeListener(view);
		// Make it also an observer of chidren nodes it displays
		((ObservableLine) cartesianPlane.getXAxis()).addPropertyChangeListener(view);
		((ObservableLine) cartesianPlane.getYAxis()).addPropertyChangeListener(view);
		((ObservableStringShape) cartesianPlane.getXLabel()).addPropertyChangeListener(view);
		((ObservableStringShape) cartesianPlane.getYLabel()).addPropertyChangeListener(view);
		// Nothing can be displayed unless it is in a top level view
		JFrame frame = new JFrame("Cartesian Plane");
		// so we add the graphics view to the top level frame
		frame.add((Component) view);
		frame.setSize(300, 300);
		frame.setVisible(true);
		// A second view to show view synchronization
		ObjectEditor.edit(cartesianPlane);			
	}
	// Go to ACartsianPlaneView to see what is going on there
}
