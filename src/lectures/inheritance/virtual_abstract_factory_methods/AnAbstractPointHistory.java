package lectures.inheritance.virtual_abstract_factory_methods;

import lectures.arrays.collections_kinds.extra.PointHistory;
import lectures.graphics.extra.Point;

public abstract class AnAbstractPointHistory implements PointHistory{
	public final int MAX_SIZE = 50;
	protected Point[] contents = new Point[MAX_SIZE];
	protected int size = 0;
	public int size() {
		return size;
	}	
	public Point elementAt (int index) {
		return contents[index];
	}
	protected boolean isFull() {
		return size == MAX_SIZE;

	}
	protected abstract Point createPoint(int x, int y);
	public void addElement(int x, int y) {
		if (isFull())
			System.out.println("Adding item to a full history");
		else {
			Point p = createPoint(x, y);
			contents[size] = p;
			size++;
		}
	}    
}
