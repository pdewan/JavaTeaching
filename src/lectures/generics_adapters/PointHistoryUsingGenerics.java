package lectures.generics_adapters;

import lectures.graphics.Point;


public interface PointHistoryUsingGenerics extends History<Point> {
	public void addElement(int x, int y);

}
