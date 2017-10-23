package lectures.mvc.graphics;

import java.awt.Component;
import java.beans.PropertyChangeListener;

import javax.swing.JFrame;

import lectures.mvc.properties.ObservableStringShape;
import lectures.mvc.properties.atomic.ObservableLine;
import bus.uigen.ObjectEditor;
 
/*
 * GRAPHICS AND MVC
 *
 * We have creates using predefined widgets, which are windows with canned behavior.
 * Now we will use window directly to do implement custom graphics.
 * Run the program, change the AxesLength property in the ObjectEditor user-interface
 * and and see what happens to the custom view
 */
public class CartesianPlaneComposer {
	protected final static int FRAME_WIDTH = 300;
	protected final static int FRAME_HEIGHT = 300;
	public static void main(String[] args) {
		// As before we ceaate a model
		ObservableCartesianPlane cartesianPlane = 
				new AnObservableCartesianPlane
					(AnObservableCartesianPlane.INIT_AXES_LENGTH, 
					 AnObservableCartesianPlane.INIT_ORIGIN_X, 
					 AnObservableCartesianPlane.INIY_ORIGIN_Y);	
		/*
		 * As before we create a view, but this time we do not pass it it any window/widget
		 * to the view. The view itself is a window that our code converts to a widget
		 * It is a single window that shows the whole logical structure of our model,
		 * we do not create different windows for different parts of the logical structure		
		 * In the BMI example, multiple widgets displayed the same BMI property value.
		 * This is the dual situation where a single window displays multiple property values
		 */
		PropertyChangeListener view = new ACartesianPlaneView(cartesianPlane);
		// Make the view an observer of the root of the model logical structure
		cartesianPlane.addPropertyChangeListener(view);
		// Make it also an observer of chidren nodes it displays
		//Comment out the next line when asked
		((ObservableLine) cartesianPlane.getXAxis()).addPropertyChangeListener(view);
		((ObservableLine) cartesianPlane.getYAxis()).addPropertyChangeListener(view);
		((ObservableStringShape) cartesianPlane.getXLabel()).addPropertyChangeListener(view);
		((ObservableStringShape) cartesianPlane.getYLabel()).addPropertyChangeListener(view);
		// Nothing can be displayed unless it is in a top level view
		JFrame frame = new JFrame("Cartesian Plane");
		// so we add the graphics view to the top level frame
		frame.add((Component) view);
		frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		frame.setVisible(true);
		// A second view to show view synchronization
		ObjectEditor.edit(cartesianPlane);			
	}

/*
 * Run the program
 *  
 * Change the axes length in the OE Window
 * 
 * (T/F) Changes made in the OE window are reflected in the custom window.
 * 
 * Go to ACartesianPlaneView and answer the questions there.
 * 
 * (T/F) CartesianPlaneComposer registers an  instances of ACartesianPlaneView
 *  with the model(s) of the view by calling addPropertyChangeListener() method an in it.
 * 
 * Repeated question
 * A view displaying the entire logical structure of an object, O, should be registered
 * with:
 * 
 * (a) all nodes in the logical structure that are observables
 * (b) only the root node in the logical structure.
 * 
 * ACartesianPlaneView displays:
 * (a) a single node (property) in the logical structure of its model.
 * (b) multiple nodes (properties) in the logical structure of its model.
 * 
 * (T/F) A property of ObservableCartesianPlane is displayed in multiple widgets
 * (instances of Component)
 * 
 * (T/F) Multiple properties of ObservableCartesianPlane are displayed in a 
 * single widget (instances of Component)
 * 
 * Look at the console output:
 * 
 * (T/F) Each call to repaint() is followed by a call to paint();
 * 
 * Resize the custom UI window
 * 
 * Look again at the console output
 * 
 * (T/F) Each call to paint() is preceded by a call to repaint()
 * 
 * The paint() method is called in a component:
 * (a) The repaint() method is called in it.
 * (b) when the frame containing the component is resized.
 * (c) None of the above
 * 
 * 
 * 
 * Set a break point in paint() and Debug-Run the command and resize the custom
 * UI window.
 *
 * What is at the bottom of the stack?
 * Is the call to main at the bottom of the stack?
 * 
 * Next class: PlottedShuttleComposer	
 */
}
