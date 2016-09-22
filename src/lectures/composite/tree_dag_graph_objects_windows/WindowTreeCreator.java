package lectures.composite.tree_dag_graph_objects_windows;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JTextField;
/**
 * Let us create a logical and physical structure very different from the
 * Cartesian Plane - one that teaches you something about how a GUI is 
 * implemented.
 * 
 * This structure is composed of different kinds of "widgets" - 
 * items that can be displayed on the screen and possibly manipulated by the user.
 * 
 * 
 * The widgets used here are a button, a textfield, two panels, a split pane, 
 * and a frame (top level window).
 * 
 * If we want a widget to be displayed in another widget, 
 * then we must make it a child of the latter.
 * 
 * Or conversely, a child of a widget is displayed within the area of the parent
 * widget.
 * 
 * Every displayed widget must have a frame as its ancestor, otherwise it is not 
 * displayed.
 * 
 * In Java, a frame is an instance of the Frame or JFrame classes.
 * 
 * Study the program, and run it in the debug mode, stopping at the break point that
 * you are asked to place.
 * 
 * (T/F) A widget can be displayed only if is a leaf of a widget structure rooted
 * by a frame.
 * 
 * (T/F) A widget is displayed within its parent widget.
 *
 */
public class WindowTreeCreator {
	public static void main (String[] args) {
		createTree();
	}
	public static JFrame createTree () {
		
		JFrame frame = new JFrame(); // creating widget structure root
		
		JSplitPane splitPane = new JSplitPane();
		frame.add(splitPane); // split pane is now a descendant of frame
		
		JPanel leftPanel = new JPanel();
		JPanel rightPanel = new JPanel();
		splitPane.setLeftComponent(leftPanel); //  leftPanel is now the left child of split pane
		splitPane.setRightComponent(rightPanel);// rightPanel is now the right child of split pane
		
		JTextField textField = new JTextField("Edit me");
		leftPanel.add(textField); // textField is now a child of leftPanel
		
		JButton button = new JButton ("Press me");
		rightPanel.add(button); // button is now a child of rightPanel
		
		frame.setSize(200, 100);
		frame.setVisible(true);
		
		// set break point at this return statement
		return frame;
	}
/*
 * 
 * When the program stops, verify the containment relationship on the screen 
 * among widgets and their children.
 * 
 * Now verify the parent-child relationship itself by looking in the "Variables" tab
 * in the debugger.
 * 
 * Start with the splitPane.
 * 
 * Each of these widgets has an instance variable called "component", which can be expanded 
 * to see the (physical) children under "elementData".
 * 
 * Verify that you can reach the text field or button from the splitPane.
 * 
 * In WindowTreeCreator, a JPanel instance is:
 * 		(a) the root of the widget tree.
 * 		(b) an interior node of the widget tree,
 * 		(c) a leaf of the widget tree.
 * 
 * In WindowTreeCreator, a JTextField instance is:
 * 		(a) the root of the widget tree.
 * 		(b) an interior node of the widget tree,
 * 		(c) a leaf of the widget tree.
 * 
 *  In WindowTreeCreator, a JFrame instance is:
 * 		(a) the root of the widget tree.
 * 		(b) an interior node of the widget tree,
 * 		(c) a leaf of the widget tree.
 * 
 */
 /*
  * Next class: WindowDAGCreator 
  */

}
