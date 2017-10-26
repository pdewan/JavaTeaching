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
/*
 * APlottedShuttleMouseController IS-A
 *    (a) Component
 *    (b) KeyListener
 *    (c) MouseListener
 *    (d) None of the above
 */
	// This mouse event we care about
	// The mouse click notification method
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
 * (T/F) When a key is pressed, a method in APlottedShuttleMouseController is called
 * 
 * To answer the question above, look at mouseClicked and if necessary,  again:
 * 
 * Click the left mouse button somewhere in the custom view and see what happens.
 * Press the x key somewhere in the custom view and see what happens.
 * Press the y key somewhere in the custom view and see what happens.
 *  
 * (T/F) An instance of APlottedShuttleMouseController knows about, that is,
 * has a reference to an instance of APlottedKeyController.
 * 
 * (T/F) Controllers of the same model can be independent of each other.
 * 
 * Return to PlottedShuttleComposer
 */
