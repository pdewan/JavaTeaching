package lectures.composite.design_pattern;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class CompositeSwingComponentCreator {
	public static final int RELATIVE_SIZE = 2;
	public static Border border = new LineBorder(Color.black);
	public static final Dimension LEAF_SIZE = new Dimension (50, 30);
	public static int NUM_LEVELS = 3;	
	public static void main(String[] args) {
		createAndDisplayCompositeUI();
	}	
	public static JFrame createAndDisplayCompositeUI () {
		Component leaf = createLeaf(LEAF_SIZE);
		Component root = createComponentTree(leaf);
		JFrame frame = createFrameAndDisplayInWindow(root);
		return frame;
	}
	public static Component createComponentTree(Component leaf) {
		Component retVal = leaf;
		for (int i = 1; i <= NUM_LEVELS; i++) {
			retVal = nestComponent(retVal);
		}
		return retVal;		
	}
	public static Component createLeaf(Dimension size) {
		Component retVal = new JTextField("Edit me");
		retVal.setSize(size);
		return retVal;
	}
	public static Container nestComponent(Component inner) {
		JPanel retVal = new JPanel();
		retVal.setBorder(border); // show outline
		retVal.setSize(inner.getWidth() * RELATIVE_SIZE, inner.getHeight()
				* RELATIVE_SIZE);
		retVal.setLayout(null); // do not mess with the size
		retVal.add(inner);
		return retVal;
	}
	public static JFrame createFrameAndDisplayInWindow(Component aComponent) {
		JFrame frame = new JFrame();
		frame.add(aComponent);
		frame.setSize(aComponent.getSize());
		frame.setVisible(true);
		return frame;
	}
}
