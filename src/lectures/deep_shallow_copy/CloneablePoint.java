package lectures.deep_shallow_copy;

import lectures.inheritance.extra.MutablePoint;

public interface CloneablePoint extends MutablePoint {
	public Object clone();
}
