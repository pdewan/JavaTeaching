package lectures.arrays.collections_kinds.extra;

import lectures.composite.objects_shapes.Point;

public interface PointHistory {
	public void addElement(int x, int y);
	public Point elementAt(int index); 
	public int size();
}
