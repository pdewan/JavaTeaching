package lectures.inheritance.virtual_abstract_factory_methods;

import lectures.composite.objects_shapes.Point;
import lectures.graphics.extra.APolarPoint;

public class APolarPointHistory extends AnAbstractPointHistory{
	protected Point createPoint(int x, int y) {
		return new APolarPoint(x, y);
	}

}
