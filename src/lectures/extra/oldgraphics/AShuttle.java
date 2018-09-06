package lectures.extra.oldgraphics;
import lectures.graphics.extra.ACartesianPoint;
import lectures.graphics.extra.Point;
import bus.uigen.ObjectEditor;
//@StructurePattern(StructurePatternNames.LABEL_PATTERN)
public class AShuttle implements ShuttleImage {
	 public static final String IMAGE = "shuttle2.jpg";
	 public static final String TEXT = "";
	 public static final int WIDTH = 80;
	 public static final int HEIGHT = 25;
     Point location;
     public AShuttle (int initX, int initY) {		
        location = new ACartesianPoint(initX, initY);       
     }
     public AShuttle () {		
         location = new ACartesianPoint(50, 50);       
      }     
     public Point getLocation() {return location;}
     public void setLocation(Point newVal) {location = newVal;}
     public int getWidth() { return WIDTH;}
     public int getHeight() {return HEIGHT;}
     //public String getText() {return TEXT;}
     public String getImageFileName() {return IMAGE;}     
     public static void main (String args[]) {
    	 ShuttleImage shuttle = new AShuttle(50, 50);
    	 ObjectEditor.edit(shuttle);
     }
}
