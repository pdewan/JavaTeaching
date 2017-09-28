package lectures.oegraphics;

import java.awt.event.MouseEvent;

import shapes.FlexibleShape;
import bus.uigen.ObjectEditor;

public class MouseDragBasedMovingHelloWorld {

	public static void main (String[] args) {
		FlexibleShape helloShape = ObjectEditor.drawString("Hello World", 100, 100);	
		processHelloWorldDrags(helloShape);
	}	
	public static void processHelloWorldDrags(FlexibleShape helloShape) {
		while (true) {
			MouseEvent nextInput = ObjectEditor.getMouseDraggedEvent();
			helloShape.setX(nextInput.getX());
			helloShape.setY(nextInput.getY());
		}		
	}
}
