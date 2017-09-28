package lectures.composite.design_pattern;

import util.annotations.StructurePattern;
import util.annotations.StructurePatternNames;

@StructurePattern(StructurePatternNames.BEAN_PATTERN)
public class AScalableNestedShapeTriplet implements ScalableNestedShapeTriplet  {
	ScalableNestedShapePair inner;	
	ScalableShape outer;
	
//	public AScalableNestedShapeTriplet(ScalableShape theInnerMost) {
//		inner = new AScalableNestedShapePair(theInnerMost);
//		outer = new AScalableShape(inner.getOuter().getX(), inner.getOuter().getY(),
//		              inner.getOuter().getWidth()*ScalableNestedShapePair.RELATIVE_SIZE,
//		              inner.getOuter().getHeight()*ScalableNestedShapePair.RELATIVE_SIZE);
//		
//	}
	public AScalableNestedShapeTriplet(ScalableNestedShapePair theInner, ScalableShape theOuter) {
		inner = theInner;
		outer = theOuter;
	}
	public void scale(int percentage){
		outer.scale(percentage);
		inner.scale(percentage);				
	}
	public ScalableNestedShapePair getInner() {
		return inner;
	}
	public ScalableShape getOuter() {
		return outer;
	}	
}
