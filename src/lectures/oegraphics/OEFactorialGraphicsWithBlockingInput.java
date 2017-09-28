package lectures.oegraphics;

import java.awt.event.MouseEvent;

import lectures.recursion.Factorial;
import shapes.FlexibleShape;
import shapes.TextShape;
import bus.uigen.ObjectEditor;

public class OEFactorialGraphicsWithBlockingInput implements FactorialGraphics {
	public static void main (String[] args) {
		int n = 0;
		TextShape textShape = ObjectEditor.drawString("" + n, RECT_X, RECT_Y - TEXT_Y_OFFSET);
		FlexibleShape rectangle  = ObjectEditor.fillRectangle(RECT_X, RECT_Y, RECT_WIDTH, 0);	
		while (true) {
			MouseEvent nextInput = ObjectEditor.getMouseClickedEvent();
			n++;			
			rectangle.setHeight(Factorial.factorial(n)*PIXELS_PER_INT);	
			textShape.setText("" + n);
		}	
	}	
}
