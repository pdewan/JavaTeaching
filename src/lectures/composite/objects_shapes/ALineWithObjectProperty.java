package lectures.composite.objects_shapes;

import lectures.graphics.ACartesianPoint;
import lectures.graphics.Point;
import util.annotations.StructurePattern;
import util.annotations.StructurePatternNames;
import util.misc.ThreadSupport;
import bus.uigen.OEFrame;
import bus.uigen.ObjectEditor;
@StructurePattern(StructurePatternNames.LINE_PATTERN) 
/**
 *   
 * In all objects we have seen in Praxis or assignments so far, 
 * the instance variables and properties
 * were primitive values (or Strings in assignments).Thus, these objects are "composed" of 
 * primitive values and Strings. None of the component objects themselves had
 * properties.
 * 
 * This class defines an object that has both a variable and a property that is
 * itself a Bean,
 * 
 * So, we have a Bean composed of another Bean, or in other words, we have
 * "object nesting" with a parent/child relationship, where the part is called
 * a child of the containing object.
 * 
 * Yet this is an atomic shape - a line - as the StructurePattern annotation
 * shows.
 * 
 * Look through this program. Go to the declaration of both the the interface 
 * Point and the class ACartesianPoint used here.
 * 
 * After that look at AnInteger.
 */
public class ALineWithObjectProperty implements LineWithObjectProperty {
	public static final int INIT_X = 10;
	public static final int INIT_Y = 10;
	public static final int INIT_WIDTH = 20;
	public static final int INIT_HEIGHT = 20;
	int width, height;
	
	Point location;	// an non-primitive variable!
	
	public ALineWithObjectProperty(
		Point initLocation, int initWidth, int initHeight) {

		location = initLocation;	// comment this out on the second run
		width = initWidth;
		height = initHeight;	
	}
	
	public Point getLocation() {return location;}					// a non-primitive property!
	public void setLocation(Point newVal) {location = newVal;}
	
	public int getWidth() {return width;}
	public void setWidth(int newVal) {width = newVal;}
	public int getHeight() {return height;}
	public void setHeight(int newHeight) {height = newHeight;}	
	
	public static void main(String args[]) {
			LineWithObjectProperty line =  new ALineWithObjectProperty(
					new ACartesianPoint(INIT_X, INIT_Y), INIT_WIDTH, INIT_HEIGHT);		
			OEFrame aFrame = ObjectEditor.edit (line);
			aFrame.showTreePanel();
			/*
			 * Click on the grey/blue bar left of the following line to set
			 * a break point before you run the program.
			 * 
			 */
			line.setHeight(line.getHeight()*2);
			aFrame.refresh();
		}
}
/*
 * Bean vs non Bean Properties
 * 
 * The Bean properties of ALineWithObjectProperty are:
 *    (a) Width
 *    (b) Height
 *    (c) Location
 *    (d) None of the above
 * 
 */
/*
 * LOGICAL (EXTERNAL) vs. PHYSICAL (INTERNAL) STRUCTURE
 * 
 * We can decompose a physical object based on what is externally visible or
 * how it is internally organized. For example we decompose a human hand into
 * its individual fingers or the various bones that make up the hand.
 * 
 * Similarly can decompose ("break apart") an object by the values assigned to its 
 * instance variables or properties.
 * 
 * Decomposing an object by its instance variables creates its internal or 
 * physical structure.
 * 
 * Decomposing an object by its properties creates its external or logical structure.
 * 
 * The physical structure represents how the object is physically stored in memory.
 * 
 * The logical structure describes how the object is logically structured by someone
 * looking at its public instance methods.
 * 
 * The debugger and ObjectEditor provide visualizations of these structures,
 * respectively.
 * 
 * We will use these visualizations to describe common concepts in these 
 * structures.
 * 
 * Set the break point as instructed by the comment in the main method.
 * 
 * Execute the Run-->Debug As command (F11 key).
 * 
 * The ObjectEditor window should be shown, the program should stop or
 * break at the line with the breakpoint you placed, and you should be
 * in the Debug perspective.
 */

/*
 * VISUALIZING THE TWO STRUCTURES
 * 
 * Execute the Run->Step Into command ((Fn) F5) to step into the getter called
 * and step return back ((Fin) F7).
 * 
 * Now execute again the Run->Step Into command ((Fn) F5) to step into the setter. 
 *   
 * Look at the top right window and select the left tab: Variables (if not
 * already selected). 
 * 
 * It shows two variables. 
 * 
 * One is the variable, newHeight, look its value.
 * 
 * When setHeight is called in ALineWithObjectProperty, the value of newHeight shown
 * by the debugger is:
 *     (a) 0
 *     (b) the parameter passed by main to the setHeight() method (INIT_HEIGHT).
 *     (c) None of the above
 *     
 * The variable newHeight is a:
 *     (a) local variable created when the method is called and deleted it ends
 *     (b) global variable persisting between invocations (calls) of the method
 * 
 * The other is the variable, this, which refers to the object 
 * on which the setter is being executed.
 * 
 * Press on the arrow to the left of "this" to expand it, and expand
 * the "location" item   
 * 
 * Similarly, expand the Location item in the tree view displayed 
 * by ObjectEditor.
 * 
 * So you have two tree views displayed now, one by ObjectEditor 
 * and one by the debugger.
 * 
 * Some items are similar (ignoring the case) and some are different.
 * 
 * The structure (tree view) created by ObjectEditor is the logical (external) structure and
 * the one created by the debugger is the physical (internal) structure.			

 * As we see in the two structures, names and values are displayed 
 * for primitive components of an object, and expandable names are 
 * shown for object components (location, in this case). 
 * 
 * Under "this", the debugger displays items corresponding to:
 * (a) local variables of the object.
 * (b) global variables of the object.
 * (c) properties of the object. 
 * 
 * In the tree view, ObjectEditor displays items corresponding to:
 * 
 * (a) local variables of the object.
 * (b) global variables of the object.
 * (c) properties of the object. 
 * 
 * (T/F) A debugger shows the physical structure of an object.
 * (T/F) ObjectEditor shows the physical structure of an object.
 * 
 * The logical structure of an object is its decomposition by its:
 *    (a) variables.
 *    (b) properties.
 * 
 */
/*
 * STRUCTURE-BASED TERMINOLOGY
 *  
 * Both physical and logical structures involve common concepts of root, 
 * internal nodes, and leaves,defined below.
 * 
 * In computer science, the items in a structure are called nodes, 
 * which have names and possibly values and children (sub structures).
 *  
 * A node with no children is a leaf node in the structure.
 * 
 * A non leaf node is a parent or structured node.
 * 
 * A node with no parent is a root node in the structure.
 * 
 * Any node that is not a leaf or root is an internal or interior node.
 * 
 * If B is the child of A, and C is a child (or descendant) of B then 
 * B and C are descendants of A and A and B are ancestors of C.
 * 
 * A path from an ancestor to a descendant is a series of  connected edges
 * (representing parent-child edges)leading from the ancestor to the descendant.
 * 
 *  The length of the path is the number of edges in the path.
 * 
 * A node is considered to have a path to itself of length 0.
 *
 * (T/F) In (logical or physical) structure with a unique root, a path exists from 
 *  the root to every other node.
 *  
 *  (T/F) In (logical or physical) structure with a unique root, a path exists from 
 *  each parent node to every other node.
 * 
 * Children of the same node are called siblings.
 * 
 * To visualize the structure, a parent is connected to a child through a 
 * (directed) line segment called an edge that goes from parent to child. 
 * Usually the arrow in the segment is not shown as the parent is drawn
 * above the child.
 * The tree view in object editor uses such a visualization.
 * The debugger uses indentation to show child relationships. 
 * 
 * An edge is a:
 *   a) directed line segment showing a parent-child relationship.
 *   b) undirected line segment showing a parent-child relationship.
 *   c) the set of all leaf nodes.
 *   d) None of the above.
 *   
 * Nodes represent the:
 *   parent-child relationships among the element compositions in a structure.
 *   elements themselves.
 *   None of the above.
 *   

 * Identify the root, a leaf, a parent, and an internal node 
 * in the two structures.
 * 
 * (T/F) The physical structure of ALineWithObjectProperty has a parent
 * node labeled "location". 
 * 
 * (T/F) The physical structure of ALineWithObjectProperty has a root
 * node labeled "this".
 * 
 * (T/F) The physical structure of ALineWithObjectProperty has a parent
 * node labeled "this".
 * 
 * (T/F) The physical structure of ALineWithObjectProperty has a parent
 * node labeled "x".
 * 
 * (T/F) The physical structure of ALineWithObjectProperty has a leaf
 * node labeled "radius".
 * 
 * (T/F) The logical structure of ALineWithObjectProperty has a leaf
 * node labeled "Radius".
 * 
 * Now comment out the statement in the constructor that assigns to location
 * and debug the program again (F11), stepping into the break point.

 * Can you explain how each of the two tree views has changed and why?
 * 
 * Do the tree views show the same nodes as previously?
 *
 * Does the debugger show the same nodes as previously when you call setLocation?
 * 
 * (T/F) Different instances of the same class can have different logical structures 
 * depending on if and what values are assigned to the properties.
 *  
 * (T/F) Different instances of the same class can have different physical structures 
 * depending on if and what values are assigned to the variables.
 */

/*
 * ATOMIC VS STRUCTURED TYPE
 * 
 * A type whose logical and physical structure has only one leaf node is an 
 * atomic type - it cannot be decomposed into multiple components.
 * 
 * A primitive type is always an atomic type.
 * 
 * Some object types may also be atomic types depending on the instance
 * variables/properties they define.
 * 
 * A non-atomic type is a structured type - these types can be decomposed into
 * more than one component. 
 *
 * 
 * (T/F) int is an atomic type
 * 
 * Go to the declaration of Point
 * 
 * (T/F) Point is a structured type.
 * 
 * Go to the declaration of MyInteger
 * 
 * (T/F) MyInteger is a structured type.
 */

/*
 * COMPOSITE VS. NON-COMPOSITE  TYPES
 * 
 * A structured type with at least one internal structured node is a 
 * composite type - such a type has a component that is itself structured.
 * 
 * (T/F) Point is a composite type.
 * (T/F) ALineWithObjectProperty is a composite type.
 *  
 */
/*
 * COMPOSITE SHAPES VS OBJECTS
 * 
 * In this example, the ObjectEditor tree view was structured but not the
 * graphics view, because the object simply represented a line that used a 
 * Point object rather than x,y coordinates for the location. 
 * (We recommend using x,y coordinates for location in your project to avoid 
 * some subtle problems)
 * 
 * The next example shows a structured shape.
 * 
 * Next class: ACartesianPlane
 *
 */

