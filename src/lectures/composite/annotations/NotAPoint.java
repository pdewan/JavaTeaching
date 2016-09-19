package lectures.composite.annotations;

import lectures.composite.objects_shapes.ImageWithHeight;
import lectures.composite.objects_shapes_extra.FancyCartesianPlane;

public interface NotAPoint {
	public FancyCartesianPlane getFancyCartesianPlane();
	public ImageWithHeight getShuttleImage();
	public int getCartesianX();
	public void setCartesianX(int newVal);
	public int getCartesianY();
	public void setCartesianY(int newVal);
}
