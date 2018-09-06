package lectures.composite.objects_shapes;

import util.annotations.StructurePattern;
import util.annotations.StructurePatternNames;
import lectures.graphics.extra.ALine;
import lectures.graphics.extra.AStringShape;
import lectures.graphics.extra.Line;
import lectures.graphics.extra.StringShape;
import bus.uigen.OEFrame;
import bus.uigen.ObjectEditor;

/*
 * The purpose of this class is to draw a scalable Cartesian Plane with labeled X and
 * Y axes.
 * 
 * An editable AxesLength property can be used to magnify and shrink the plane.  
 *
 */
@StructurePattern(StructurePatternNames.BEAN_PATTERN)
public class ACartesianPlane implements CartesianPlane {	
	protected int originX, originY;
	protected int axesLength;   
	protected Line xAxis;
    protected Line yAxis;  
	protected StringShape xLabel;
	protected StringShape yLabel;
/*    
 * ACartesianPlane has:
 *   a) only primitive components in its physical structure.
 *   b) only object components in its physical structure.
 *   c) both primitive and object components in its physical structure.
 */
	
    public ACartesianPlane (int theAxesLength, int theOriginX, int theOriginY ) {    	
    	axesLength = theAxesLength; 
    	originX = theOriginX;
    	originY = theOriginY;
    	/*
    	 * Creating the initial structure based on the initial axeslength.
    	 */
       xAxis = new ALine(toXAxisX(), toXAxisY(), axesLength, 0);
       yAxis = new ALine(toYAxisX(), toYAxisY(), 0, axesLength);  
       xLabel = new AStringShape ("X", toXLabelX(), toXLabelY());
       yLabel = new AStringShape ("Y", toYLabelX(), toYLabelY());
    }
/*
 * The constructor of ACartesianPlane:
 *    (a) does not initialize its object variables.
 *    (b) assigns its parameters to its object variables.
 *    (c) creates new instances and assigns them to its object variables.
 *   
 */
   
    public Line getXAxis() {
    	System.out.println ("X Axis:" + xAxis);
    	return xAxis;
    }
/*
 * (T/F) getAxis() of ACartesianPlane creates and returns a new object each time 
 * it is called.
 */
    public Line getYAxis() {
    	return yAxis;
    }    
    public StringShape getXLabel() {
    	return xLabel;
    }
    public StringShape getYLabel() {
    	return yLabel;
    }
    public int getAxesLength() {
		return axesLength;
	}
    
    /*
     * setAxesLength modifies the graphical components to be consistent with 
     * the new axeslength.  
     */
	public void setAxesLength(int anAxesLength) {
		System.out.println ("New axes length:" + anAxesLength);
		axesLength = anAxesLength;
		xAxis.setWidth(axesLength);
		yAxis.setHeight(axesLength);
		xAxis.setX(toXAxisX());
		xAxis.setY(toXAxisY());
		yAxis.setX(toYAxisX());
		yAxis.setY(toYAxisY());
		xLabel.setX(toXLabelX());
		xLabel.setY(toXLabelY());
		yLabel.setX(toYLabelX());
		yLabel.setY(toYLabelY());
	}
/*
 * Calling setAxesLength in ACartesianPlane, changes the:
 *   (a) object variable xAxis, that is, 
 *       assigns a new object to this variable.
 *   (b) primitive X property of the existing object stored in the xAxis variable. 
 *   (c) None of the above.
 *   
 * Calling setAxesLength in ACartesianPlane changes:
 * 		(a)  leaf nodes in the physical structure.
 * 		(b)  object nodes in the physical structure.
 * 		(c)  None of the above
 */
	
	/*
	 * These methods are used for calculating the locations of the line and label objects
	 */
	protected int toXAxisX() {
    	return originX - axesLength/2;
    }
	protected int toXAxisY() {
    	return originY;
    }
	protected int toYAxisX() {
    	return originX;
    }
	protected int toYAxisY() {
    	return originY - axesLength/2;
    }
	protected int toXLabelX() {
    	return originX + axesLength/2;    	
    }
	protected int toXLabelY() {
    	return originY;  	
    }
	protected int toYLabelX() {
    	return originX;    	
    }
	protected int toYLabelY() {
    	return originY - axesLength/2;  	
    }
	
    public static void main (String[] args) {
    	CartesianPlane aCartesianPlane = 
    		new ACartesianPlane(INIT_AXES_LENGTH, INIT_ORIGIN_X, INIT_ORIGIN_Y);
    	OEFrame anOEFrame =  ObjectEditor.edit(aCartesianPlane);
    	anOEFrame.showTreePanel();
    	anOEFrame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
    	/*
    	 * set a break point on setter call
    	 */
    	aCartesianPlane.setAxesLength(aCartesianPlane.getAxesLength()*2);
    	anOEFrame.refresh();
    	// to hide the main panel, you can execute
//    	anOEFrame.hideMainPanel();
    	
    }	
}
/*
 * Study the class and draw or imagine the logical and physical structure
 * of the instance created by main.
 * 
 * Which properties have setters?    
 * 
 * (T/F) AxesLength is a readonly property of ACartesianPlane.
 * 
 * (T/F) XAxis is readonly property of ACartesianPlane. 
 * 
 * (T/F) All object properties of ACartesianPlane are readonly.
 * 
 * (T/F) XAxis is a stored property of ACartesianPlane, that is, its value
 * is stored in an instance variable.
 * 
 * (T/F) In ACartesianPlane, each time a getter of an object property is called, 
 * a new object is returned.  
 */

/*  
 * 
 * Run in debug mode and stop at the breakpoint, and step into the getter, 
 * step return, and then step into the setter.
 * 
 * Look at the physical structure displayed by the debugger. 
 *  
 * (T/F) axesLength is a leaf variable of ACartesianPlane.
 * 
 * (T/F) xAxis is a leaf variable of ACartesianPlane. 
 * 
 * Look at the logical structure displayed by ObjectEditor.
 * 
 * Is the content of the graphics panel predicted?
 *  
 * Is the content of the main panel predicted?
 * 
 * (T/F) Every property of an object is displayed in the ObjectEditor tree panel.
 * 
 * (T/F) Every property of an object is displayed in the main panel.
 * 
 * (T/F) Every property of an object is displayed either in the main panel
 * or the graphics panel.   
 *  
 * Resume the execution to see the behavior of the program. 
 * Edit the AxesLength to call setAxesLength and see the effect.
 * 
 * When the setter above is called, did any of the leaf nodes change in the structure?
. 
 * Did any of the composite nodes change, that is, did they get new children or 
 * lose children?
 * 
 * Look at the console output. Is it what you would predict.
 *
 * Look at the code in setAxesLength and getAxis and review your answers about it.
 * 
 * The next example is more concise but also inefficient: 
 * AnInefficientCartesianPlane
 */

	