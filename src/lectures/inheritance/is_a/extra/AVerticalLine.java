package lectures.inheritance.is_a.extra;

import lectures.graphics.extra.ALine;
import lectures.graphics.extra.Line;
import util.annotations.StructurePattern;
import util.annotations.StructurePatternNames;
import bus.uigen.ObjectEditor;
@StructurePattern(StructurePatternNames.LINE_PATTERN)
public class AVerticalLine extends ALine {
	public AVerticalLine (int initX, int initY, int initHeight) {
		super (initX, initY, 0, initHeight);
	}
	public void setWidth(int newVal) {
		
	}
	public static void main (String[] args) {
		System.out.println(checkLine (new ALine(10, 10, 50, 50), 10));
		System.out.println(checkLine (new AVerticalLine(10, 10, 50), 10));
		ObjectEditor.edit(new AVerticalLine(25, 25, 50));
	}
	public static boolean checkLine(Line aLine, int aWidth) {
		aLine.setWidth(aWidth);
		return aLine.getWidth() == aWidth;		
	}
}
