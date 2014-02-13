package lectures.composite.visitors;

import java.awt.Component;
import java.awt.Container;
import java.lang.reflect.Method;

import javax.swing.JFrame;

import lectures.composite.tree_dag_graph_objects_windows.WindowTreeCreator;

public class ReflectingSwingComponentTreeMorpher extends
		SwingComponentTreeMorpher {
	public static void main(String[] args) {
		JFrame aFrame = WindowTreeCreator.createTree();
		Container root = aFrame.getContentPane();
		try {
			Method colorMethod = SwingComponentTreeMorpher.class.
				getDeclaredMethod("color", new Class[]{Component.class});
			traverseInOrder(root, colorMethod, SwingComponentTreeMorpher.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void traverseInOrder(Component aComponent, 
			Method aVisitorMethod, Object aVisitorMethodTarget) {
		try {
			aVisitorMethod.invoke(aVisitorMethodTarget, new Component[] {aComponent});			
		} catch (Exception e) {
			e.printStackTrace();
		}			
		if (!(aComponent instanceof Container))
			return;
		Container aContainer = (Container) aComponent;
		Component[] components = aContainer.getComponents();
		for (int i = 0; i < components.length; i++) {
			traverseInOrder(components[i], aVisitorMethod, aVisitorMethodTarget);
		}
	}
}
