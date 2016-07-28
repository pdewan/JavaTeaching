package lectures.mvc.graphics;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.beans.PropertyChangeListener;

import lectures.composite.objects_shapes.ImageWithHeight;
import lectures.mvc.properties.ObservableCartesianPlane;
import lectures.mvc.properties.ObservablePlottedShuttle;

public class APlottedShuttleView extends ACartesianPlaneView implements PropertyChangeListener {   
	ObservablePlottedShuttle plottedShuttle;	
	public APlottedShuttleView(ObservablePlottedShuttle aPlottedShuttle) {
		// can we get rid of the cast while still doing reuse?
		super((ObservableCartesianPlane) aPlottedShuttle.getCartesianPlane());
		plottedShuttle = aPlottedShuttle;
		setFocusable(true); // allow component to get keyboard focus
	}		
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2 = (Graphics2D) g;
		draw(g2, plottedShuttle.getShuttleImage());
	}
	public  void draw(Graphics2D g, ImageWithHeight anImage) {
		Image img = Toolkit.getDefaultToolkit().getImage(anImage.getImageFileName());
		g.drawImage(img, anImage.getX(), anImage.getY(), this);		
	}	
	
}
