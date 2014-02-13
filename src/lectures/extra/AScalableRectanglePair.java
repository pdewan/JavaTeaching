package lectures.extra;


public class AScalableRectanglePair implements ScalableRectanglePair  {
	ScalableRectangle inner;	
	ScalableRectangle outer;
	
	public AScalableRectanglePair(ScalableRectangle anOuter, ScalableRectangle anInner) {
		inner = anInner;
		outer = anOuter;
	}
	public void scale(int percentage){
		outer.scale(percentage);
		inner.scale(percentage);				
	}
	public ScalableRectangle getRectangle1() {
		return inner;
	}
	public ScalableRectangle getRectangle2() {
		return outer;
	}
	
	
}
