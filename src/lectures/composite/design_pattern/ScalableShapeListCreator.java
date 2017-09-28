package lectures.composite.design_pattern;

import bus.uigen.ObjectEditor;


public class ScalableShapeListCreator extends CompositeScalableNestedPairCreator {	
	public static ScalableShapeList createShapeList (int numShapes){
		ScalableShapeList shapeList = new AScalableShapeList();
		LeafShape curShape = innermost();
		for (int curElementNum = 0; curElementNum < numShapes; curElementNum ++) {
			shapeList.add(curShape);
			curShape = toOuter(curShape);			
		}
		return shapeList;
	}	
	public static void main (String[] args) {
		ObjectEditor.edit(createShapeList(3));
	}
}
