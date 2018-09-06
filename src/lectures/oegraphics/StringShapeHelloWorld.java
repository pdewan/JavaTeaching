package lectures.oegraphics;

import lectures.graphics.extra.AStringShape;
import lectures.graphics.extra.StringShape;
import bus.uigen.OEFrame;
import bus.uigen.ObjectEditor;

public class StringShapeHelloWorld {
	public static void main(String[] args) {
		StringShape helloShape = new AStringShape("hello world", 100, 100);
		OEFrame oeFrame = ObjectEditor.edit(helloShape);		
	}
}
