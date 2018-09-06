package lectures.generics_adapters.extra;

import lectures.generics_adapters.History;
import lectures.graphics.extra.Point;


public interface PointHistoryUsingGenerics extends History<Point> {
	public void addElement(int x, int y);

}
