package lectures.oegraphics;

import bus.uigen.ObjectEditor;

public class GraphicsShapes {
	public static void main (String[] args) {
		ObjectEditor.drawRectangle(100, 60, 75, 50);
		ObjectEditor.fillOval(100, 60, 75, 50);
		ObjectEditor.drawLine(100, 60, 75, 50);
//		ObjectEditor.drawString("hello world", 100, 20);
//		ObjectEditor.drawImage("shuttle.jpg", 0, 100);
	}
}
