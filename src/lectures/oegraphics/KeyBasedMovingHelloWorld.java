package lectures.oegraphics;

import shapes.FlexibleShape;
import bus.uigen.ObjectEditor;

public class KeyBasedMovingHelloWorld {
	public static final char UP_KEY = 'e';
	public static final char DOWN_KEY = 'x';
	public static final char LEFT_KEY = 's';
	public static final char RIGHT_KEY = 'd';
	public static final int STEP = 10;

	public static void main(String[] args) {
		FlexibleShape helloShape = ObjectEditor.drawString("Hello World", 100, 100);
		processHelloWorldKeys(helloShape);
	}
	
	public static void processHelloWorldKeys(FlexibleShape helloShape) {
		while (true) {
			char nextInput = ObjectEditor.getChar();
			switch (nextInput) {
			case UP_KEY:
				helloShape.setY(helloShape.getY() - STEP);
				break;
			case DOWN_KEY:
				helloShape.setY(helloShape.getY() + STEP);
				break;
			case LEFT_KEY:
				helloShape.setX(helloShape.getX() - STEP);
				break;
			case RIGHT_KEY:
				helloShape.setX(helloShape.getX() + STEP);
				break;
			}
		}	
		
	}

}
