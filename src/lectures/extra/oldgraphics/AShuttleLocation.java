package lectures.extra.oldgraphics;
import lectures.composite.objects_shapes.ACartesianPoint;
import bus.uigen.ObjectEditor;
//@StructurePattern(StructurePatternNames.BEAN_PATTERN)
//@StructurePattern(StructurePatternNames.LINE_PATTERN)
public class AShuttleLocation implements ShuttleLocation {	
	static protected final int ORIGIN_X = 200, ORIGIN_Y = 200;
	static protected final int AXES_LENGTH = 300;
	int shuttleX = 0, shuttleY = 0;
	protected FancyCartesianPlane cartesianPlane; 
	protected ShuttleImage shuttleLabel;
	public AShuttleLocation() {
		cartesianPlane = new AFancyCartesianPlane (
				AXES_LENGTH, ORIGIN_X, ORIGIN_Y);
		shuttleLabel = new AShuttle(labelX(), labelY());
	}
	public FancyCartesianPlane getFancyCartesianPlane() {return cartesianPlane;}
	public ShuttleImage getShuttleLabel() {return shuttleLabel;}
	public int getShuttleX() {return shuttleX;}
	public void setShuttleX(int newVal) {
		shuttleX = newVal;
		shuttleLabel.setLocation(new ACartesianPoint(labelX(), labelY()));
	}
	public int getShuttleY() {return shuttleY;}
	public void setShuttleY(int newVal) {
		shuttleY = newVal;
		shuttleLabel.setLocation(new ACartesianPoint(labelX(), labelY()));
	}
	protected int labelX() {return ORIGIN_X + shuttleX;}
	protected int labelY() {return ORIGIN_Y - shuttleY - AShuttle.HEIGHT;}
	public static void main (String[] args) {
		ShuttleLocation shuttleLocation = new AShuttleLocation();	
		ObjectEditor.edit(shuttleLocation);
	}
}

