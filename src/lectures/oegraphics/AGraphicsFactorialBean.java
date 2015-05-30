package lectures.oegraphics;

import lectures.recursion.Factorial;
import shapes.FlexibleShape;
import shapes.FlexibleTextShape;
import bus.uigen.ObjectEditor;
import bus.uigen.shapes.ARectangleModel;
import bus.uigen.shapes.AStringModel;

public class AGraphicsFactorialBean implements GraphicsFactorialBean {
	FlexibleShape rectangle;
	FlexibleTextShape textShape;
	public AGraphicsFactorialBean (int rectX, int n) {
		textShape = new AStringModel("" + n, rectX, RECT_Y - TEXT_Y_OFFSET);
		rectangle  = new ARectangleModel(rectX, RECT_Y, RECT_WIDTH, Factorial.factorial(n)*PIXELS_PER_INT);	
		rectangle.setFilled(true);
	}	
	public FlexibleShape getRectangle() {
		return rectangle;
	}
	public FlexibleShape getTextShape() {
		return textShape;
	}
	public static void main (String[] args) {
		ObjectEditor.edit(new AGraphicsFactorialBean(RECT_X,  4));
	}
}
