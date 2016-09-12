package lectures.graphics;
// Study the program, run it, uncomment according to the instructions at the end
import javax.swing.Icon;
import javax.swing.ImageIcon;

import bus.uigen.OEFrame;
import bus.uigen.ObjectEditor;
import util.annotations.StructurePattern;
import util.annotations.StructurePatternNames;


//@StructurePattern(StructurePatternNames.BEAN_PATTERN)
//@StructurePattern(StructurePatternNames.POINT_PATTERN)
//@StructurePattern(StructurePatternNames.LINE_PATTERN)
//@StructurePattern(StructurePatternNames.RECTANGLE_PATTERN)
//@StructurePattern(StructurePatternNames.OVAL_PATTERN)
//@StructurePattern(StructurePatternNames.STRING_PATTERN)
@StructurePattern(StructurePatternNames.IMAGE_PATTERN)

public class AShapeDemo {
	// Not all of these variables will be used at all cases
	static final int INITIAL_X = 40, INITIAL_Y = 80, INITIAL_WIDTH = 200, INITIAL_HEIGHT = 100;
	static final String INITIAL_TEXT = "Hello World", INITIAL_IMAGE_FILE_NAME = "shuttle2.jpg";
    int x = INITIAL_X, y = INITIAL_Y; 
    int width = INITIAL_WIDTH, height = INITIAL_HEIGHT; 
    String text = INITIAL_TEXT;
	String imageFileName = INITIAL_IMAGE_FILE_NAME;	
	public AShapeDemo () {
		Icon icon = new ImageIcon(imageFileName);
		System.out.println ("Image Height:" + icon.getIconHeight() +
				" Image width:" + icon.getIconWidth());
	
	}
    // Not all of these properties are used in all cases
    public int getX() {return x;}
 	public void setX(int newX) {x = newX;}
 	public int getY() { return y; }
 	public void setY(int newY) {y = newY;}
 	public int getWidth() {return width;}
	public void setWidth(int newVal) {width = newVal;}
	public int getHeight() {return height;}
	public void setHeight(int newVal) {height = newVal;}
//  public String getText() {return text;}  
//	public void setText(String newVal) {imageFileName = newVal;} 
  public String getImageFileName() {return imageFileName;}  
  public void setImageFileName(String newVal) {imageFileName = newVal;}     
    public static void main (String[] args ) {
    	OEFrame anOEFrame = ObjectEditor.edit(new AShapeDemo());
    	anOEFrame.showTreePanel();
 // MAIN AND EDITABLE TREE PANEL
    	// Run Main program. You will see both a main panel and a tree panel.
    	// Use the Common->Tree menu item to hide and show the tree panel
    	// Edit the items in the main panel. The tree panel view should change.
    	// Edit the text following : in the tree panel. The main panel should change.
    	// I have noticed that I have to click 3 times before the tree item will become
    	// editable. Here is the documentation of JTree:
    	// "Editing is started on a triple mouse click, or after a click, pause, click and 
    	// a delay of 1200 milliseconds."
    	
    	// When you use the BeanPattern annotation, ObjectEdior displays the properties
    	// in the main panel (and possibly tree view if you create) one without interpreting
    	// the properties in any way. The other annotations, currently commented out
    	// are associated with specific interpretations. To understand them, you will need to
    	// comment out the Bean Pattern annotation and uncomment one of the other commented
    	// annotations.
    	
  // DRAW PANEL, AUTO POINT DISPLAY, JAVA COORDINATE SYSTEM  	
    	// Our first goal is to make this object look like a point.
    	// Uncomment the Point Pattern annotation. This annotation tells ObjectEditor that if this object
    	// has properties expected from a Point, then it should be displayed as a point on the screen.
    	// The current properties of this object are,of course, sufficient to represent a point.
      	// Execute the program. 
    	// The main panel is no longer displayed now, instead we see a draw panel.
    	// You should see a point positioned using the Java coordinate system. Hover over it to see the message.
    	// Try to understand the coordinate system by editing the
    	// X and Y properties in the tree window (if editing it is a pain, just change the 
    	// named constants in this program.
    	
// LINE PATTERN
    	// Comment out the point pattern annotation.
    	
    	// Comment in the line pattern annotation. This annotation tells ObjectEditor that if this object
    	// has properties expected from a Point, then it should be displayed as a line on the screen.
    	// The current properties of this object are not sufficient to represent a line. Uncomment what you think
    	// are the missing properties. Run the program. If you did not include the necessary
    	// properties, ObjectEditor will tell you which ones are missing. Again, edit the
    	// tree view to try and understand how the values of these properties correspond to the 
    	// displayed shape; and hover over the shape.
    	
    	// A line can be represented as a computer object in many ways, not all of which are
    	// supported by ObjectEditor. What we have seen above is on set of properties representing
    	// a line. Think of other possible representations of a line.
  
   // RECTANGLE AND OVAL PATTERN   	
    	// Now change the uncommented annotation to Rectangle Pattern and Oval Pattern
    	// and see the expected result.
    	
   // STRING PATTERN 	
    	// The string pattern annotation is for a String that can be positioned on the screen. 
    	// The X, Y and Text properties are  essential to represent it. The height and width are
    	// supposed to be optional, allowing you to clip the displayed text to the 
    	// desired bounds, but they have stopped to work or I no longer understand
    	// Java's clipping behavior. You do not need such clipping
    	// so comment out the Width and Height properties when you display a string.
    	
  // IMAGE PATTERN  	
    	// The Image pattern is for an image that can be positioned on the screen.
    	// The X, Y and ImageFileNa,me properties are  essential to represent it. 
    	// The height and width are optional, allowing you to scale the displayed image. 
    	// Display the image with and without the optional properties commented out.
    	// Uncomment the constructor code to see how to compute the unscaled width and height.
    	
    	// At this point you can draw any shape in your project - in fact any shape
    	// at all - through ObjectEditor. Later you will draw shapes directly
    	// using Java's API, while still using your ObjectEditor-based code, which is 
    	// actually code based on something called the MVC architecture, to be studied later.
    	
    	
    	
    	
    }

}
