package lectures.mvc.properties.atomic;
import java.awt.Color;

import lectures.graphics.Line;
import util.annotations.StructurePattern;
import util.annotations.StructurePatternNames;
import util.misc.ThreadSupport;
import bus.uigen.OEFrame;
import bus.uigen.ObjectEditor;
@StructurePattern(StructurePatternNames.LINE_PATTERN) 
/**
 * This is very much the template code for line that you have been using.
 * 
 * Its purpose is to show you why calling refresh() on ObjectEditor is bad.
 * 
 * Study the code and follow the instructions at the end.
 * 
 * Also take a look at the equals() method to see how a comparison method 
 * might be written for a specific class. It overrides a generic Object equals()
 * method that only returns true if two object variables refer to the exact same object,
 * not when they refer to different equivalent objects.
 * 
 */
public class ANonObservableLine implements Line {
	int x, y, width, height;
	public ANonObservableLine (int initX, int initY, int initWidth, int initHeight) {
		x = initX; 
		y = initY;
		width = initWidth;
		height = initHeight;	
	}
	public Color getColor() {
		return Color.WHITE;
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
	
	protected static int NUM_STEPS = 10;
	protected static long SLEEP_TIME = 500;
	protected static int X_STEP = 10;
	/**
	 * Creates an animation displayed in two editors.
	 */
	public static void animateLine (
			Line aLine, 
			OEFrame editor1, 
			OEFrame editor2) {		
		for (int i = 0; i < NUM_STEPS; i++) {
			int newX = aLine.getX() + X_STEP;
			aLine.setX(newX);
			ThreadSupport.sleep(SLEEP_TIME);
			editor1.refresh();
			editor2.refresh();
		}
	}
	
	/**
	 * Supplies the parameters to animateLine
	 */
	public static void main(String args[]) {
		Line aLine = new ANonObservableLine(10, 10, 30, 30);
		OEFrame editor1 = ObjectEditor.edit (aLine);
		OEFrame editor2 = ObjectEditor.edit (aLine);
//		OEFrame editor3 = ObjectEditor.edit (aLine);
		animateLine (aLine, editor1, editor2);
	}
/*
 * Study the animateLine() and main methods and run the main method to
 * create the animation.
 * 
 * Uncomment the code to create editor3 and change animateLine to 
 * refresh all three editors.
 * 
 * Note that animateLine must be passed an extra parameter and the loop
 * must be changed.
 * 
 * This is because the animation code  must know about each editor 
 * that displays a line.
 * 
 * (T/F) Calling the refresh() method on ObjectEditor is bad because it forces
 * code animating an object to know about ObjectEditor frames displaying it.
 *  
 * (T/F) Asking user-interface code to redisplay a computation object
 *  is bad because it does not support the separation of concerns principle.
 *  
 *  Go to: AnObservableLine
 */
}
