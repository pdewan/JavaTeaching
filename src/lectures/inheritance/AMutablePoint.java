package lectures.inheritance;

import lectures.graphics.ACartesianPoint;

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
