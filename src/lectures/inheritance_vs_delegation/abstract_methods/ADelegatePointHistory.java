package lectures.inheritance_vs_delegation.abstract_methods;

import lectures.arrays.collections_kinds.extra.PointHistory;
import lectures.graphics.extra.Point;

public class ADelegatePointHistory implements PointHistory {
	public final int MAX_SIZE = 50;
	protected Point[] contents = new Point[MAX_SIZE];
	protected int size = 0;
	DelegatingPointHistory delegator;
	public ADelegatePointHistory(DelegatingPointHistory theDelegator) {
		delegator = theDelegator;
	}
	public int size() {
		return size;
	}	
	public Point elementAt (int index) {
		return contents[index];
	}
	protected boolean isFull() {
		return size == MAX_SIZE;
	}
	public void addElement(int x, int y) {
		if (isFull())
			System.out.println("Adding item to a full history");
		else {
			Point p = delegator.createPoint(x, y);
			contents[size] = p;
			size++;
		}
	}    
}
