package lectures.composite.objects_shapes;

import lectures.graphics.ALine;
import lectures.graphics.AStringShape;
import lectures.graphics.Line;
import lectures.graphics.StringShape;
import bus.uigen.ObjectEditor;
// This is how you should not change structures
// Compare setAxesLength() of this class with the one in the previous one.
// Compare one of the getters (say getAxis()) with the corresponding getter of the previous class
// Does any composite node change in this example (get differenrt children) and when
// does it change?
public class AnInefficientCartesianPlane implements CartesianPlane {
	protected int originX, originY;
	protected int axesLength; 
    public AnInefficientCartesianPlane (int theAxesLength, int theOriginX, int theOriginY ) {
    	axesLength = theAxesLength; 
    	originX = theOriginX;
    	originY = theOriginY;      
    }  
    
    // what is this getter more inefficient than the previous one?
    public Line getXAxis() {
    	return new ALine(toXAxisX(), toXAxisY(), axesLength, 0);
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
    	ObjectEditor.edit(new AnInefficientCartesianPlane(200, 125, 125));
    }
	
}