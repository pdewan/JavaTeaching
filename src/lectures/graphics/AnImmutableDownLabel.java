package lectures.graphics;
import bus.uigen.ObjectEditor;
//import util.annotations.StructurePatternNames;
//@util.annotations.StructurePattern(util.annotations.StructurePatternNames.LABEL_PATTERN)
public class AnImmutableDownLabel implements ImmutableLabel {
	int x, y;
	int width = 100;
	int height = 100;
	String imageFileName = "dn.gif";
	String text = "Down Button";	
	public AnImmutableDownLabel(int theX, int theY) {
		x = theX;
		y = theY;
	}
	public int getX() {return x;}	
	public int getY() {return y;}	
	public int getWidth() {return width;}	
	public int getHeight() {return height;}	
	public String getText() {return text;}
	public String getImageFileName() {return imageFileName;}	
	public static void main (String args[]) {
		ObjectEditor.edit(new AnImmutableDownLabel(0, 0));
	}
}
