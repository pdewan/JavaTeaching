package lectures.oegraphics;

import lectures.graphics.ALine;
import lectures.graphics.Line;
import bus.uigen.ObjectEditor;

public class LineAnimator {
	public static final int NUM_STEPS = 20;
	public static final int PAUSE_TIME = 100;
	public static final int WIDTH_INCREMENT = 3;
	public static void main (String[] args) {
		Line line = new ALine(10, 10, 20, 20);
		ObjectEditor.edit(line);
		for (int index = 1; index < NUM_STEPS; index++) {
			line.setWidth(line.getWidth() + WIDTH_INCREMENT);
			try {
				Thread.sleep(PAUSE_TIME);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
