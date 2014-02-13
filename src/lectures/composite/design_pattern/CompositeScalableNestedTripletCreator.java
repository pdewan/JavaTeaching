package lectures.composite.design_pattern;

import bus.uigen.ObjectEditor;

public class CompositeScalableNestedTripletCreator extends CompositeScalableNestedPairCreator {	
	public static CompositeShape createTriplet () {
		CompositeShape pair = createPair();
		return new ACompositeShape(pair, toOuter(pair.getOuter()) );
	}
	public static void main (String[] args) {
		ObjectEditor.edit(createTriplet());
	}
}
