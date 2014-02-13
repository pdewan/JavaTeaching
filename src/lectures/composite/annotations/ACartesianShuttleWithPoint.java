package lectures.composite.annotations;

import lectures.composite.objects_shapes.ACartesianPlane;
import lectures.composite.objects_shapes.CartesianPlane;
import lectures.graphics.ACartesianPoint;
import lectures.graphics.AShapeImage;
import lectures.graphics.ImageShape;
import lectures.graphics.Point;
import bus.uigen.ObjectEditor;
//@StructurePattern(StructurePatternNames.BEAN_PATTERN)
public class ACartesianShuttleWithPoint implements CartesianShuttleWithPoint {
	static protected final int ORIGIN_X = 200, ORIGIN_Y = 200;
	static protected final int AXES_LENGTH = 300;
	Point shuttleLocation = new ACartesianPoint(0, 0);
	protected CartesianPlane cartesianPlane; 
	protected ImageShape shuttle;
	public static final String SHUTTLE_IMAGE_FILE_NAME = "shuttle2.jpg";
	public static final int SHUTTLE_IMAGE_HEIGHT = 25;
	public ACartesianShuttleWithPoint(int anX, int aY) {
		cartesianPlane = new ACartesianPlane (AXES_LENGTH, ORIGIN_X, ORIGIN_Y);
		shuttle = new AShapeImage(SHUTTLE_IMAGE_FILE_NAME, shuttleJavaX(), shuttleJavaY());
		setShuttleLocation(new ACartesianPoint(anX, aY));
	}
	public CartesianPlane getCartesianPlane() {return cartesianPlane;}
	public ImageShape getShuttle() {return shuttle;}
	public Point getShuttleLocation() {return shuttleLocation;}
	public void setShuttleLocation(Point newVal) {
		shuttleLocation = newVal;
		shuttle.setX(shuttleJavaX());
	}	
	protected int shuttleJavaX() {return ORIGIN_X + shuttle.getX();}
	protected int shuttleJavaY() {return ORIGIN_Y - shuttle.getY() - SHUTTLE_IMAGE_HEIGHT;}
	public static void main (String[] args) {
		CartesianShuttleWithPoint shuttleLocation = new ACartesianShuttleWithPoint(50, 100);	
		ObjectEditor.edit(shuttleLocation);
	}	
}

