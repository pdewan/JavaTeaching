package lectures.composite.objects_shapes;




public interface PlottedShuttle {
	static final int ORIGIN_X = 200, ORIGIN_Y = 200;
	static final int AXES_LENGTH = 300;
	static final int FRAME_WIDTH = 600;
	static final int FRAME_HEIGHT = 600;
	public CartesianPlane getCartesianPlane();
	public ImageWithHeight getShuttleImage();
	public int getShuttleX();
	public void setShuttleX(int newVal);
	public int getShuttleY();
	public void setShuttleY(int newVal);	
}
