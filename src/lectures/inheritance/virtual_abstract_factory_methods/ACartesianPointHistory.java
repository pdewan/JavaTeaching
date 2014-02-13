package lectures.inheritance.virtual_abstract_factory_methods;

import lectures.graphics.ACartesianPoint;
import lectures.graphics.Point;

public class ACartesianPointHistory extends AnAbstractPointHistory{
	protected Point createPoint(int x, int y) {
		return new ACartesianPoint(x, y);
	}
}
