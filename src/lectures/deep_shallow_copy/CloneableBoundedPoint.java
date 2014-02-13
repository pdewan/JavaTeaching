package lectures.deep_shallow_copy;

import lectures.inheritance.BoundedPoint;

public interface CloneableBoundedPoint extends BoundedPoint {
	public Object clone();
	public CloneableBoundedPoint deepCopy();
}
