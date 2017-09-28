package lectures.extra;


public class ACompositeScalableNester implements Scalable, ShapePair {
	Scalable inner;	
	Scalable outer;
	
	public ACompositeScalableNester(Scalable anOuter, Scalable anInner) {
		outer = anOuter;
		inner = anInner;
	}
	public void scale(int percentage){
		outer.scale(percentage);
		inner.scale(percentage);				
	}
	public Scalable getShape1() {
		return inner;
	}
	public Scalable getShape2() {
		return outer;
	}
	
	
}
