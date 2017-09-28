package lectures.oegraphics;

import java.awt.Color;

import shapes.FlexibleShape;
import bus.uigen.ObjectEditor;

public class CustomizedGraphicsHelloWorld {
	public static void customizeFrame() {
		ObjectEditor.setShapeDrawerFrameSize(320, 240);
		ObjectEditor.setShapeDrawerBackground (new Color(86, 160, 211));
	}
	public static FlexibleShape sayHello() {		
		FlexibleShape textShape = ObjectEditor.drawString("Hello World", 100, 100);	
		return textShape;		
	}
	public static void customizeHello(FlexibleShape aShape) {
		aShape.setColor(Color.CYAN);
		aShape.setFontSize(18);
	}	
	public static void main (String[] args) {
		customizeFrame();
		FlexibleShape helloShape = sayHello();
		customizeHello(helloShape);
	}
}
