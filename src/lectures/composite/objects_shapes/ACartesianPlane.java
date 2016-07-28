package lectures.composite.objects_shapes;

import lectures.graphics.ALine;
import lectures.graphics.AStringShape;
import lectures.graphics.Line;
import lectures.graphics.StringShape;
import bus.uigen.OEFrame;
import bus.uigen.ObjectEditor;

// Study the class and draw the logical and physical structure
// of the instance created by main. 

// What do you expect to be draw in the graphics window by this program.
// What do you expect to be drawn in the main window?
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
        xAxis = new ALine(toXAxisX(), toXAxisY(), axesLength, 0);
        yAxis = new ALine(toYAxisX(), toYAxisY(), 0, axesLength);  
     	xLabel = new AStringShape ("X", toXLabelX(), toXLabelY());
        yLabel = new AStringShape ("Y", toYLabelX(), toYLabelY());
    }    
    // Do we need setters for these properties?
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
    // This code duplicates what is in the constructor.
    // Can you remove the duplication?
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
    	// set a break point on setter call,    	
    	aCartesianPlane.setAxesLength(aCartesianPlane.getAxesLength()*2);
    	anOEFrame.refresh();
    	// to hide the main panel, you can execute
//    	anOEFrame.hideMainPanel();
    	// Run in debug mode, and step into the setter
     	// Again look at the logical structure displayed by ObjectEditor and the physical structure
     	// displayed by the debugger. Are these the structures you would have predicted?   	
     	// Is the content of the main panel predicted?
     	// Is the content of the graphics panel predicted?
    	
    	// When the setter above is called, did any of the leaf nodes change in the structure?
    	// Did any of the composite nodes change, that is, did they get new children?
    	
    	// Try and remove the code duplication mentioned above and text if it works
    	// The next example also does not have code duplication but is far more inefficient
     	
    	
    }	
}