package lectures.composite.tree_dag_graph_objects_windows;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JTextField;
// The previous program created a tree structure.
// A tree structure is one in which there is a unique root node.
// Also a node cannot have two parents, that is two nodes cannot point to
// the same child.
// In this program we will try to make textField have two parents.
// Before you debug this program, try to reason what should happen to 
// to the display if a textField has two parents.
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
		rightPanel.add(textField); // making textField a child of rightPanel
		frame.setSize(200, 100);
		frame.setVisible(true);
		// set break point below
		return frame;
	}
	// View the output. What did Java do to the text field?
	// Go to the rightPanel and leftPanel variables and see if you can reach
	// the text field from both.
}
