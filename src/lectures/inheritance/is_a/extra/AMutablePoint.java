package lectures.inheritance.is_a.extra;

import lectures.composite.objects_shapes.ACartesianPoint;
import lectures.inheritance.extra.MutablePoint;

public class AMutablePoint extends ACartesianPoint implements MutablePoint {
	public AMutablePoint() {
		super(0, 0);
	}
	public AMutablePoint(int theX, int theY) {
		super(theX, theY);
	}	
	public void setX(int newVal) {
		x = newVal;
	}	
	public void setY(int newVal) {
		y = newVal;		
	}
}
