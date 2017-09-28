package lectures.mvc.graphics;

import java.awt.Component;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import java.beans.PropertyChangeListener;

import javax.swing.JFrame;

import lectures.mvc.properties.AnObservablePlottedShuttle;
import lectures.mvc.properties.ObservablePlottedShuttle;
import bus.uigen.OEFrame;
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
	static final int CUSTOM_FRAME_WIDTH = 400;
	static final int CUSTOM_FRAME_HEIGHT = 300;
	static final int OE_FRAME_WIDTH = 400;
	static final int OE_FRAME_HEIGHT = 600;
	static final int INIT_SHUTTLE_X = 25;
	static final int INIT_SHUTTLE_Y = 50;

	static final int FINAL_SHUTTLE_X = 50;
	static final int FINAL_SHUTTLE_Y = 100;
	
	public static void composeShuttleMVC(ObservablePlottedShuttle aPlottedShuttle) {
		PropertyChangeListener view = new APlottedShuttleView(aPlottedShuttle);
		aPlottedShuttle.addPropertyChangeListener(view);	
		// This time we create two controllers also
		// They will listener to events from the view, so they need the views in their constructors
		MouseListener aMouseController = new APlottedShuttleMouseController(aPlottedShuttle, (Component) view);
		KeyListener aKeyController = new APlottedShuttleKeyController(aPlottedShuttle, (Component) view);
		JFrame aFrame = new JFrame("Plotted Shuttle");
		aFrame.add((Component) view);
		aFrame.setSize(CUSTOM_FRAME_WIDTH, CUSTOM_FRAME_HEIGHT);
		aFrame.setVisible(true);
	}
	public static void main(String[] args) {		
		ObservablePlottedShuttle aPlottedShuttle = new AnObservablePlottedShuttle(INIT_SHUTTLE_X, INIT_SHUTTLE_Y);		
		composeShuttleMVC(aPlottedShuttle);
//		PropertyChangeListener view = new APlottedShuttleView(aPlottedShuttle);
//		aPlottedShuttle.addPropertyChangeListener(view);	
		/*
		This time we create two controllers also
		They will listener to events from the view, so they need the views in their constructors
		*/
//		MouseListener aMouseController = new APlottedShuttleMouseController(aPlottedShuttle, (Component) view);
//		KeyListener aKeyController = new APlottedShuttleKeyController(aPlottedShuttle, (Component) view);
//		JFrame aFrame = new JFrame("Plotted Shuttle");
//		aFrame.add((Component) view);
//		aFrame.setSize(300, 300);
//		aFrame.setVisible(true);
		OEFrame anOEFrame = ObjectEditor.edit(aPlottedShuttle);	
		anOEFrame.setSize(OE_FRAME_WIDTH, OE_FRAME_HEIGHT);
		aPlottedShuttle.setShuttleX(FINAL_SHUTTLE_X);
		aPlottedShuttle.setShuttleY(FINAL_SHUTTLE_Y);
	}
	// Think what each controller must do 
	// Go to the code of the two controllers and see the actual code
}
