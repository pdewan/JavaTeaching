package lectures.oegraphics;

import lectures.graphics.extra.Line;
import lectures.main_consoleinput.Console;
import lectures.mvc.properties.atomic.AnObservableLine;
import bus.uigen.ObjectEditor;

public class ObservableLineAnimator {
	public static void main (String[] args) {
		Line line = new AnObservableLine(10, 10, 20, 20);
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
