package lectures.generics_adapters;

import lectures.graphics.ACartesianPoint;
import lectures.graphics.Point;

public class APointHistoryUsingGenerics extends AHistory<Point> implements lectures.arrays.collections_kinds.PointHistory{
	public void addElement(int x, int y) {
		addElement(new ACartesianPoint(x,y));		
	} 
}
