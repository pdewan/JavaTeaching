package lectures.inheritance;


public interface BoundedPoint extends MutablePoint {
	public MutablePoint getUpperLeftCorner();
	public MutablePoint getLowerRightCorner();
	public void setUpperLeftCorner(MutablePoint newVal);
	public void setLowerRightCorner(MutablePoint newVal);	
}
