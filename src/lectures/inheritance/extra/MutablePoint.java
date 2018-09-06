package lectures.inheritance.extra;

import lectures.graphics.extra.Point;

public interface MutablePoint extends Point {
	void setX(int newVal);
	void setY(int newVal);
}
