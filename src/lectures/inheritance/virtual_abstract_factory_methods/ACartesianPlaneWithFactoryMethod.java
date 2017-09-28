package lectures.inheritance.virtual_abstract_factory_methods;

import lectures.composite.objects_shapes.CartesianPlane;
import lectures.graphics.ALine;
import lectures.graphics.AStringShape;
import lectures.graphics.Line;
import lectures.graphics.StringShape;
import bus.uigen.ObjectEditor;

public class ACartesianPlaneWithFactoryMethod implements CartesianPlane {
	protected int originX, originY;
	protected int axesLength;   
	protected Line xAxis;
    protected Line yAxis;  
	protected StringShape xLabel;
	protected StringShape yLabel;
    public ACartesianPlaneWithFactoryMethod (int theAxesLength, int theOriginX, int theOriginY ) {
    	axesLength = theAxesLength; 
    	originX = theOriginX;
    	originY = theOriginY;
        xAxis = createLine(toXAxisX(), toXAxisY(), axesLength, 0);
        yAxis = createLine(toYAxisX(), toYAxisY(), 0, axesLength);  
     	xLabel = createStringShape ("X", toXLabelX(), toXLabelY());
        yLabel = createStringShape ("Y", toYLabelX(), toYLabelY());
    } 
    
    protected Line createLine(int anX, int aY, int aWidth, int aHeight) {
    	return new ALine(anX, aY, aWidth, aHeight);
    }
    
    protected StringShape createStringShape(String aString, int anX,  int aY) {
    	return new AStringShape(aString, anX, aY); 
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
	int toXAxisX() {
    	return originX - axesLength/2;
    }
    int toXAxisY() {
    	return originY;
    }
    int toYAxisX() {
    	return originX;
    }
    int toYAxisY() {
    	return originY - axesLength/2;
    }
    int toXLabelX() {
    	return originX + axesLength/2;    	
    }
    int toXLabelY() {
    	return originY;  	
    }
    int toYLabelX() {
    	return originX;    	
    }
    int toYLabelY() {
    	return originY - axesLength/2;  	
    }
    public static void main (String[] args) {
    	CartesianPlane plane = new ACartesianPlaneWithFactoryMethod(200, 125, 125);
    	ObjectEditor.edit(plane);
    }	
}