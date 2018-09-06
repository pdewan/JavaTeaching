package lectures.extra.oldgraphics;

import lectures.composite.objects_shapes.ACartesianPoint;
import lectures.composite.objects_shapes.Point;
import bus.uigen.ObjectEditor;

public class ALabel implements Label {
    int width, height;
    String text, imageFileName;
    Point location;
    public ALabel (
            int initX, int initY, int initWidth, int initHeight, 
            String initText, String theImageFile) {		
        location = new ACartesianPoint(initX, initY);
        width = initWidth;    height = initHeight;
        text = initText;          imageFileName = theImageFile;
     }
     public Point getLocation() {return location;}
     public void setLocation(Point newVal) {location = newVal;}
     public int getWidth() { return width;}
     public void setWidth(int newVal) {width = newVal;}
     public int getHeight() {return height;}
     public void setHeight(int newHeight) {height = newHeight;}
     public String getText() {return text;}
     public void setText(String newVal) {text = newVal;}
     public String getImageFileName() {return imageFileName;}
     public void setImageFileName(String newVal) {imageFileName = newVal;}
     public static void main (String[] args) {
    	 Label label = new ALabel(20, 30, 50, 60, "foo", "dn.gif");
    	 ObjectEditor.edit(label);
    	 label.setText("bar");
    	 //label.setImageFileName("shuttle.jpg");
     }
}
