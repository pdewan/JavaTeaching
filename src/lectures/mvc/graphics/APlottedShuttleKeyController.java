package lectures.mvc.graphics;

import java.awt.Component;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import lectures.composite.objects_shapes.PlottedShuttle;

public class APlottedShuttleKeyController 
	implements KeyListener { // Defined by Java
/*
 * APlottedShuttleKeyController IS-A
 *    (a) Component
 *    (b) KeyListener
 *    (c) MouseListener
 *    (d) None of the above
 */
	Component shuttleComponent;
	PlottedShuttle plottedShuttle;
	public static final int TARGET_X = 100;
	public static final int TARGET_Y = 100;	
	public APlottedShuttleKeyController (PlottedShuttle aPlottedShuttle, Component aShuttleComponent) {
		shuttleComponent = aShuttleComponent;
		plottedShuttle = aPlottedShuttle;
		shuttleComponent.addKeyListener(this);
	}
	
	// This key event our controller cares about
    public void keyTyped(KeyEvent e) {
    	char typedChar = e.getKeyChar();
    	System.out.println ("Key typed:" + typedChar);
    	switch (typedChar) {
    	case 'x' :
    		plottedShuttle.setShuttleX(TARGET_X);
    		break;
    	case 'y':
    		plottedShuttle.setShuttleY(TARGET_Y);
    		break;
    	}    
	}	
	// These it does not
	public void keyPressed(KeyEvent e) {}
	public void keyReleased(KeyEvent e) {}	
/*
 * Look at the Console output and if necessary, to again:
 *  
 * 
 * (T/F) When the left mouse button is pressed a method in APlottedShuttleKeyController
 * is called.
 * (T/F) when a key is pressed, a method in APlottedShuttleKeyController is called
 * 
 * To answer the question above, look at keyTyped and if necessary,  again:
 * 
 * Click the left mouse button somewhere in the custom view and see what happens.
 * Press the x key somewhere in the custom view and see what happens.
 * Press the y key somewhere in the custom view and see what happens.
 *  
 * Look at the constructor.
 * 
 * Listener = Observer
 * 
 * APlottedShuttleKeyController is an 
 *   (a) observer of an object of type Component
 *   (b) observable of an object of type Component
 *   (c) observer of an object of type ObservablePlottedShuttle
 *   (c) None of the above
 * 
 * Look at the method keyTyped
 *  
 * (T/F) APlottedShuttleKeyController calls methods in its model in response
 * to user input 	 
 * 
 * Next class APlottedShuttleMouseController
 */
}
