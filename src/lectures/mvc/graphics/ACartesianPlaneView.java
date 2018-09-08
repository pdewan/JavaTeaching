package lectures.mvc.graphics;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import lectures.composite.objects_shapes.CartesianPlane;
import lectures.graphics.extra.Line;
import lectures.graphics.extra.StringShape;

public class ACartesianPlaneView 
   /*
    * inheriting the basic window behavior of being paintable and insertable in a 
    * parent container
    */
	extends Component 
	implements PropertyChangeListener {	
/*
 *    
 *  ACartesianPlaneView IS-A:
 *     (a) JFrame
 *     (b) Component
 *     (c) None of the above
 *     
 *  (T/F) ACartesianPlaneView IS-A PropertyChangeListener	
 */
    // Some magic to draw a dotted line
	BasicStroke dotted = new BasicStroke(
  	      1f, 
  	      BasicStroke.CAP_ROUND, 
  	      BasicStroke.JOIN_ROUND, 
  	      1f, 
  	      new float[] {2f}, 
  	      0f);
	// Other views did not store models in instance variables, why do it here?
	ObservableCartesianPlane cartesianPlane;
	
	/*
	 * ACartesianPlaneView HAS-A (has an instance variable of type/supertype):
	 *    (a) JFrame
	 *    (b) Component
	 *    (d) None of the above
	 *  
	 */
	public ACartesianPlaneView(ObservableCartesianPlane aCartesianPlane) {
		cartesianPlane = aCartesianPlane;

	}
	// The actual notification method does not do any output
	public void propertyChange(PropertyChangeEvent evt) {

		/*
		 Causes paint to be called.
		 Enqueues an event for Java asking it to call paint when its "painting thread"
		 is next ready to process events.
		 When we study threads, we will understand what that means.
		 */
		System.out.println(("Repaint called by:" + Thread.currentThread()));

		/* put breakpoint here when asked */
		repaint(); 
	}	
	@Override
	// Inherited method called by the paint thread	
	
	public void paint(Graphics g) {
		System.out.println(("Paint called by:" + Thread.currentThread()));
		super.paint(g); // do whatever the superclass does with the method, 
		// in case it does something essential
		// The graphics object is a pen on which you can do several operations		
		Graphics2D g2 = (Graphics2D) g;
		// which is really a Graphics2D object
		g2.setStroke(dotted); // you can set its stroke
		g.setColor(Color.BLUE);	 // its color	
		draw(g, cartesianPlane); // and of course you can ask it to draw
	}
	

		
    public  void draw(Graphics g, CartesianPlane aCartesianPlane) {
    	// draw the different parts of the plane
    	draw(g, aCartesianPlane.getXAxis());
    	draw(g, aCartesianPlane.getYAxis());
    	draw(g, aCartesianPlane.getXLabel());
		draw(g, aCartesianPlane.getYLabel());	
	}	
	public  void draw(Graphics g, Line aLine) {
		// Hover over drawLine in case you do not understand what it does
		g.drawLine(aLine.getX(), aLine.getY(), aLine.getX() + aLine.getWidth(), aLine.getY() + aLine.getHeight());		
	}
	
	public void draw(Graphics g, StringShape aLabel) {
		String s = aLabel.getText();
		g.drawString(s, aLabel.getX(), aLabel.getY());		
	}
/*
 * (ACartesianPlaneView overrides a method called:
 *     paint()
 *     repaint()
 *     None of the above
 * 
 * propertyChange() in ACartesianPlaneView calls:
 *    (a) repaint()
 *    (b) paint()
 *    (c) None of the above
 * 
 *  The method drawLine() is invoked on an object of type:
 *        (a) Component
 *        (b) JFrame
 *        (c) Graphics 
 *        
 * (T/F) ACartesianPlaneView instantiates an object of type Graphics
 *        
 * (T/F) ACartesianPlaneView registers its instances with its model(s) by calling 
 * addPropertyChangeListener() method an in the model(s).
 *
 * Return to CartesianPlaneComposer
 */
	
}
