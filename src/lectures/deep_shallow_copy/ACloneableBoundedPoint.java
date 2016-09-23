package lectures.deep_shallow_copy;

import lectures.inheritance.is_a.ABoundedPoint;

public class ACloneableBoundedPoint extends ABoundedPoint implements CloneableBoundedPoint, Cloneable {	
	public ACloneableBoundedPoint(int initX, int initY,
			CloneablePoint theUpperLeftCorner, CloneablePoint theLowerRightCorner) {
		super(initX, initY, theUpperLeftCorner, theLowerRightCorner);
	}

	public Object clone() {
		try {
			return super.clone();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	public CloneableBoundedPoint deepCopy() {
		return  new ACloneableBoundedPoint (x, y, 
				(CloneablePoint) ((CloneablePoint) upperLeftCorner).clone(), 
				(CloneablePoint) ((CloneablePoint)lowerRightCorner).clone()); 
	}
}
