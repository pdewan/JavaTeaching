package lectures.composite.objects_shapes;

import lectures.graphics.ACartesianPoint;
import lectures.graphics.Point;
import util.annotations.StructurePattern;
import util.annotations.StructurePatternNames;
import util.misc.ThreadSupport;
import bus.uigen.OEFrame;
import bus.uigen.ObjectEditor;
@StructurePattern(StructurePatternNames.LINE_PATTERN) 
// In all objects we have seen so far, the instance variables and properties
// were primitive values. Thus, these objects are composed of primitive values.
// This class defines an object that has both a variable and a property of a non primitive
// type. So we have an object composed of another object, or in other words, we have
// object nesting with parent/child relationship.

// Look carefully at the code both the interface Point and the class ACartesianPointPoint used
// here.

// Look through this program. Go to the declaration of both the the interface Point and the class ACartesianPointPoint used
// here.

/// Identify the instance variable and property whose type is
// an object type (class or interface) rather than a primitive type,

public class ALineWithObjectProperty implements LineWithObjectProperty {
	int width, height;
	Point location;
	public ALineWithObjectProperty(
		Point initLocation, int initWidth, int initHeight) {
		// comment this out on the second run
		location = initLocation;
		width = initWidth;
		height = initHeight;	
	}
	public Point getLocation() {return location;}
	public void setLocation(Point newVal) {location = newVal;}
	public int getWidth() {return width;}
	public void setWidth(int newVal) {width = newVal;}
	public int getHeight() {return height;}
	public void setHeight(int newHeight) {height = newHeight;}	
	public static void main(String args[]) {
			LineWithObjectProperty line =  new ALineWithObjectProperty(
					new ACartesianPoint(10, 10), 20, 20);
			OEFrame aFrame = ObjectEditor.edit (line);
			aFrame.showTreePanel();
			// click on the grey/blue bar left of the following line to set a break point
			line.setHeight(line.getHeight()*2);
			aFrame.refresh();
			// Execute the Run-->Debug As command (F11 key).
			// The ObjectEditor window should be shown and the program should stop or
			// break at the line with the breakpoint and you should be in the Debug perspective.
			// Execute the Run->Step Into command (F5) to step into the setter called.
			// Look at the top right window. It shows two variables. 
			// One is the variable, newHeight, holding the parameter value passed to the setter. 
			// Verify its value is correct.
			// The other is the variable, this, which refers to the object on which the setter is being execute.
			// Press on the arrow on the left of "this" to expand it, and expand the location item also.
			// Similarly, expand the Location item in the tree view displayed by ObjectEditor.
			// So you have two tree views displayed now, one by ObjectEditor and one by the debugger.
			// Some items are similar (modulo the case) and some are different.
			// Can you explain what criteria the two tools are using to decompose the object?
			
			// The structure created by ObjectEditor is the logical structure and
			// the one created by the debugger is the physical structure
			

			// As we see in the two structures, named and values are displayed for primitive components
			// of an object, and expandable names are shown for object components. 
			
			// In computer science, the items in a structure are called nodes, which have names
			// and possibly values and children (sub structures). 
			// A node with no children is a leaf node in the structure.
			// A non leaf node is a composite node.
			// A node with no parent is a root node in the structure.
			// Any other node is an internal node.
			// If A is a child of B and C is a child of B then 
			// B and C are descendants of A and A and B are ancestors of C
			
			// To visualize the structure, a parent is connected to a child through a 
			// line segment called an edge. Both tree views use such a visualization.
			
			// Identify the root, a leaf, a composite, and an internal node in the two structures

			
			
			// Now comment out the statement in the constructor that assigns to location
			// and debug the program again (F11), stepping into the break point.
			
			// Can you explain how each of the two tree views has changed and why?
			// Do the tree views show the same nodes as previously?
			
			// In this example, the ObjectEditor tree view was structured but not the
			// graphics view, because the object simply represented a line, using a 
			// Point object rather than x,y coordinates for the location. (I recommend using
			// X,y coordinates for your project to avoid some subtle problems)
			
			// We will see next an example in which the graphics view itself is structured.
			
			 
			
		
//			OEFrame editor = bus.uigen.ObjectEditor.edit (line);
//			for (int i = 0; i < 10; i++) {
//				int newX = line.getLocation().getX() + 5;
//				line.setLocation(new ACartesianPoint(newX, line.getLocation().getY() ));
//				ThreadSupport.sleep(300);
//				editor.refresh();
//			}
		}
}
