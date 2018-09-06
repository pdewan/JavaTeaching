package lectures.composite.objects_shapes;
import lectures.composite.objects_shapes_extra.AnImageWithHeight;
import lectures.composite.objects_shapes_extra.ImageWithHeight;
import util.annotations.StructurePattern;
import util.annotations.StructurePatternNames;
import bus.uigen.OEFrame;
import bus.uigen.ObjectEditor;

@StructurePattern(StructurePatternNames.BEAN_PATTERN)
public class APlottedShuttle implements PlottedShuttle  {    
	public static final String SHUTTLE_IMAGE_FILE_NAME = "shuttle2.jpg";
	int shuttleX = 0, shuttleY = 0;
	protected CartesianPlane cartesianPlane; 
	protected ImageWithHeight shuttleImage;	
	
	public APlottedShuttle(int anX, int aY) {
		cartesianPlane = new ACartesianPlane (AXES_LENGTH, ORIGIN_X, ORIGIN_Y);
		shuttleImage = new AnImageWithHeight(SHUTTLE_IMAGE_FILE_NAME);
		setShuttleX(anX);
		setShuttleY(aY);
	}
	
	public CartesianPlane getCartesianPlane() {return cartesianPlane;}
	
	public ImageWithHeight getShuttleImage() {return shuttleImage;}
	
	public int getShuttleX() {return shuttleX;}
	public void setShuttleX(int newVal) {
		shuttleX = newVal;
		shuttleImage.setX(toWindowX());
	}
	/*
	 * In APlotedShttle, setShuttleX() changes:
	 * 	a) the shuttleX instance variable
	 *  b) the X property of the object assigned to the shuttleImage instance variable.
	 *  c) the xAxis property of the object assigned to the cartesianPlane variable.
	 */
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
		OEFrame anOEFrame = ObjectEditor.edit(shuttle);
		anOEFrame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
//		oeFrame.hideMainPanel();
	}
}
/*
 * Without looking at this program, run it and observe the graphics view 
 * created (stretch the window to see all of it).
 * 
 * Edit the properties in the main panel to see the effect on in the graphics
 * panel.
 * 
 * What properties/logical structure do you think this class has based on the
 * graphics view?
 * 
 * Use the Common->TreeView command to view the actual logical structure.
 * 
 * Examine this code. Does your predicted logical structure match the actual one?
 * 
 * If not, which is the preferable one?
 * 
 * The logical and physical structure of APlottedShuttle has:
 *   (a) a child node that represents the X axis.
 *   (b) a (non-child) descendant node that represents the X axis.
 *   (c) None of the above.
 *   
 *  The logical and physical structure of APlottedShuttle has:
 *   (a) a child node that represents the shuttle.
 *   (b) a (non-child) descendant node that represents the shuttle.
 *   (c) None of the above. 
 *   
 *  The logical and physical structure of APlottedShuttle has:
 *   (a) a child node that represents the Cartesian plane
 *   (b) a (non-child) descendant node that represents the cartesian plane.
 *   (c) None of the above.
 * 
 * (T/F) APlottedShuttle reuses the code in ACartesianPlane.
 * 
 * (T/F) Every atomic graphics object (line, image, text) displayed in the 
 *     graphics window created for an instance of ACartesianPlane is a 
 *     (physical or logical) child of the instance.
 * 
 * (T/F) Every atomic graphics object (line, image, text) displayed in the 
 *     graphics window created for an instance of APlottedShuttle  is  
 *     (physical or logical) child of the instance.
 *     
 * If our requirements specify only the root and leaf nodes of a physical structure,
 * reusability is increased by making each leaf node a:
 * 	   (a) child of the root.
 * 	   (b) a (direct or indiect) descendant of the object.
 *  
 */

