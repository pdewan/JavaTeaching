package lectures.inheritance.virtual_abstract_factory_methods;

import lectures.graphics.extra.APolarPoint;
import lectures.graphics.extra.Point;

public class APolarPointHistory extends AnAbstractPointHistory{
	protected Point createPoint(int x, int y) {
		return new APolarPoint(x, y);
	}

}
