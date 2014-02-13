package lectures.composite.objects_shapes;

import lectures.graphics.ALine;
import lectures.graphics.AStringShape;
import lectures.graphics.Line;
import lectures.graphics.StringShape;
import bus.uigen.ObjectEditor;

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
    	CartesianPlane plane = new ACartesianPlane(200, 125, 125);
    	ObjectEditor.edit(plane);
    }	
}