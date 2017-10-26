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
	/*
	 * Study what this method does
	 */
	public APlottedShuttleKeyController (PlottedShuttle aPlottedShuttle, Component aShuttleComponent) {
		shuttleComponent = aShuttleComponent;
		plottedShuttle = aPlottedShuttle;
		shuttleComponent.addKeyListener(this);
	}
/*
 * Remember listener == observer
 * 
 * (T/F) APlottedShuttleKeyController is an observer of a widget.
 * 
 */
	
	// This key event our controller cares about
	// This is also a notification method
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
 * (T/F) When a key is pressed, a method in APlottedShuttleKeyController is called.
 * 
 * To answer the question above, look at keyTyped and if necessary,  again the
 * console
 * 
 * Click the left mouse button somewhere in the custom view and see what happens.
 * Press the x key somewhere in the custom view and see what happens.
 * Press the y key somewhere in the custom view and see what happens.
 *  
 * Look at the constructor.
 * 
 * Listener = Observer
 *  
 * Look at the method keyTyped
 *  
 * (T/F) APlottedShuttleKeyController calls methods in its model in response
 * to the typing of a key.
 *
 * keyTyped is a notification method
 * 
 * What is consistent with this example:
 * 
 * In graphics-based MVC, where the view is a widget(Component), user input causes:
 *  (a) The controller to call notification methods in the view.
 *  (b) The view (widget) to call notification methods in the controller.
 *  (c) The controller to call write methods in the model.
 *  (d) The controller to call read methods in the model.
 *  (e) The model to call notification methods in the controller.
 *  (f) The model to call notification methods in the view.
 *  (g) None of the above
 *  

 *  
 *  
 * 
 *  
 * 
 * Next class APlottedShuttleMouseController
 */
}
