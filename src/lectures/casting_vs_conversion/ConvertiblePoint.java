package lectures.casting_vs_conversion;

import lectures.graphics.extra.Point;

public interface ConvertiblePoint extends Point {
	public ConvertiblePoint asCartesianPoint();
	public ConvertiblePoint asPolarPoint();
}
