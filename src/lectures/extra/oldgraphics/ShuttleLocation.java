package lectures.extra.oldgraphics;


public interface ShuttleLocation {
	public FancyCartesianPlane getFancyCartesianPlane();
	public ShuttleImage getShuttleLabel();
	public int getShuttleX();
	public void setShuttleX(int newVal);
	public int getShuttleY();
	public void setShuttleY(int newVal);	
}
