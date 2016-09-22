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
 * It can have cycles, so we can make an ancestor of a node its child.
 * 
 * A DAG ("Directed Acyclic Graph") does not allow cycles but does allow children with 
 * multiple parents.
 * 
 * So, what we attempted to create in the previous program was a DAG.
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
		
		// No need for a breakpoint this time, we won't be going into the debugger
		// unless you choose to for the next question.
	}
/**
 * What should happen when the program runs?
 * 
 * What does happen?
 * 
 * If we create a cycle in a widget structure, Java:
 * 		(a)  removes the cycle
 * 		(b)  ignores the operation that creates a cycle.
 * 		(c)  gives a compile-time error. * 		
 * 		(d)  gives a runtime error.
 * 
 * 		* A compile-time error means that Java is unable to build the code (you get
 * 			something underlined in Eclipse, an error message talking about a
 * 			compilation problem, etc).
 * 		  A runtime error means that the code gets built successfully, but crashes when it runs.
 * 		
 * 			You have probably seen enough compile-time errors to recognize them by this point,
 * 			but if you want to be really sure, put a breakpoint on the first line of the program and
 *          run the debugger. If the code does run, you know it was built successfully. You can
 *          press "Resume" (F8) to continue with the execution of the program when it pauses.
 *          
 *		Next class: ADAGCartesianPlane
 */
}
