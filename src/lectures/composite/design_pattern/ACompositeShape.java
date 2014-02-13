package lectures.composite.design_pattern;

public class ACompositeShape implements CompositeShape {
	Scalable inner;
	LeafShape outer;
	public ACompositeShape(Scalable theInner, LeafShape theOuter) {
		inner = theInner;
		outer = theOuter;
	}
	public void scale(double fraction){
		outer.scale(fraction);
		inner.scale(fraction);			
	}
	public Scalable getInner() {
		return inner;
	}
	public LeafShape getOuter() {
		return outer;
	}	
}
