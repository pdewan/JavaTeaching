package lectures.composite.objects_shapes_extra;

import lectures.composite.objects_shapes.CartesianPlane;
import lectures.graphics.extra.StringShape;

public interface FancyCartesianPlane {
	public int getAxesLength();
	public void setAxesLength(int newVal);
	public StringShape getXLabel();
	public StringShape getYLabel();
	public CartesianPlane getCartesianPlane();

}
