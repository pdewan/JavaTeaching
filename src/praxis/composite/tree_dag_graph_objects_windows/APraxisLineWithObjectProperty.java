package praxis.composite.tree_dag_graph_objects_windows;

import lectures.composite.tree_dag_graph_objects_windows.DAGCartesianPlane;
import lectures.graphics.ACartesianPoint;
import lectures.graphics.Point;
import util.annotations.StructurePattern;
import util.annotations.StructurePatternNames;
import util.annotations.Visible;
import util.misc.ThreadSupport;
import bus.uigen.OEFrame;
@StructurePattern(StructurePatternNames.LINE_PATTERN) 

public class APraxisLineWithObjectProperty implements PraxisLineWithObjectProperty {
	int width, height;
	Point location;
	DAGCartesianPlane parent;
	public APraxisLineWithObjectProperty(
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
	public DAGCartesianPlane getGraph() {
		// comment this out
		return null;
		// uncomment this
//		return parent;
	}
	public void setGraph(DAGCartesianPlane aParent) {
		parent = aParent;
	}
//	public static void main(String args[]) {
//			PraxisLineWithObjectProperty line =  new APraxisLineWithObjectProperty(new ACartesianPoint(10, 10), 20, 20);
////			bus.uigen.ObjectEditor.edit (line);
//
//			OEFrame editor = bus.uigen.ObjectEditor.edit (line);
//			for (int i = 0; i < 10; i++) {
//				int newX = line.getLocation().getX() + 5;
//				line.setLocation(new ACartesianPoint(newX, line.getLocation().getY() ));
//				ThreadSupport.sleep(300);
//				editor.refresh();
//			}
//		}
	
	
}
