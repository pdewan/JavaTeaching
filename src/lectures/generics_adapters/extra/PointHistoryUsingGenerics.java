package lectures.generics_adapters.extra;

import lectures.composite.objects_shapes.Point;
import lectures.generics_adapters.History;


public interface PointHistoryUsingGenerics extends History<Point> {
	public void addElement(int x, int y);

}
