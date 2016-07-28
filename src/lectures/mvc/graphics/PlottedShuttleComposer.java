package lectures.mvc.graphics;

import java.awt.Component;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import java.beans.PropertyChangeListener;

import javax.swing.JFrame;

import lectures.mvc.properties.AnObservablePlottedShuttle;
import lectures.mvc.properties.ObservablePlottedShuttle;
import bus.uigen.ObjectEditor;
// WINWDOW-BASED CONTROLLER
// Again we will draw our own graphics. 
// We will also learn how to intercept raw key and mouse events by defining 
// two independent window based controllers.
// In addition, we will learn to subclass our custom graphics view from the previous exercise.
// To do so, we will work with a plotted shuttle instead of a Cartesian plane
// Run the program.
// Click the left mouse button somewhere in the custom view and see what happens.
// Press the x key somewhere in the custom view and see what happens.
// Press the y key somewhere in the custom view and see what happens.

public class PlottedShuttleComposer {
	public static void main(String[] args) {		
		ObservablePlottedShuttle aPlottedShuttle = new AnObservablePlottedShuttle(50, 100);		
		PropertyChangeListener view = new APlottedShuttleView(aPlottedShuttle);
		aPlottedShuttle.addPropertyChangeListener(view);	
		// This time we create two controllers also
		// They will listener to events from the view, so they need the views in their constructors
		MouseListener aMouseController = new APlottedShuttleMouseController(aPlottedShuttle, (Component) view);
		KeyListener aKeyController = new APlottedShuttleKeyController(aPlottedShuttle, (Component) view);
		JFrame aFrame = new JFrame("Plotted Shuttle");
		aFrame.add((Component) view);
		aFrame.setSize(300, 300);
		aFrame.setVisible(true);
		ObjectEditor.edit(aPlottedShuttle);	
		aPlottedShuttle.setShuttleY(100);
		aPlottedShuttle.setShuttleX(50);
	}
	// Think what each controller must do 
	// Go to the code of the two controllers and see the actual code
}
