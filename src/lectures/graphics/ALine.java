package lectures.graphics;
import util.annotations.StructurePattern;
import util.annotations.StructurePatternNames;
import util.misc.ThreadSupport;
import bus.uigen.OEFrame;
@StructurePattern(StructurePatternNames.LINE_PATTERN) 
public class ALine implements Line {
	int x, y, width, height;
	public ALine (int initX, int initY, int initWidth, int initHeight) {
		x = initX; 
		y = initY;
		width = initWidth;
		height = initHeight;	
	}
	public int getX() {return x;}
	public void setX(int newX) {x = newX;}
	public int getY() { return y; }
	public void setY(int newY) {y = newY;}
	public int getWidth() {return width;}
	public void setWidth(int newVal) {width = newVal;}
	public int getHeight() {return height;}
	public void setHeight(int newHeight) {height = newHeight;}	
	public boolean equals(Object otherVal) {
		if (!(otherVal instanceof Line)) {
			return false;
		}
		Line otherLine = (Line) otherVal;
		return (x == otherLine.getX() && y == otherLine.getY() && width == otherLine.getWidth() && height == otherLine.getHeight());
	}
	public static void main(String args[]) {
		Line line = new ALine(10, 10, 20, 20);
		OEFrame editor = bus.uigen.ObjectEditor.edit (line);
		for (int i = 0; i < 10; i++) {
			int newX = line.getX() + 5;
			line.setX(newX);
			ThreadSupport.sleep(300);
			editor.refresh();
		}
	}
}
