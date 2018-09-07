package lectures.inheritance.extra;

import lectures.composite.objects_shapes.Point;
import lectures.inheritance.ABaseStringHistory;
/*
 * nonsense class to defend Java type checking rules
 * 
 */
public class AStringHistoryAndPoint extends ABaseStringHistory implements Point {

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
