package lectures.composite.objects_shapes;

import lectures.graphics.StringShape;

public interface FancyCartesianPlane {
	public int getAxesLength();
	public void setAxesLength(int newVal);
	public StringShape getXLabel();
	public StringShape getYLabel();
	public CartesianPlane getCartesianPlane();

}
