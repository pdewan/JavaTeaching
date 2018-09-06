package lectures.inheritance.virtual_abstract_factory_methods;

import lectures.arrays.collections_kinds.extra.PointHistory;
import lectures.extra.ACartesianPointHistoryWithDynamicallyDispatchedMethod;
import lectures.graphics.extra.ACartesianPoint;
import lectures.graphics.extra.Point;

public class APolarPointHistoryWithDynamicallyDispatchedMethod extends ACartesianPointHistoryWithDynamicallyDispatchedMethod {
	protected Point createPoint(int x, int y) {
		return new ACartesianPoint(x, y);
	}
	
	public static void main (String[] args) {
		PointHistory pointHistory = new APolarPointHistoryWithDynamicallyDispatchedMethod();
		pointHistory.addElement(50, 100);
	}
}
