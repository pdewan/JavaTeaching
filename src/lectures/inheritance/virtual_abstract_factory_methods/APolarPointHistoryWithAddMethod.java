package lectures.inheritance.virtual_abstract_factory_methods;

import lectures.arrays.collections_kinds.extra.APointHistory;
import lectures.graphics.extra.APolarPoint;
import lectures.graphics.extra.Point;

public class APolarPointHistoryWithAddMethod extends APointHistory {
	public void addElement(int x, int y) {
		if (isFull())
			System.out.println("Adding item to a full history");
		else {
			Point p = new APolarPoint(x, y);
			contents[size] = p;
			size++;
		}
	}

}
