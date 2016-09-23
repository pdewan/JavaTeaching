package lectures.deep_shallow_copy;

import lectures.inheritance.is_a.AMutablePoint;

public class ACloneablePoint extends AMutablePoint implements CloneablePoint, Cloneable {
	public ACloneablePoint(int theX, int theY) {
		super(theX, theY);
	}
	public Object clone() {
		try {
			return super.clone();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
