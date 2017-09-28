package lectures.extra;

import lectures.composite.design_pattern.ScalableShape;

public class AScalableNester implements ScalableNester{
	ScalableShape nestedRectangle;
	ScalableShape enclosingRectangle;
	static final int  RELATIVE_SIZE = 2;
	public AScalableNester(ScalableShape theNestedRectangle) {
		nestedRectangle = theNestedRectangle;
		makeEnclosingRectangle();
	}	
	public ScalableShape getNestedRectangle() {
		return nestedRectangle;
	}	
	void makeEnclosingRectangle() {
//		enclosingRectangle = new AScalableRectangle (nestedRectangle.getX(), 
//											 nestedRectangle.getY(),
//											 nestedRectangle.getWidth()*RELATIVE_SIZE,
//											 nestedRectangle.getHeight()*RELATIVE_SIZE);
	}	
	public ScalableShape getEnclosingRectangle() {
		return enclosingRectangle;
	}	
	public void scale (int percentage) {
		nestedRectangle.scale(percentage);
		enclosingRectangle.scale(percentage);
	}
}
