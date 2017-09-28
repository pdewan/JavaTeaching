package praxis.composite.tree_dag_graph_objects_windows;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JTextField;

public class PraxisWindowTreeDAGOrGraphCreator {
	public static void main (String[] args) {
		createTreeDAGOrGraph();
	}
	public static void createTreeDAGOrGraph () {
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
		// comment this out
		rightPanel.add(button);
		// uncomment this after commenting the upper and lower lines out 
//		rightPanel.add(textField);
		// uncomment this after commenting the above two lines out
//		rightPanel.add(splitPane);
		frame.setSize(300, 100);
		frame.setVisible(true);
	}

}
