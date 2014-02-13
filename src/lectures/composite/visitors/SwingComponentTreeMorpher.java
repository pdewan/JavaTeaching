package lectures.composite.visitors;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JFrame;

import lectures.animation.threads_commands.ThreadSupport;
import lectures.composite.design_pattern.CompositeSwingComponentCreator;
import bus.uigen.util.SingleStepper;

public class SwingComponentTreeMorpher {

	public static final Color COLOR = Color.CYAN;
	public static final int MAGNIFICATION = 2;

	public static void main(String[] args) {
//		JFrame aFrame = WindowTreeCreator.createTree();
//		Container root = aFrame.getContentPane();	
//		magnifySubtree(root);
//		colorSubtree(root);
//		InteractiveClearanceGiver.waitForClearance();
//		animatedMagnifySubtree(root);
//		animatedMagnifySubtreePostOrder(root);
		JFrame aFrame2 = CompositeSwingComponentCreator.createAndDisplayCompositeUI();
		Container root2 = aFrame2.getContentPane();	
		SingleStepper.waitForNextStep();
//		animatedMagnifySubtree(aFrame2);
		animatedMagnifySubtreePostOrder(aFrame2);

	}

	public static void magnify(Component aComponent) {
		Dimension aComponentSize = aComponent.getSize();
		aComponent.setSize(new Dimension(aComponentSize.width * MAGNIFICATION,
				aComponentSize.height * MAGNIFICATION));
	}
	public static void magnifySubtree(Component aComponent) {
		magnify(aComponent);
		if (!(aComponent instanceof Container))
			return;
		Container aContainer = (Container) aComponent;
		Component[] components = aContainer.getComponents();
		for (int i = 0; i < components.length; i++) {
			magnifySubtree(components[i]);
		}
	}

	public static void animatedMagnify(Component aComponent) {
		magnify(aComponent);
		ThreadSupport.sleep(500);
	}
	public static void animatedMagnifySubtreePostOrder(Component aComponent) {
		if (aComponent instanceof Container) {
			Container aContainer = (Container) aComponent;
			Component[] components = aContainer.getComponents();
			for (int i = 0; i < components.length; i++) {
				animatedMagnifySubtreePostOrder(components[i]);
			}
		}
		animatedMagnify(aComponent);
	}


	public static void animatedMagnifySubtree(Component aComponent) {
		animatedMagnify(aComponent);
		if (!(aComponent instanceof Container))
			return;
		Container aContainer = (Container) aComponent;
		Component[] components = aContainer.getComponents();
		for (int i = 0; i < components.length; i++) {
			animatedMagnifySubtree(components[i]);
		}
	}

	public static void color(Component aComponent) {
		aComponent.setBackground(COLOR);
	}
	public static void colorSubtree(Component aComponent) {
		color(aComponent);
		// can we redesign AWT to prevent instanceof?
		if (!(aComponent instanceof Container))
			return;
		Container aContainer = (Container) aComponent;
		Component[] components = aContainer.getComponents();
		for (int i = 0; i < components.length; i++) {
			colorSubtree(components[i]);
		}
	}

}
