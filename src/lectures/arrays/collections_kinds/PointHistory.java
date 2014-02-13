package lectures.arrays.collections_kinds;

import lectures.graphics.Point;

public interface PointHistory {
	public void addElement(int x, int y);
	public Point elementAt(int index); 
	public int size();
}
