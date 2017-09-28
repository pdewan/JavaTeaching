package lectures.extra;

import lectures.composite.design_pattern.ScalableShape;

public interface Nester {

	public ScalableShape getNestedRectangle();

	public ScalableShape getEnclosingRectangle();

}