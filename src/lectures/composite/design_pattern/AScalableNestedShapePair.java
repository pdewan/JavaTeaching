package lectures.composite.design_pattern;


public class AScalableNestedShapePair implements ScalableNestedShapePair  {
	ScalableShape inner;	
	ScalableShape outer;
	
//	public AScalableNestedShapePair(ScalableShape theInner) {
//		inner = theInner;
//		outer = new AScalableShape(inner.getX(), inner.getY(),
//		                               inner.getWidth()*RELATIVE_SIZE,
//		                               inner.getHeight()*RELATIVE_SIZE);
//	}	
	public AScalableNestedShapePair(ScalableShape theInner, ScalableShape theOuter) {
		inner = theInner;
		outer = theOuter;
	}	
	public ScalableShape getInner() {
		return inner;
	}
	public ScalableShape getOuter() {
		return outer;
	}
	@Override
	public void scale(double percentage) {
		inner.scale(percentage);
		outer.scale(percentage);		
	}	
}
