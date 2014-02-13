package lectures.composite.visitors;

import java.awt.Component;
import java.awt.Container;

import lectures.animation.threads_commands.ThreadSupport;

public class SwingComponentTreeTraverser {	
	public static void traversePreOrder(Component aComponent, ComponentVisitor aVisitor) {	
		aVisitor.visit(aComponent);
		ThreadSupport.sleep(1000);
		if (!(aComponent instanceof Container)) return;
		Container aContainer = (Container) aComponent;
		Component[] components = aContainer.getComponents();
		for (int i = 0; i < components.length; i++) {
			traversePreOrder(components[i], aVisitor);			
		}		
	}
	public static void traversePostOrder(Component aComponent, ComponentVisitor aVisitor) {		
		if (aComponent instanceof Container) {;
		Container aContainer = (Container) aComponent;
		Component[] components = aContainer.getComponents();
		for (int i = 0; i < components.length; i++) {
			traversePostOrder(components[i], aVisitor);			
		}
		}
		aVisitor.visit(aComponent);
		ThreadSupport.sleep(1000);
	}
}
