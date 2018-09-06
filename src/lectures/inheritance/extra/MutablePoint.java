package lectures.inheritance.extra;

import lectures.composite.objects_shapes.Point;

public interface MutablePoint extends Point {
	void setX(int newVal);
	void setY(int newVal);
}
