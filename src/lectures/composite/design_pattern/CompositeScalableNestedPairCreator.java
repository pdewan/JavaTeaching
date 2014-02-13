package lectures.composite.design_pattern;

import bus.uigen.ObjectEditor;


public class CompositeScalableNestedPairCreator {
	public static final int RELATIVE_SIZE = 2;
	public static LeafShape innermost() {
		return new ALeafRectangle (0, 0, 20, 20);	
	}
	public static LeafShape toOuter (LeafShape anInner) {
		return new ALeafRectangle(anInner.getX(), anInner.getY(),
				anInner.getWidth()*RELATIVE_SIZE,
				anInner.getHeight()*RELATIVE_SIZE);
	}
	public static CompositeShape createPair () {
		LeafShape inner = innermost();	
		return new ACompositeShape (inner, toOuter(inner));
	}
	public static void main (String[] args) {

		ObjectEditor.edit(createPair());
	}
}
