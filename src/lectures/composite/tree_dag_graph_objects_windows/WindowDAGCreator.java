package lectures.composite.tree_dag_graph_objects_windows;

import javax.swing.JFrame;

import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JTextField;
/*
 * The previous program created a tree structure.
 * This class creates what is known as a DAG structure.
 * Study the program and try to see what is different
 * about the structure created.
 *  
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
/*
 * The previous program created a tree structure.
 * This class creates what is known as a DAG structure.
 * Study the program and try to see what is different
 * about the structure created.
 * 
 * A tree structure is one in which 
 * 	1. there is a unique root node.
 * 
 *  2. a node does not have two parents, that is, two nodes do not point to
 * 	   the same child.
 *   
 * A DAG does not have these constraints.
 * 
 * 
 * A path from a node A to another node B is a sequence of parent-child
 * edges we follow to reach B from A. Not all nodes in a logical structure
 * are reachable from other nodes.
 * 
 * (T/F) A tree can have multiple roots.
 * (T/F) A DAG can have multiple roots.
 *
 * (T/F) In a tree, there is always a unique path from an ancestor node to a descendant node.
 * (T/F) In a DAG, there is always  unique path from an ancestor node to a descendant node.
 * 
 *  
 */	
/*
 * Before you debug this program, try to reason what should happen to 
 * to the display if a textField has two parents.
 * 
 * Debug-Run the program.
 *  What did Java do to the text field?
 * 
 * Go to the rightPanel and leftPanel variables and see if you can reach
 * the text field from both.
 * 
 * 
 * If we assign two parents to a widget, Java:
 * 		(a)  displays two copies of the widget, one in the display area of each
 * 		     parent.
 * 		(b)  re-parents the widget when the second assignment is made.
 * 		(c)  ignores the second assignment.
 * 		(d)  gives an error when the second assignment is made.
 *  
 */
/*
 * Next class: WindowGraphCreator
 */
	 
}
