package lectures.mvc.graphics;

import java.awt.Component;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import lectures.composite.objects_shapes.PlottedShuttle;

public class APlottedShuttleKeyController 
	implements KeyListener { // Defined by Java
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
}
