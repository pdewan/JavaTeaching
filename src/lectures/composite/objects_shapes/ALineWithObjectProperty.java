package lectures.composite.objects_shapes;

import util.annotations.StructurePattern;
import util.annotations.StructurePatternNames;
import util.misc.ThreadSupport;
import bus.uigen.OEFrame;
import lectures.graphics.ACartesianPoint;
import lectures.graphics.ALine;
import lectures.graphics.Line;
import lectures.graphics.Point;
@StructurePattern(StructurePatternNames.LINE_PATTERN) 

public class ALineWithObjectProperty implements LineWithObjectProperty {
	int width, height;
	Point location;
	public ALineWithObjectProperty(
		Point initLocation, int initWidth, int initHeight) {
		location = initLocation;
		width = initWidth;
		height = initHeight;	
	}
	public Point getLocation() {return location;}
	public void setLocation(Point newVal) {location = newVal;}
	public int getWidth() {return width;}
	public void setWidth(int newVal) {width = newVal;}
	public int getHeight() {return height;}
	public void setHeight(int newHeight) {height = newHeight;}	
	public static void main(String args[]) {
			LineWithObjectProperty line =  new ALineWithObjectProperty(new ACartesianPoint(10, 10), 20, 20);
//			bus.uigen.ObjectEditor.edit (line);

			OEFrame editor = bus.uigen.ObjectEditor.edit (line);
			for (int i = 0; i < 10; i++) {
				int newX = line.getLocation().getX() + 5;
				line.setLocation(new ACartesianPoint(newX, line.getLocation().getY() ));
				ThreadSupport.sleep(300);
				editor.refresh();
			}
		}
	
}
