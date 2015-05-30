package lectures.oegraphics;

import java.awt.event.MouseEvent;

import bus.uigen.ObjectEditor;

public class MouseDragBasedDotPainter {
	public static final int DOT_DIAMETER = 5;
	public static void main (String[] args) {
		processMouseDraggingCommand();
	}
	public static void processMouseDraggingCommand() {
		while (true) {
			MouseEvent nextInput = ObjectEditor.getMouseDraggedEvent();
			ObjectEditor.fillOval(nextInput.getX(), nextInput.getY(), DOT_DIAMETER, DOT_DIAMETER);
		
		}		
	}

}
