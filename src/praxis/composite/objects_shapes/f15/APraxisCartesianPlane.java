package praxis.composite.objects_shapes.f15;

import util.misc.ThreadSupport;
import lectures.composite.objects_shapes.ALineWithObjectProperty;
import lectures.composite.objects_shapes.CartesianPlane;
import lectures.composite.objects_shapes.LineWithObjectProperty;
import lectures.graphics.ACartesianPoint;
import lectures.graphics.ALine;
import lectures.graphics.AStringShape;
import lectures.graphics.Line;
import lectures.graphics.StringShape;
import bus.uigen.OEFrame;
import bus.uigen.ObjectEditor;

public class APraxisCartesianPlane implements PraxisCartesianPlane {
	protected int originX, originY;
	protected int axesLength;   
	protected LineWithObjectProperty xAxis;
    protected Line yAxis;  
	protected StringShape xLabel;
	protected StringShape yLabel;
    public APraxisCartesianPlane (int theAxesLength, int theOriginX, int theOriginY ) {
    	axesLength = theAxesLength;
    	// comment out the following statement
//    	originX = theOriginX;
    	originY = theOriginY;
    	// comment out the following statement
        xAxis = new ALineWithObjectProperty(new ACartesianPoint(toXAxisX(), toXAxisY()), axesLength, 0);
        yAxis = new ALine(toYAxisX(), toYAxisY(), 0, axesLength);  
     	xLabel = new AStringShape ("X", toXLabelX(), toXLabelY());
        yLabel = new AStringShape ("Y", toYLabelX(), toYLabelY());
    }    
    public LineWithObjectProperty getXAxis() {
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
	public void setAxesLength(int anAxesLength) {
		axesLength = anAxesLength;
		// comment out the following statement
//		changeDependentProperties();
	}
	protected void changeDependentProperties() {
		xAxis.setWidth(axesLength);
		yAxis.setHeight(axesLength);
		xAxis.setLocation(new ACartesianPoint (toXAxisX(), toXAxisY()));		
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
    	final int axesIncrement = 5;
    	final long initDelay = 1000;
    	final long sleepTime = 300;
    	PraxisCartesianPlane aCartesianPlane = new APraxisCartesianPlane(100, 125, 125);
    	OEFrame anEditor = ObjectEditor.edit(aCartesianPlane);
    	// comment out line below
    	anEditor.showTreePanel();
    	// remove comment in line below
//    	anEditor.hideMainPanel();
    	anEditor.setSize(500, 600);
    	anEditor.setLocation(100, 200);
		// put break point on the line below (click on the leftmost vertical bar and right click>DebugAs>JavaApplication
    	ThreadSupport.sleep(initDelay);

    	for (int i = 0; i < 10; i++) {
			int newAxesLength = aCartesianPlane.getAxesLength() + axesIncrement;
			aCartesianPlane.setAxesLength(newAxesLength);
			ThreadSupport.sleep(sleepTime);
			// comment out the line below
			anEditor.refresh();
			System.out.println (" XX:" + aCartesianPlane.getXAxis().getLocation().getRadius());
		}
   }	
}