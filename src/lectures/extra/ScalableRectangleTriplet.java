package lectures.extra;


public interface ScalableRectangleTriplet  {
	public ScalableRectanglePair getInner();
	public ScalableRectangle getOuter() ;
	public void scale(int percentage);
}
