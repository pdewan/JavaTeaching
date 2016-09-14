package lectures.graphics;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import bus.uigen.OEFrame;
import bus.uigen.ObjectEditor;
import util.annotations.StructurePattern;
import util.annotations.StructurePatternNames;

/**
 * This class demonstrated several concepts.
 * 
 * It shows:
 * 
 * 	 
 *   a set of properties that can describe a rectangle.
 * 
 *   this set can also describe an oval and a line.
 * 
 *   a variation of this set can describe a movable text string.
 * 
 *   a variation of this set can describe a movable image.
 *   
 *   
 *   that ObjectEditor can take this set and its variations, together with
 *   an annotation identifying the shape, to display the shape automatically 
 *   in the Java coordinate system.
 *   
 * We will take a single class and give it the behavior of different shapes by
 * adding/deleting properties and associated variables, and changing the 
 * commented out annotations below. 
 * Currently, the class is configured to be a rectangle.
 * 
 *  
 */
//@StructurePattern(StructurePatternNames.BEAN_PATTERN)
//@StructurePattern(StructurePatternNames.POINT_PATTERN)
//@StructurePattern(StructurePatternNames.LINE_PATTERN)
//@StructurePattern(StructurePatternNames.RECTANGLE_PATTERN)
//@StructurePattern(StructurePatternNames.OVAL_PATTERN)
//@StructurePattern(StructurePatternNames.STRING_PATTERN)
@StructurePattern(StructurePatternNames.IMAGE_PATTERN)


public class AShapeDemo {
	/*
	 * Making sure we have no magic numbers
	 */
	static final int INITIAL_X = 40, 
			INITIAL_Y = 80, 
			INITIAL_WIDTH = 200, 
			INITIAL_HEIGHT = 100;
	static final String INITIAL_TEXT = "Hello World", 
			INITIAL_IMAGE_FILE_NAME = "shuttle2.jpg";
	/*
	 * Not all of these variables will be used at all cases
	 */
	
	/*
	 * upper left corner
	 */
    int x = INITIAL_X,
    	y = INITIAL_Y; 
    
    int width = INITIAL_WIDTH, 
    	height = INITIAL_HEIGHT; 
    
    String text = INITIAL_TEXT;
    
	String imageFileName = INITIAL_IMAGE_FILE_NAME;	
	
	public AShapeDemo () {
		/*
		 * The following code makes sense only when this is an image
		 */
//		Icon icon = new ImageIcon(imageFileName);
//		setHeight(icon.getIconHeight());
//		setWidth(icon.getIconWidth());
//		System.out.println ("Image Height:" + icon.getIconHeight() +
//				" Image width:" + icon.getIconWidth());
	
	}
	/*
	 * 	Describe rectangular bounded box   
     */
    public int getX() {return x;} 
 	public void setX(int newX) {x = newX;}
 	public int getY() { return y; }
 	public void setY(int newY) {y = newY;}
 	public int getWidth() {return width;}
	public void setWidth(int newVal) {width = newVal;}
	public int getHeight() {return height;}
	public void setHeight(int newVal) {height = newVal;}
	
	/*
	 * Uncomment these  to make this into a text box
	 */
//	public String getText() {return text;}  
//	public void setText(String newVal) {imageFileName = newVal;} 
	
	/*
	 * Uncomment these out to make this into an image.
	 */
//	public String getImageFileName() {return imageFileName;}  
//	public void setImageFileName(String newVal) {imageFileName = newVal;} 
	
	
	
	
    public static void main (String[] args ) {
    	OEFrame anOEFrame = ObjectEditor.edit(new AShapeDemo());
    	anOEFrame.showTreePanel();
     	
    }
    /*
	 * MAIN AND TREE PANEL
	 * 
	 * To understand the properties of this class, run this program.
	 * 
	 * You will see both a draw panel and a tree panel.
	 * 
	 * Use the Common->Tree menu item to hide and show the tree panel.
	 * 
	 * Edit the items in the main panel. 
	 * 
	 * The tree panel view should change.
	 * 
	 * Edit the text following : in the tree panel. 
	 * 
	 * The main panel should change.
	 * 
	 * I have noticed that I have to click 3 times before the tree item will 
	 * become editable. Here is the documentation of JTree:
	 * "Editing is started on a triple mouse click, or after a click, pause, 
	 * click and a delay of 1200 milliseconds."	
	 *    	
	 * When you use the BeanPattern annotation, ObjectEdior displays the 
	 * properties in the main panel (and possibly tree view if you create) 
	 * one without interpreting	the properties in any way. 
	 * 
	 * The other annotations, currently commented out
	 * are associated with specific interpretations. 
	 * 
	 * To understand them, you will need to	comment out the Bean Pattern 
	 * annotation and uncomment one of the other commented annotations.
	 */
    
	/*
	 * REPRESENTING A RECTANGLE
	 * 
	 * Replace the current @StructurePattern current annotation with the 
	 * @StructurePattern(StructurePatternNames.RECTANGLE_PATTERN)annotation.
	 * 
	 * Run the program.
	 * 
	 * The main panel is no longer displayed now, instead we see a draw panel.
	 * .
	 * 
	 * (T/F) A rectangle can be completely represented by the coordinates
	 * of its upper-left corner.
	 * 
	 * (T/F) A rectangle can be completely represented by its width and  height.
	 * 
	 * (T/F) A rectangle can be completely represented by  the coordinates
	 * of its upper-left corner its width and  height.
	 * 
	 * (T/F) A rectangle A rectangle can be completely represented by  the 
	 * coordinates of its upper-left and lower-right corners.
	 * 
	 * (T/F) A rectangle A rectangle can be completely represented by  the 
	 * coordinates of its upper-left and lower-left corners.
	 * 	    
	 * The properties of this class describe the the width and height a rectangle
	 * and the x and y coordinates of the upper left corner of the rectangle.
	 * 
	 * Do these four properties completely represent the rectangle, that is,
	 * can they be used to draw the complete rectangle?
	 * 
	 * What combination of properties are sufficient to draw a rectangle?
	 * 
	 */
    
    /*
	 * COMPUTER COORDINATE SYSTEM
	 * 
	 * Try to understand the graphics coordinate system by editing the
	 * X and Y properties in the tree window (if editing it is a pain, 
	 * just change the named constants in this program.
	 * 
	 * In a computer coordinate system, the origin is:
	 * 
	 * 	(a) The lower-left corner of the screen.
	 * 	(b) The upper-left corner of the screen.
	 * 	(c) The lower-left corner of the window being used for a graphics
	 * 		operation.
	 * 	(d) The upper-left corner of the window being used for a graphics
	 * 			operation.
	 * 	
	 * 
	 * In a computer coordinate system, x coordinates increase
	 * 	(a) left to right
	 * 	(b) right to left.
	 * 
	 * In a computer coordinate system, y coordinates increase
	 * 	(a) top to bottom.
	 * 	(b) bottom to top.	 
	 *  
	 * Why the difference between Mathematical and Computer coordinate system?
	 * 
	 * Shapes are are drawn using graphics operations targeting some window.
	 * 
	 * The upper left corner of the enclosing window is the origin of the
	 * coordinate system for the operation.
	 * 
	 * As in a mathematical Cartesian Plane, the X axis however goes from 
	 * left to right.
	 * 
	 * The Y axis however goes from top to bottom.
	 * 
	 * This coordinate system mirrors how one reads text in typical natural 
	 * languages, left to right, top to bottom.
	 * 	
	 *
	 */   
    /*
     * LINE AND OVALS
     * 
     * These are not rectangles, but can be described by rectangular bounding
     * boxes.
     * 
     * So the properties of this object (describing the bounding box), together
     * with an identification of the shape are sufficient to completely
     * describe the shape.
     * 
     * Replace the current @StructurePattern current annotation with the 
	 * @StructurePattern(StructurePatternNames.LINE_PATTERN)annotation
	 * and run the program and view the draw panel.
	 * 
	 * Now replace the current @StructurePattern current annotation with the 
	 * @StructurePattern(StructurePatternNames.LINE_PATTERN)annotation
	 * and run the program again and view the shape displayed.     * 
     *
     * 
     */
    /*
     * POSITIONABLE IMAGES
     * 
     * (T/F) A (positionable) unscalable image can be represented by 
     * an image file name and  the coordinates of the upper upper-left 
     * corner of its bounding box.
	 * 
	 * (T/F) A (positionable) scalable image can be represented by an
	 * image file name, the 
     * coordinates of the upper upper-left corner of its bounding box, and
     * the height and width of the box.
	 * 
     * 
     * Uncomment the code defining the ImageFileName property.
     * 
     * Replace the current @StructurePattern current annotation with the 
	 * @StructurePattern(StructurePatternNames.IMAGE_PATTERN)annotation
	 * and run the program and view the draw panel.
	 * 
     * Run the program.
     * 
     * The image should look ugly as it has been scaled up or down to the
     * bounding box defined by the height and width properties.
     * 
     * It is possible to get the unscaled versions of these values - the
     * code is given in the constructor.
     * 
     * Uncomment this code and run the program.
     * 
     * Comment out the getters and setters for height and width and run the
     * program.
     * 
     * We are not using the unscaled versions of the height and width.
     * 
     */
    /*
     * POSITIONABLE STRINGS
     * 
     * (T/F) A (positionable) unscalable texs string can be represented by 
     * a string and  the coordinates of the upper upper-left 
     * corner of its bounding box.
     * 
     * At this point, we have three properties, X, Y and ImageFileName.
     * 
     * Comment of the getter and setter for the ImageFileName property.
     * 
     * Uncomment the getter and setter for the Text property.
     * 
     * Replace the current @StructurePattern current annotation with the 
	 * @StructurePattern(StructurePatternNames.STRING_PATTERN)annotation
	 * and run the program and view the draw panel.
     * 
     */
    /*
     *  POSITIONABLE POINTS     
     * 
     * Now comment the getter and setter for the TEXT property.
     * 
     * At this point we have only two properties: X and Y.
     * 
     * Replace the current @StructurePattern current annotation with the 
	 * @StructurePattern(StructurePatternNames.POINT_PATTERN)annotation
	 * and run the program and view the draw panel.
    */
    /*
     * USE OF STRUCTURE PATTERN
     * 
     * (T/F) StructurePattern annotations can tell a tool how to interpret the
     * properties of an object.
     * 
     * (T/F) StructurePattern annotations can be used to specify the properties
     * of an object.
     * 
     * (T/F) StructurePattern annotations can be used to identify missing 
     * properties.
     * 
     * Replace the current @StructurePattern current annotation with the 
	 * @StructurePattern(StructurePatternNames.LINE_PATTERN)annotation
	 * and run the program and view the draw panel and console.
	 * 
	 * Do you see any error messages/warnings in the console?
     */
    
   

}
