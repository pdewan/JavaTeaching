package lectures.extra;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.JPanel;

import lectures.composite.objects_shapes.CartesianPlane;
import lectures.composite.objects_shapes.ImageWithHeight;
import lectures.composite.objects_shapes.PlottedShuttle;
import lectures.graphics.Line;
import lectures.graphics.StringShape;

public class ALineJPanelAndView extends JPanel implements PropertyChangeListener {	
    BasicStroke dotted = new BasicStroke(
  	      1f, 
  	      BasicStroke.CAP_ROUND, 
  	      BasicStroke.JOIN_ROUND, 
  	      1f, 
  	      new float[] {2f}, 
  	      0f);
	Line line;	
	public ALineJPanelAndView(Line aLine) {
		line = aLine;
	}
	public void propertyChange(PropertyChangeEvent evt) {
		repaint(); // causes paint to be called
	}	
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2 = (Graphics2D) g;
		g2.setStroke(dotted);
		g.setColor(Color.BLUE);		
		draw(g, line);
	}
	public  void draw(Graphics2D g, ImageWithHeight anImage) {
		Image img = Toolkit.getDefaultToolkit().getImage(anImage.getImageFileName());
		g.drawImage(img, anImage.getX(), anImage.getY(), this);		
	}
	
	public  void draw(Graphics2D g, PlottedShuttle aShuttleLocation) {
		draw(g, aShuttleLocation.getCartesianPlane());
		draw (g, aShuttleLocation.getShuttleImage());
	}
	
	
    public  void draw(Graphics g, CartesianPlane aCartesianPlane) {
    	draw(g, aCartesianPlane.getXAxis());
    	draw(g, aCartesianPlane.getYAxis());
    	draw(g, aCartesianPlane.getXLabel());
		draw(g, aCartesianPlane.getYLabel());	
	}	
	public  void draw(Graphics g, Line aLine) {
		g.drawLine(aLine.getX(), aLine.getY(), aLine.getX() + aLine.getWidth(), aLine.getY() + aLine.getHeight());		
	}
	public  void draw(Graphics g, StringShape aLabel) {
		String s = aLabel.getText();
		g.drawString(s, aLabel.getX(), aLabel.getY());		
	}	
}
