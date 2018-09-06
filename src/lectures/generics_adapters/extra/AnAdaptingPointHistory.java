package lectures.generics_adapters.extra;
import lectures.arrays.collections_kinds.extra.PointHistory;
import lectures.composite.objects_shapes.Point;
import lectures.generics_adapters.AHistory;
import lectures.generics_adapters.History;
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
