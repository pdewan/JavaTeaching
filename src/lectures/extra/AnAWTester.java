package lectures.extra;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class AnAWTester {
	public static final  Dimension TOP_SIZE = new Dimension (400, 400);
	public static final LineBorder TOP_BORDER = new LineBorder(Color.BLACK);
	public static final int NUM_LEVELS = 4;

	public static JPanel addHalfSizeChild(JPanel parent) {
		JPanel child = new JPanel();
		Dimension parentSize = parent.getSize();
		child.setSize(new Dimension(parentSize.height/2, parentSize.width/2));
		child.setLayout(parent.getLayout());
		child.setBorder(parent.getBorder());
		parent.add(child);
		return child;
	}
	
	public static JPanel createTopPanel() {	
		JPanel topPanel = new JPanel();
		topPanel.setLayout(null);
		topPanel.setBorder(TOP_BORDER);
		topPanel.setSize(TOP_SIZE);
		return topPanel;
	}
	
	public static void createPanelStructure(JPanel topPanel, int numLevels) {
		JPanel currentPanel = topPanel;
		for (int i = 1; i < numLevels; i++) {
			JPanel childPanel = addHalfSizeChild(currentPanel);
			currentPanel = childPanel;
		}		
	}	
	public static void main (String[] args) {		
		JFrame frame = new JFrame();
		JPanel topPanel =  createTopPanel();
		frame.setContentPane(topPanel);
		createPanelStructure(topPanel, NUM_LEVELS);	
		frame.setSize(TOP_SIZE);
		frame.setVisible(true);				
	}
}
