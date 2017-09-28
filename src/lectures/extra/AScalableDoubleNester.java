package lectures.extra;

import lectures.composite.design_pattern.ScalableShape;

public class AScalableDoubleNester implements ScalableDoubleNester{
	ScalableNester nester;
	ScalableShape enclosingRectangle;
	static final int  RELATIVE_SIZE = 2;
	public AScalableDoubleNester(ScalableNester theNester) {
		nester = theNester;
		makeEnclosingRectangle();
	}	
	public ScalableNester getNester() {
		return nester;
	}	
	void makeEnclosingRectangle() {
//		enclosingRectangle = new AScalableRectangle (nester.getEnclosingRectangle().getX(), 
//											 nester.getEnclosingRectangle().getY(),
//											 nester.getEnclosingRectangle().getWidth()*RELATIVE_SIZE,
//											 nester.getEnclosingRectangle().getHeight()*RELATIVE_SIZE);
	}	
	public ScalableShape getEnclosingRectangle() {
		return enclosingRectangle;
	}	
	public void scale (int percentage) {
		nester.scale(percentage);
		enclosingRectangle.scale(percentage);
	}
}
