package lectures.composite.tree_dag_graph_objects_windows;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JTextField;
/**
 * A structure in which there is no restriction on the parent-child relationships
 * is a general graph. 
 * 
 * It can have cyles, so we can make an ancextor of a node a child.
 * 
 * A DAG does not allow cycles but does allow children with multiple parents.
 * 
 * So what we attempted to create in the previous program was a DAG.
 * 
 * Here we will try to create a graph with a cycle.
 * 
 * (T/F) In a DAG, there can be multiple paths from the root to a node.
 * 
 * (T/F) A DAG can have cycles.
 * 
 */

public class WindowGraphCreator {
	public static void main (String[] args) {
		createCycle();
	}
	public static void createCycle () {
		JFrame frame = new JFrame();
		JSplitPane splitPane = new JSplitPane();
		frame.add(splitPane);
		JPanel leftPanel = new JPanel();
		JPanel rightPanel = new JPanel();
		splitPane.setLeftComponent(leftPanel);
		splitPane.setRightComponent(rightPanel);
		JTextField textField = new JTextField("Edit me");
		leftPanel.add(textField);
		rightPanel.add(splitPane); // adding the parent of rightPanel as the child of rightPanel
		JButton button = new JButton ("Press me");
		rightPanel.add(button);
		frame.setSize(200, 100);
		frame.setVisible(true);
	}
/**
 * What should happen when the program runs?
 * 
 * What does happen?
 * 
 * If we create a cycle in a widget structure, Java:
 * 		(a)  removes the cycle
 * 		(b)  ignores the operation that creates a cycle.
 * 		(c)  gives a compile time error. * 		
 * 		(d)  gives a runtime error.
 * 
 */
}
