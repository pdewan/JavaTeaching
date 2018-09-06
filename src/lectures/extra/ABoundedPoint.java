package lectures.extra;

import lectures.composite.objects_shapes.ACartesianPoint;
import lectures.composite.objects_shapes.Point;
import util.annotations.Explanation;
import bus.uigen.ObjectEditor;
@Explanation("Has max and min values.")
public class ABoundedPoint extends ACartesianPoint implements Point {
	public ABoundedPoint(int initX, int initY, Point upperLeftCorner,
			Point lowerRightCorner) {
		super(initX, initY);
		x = Math.max(x, upperLeftCorner.getX());
		x = Math.min(x, lowerRightCorner.getX());
		y = Math.max(y, upperLeftCorner.getY());
		y = Math.min(y, lowerRightCorner.getY());		
	}
	
	public static void main(String[] args) {
		ObjectEditor.edit(new ABoundedPoint(25, 25, 
				new ACartesianPoint(0,0), new ACartesianPoint(100, 100)));
	}
}
