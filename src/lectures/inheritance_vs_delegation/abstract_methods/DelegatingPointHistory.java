package lectures.inheritance_vs_delegation.abstract_methods;

import lectures.arrays.collections_kinds.extra.PointHistory;
import lectures.composite.objects_shapes.Point;

public interface DelegatingPointHistory extends PointHistory {
	public Point createPoint(int x, int y);

}
