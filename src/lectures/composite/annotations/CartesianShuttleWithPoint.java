package lectures.composite.annotations;

import lectures.composite.objects_shapes.CartesianPlane;
import lectures.graphics.ImageShape;
import lectures.graphics.Point;
public interface CartesianShuttleWithPoint {
	public CartesianPlane getCartesianPlane();
	public ImageShape getShuttle();	
	public Point getShuttleLocation();
	public void setShuttleLocation(Point newVal);
}
