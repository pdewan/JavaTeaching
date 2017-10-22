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
	/**
	 * Also take a look at the equals() method to see how a comparison method 
	 * might be written for a specific class. It overrides a generic Object equals()
	 * method that only returns true if two object variables refer to the exact same object,
	 * not when they refer to different equivalent objects.
	 */
	public boolean equals(Object otherVal) {
		if (!(otherVal instanceof Line)) {
			return false;
		}
		Line otherLine = (Line) otherVal;
		return (x == otherLine.getX() && y == otherLine.getY() && 
				width == otherLine.getWidth() && height == otherLine.getHeight());
	}
	
	protected final static int NUM_STEPS = 10;
	protected final static long SLEEP_TIME = 500;
	protected final static int X_STEP = 10;
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

	
	protected static final int INIT_X = 10;
	protected static final int INIT_Y = 10;
	protected static final int INIT_WIDTH = 30;
	protected static final int INIT_HEIGHT = 30;

	/**
	 * Supplies the parameters to animateLine
	 */
	public static void main(String args[]) {
		Line aLine = new ANonObservableLine(INIT_X, INIT_Y, INIT_WIDTH, INIT_HEIGHT);
		OEFrame editor1 = ObjectEditor.edit (aLine);
		OEFrame editor2 = ObjectEditor.edit (aLine);
//		OEFrame editor3 = ObjectEditor.edit (aLine);
		animateLine (aLine, editor1, editor2);
	}
/*
 * Study the animateLine() and main methods and run the main method to
 * create the animation.
 * 
 * Uncomment the code to create editor3 and change animateLine if necessary to 
 * refresh all three editors.
 * 
 * In ANonObservableLine, which of the following is required to animate the line in 
 * a third editor:
 * 
 * (a) The header of animateLine() must be changed.
 * (b) The body of animateLine() must be changed.
 * (c) None of the above.
 * 
 * (T/F) animateLine() in ANonObservableLine is aware of the the user-interface
 * code (OEFrame) objects displaying the lines. 
 * 
 * In ANonObservableLine, which methods are aware of the OE frames displaying
 * a line object:
 * 
 *    (a) The main method.
 *    (b) animateLine()
 *    (c) equals()
 * 
 * (T/F) Code that manipulates an object (e.g. animateLine()) should be aware of
 * the user-interface code (e.g. ObjectEditor) that displays it.  
 * 
 * (T/F) Asking code that manipulates an object (e.g. animateLine()) to call the
 * ObjectEditor refresh method is consistent with the separation of concerns
 * principle.
 *  
 *  Go to: AnObservableLine
 */
}
