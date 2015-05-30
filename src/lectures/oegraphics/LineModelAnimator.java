package lectures.oegraphics;

import lectures.main_consoleinput.Console;
import shapes.AttributedShape;
import bus.uigen.ObjectEditor;
import bus.uigen.shapes.ALineModel;

public class LineModelAnimator {
	public static void main (String[] args) {
		AttributedShape line = new ALineModel(10, 10, 20, 20);
		ObjectEditor.edit(line);
		Console.readString();
		for (int index = 1; index < 20; index++) {
			line.setWidth(line.getWidth() + 3);
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
