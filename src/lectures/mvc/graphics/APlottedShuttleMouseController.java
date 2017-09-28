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
		// Instead of making the controller an action listener (observer)
		// we make it a listener of mouse events
		shuttleComponent.addMouseListener(this);
	}
	// This mouse event we care about
	public void mouseClicked(MouseEvent e) {
		plottedShuttle.setShuttleX(0);
		plottedShuttle.setShuttleY(0);		
	}    
	public void mouseEntered(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {}
	public void mousePressed(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}	
}
