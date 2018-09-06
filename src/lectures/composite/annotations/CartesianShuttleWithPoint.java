package lectures.composite.annotations;

import lectures.composite.objects_shapes.CartesianPlane;
import lectures.composite.objects_shapes.Point;
import lectures.graphics.extra.ImageShape;
public interface CartesianShuttleWithPoint {
	public CartesianPlane getCartesianPlane();
	public ImageShape getShuttle();	
	public Point getShuttleLocation();
	public void setShuttleLocation(Point newVal);
}
