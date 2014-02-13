package lectures.extra;

import lectures.graphics.ACartesianPoint;
import lectures.graphics.Point;
import bus.uigen.ObjectEditor;
public class AnotherShuttle   {
	 static final String IMAGE = "shuttle2.jpg";
	 static final String TEXT = "";
	 static final int WIDTH = 80;
	 static final int HEIGHT = 25;
     Point location;
     public AnotherShuttle (int initX, int initY) {		
        location = new ACartesianPoint(initX, initY);       
     }
     public AnotherShuttle () {		
         location = new ACartesianPoint(50, 50);       
      }
     
     public Point getLocation() {return location;}
     public void setLocation(Point newVal) {location = newVal;}
     public int getWidth() { return WIDTH;}
     public int getHeight() {return HEIGHT;}
     public String getText() {return TEXT;}
     public String getImageFileName() {return IMAGE;}
     
     public static void main (String args[]) {
    	 AnotherShuttle shuttle = new AnotherShuttle(50, 50);
    	 ObjectEditor.edit(shuttle);
     }
}
