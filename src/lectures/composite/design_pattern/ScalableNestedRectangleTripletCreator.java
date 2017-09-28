package lectures.composite.design_pattern;

import bus.uigen.ObjectEditor;

public class ScalableNestedRectangleTripletCreator extends ScalableNestedRectanglePairCreator {
	public static ScalableNestedShapeTriplet createTriplet () {
		ScalableNestedShapePair pair = createPair();
		return new AScalableNestedShapeTriplet(pair, toOuter(pair.getOuter()) );
	}
	public static void main (String[] args) {
		ObjectEditor.edit(createTriplet());
	}
}
