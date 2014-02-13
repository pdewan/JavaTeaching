package lectures.composite.objects_shapes;
import bus.uigen.OEFrame;
import bus.uigen.ObjectEditor;

public class APlottedShuttle implements PlottedShuttle /*, NotAPoint*/ {
    static protected final String SHUTTLE_IMAGE_FILE_NAME = "shuttle2.jpg";
	static protected final int ORIGIN_X = 200, ORIGIN_Y = 200;
	static protected final int AXES_LENGTH = 300;
	int shuttleX = 0, shuttleY = 0;
	protected CartesianPlane cartesianPlane; 
	protected ImageWithHeight shuttleImage;
	// why not use 
//	public static final String SHUTTLE_IMAGE_FILE_NAME = "shuttle2.jpg";
//	public static final int SHUTTLE_IMAGE_HEIGHT = 25;
	public APlottedShuttle(int anX, int aY) {
		cartesianPlane = new ACartesianPlane (AXES_LENGTH, ORIGIN_X, ORIGIN_Y);
		shuttleImage = new AnImageWithHeight(SHUTTLE_IMAGE_FILE_NAME);
		setShuttleX(anX);
		setShuttleY(aY);
//		shuttle = new AMovableImage(SHUTTLE_IMAGE_FILE_NAME, windowX(), windowY());
	}
	public CartesianPlane getCartesianPlane() {return cartesianPlane;}
	public ImageWithHeight getShuttleImage() {return shuttleImage;}
	public int getShuttleX() {return shuttleX;}
	public void setShuttleX(int newVal) {
		shuttleX = newVal;
		shuttleImage.setX(toWindowX());
	}
	public int getShuttleY() {return shuttleY;}
	public void setShuttleY(int newVal) {
		shuttleY = newVal;
		shuttleImage.setY(toWindowY());
	}
	int toWindowX() {
		return ORIGIN_X + shuttleX; 
	}
	int toWindowY() {
		return ORIGIN_Y - shuttleY - shuttleImage.getHeight(); 
	}
	public static void main (String[] args) {
		PlottedShuttle shuttle = new APlottedShuttle(0, 0);
		OEFrame oeFrame = ObjectEditor.edit(shuttle);
		oeFrame.hideMainPanel();
		oeFrame.showTreePanel();
	}
}

