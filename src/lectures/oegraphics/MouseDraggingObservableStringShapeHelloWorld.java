package lectures.oegraphics;

import java.awt.event.MouseEvent;

import lectures.graphics.StringShape;
import lectures.mvc.properties.AnObservableStringShape;
import bus.uigen.OEFrame;
import bus.uigen.ObjectEditor;
import bus.uigen.controller.AComponentInputter;
import bus.uigen.controller.ComponentInputter;

public class MouseDraggingObservableStringShapeHelloWorld {
	public static void main(String[] args) {
		StringShape helloShape = new AnObservableStringShape("hello world", 100, 100);
		OEFrame oeFrame = ObjectEditor.edit(helloShape);
		ComponentInputter inputter = new AComponentInputter(
				oeFrame.getDrawComponent());
		while (true) {
			MouseEvent nextInput = inputter.getMouseDraggedEvent();
			helloShape.setX(nextInput.getX());
			helloShape.setY(nextInput.getY());
		}
	}

}
