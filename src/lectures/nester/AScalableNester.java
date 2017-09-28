package lectures.nester;

public class AScalableNester implements ScalableNester {
	ScalableShape nestedRectangle;
	ScalableShape enclosingRectangle;
	static final int  RELATIVE_SIZE = 2;
	public AScalableNester(ScalableShape theNestedRectangle) {
		nestedRectangle = theNestedRectangle;
		makeEnclosingRectangle();
	}
	/* (non-Javadoc)
	 * @see examples.composite.Nester#getNestedRectangle()
	 */
	public ScalableShape getNestedRectangle() {
		return nestedRectangle;
	}
	
	void makeEnclosingRectangle() {
		enclosingRectangle = new ARectangle (nestedRectangle.getX(), 
											 nestedRectangle.getY(),
											 nestedRectangle.getWidth()*RELATIVE_SIZE,
											 nestedRectangle.getHeight()*RELATIVE_SIZE);
		
	}
	/* (non-Javadoc)
	 * @see examples.composite.Nester#getEnclosingRectangle()
	 */
	public ScalableShape getEnclosingRectangle() {
		return enclosingRectangle;
	}
	/* (non-Javadoc)
	 * @see examples.composite.Nester#scale(int)
	 */
	public void scale (int percentage) {
		nestedRectangle.scale(percentage);
		enclosingRectangle.scale(percentage);
	}
	
	

}
