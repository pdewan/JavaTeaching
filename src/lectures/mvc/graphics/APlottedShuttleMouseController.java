package lectures.mvc.graphics;

import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import lectures.composite.objects_shapes.PlottedShuttle;

public class APlottedShuttleMouseController implements MouseListener {
	Component shuttleComponent;
	PlottedShuttle plottedShuttle;
	public APlottedShuttleMouseController (PlottedShuttle aPlottedShuttle, Component aShuttleComponent) {
		shuttleComponent = aShuttleComponent;
		plottedShuttle = aPlottedShuttle;
		/*
		 * Instead of making the controller an action listener (observer)
		 * we make it a listener of mouse events
		 */
		shuttleComponent.addMouseListener(this);
	}
	// This mouse event we care about
	public void mouseClicked(MouseEvent e) {
    	System.out.println ("Mouse clicked:");

		plottedShuttle.setShuttleX(0);
		plottedShuttle.setShuttleY(0);		
	}    
	public void mouseEntered(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {}
	public void mousePressed(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}	
}
/*
 * Look at the Console output and if necessary, to again:
 *  
 * 
 * (T/F) When the left mouse button is pressed a method in APlottedShuttleMouseController
 * is called.
 * (T/F) when a key is pressed, a method in APlottedShuttleMouseController is called
 * 
 * To answer the question above, look at mouseClicked and if necessary,  again:
 * 
 * Click the left mouse button somewhere in the custom view and see what happens.
 * Press the x key somewhere in the custom view and see what happens.
 * Press the y key somewhere in the custom view and see what happens.
 *  
 * Look at the constructor.
 * 
 * Listener = Observer
 * 
 * APlottedShuttleMouseController is an 
 *   (a) observer of an object of type Component
 *   (b) observable of an object of type Component
 *   (c) observer of an object of type ObservablePlottedShuttle
 *   (c) None of the above
 * 
 * Look at the method mouseClicked
 *  
 * (T/F) APlottedShuttleMoController calls methods in its model in response
 * to user input 	 
 * 
 * Return to PlottedShuttleComposer
 */
