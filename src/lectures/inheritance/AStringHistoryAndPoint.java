package lectures.inheritance;

import lectures.arrays.collections_implementation.AStringHistory;
import lectures.graphics.Point;
/*
 * nonsense class to defend Java type checking rules
 * 
 */
public class AStringHistoryAndPoint extends AStringHistory implements Point {

	@Override
	public int getX() {
		return 0;
	}

	@Override
	public int getY() {
		return 0;
	}

	@Override
	public double getAngle() {
		return 0;
	}

	@Override
	public double getRadius() {
		return 0;
	}

}
