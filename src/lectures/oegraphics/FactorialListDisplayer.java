package lectures.oegraphics;

import bus.uigen.ObjectEditor;

public class FactorialListDisplayer implements FactorialGraphics {
	public static final int X_SEPARATION = RECT_WIDTH + 5;
	public static void main (String[] args) {
		int maxNum = 4;
		GraphicsFactorialBean[] factorials = new  GraphicsFactorialBean[maxNum];
		for (int curNum = 1; curNum <= maxNum; curNum++) {
			factorials[curNum-1] = new AGraphicsFactorialBean(curNum*X_SEPARATION, curNum);
		}
		ObjectEditor.edit(factorials);
		ObjectEditor.edit(factorials[0]);
	}
}
