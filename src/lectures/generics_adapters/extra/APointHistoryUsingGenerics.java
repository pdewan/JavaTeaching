package lectures.generics_adapters.extra;

import lectures.composite.objects_shapes.ACartesianPoint;
import lectures.composite.objects_shapes.Point;
import lectures.generics_adapters.AHistory;

public class APointHistoryUsingGenerics extends AHistory<Point> implements lectures.arrays.collections_kinds.extra.PointHistory{
	public void addElement(int x, int y) {
		addElement(new ACartesianPoint(x,y));		
	} 
}
