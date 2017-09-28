package lectures.extra;

import lectures.composite.design_pattern.ScalableShape;

public interface DoubleNester {

	public ScalableNester getNester();

	public ScalableShape getEnclosingRectangle();

}