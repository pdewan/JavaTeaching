package lectures.composite.tree_dag_graph_objects_windows;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JTextField;

public class WindowTreeCreator {
	public static void main (String[] args) {
		createTree();
	}
	public static JFrame createTree () {
		JFrame frame = new JFrame();
		JSplitPane splitPane = new JSplitPane();
		frame.add(splitPane);
		JPanel leftPanel = new JPanel();
		JPanel rightPanel = new JPanel();
		splitPane.setLeftComponent(leftPanel);
		splitPane.setRightComponent(rightPanel);
		JTextField textField = new JTextField("Edit me");
		leftPanel.add(textField);
		JButton button = new JButton ("Press me");
		rightPanel.add(button);
		frame.setSize(200, 100);
		frame.setVisible(true);
		return frame;
	}

}
