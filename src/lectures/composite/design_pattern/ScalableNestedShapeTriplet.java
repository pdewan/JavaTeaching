package lectures.composite.design_pattern;


public interface ScalableNestedShapeTriplet  {
	public ScalableNestedShapePair getInner();
	public ScalableShape getOuter() ;
	public void scale(int percentage);
}
