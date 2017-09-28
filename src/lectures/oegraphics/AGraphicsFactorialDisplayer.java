package lectures.oegraphics;

import lectures.interfaces.FactorialSpreadsheet;
import shapes.FlexibleShape;
import shapes.FlexibleTextShape;
import bus.uigen.shapes.ARectangleModel;
import bus.uigen.shapes.AStringModel;

public class AGraphicsFactorialDisplayer implements GraphicsFactorialDisplayer {
	FlexibleShape rectangle;
	FlexibleTextShape textShape;
	int rectX;
	FactorialSpreadsheet factorialSpreadsheet;
	public AGraphicsFactorialDisplayer (int aRectX, FactorialSpreadsheet aFactorialSpreadsheet) {
		init(aRectX, aFactorialSpreadsheet);
	}	
	public AGraphicsFactorialDisplayer (FactorialSpreadsheet aFactorialSpreadsheet) {
		init(RECT_X, aFactorialSpreadsheet);
	}	
	void init(int aRectX, FactorialSpreadsheet aFactorialSpreadsheet) {
		factorialSpreadsheet = aFactorialSpreadsheet;
		rectX = aRectX;
		textShape = new AStringModel("", rectX, RECT_Y - TEXT_Y_OFFSET);
		rectangle  = new ARectangleModel(rectX, RECT_Y, RECT_WIDTH, 0);			
		rectangle.setFilled(true);
		computeDependentProperties();
	}
	public FlexibleShape getRectangle() {
		return rectangle;
	}
	public FlexibleShape getTextShape() {
		return textShape;
	}
	public void computeDependentProperties() {
		textShape.setText("" + factorialSpreadsheet.getNumber());		
		rectangle.setHeight((int) (factorialSpreadsheet.getFactorial()*PIXELS_PER_INT));		
	}
//	@Override
//	public int getX() {
//		return rectX; ;
//	}
//	@Override
//	public void setX(int newVal) {
//	}	
}
