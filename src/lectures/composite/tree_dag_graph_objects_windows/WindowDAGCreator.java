package lectures.composite.tree_dag_graph_objects_windows;

import javax.swing.JFrame;

import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JTextField;
/*
 * The previous program created a tree structure.
 * 
 * A tree structure is one in which 
 * 	  (a) there is a unique root node.
 * 
 *    (b) a node does not have two parents, that is two nodes do not point to
 * 		   the same child.
 * 
 * In this program we will try to make textField have two parents.
 * 
 * Before you debug this program, try to reason what should happen to 
 * to the display if a textField has two parents.
 */
public class WindowDAGCreator {
	public static void main (String[] args) {
		createDAG();
	}
	public static JFrame createDAG () {
		JFrame frame = new JFrame();
		JSplitPane splitPane = new JSplitPane();
		frame.add(splitPane);
		JPanel leftPanel = new JPanel();
		JPanel rightPanel = new JPanel();
		splitPane.setLeftComponent(leftPanel);
		splitPane.setRightComponent(rightPanel);
		JTextField textField = new JTextField("Edit me");
		leftPanel.add(textField); // making textField a child of leftPanel
		rightPanel.add(textField); // making textField also a child of rightPanel
		frame.setSize(200, 100);
		frame.setVisible(true);
		// set break point below
		return frame;
	}
	
/**
 * View the output. What did Java do to the text field?
 * 
 * Go to the rightPanel and leftPanel variables and see if you can reach
 * the text field from both.
 * 
 * (T/F) In a tree there an be two paths from the root to a node.
 * 
 * If we assign two parents to a widget, Java:
 * 		(a)  displays two copies of the widget, one in the display area of each
 * 		     parent.
 * 		(b)  reparents the widget when the second assignment is made.
 * 		(c)  ignores the second assignment.
 * 		(d)  gives an error when the second assignment is made.
 *  
 *
 */
/*
 * Next class: WindowGraphCreator
 */
	 
}
