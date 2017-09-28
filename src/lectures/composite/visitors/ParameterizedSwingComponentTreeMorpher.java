package lectures.composite.visitors;

import java.awt.Component;
import java.awt.Container;

import javax.swing.JFrame;

import lectures.composite.tree_dag_graph_objects_windows.WindowTreeCreator;

public class ParameterizedSwingComponentTreeMorpher extends
		SwingComponentTreeMorpher {
	public static void main(String[] args) {
		JFrame aFrame = WindowTreeCreator.createTree();
		Container root = aFrame.getContentPane();
		traverseInOrder(root, VisitOption.COLOR);
	}

	public static void traverseInOrder(Component aComponent,
			VisitOption aVisitOption) {
		switch (aVisitOption) {
		case MAGNIFY:
			magnify(aComponent);
			break;
		case ANIMATED_MAGNIFY:
			animatedMagnify(aComponent);
			break;
		case COLOR:
			color(aComponent);
			break;
		}		
		if (!(aComponent instanceof Container))
			return;
		Container aContainer = (Container) aComponent;
		Component[] components = aContainer.getComponents();
		for (int i = 0; i < components.length; i++) {
			traverseInOrder(components[i], aVisitOption);
		}
	}

}
