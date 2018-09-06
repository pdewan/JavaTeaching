package lectures.composite.annotations;

import lectures.composite.objects_shapes.CartesianPlane;
import lectures.graphics.extra.ImageShape;
import lectures.graphics.extra.Point;
public interface CartesianShuttleWithPoint {
	public CartesianPlane getCartesianPlane();
	public ImageShape getShuttle();	
	public Point getShuttleLocation();
	public void setShuttleLocation(Point newVal);
}
