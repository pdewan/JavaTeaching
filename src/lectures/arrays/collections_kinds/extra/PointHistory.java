package lectures.arrays.collections_kinds.extra;

import lectures.graphics.extra.Point;

public interface PointHistory {
	public void addElement(int x, int y);
	public Point elementAt(int index); 
	public int size();
}
