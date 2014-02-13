package lectures.generics_adapters;
import lectures.arrays.collections_kinds.PointHistory;
import lectures.graphics.Point;
import lectures.static_state.ACartesianPointComputingMidPoint;
public class AnAdaptingPointHistory implements PointHistory {
	History<Point> contents = new AHistory();	
	public void addElement(int x, int y) {
		contents.addElement(new ACartesianPointComputingMidPoint(x,y));		
	}	
	public Point elementAt(int index) {		
		return contents.elementAt(index);
	}
	public int size() {
		return contents.size();
	} 
}
