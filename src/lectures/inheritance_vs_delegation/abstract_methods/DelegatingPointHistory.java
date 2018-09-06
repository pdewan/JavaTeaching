package lectures.inheritance_vs_delegation.abstract_methods;

import lectures.arrays.collections_kinds.extra.PointHistory;
import lectures.graphics.extra.Point;

public interface DelegatingPointHistory extends PointHistory {
	public Point createPoint(int x, int y);

}
