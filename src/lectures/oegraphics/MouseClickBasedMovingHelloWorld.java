package lectures.oegraphics;

import java.awt.event.MouseEvent;

import shapes.FlexibleShape;
import bus.uigen.ObjectEditor;

public class MouseClickBasedMovingHelloWorld {
	
	public static void main (String[] args) {
		FlexibleShape helloShape = ObjectEditor.drawString("Hello World", 100, 100);	

		CustomizedGraphicsHelloWorld.customizeHello(helloShape);
		processMouseMovingCommand(helloShape);
	}
	public static void processMouseMovingCommand(FlexibleShape aHelloShape) {
		while (true) {
			MouseEvent nextInput = ObjectEditor.getMouseClickedEvent();
			aHelloShape.setX(nextInput.getX());
			aHelloShape.setY(nextInput.getY());
		}		
	}

}
