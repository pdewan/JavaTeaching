package lectures.extra;


public class AScalableRectangleTriplet implements ScalableRectangleTriplet  {
	ScalableRectanglePair inner;	
	ScalableRectangle outer;
	
	public AScalableRectangleTriplet(ScalableRectangle anOuter, ScalableRectanglePair anInner) {
		inner = anInner;
		outer = anOuter;
	}
	public void scale(int percentage){
		outer.scale(percentage);
		inner.scale(percentage);				
	}
	public ScalableRectanglePair getInner() {
		return inner;
	}
	public ScalableRectangle getOuter() {
		return outer;
	}	
}
