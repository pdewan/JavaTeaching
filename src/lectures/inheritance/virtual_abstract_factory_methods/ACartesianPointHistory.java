package lectures.inheritance.virtual_abstract_factory_methods;

import lectures.composite.objects_shapes.ACartesianPoint;
import lectures.composite.objects_shapes.Point;

public class ACartesianPointHistory extends AnAbstractPointHistory{
	protected Point createPoint(int x, int y) {
		return new ACartesianPoint(x, y);
	}
}
