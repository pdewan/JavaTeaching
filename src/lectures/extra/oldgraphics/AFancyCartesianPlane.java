package lectures.extra.oldgraphics;

import lectures.composite.objects_shapes.ACartesianPlane;
import lectures.composite.objects_shapes.CartesianPlane;
import lectures.graphics.extra.ACartesianPoint;
import lectures.graphics.extra.Line;
import bus.uigen.ObjectEditor;

public class AFancyCartesianPlane implements FancyCartesianPlane {
    protected int axesLength;
	protected CartesianPlane cartesianPlane;
    protected Label xLabel;
    protected Label yLabel;
    protected final int LABEL_BOUNDS_SIDE_LENGTH = 10;     
    public AFancyCartesianPlane (int theAxesLength, int theOriginX, int theOriginY ) { 
    	axesLength = theAxesLength;
    	cartesianPlane = new ACartesianPlane(theAxesLength, theOriginX, theOriginY);
    	xLabel = new ALabel (
                theOriginX + theAxesLength/2, 
                theOriginY - LABEL_BOUNDS_SIDE_LENGTH/2,
                LABEL_BOUNDS_SIDE_LENGTH, 
                LABEL_BOUNDS_SIDE_LENGTH, "X", null);
        yLabel = new ALabel (
                theOriginX, 
                theOriginY - theAxesLength/2 - LABEL_BOUNDS_SIDE_LENGTH,
                LABEL_BOUNDS_SIDE_LENGTH, 
                LABEL_BOUNDS_SIDE_LENGTH, "Y", null);

    }
    
   
    public CartesianPlane getCartesianPlane() {
    	return cartesianPlane;
    }
    public Label getXLabel() {return xLabel;}
    public Label getYLabel() {return yLabel;}
    public int getAxesLength() {return axesLength;}    
    public void setAxesLength(int newVal) {
        int lengthIncrease = newVal- axesLength;
        Line xAxis = cartesianPlane.getXAxis();
        Line yAxis = cartesianPlane.getYAxis();
        xAxis.setX(xAxis.getX() - lengthIncrease/2);
        yAxis.setY(yAxis.getY() - lengthIncrease/2);
        updateXOfLabel(xLabel,xLabel.getLocation().getX() + lengthIncrease/2);
        updateYOfLabel(yLabel, yLabel.getLocation().getY() - lengthIncrease/2);
        axesLength = newVal;
        xAxis.setWidth(axesLength);
        yAxis.setHeight(axesLength);		
    }    
    void updateXOfLabel(Label label, int newX) {
        label.setLocation(new ACartesianPoint(
            newX, label.getLocation().getY()));
    }
    void updateYOfLabel(Label label, int newY) {
        label.setLocation(new ACartesianPoint(
            label.getLocation().getX(), newY));
    }  

    public static void main (String[] args) {
    	ObjectEditor.edit(new AFancyCartesianPlane(200, 125, 125));
    }
}