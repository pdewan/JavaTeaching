package lectures.oegraphics;

import shapes.FlexibleShape;
import util.misc.Console;
import bus.uigen.ObjectEditor;

public class GreetingAnimator {
	public static final int INIT_X = 100;
	public static final int INIT_Y = 100;
	public static final int X_INCREMENT = 3;
	public static final int INIT_FONT_SIZE = 10;
	public static final int FONT_SIZE_INCREMENT = 1;
	public static final int NUM_STEPS = 18;
	public static final int PAUSE_TIME = 100;
	public static void main (String[] args) {
		FlexibleShape greeting = ObjectEditor.drawString("Hello World", INIT_X, INIT_Y);
		Console.readLine();
		for (int index = 1; index < NUM_STEPS; index++) {
			greeting.setX(INIT_X+ index*X_INCREMENT);
			greeting.setFontSize(INIT_FONT_SIZE + index*FONT_SIZE_INCREMENT);
			try {
				Thread.sleep(PAUSE_TIME);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		ObjectEditor.removeShape(greeting);
	}

}
