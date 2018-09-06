package lectures.inheritance_vs_delegation.abstract_methods;

import lectures.arrays.collections_kinds.extra.PointHistory;
import lectures.graphics.extra.ACartesianPoint;
import lectures.graphics.extra.Point;

public class ADelegatingCartesianPointHistory implements DelegatingPointHistory{
	PointHistory delegate;
	public void addElement(int x, int y) {
		delegate.addElement(x, y);
	}
	public Point elementAt(int index) {
		return delegate.elementAt(index);
	}
	public int size() {
		return delegate.size();
	}
	public Point createPoint(int x, int y) {
		return new ACartesianPoint(x, y);
	}
}
