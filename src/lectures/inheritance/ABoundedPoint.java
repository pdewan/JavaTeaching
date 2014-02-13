package lectures.inheritance;

import util.annotations.Explanation;
import bus.uigen.ObjectEditor;
@Explanation("Has max and min values.")
public class ABoundedPoint extends AMutablePoint implements BoundedPoint {
	protected MutablePoint upperLeftCorner, lowerRightCorner;
	public ABoundedPoint(int initX, int initY, MutablePoint anUpperLeftCorner,
			MutablePoint aLowerRightCorner) {
		super(initX, initY);
		upperLeftCorner = anUpperLeftCorner;
		lowerRightCorner = aLowerRightCorner;
		fixX();
		fixY();				
	}
	void fixX() {
		x = Math.max(x, upperLeftCorner.getX());
		x = Math.min(x, lowerRightCorner.getX());		
	}
	void fixY() {
		y = Math.max(y, upperLeftCorner.getY());
		y = Math.min(y, lowerRightCorner.getY());		
	}
	public void setX(int newVal) {
		super.setX(newVal);
		fixX();
	}
	public void setY(int newVal) {
		super.setY(newVal);
		fixY();
	}
	public MutablePoint getUpperLeftCorner() {
		return upperLeftCorner;
	}	
	public MutablePoint getLowerRightCorner() {
		return lowerRightCorner;
	}
	public void setUpperLeftCorner(MutablePoint newVal) {
		upperLeftCorner = newVal;
		fixX(); 
		fixY();
	}	
	public void setLowerRightCorner(MutablePoint newVal) {
		lowerRightCorner = newVal;
		fixX();
		fixY();
	}
	
	public static void main(String[] args) {
		ObjectEditor.edit(new ABoundedPoint(25, 25, 
				new AMutablePoint(0,0), new AMutablePoint(100, 100)));
	}
}
