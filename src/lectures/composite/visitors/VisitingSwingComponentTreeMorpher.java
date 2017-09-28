package lectures.composite.visitors;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;

import lectures.composite.tree_dag_graph_objects_windows.WindowTreeCreator;

public class VisitingSwingComponentTreeMorpher extends WindowTreeCreator {	
	public static final Color COLOR = Color.CYAN;
	public static final int MAGNIFICATION = 2;
	public static void main(String[] args) {
		JFrame aFrame = createTree();
		Container root = aFrame.getContentPane();
		SwingComponentTreeTraverser.traversePostOrder(root, new AComponentMagnifier(MAGNIFICATION));
		SwingComponentTreeTraverser.traversePostOrder(root, new AComponentColorer(COLOR));
		SwingComponentTreeTraverser.traversePreOrder(root, new AComponentMagnifier(MAGNIFICATION));

	}	
}
