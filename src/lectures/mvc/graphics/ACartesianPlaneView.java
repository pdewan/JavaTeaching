package lectures.mvc.graphics;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import lectures.composite.objects_shapes.CartesianPlane;
import lectures.graphics.Line;
import lectures.graphics.StringShape;
import lectures.mvc.properties.ObservableCartesianPlane;

public class ACartesianPlaneView 
	extends Component // inheriting the basic window behavior of being paintable and insertable in a parent container
	implements PropertyChangeListener {	
    // Some magic to draw a sotted line
	BasicStroke dotted = new BasicStroke(
  	      1f, 
  	      BasicStroke.CAP_ROUND, 
  	      BasicStroke.JOIN_ROUND, 
  	      1f, 
  	      new float[] {2f}, 
  	      0f);
	// Other views did not store models in instance variables, why do it here?
	ObservableCartesianPlane cartesianPlane;	
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

		/* put breakpoint here */
		repaint(); 
	}	
	@Override
	// Inherited method called by the paint thread	
	
	public void paint(Graphics g) {
		System.out.println(("Paint called by:" + Thread.currentThread()));
		/* Put break point below */
		super.paint(g); // do whatever the superclass does with the method, in case it does something essential
		// The graphics object is a pen on which you can do several operations		
		Graphics2D g2 = (Graphics2D) g;
		// which is really a Graphics2D object
		g2.setStroke(dotted); // you can set its stroke
		g.setColor(Color.BLUE);	 // its color	
		draw(g, cartesianPlane); // and of course you can ask it to draw
	}
	/*
	 Put a break point in paint and also at the call to repaint  and debug-run it.
	 Change the axes length
	 Resize the frame
	 How many times did the paint method get called?
	 How many times did the repaint call get executed?
	 What is at the bottom of the stack?
	 Is the call to main at the bottom of the stack?	
	 */

		
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
}
