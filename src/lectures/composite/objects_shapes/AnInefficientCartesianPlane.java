package lectures.composite.objects_shapes;

import util.annotations.StructurePattern;
import util.annotations.StructurePatternNames;
import lectures.graphics.ALine;
import lectures.graphics.AStringShape;
import lectures.graphics.Line;
import lectures.graphics.StringShape;
import bus.uigen.OEFrame;
import bus.uigen.ObjectEditor;
/**
 * Compare the constructor of this class with the previous one.
 * 
 * Compare setAxesLength() of this class with the one in the previous one. 
 * 
 * Compare one of the getters (say getAxis()) with the corresponding 
 * getter of the previous class.
 * 
 * (T/F) XAxis is a stored property of AnInefficientCartesianPlane, that is, 
 * its value is stored in an instance variable.
 * 
 * 
 *
 */
@StructurePattern(StructurePatternNames.BEAN_PATTERN)
public class AnInefficientCartesianPlane implements CartesianPlane {
	protected int originX, originY;
	protected int axesLength; 
	/*
	 * Do not instantiate components in the constructor
	 */
    public AnInefficientCartesianPlane (int theAxesLength, int theOriginX, int theOriginY ) {
    	axesLength = theAxesLength; 
    	originX = theOriginX;
    	originY = theOriginY;      
    }  
    
    /*
     * Create a new line and label each time the getter is called, 
     * based on axes length
     * 
     */
    public Line getXAxis() {
    	Line result = new ALine(toXAxisX(), toXAxisY(), axesLength, 0);
    	return result;
    }
    public Line getYAxis() {
    	return new ALine(toYAxisX(), toYAxisY(), 0, axesLength);
    }    
    public StringShape getXLabel() {
    	return new AStringShape ("X", toXLabelX(), toXLabelY());
    }
    public StringShape getYLabel() {
    	return new AStringShape ("Y", toYLabelX(), toYLabelY());
    }
    public int getAxesLength() {
		return axesLength;
	}
	public void setAxesLength(int anAxesLength) {
		axesLength = anAxesLength;		
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
   	    CartesianPlane myPlane = 
   	    		new AnInefficientCartesianPlane(
   	    				INIT_AXES_LENGTH, 
   	    				INIT_ORIGIN_X, 
   	    				INIT_ORIGIN_Y);
    	OEFrame anOEFrame =  ObjectEditor.edit(myPlane);
    	anOEFrame.showTreePanel();
    	anOEFrame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
    	/*
    	 * set a break point on setter call, 
    	 *    	
    	 */
    	myPlane.setAxesLength(myPlane.getAxesLength()*2);
    	anOEFrame.refresh();
    	
    }
/*
 * Again, run in debug mode and stop at the breakpoint, and step into the getter, 
 * step return, and then step into the setter.
 * 
 * Does this physical structure have any composite nodes?
 * 
 * (T/F) AnInefficientCartesianPlane has only leaf nodes in the physical
 * structure.
 * 
 * Resume the program to see the behavior of the program.
 * 
 * Edit the AxesLength and see the effect.
 * 
 * Look at the console output:
 * 
 * (T/F)  Calling getXAxis() in AnInefficientCartesianPlane changes the 
 * composite property, XAxis, that is, returns a new new object for this 
 * property.
 * 
 * Why is this class more inefficient?
 * 
 * Next class: APlottedShuttle
 */
	
}