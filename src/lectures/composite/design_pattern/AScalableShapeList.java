package lectures.composite.design_pattern;

import java.util.ArrayList;
import java.util.List;

public class AScalableShapeList implements ScalableShapeList{
	List list = new ArrayList();	
	public void scale(double fraction) {
		for (int index=0; index < list.size(); index++) {
			((LeafShape) (list.get(index))).scale(fraction);
		}		
	}
	public void add(LeafShape aLeafShape) {
		list.add(aLeafShape);
	}	
	public int size() {
		return list.size();
	}
	public LeafShape get(int index) {
		return (LeafShape) list.get(index);
	}
}
