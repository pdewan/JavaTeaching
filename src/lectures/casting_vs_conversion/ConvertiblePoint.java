package lectures.casting_vs_conversion;

import lectures.composite.objects_shapes.Point;

public interface ConvertiblePoint extends Point {
	public ConvertiblePoint asCartesianPoint();
	public ConvertiblePoint asPolarPoint();
}
