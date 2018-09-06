package lectures.arrays.collections_kinds.extra;

import lectures.graphics.extra.ACartesianPoint;
import lectures.graphics.extra.Point;
import bus.uigen.ObjectEditor;


public class APointHistory implements PointHistory /*, Serializable*/ {
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
	public void addElement(int x, int y) {
		if (isFull())
			System.out.println("Adding item to a full history");
		else {
			Point p = new ACartesianPoint(x, y);
			contents[size] = p;
			size++;
		}
	} 
	
	public static void main (String[] args) {
		ObjectEditor.edit(new APointHistory());
	}
}
