package lectures.composite.objects_shapes;

import lectures.graphics.ALine;
import lectures.graphics.AStringShape;
import lectures.graphics.Line;
import lectures.graphics.StringShape;
import bus.uigen.OEFrame;
import bus.uigen.ObjectEditor;

/**
 * Study the class and draw the logical and physical structure
 * of the instance created by main. 
 * 
 * The idea is to draw a scalable Cartesian Plane with labelled X and
 * Y axes.
 * 
 * An editable AxesLength property can be used to magnify and shrink the plane.
 * 
 * (T/F) AxesLength is a readonly property of ACartesianPlane.
 * 
 * (T/F) XAxis is readonly property of ACartesianPlane. 
 * 
 * (T/F) All structured properties of ACartesianPlane are readonly.
 *
 */
public class ACartesianPlane implements CartesianPlane {
	protected int originX, originY;
	protected int axesLength;   
	protected Line xAxis;
    protected Line yAxis;  
	protected StringShape xLabel;
	protected StringShape yLabel;
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
     * Do we need setters for all properties?
     */
    public Line getXAxis() {
    	return xAxis;
    }
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
     * Modifying the graphical components to be consistent with the new axeslength.  
     */
	public void setAxesLength(int anAxesLength) {
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
    	CartesianPlane aCartesianPlane = new ACartesianPlane(200, 125, 125);
    	OEFrame anOEFrame =  ObjectEditor.edit(aCartesianPlane);
    	anOEFrame.showTreePanel();
    	/*
    	 * set a break point on setter call, 
    	 *    	
    	 */
    	aCartesianPlane.setAxesLength(aCartesianPlane.getAxesLength()*2);
    	anOEFrame.refresh();
    	// to hide the main panel, you can execute
//    	anOEFrame.hideMainPanel();
    	
    	
    }	
}
/*
 * 
 * 
 * Run in debug mode and stop at the breakpoint, and step into the getter, 
 * step return, and then step into the setter.
 * 
 * Again look at the logical structure displayed by ObjectEditor and the 
 * physical structure displayed by the debugger. 
 * 
 * Are these the structures you would have predicted? 
 *   	
 * Is the content of the main panel predicted?
 * 
 * Is the content of the graphics panel predicted?
 * 
 * 
 * (T/F) Every property of an object is displayed in the ObjectEditor tree panel.
 * 
 * (T/F) Every property of an object is displayed in the main panel.
 * 
 * (T/F) Every property of an object is displayed either in the main panel
 * or the graphics panel.
 *   
 *
 * When the setter above is called, did any of the leaf nodes change in the structure?
 * 
 * Did any of the composite nodes change, that is, did they get new children or 
 * lose children?
 * 
 * Calling setAxesLength in ACartesianPlane changes:
 * 		(a) only the leaf nodes in the physical structure.
 * 		(b) changes only composite nodes in the physical structure.
 * 		(c) changes both the leaf and composite nodes in the physical structure.
 *
 * The next example is more concise but also inefficient: 
 * AnInefficientCartesianPlane
 */

	