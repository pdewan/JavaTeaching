package lectures.composite.design_pattern;

import bus.uigen.ObjectEditor;

public class ScalableNestedRectanglePairCreator {
	public static final int RELATIVE_SIZE = 2;
	public static ScalableShape innermost() {
		return new AScalableRectangle (0, 0, 20, 20);	
	}
	public static ScalableShape toOuter (ScalableShape anInner) {
		return new AScalableRectangle(anInner.getX(), anInner.getY(),
				anInner.getWidth()*RELATIVE_SIZE,
				anInner.getHeight()*RELATIVE_SIZE);
	}
	public static ScalableNestedShapePair createPair () {
		ScalableShape inner = innermost();	
		return new AScalableNestedShapePair (inner, toOuter(inner));
	}
	public static void main (String[] args) {
		ObjectEditor.edit(createPair());
	}
}
