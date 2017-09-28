package lectures.extra.oldgraphics;

import lectures.composite.objects_shapes.CartesianPlane;

public interface FancyCartesianPlane {
	public int getAxesLength();
	public void setAxesLength(int newVal);
	public Label getXLabel();
	public Label getYLabel();
	public CartesianPlane getCartesianPlane();

}
