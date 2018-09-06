package lectures.extra;

import lectures.composite.objects_shapes.ACartesianPlane;
import lectures.composite.objects_shapes.CartesianPlane;
import lectures.composite.objects_shapes_extra.FancyCartesianPlane;
import lectures.graphics.extra.AStringShape;
import lectures.graphics.extra.StringShape;
import bus.uigen.ObjectEditor;

public class AnInefficientFancyCartesianPlane implements FancyCartesianPlane {
    int axesLength, originX, originY;
    public AnInefficientFancyCartesianPlane (int theAxesLength, int theOriginX, int theOriginY ) { 
    	axesLength = theAxesLength;
    	originX = theOriginX;
    	originY = theOriginY;    	
    }  
    public CartesianPlane getCartesianPlane() {
    	return new ACartesianPlane(axesLength, originX, originY);
    }
    public StringShape getXLabel() {return 
    		new AStringShape ("X",
                    originX + axesLength/2, 
                    originY );
    }
    public StringShape getYLabel() {
    	return new AStringShape ("Y",
                originX, 
                originY - axesLength/2);
    }
    public int getAxesLength() {return axesLength;}    
    public void setAxesLength(int newVal) {
        axesLength = newVal;
    }    
   
    public static void main (String[] args) {
    	ObjectEditor.edit(new AnInefficientFancyCartesianPlane(200, 125, 125));
    }
}