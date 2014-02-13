package lectures.oegraphics;

import java.awt.event.MouseEvent;

import bus.uigen.ObjectEditor;

public class MouseClickBasedDotPainter {
	public static final int DOT_DIAMETER = 20;
	public static void main (String[] args) {
		processMouseClickedCommand();
	}
	public static void processMouseClickedCommand() {
		while (true) {
			MouseEvent nextInput = ObjectEditor.getMouseClickedEvent();
			ObjectEditor.fillOval(nextInput.getX(), nextInput.getY(), DOT_DIAMETER, DOT_DIAMETER);		
		}		
	}

}
