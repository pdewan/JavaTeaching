package lectures.inheritance;

import lectures.graphics.Point;

public interface MutablePoint extends Point {
	void setX(int newVal);
	void setY(int newVal);
}
