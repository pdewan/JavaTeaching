package lectures.inheritance.is_a;

import lectures.graphics.ACartesianPoint;
import lectures.inheritance.extra.MutablePoint;

public class AMutablePoint extends ACartesianPoint implements MutablePoint {
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
