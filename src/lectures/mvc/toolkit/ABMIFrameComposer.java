package lectures.mvc.toolkit;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JSlider;
import javax.swing.JTextField;
/**
 * This is the class that creates the UI. It provides a method to compose
 * the widgets in a JFrame and methods to to retrieve the widgets. 
 * 
 * These widget are shared by both the controller and view.
 * 
 * Study the program. 
 *
 */
public class ABMIFrameComposer implements BMIFrameComposer{	
	 JFrame frame = new JFrame("BMI Spreadsheet");
	 JTextField heightField = new JTextField();	 
	 JLabel heightLabel = new JLabel("Height:");
	 JPanel heightPanel = new JPanel();
	 JTextField weightField = new JTextField();
	 JLabel weightLabel = new JLabel("Weight:");
	 JPanel weightPanel = new JPanel();
	 JSlider bmiSlider = new JSlider();
	 JProgressBar bmiProgressBar = new JProgressBar();
	 JPanel bmiPanel = new JPanel();	
	
		
	public  void composeLabelledField(JPanel aPanel, 
			                 JLabel aLabel, JTextField aField) {
		aPanel.setLayout(new GridLayout(1, 2)); // align the components of aPanel in a row with two columns
		aPanel.add(aLabel);
		aPanel.add(aField);		
	}
	public  void composeBMI() {
		bmiPanel.setLayout(new GridLayout(1, 2));
		bmiPanel.add(bmiSlider);
		bmiPanel.add(bmiProgressBar);		
	}
	/**
	 * Method called by BMIMVCComposer to create the UI
	 */
	public JFrame composeFrame() {
		composeLabelledField(heightPanel, heightLabel, heightField);
		composeLabelledField(weightPanel, weightLabel, weightField);
		composeBMI();
		frame.setLayout(new GridLayout(3, 1));
		frame.add(heightPanel);
		frame.add(weightPanel);
		frame.add(bmiPanel);
		frame.setSize(250, 150);
		return frame;
	}
	public JFrame getFrame() {
		return frame;
	}
	public JTextField getHeightField() {
		return heightField;
	}
	public JLabel getHeightLabel() {
		return heightLabel;
	}
	public JPanel getHeightPanel() {
		return heightPanel;
	}
	public JTextField getWeightField() {
		return weightField;
	}
	public JLabel getWeightLabel() {
		return weightLabel;
	}
	public JPanel getWeightPanel() {
		return weightPanel;
	}
	public JSlider getBMISlider() {
		return bmiSlider;
	}
	public JProgressBar getBMIProgressBar() {
		return bmiProgressBar;
	}
	public JPanel getBmiPanel() {
		return bmiPanel;
	}
	public static void main(String[] args) {
		JFrame aFrame = (new ABMIFrameComposer()).composeFrame();
		aFrame.setVisible(true);
	}
}
/*
 * Run the program.
 * 
 * Try and change the various widgets in the user-interface.
 * 
 * (T/F) Changing the height field in the custom UI created by ABMIFrameComposer
 * causes changes in other widgets.
 * 
 * A widget in Java is an object whose class IS-A Component and is displayed in
 * a rectangular area.
 * 
 * Recall that you can determine the IS-A hierarchy of a class (such as
 * JTextField, JProgressBar) by putting the
 * insertion point before its name and Right_Menu-->Show Type Hierarchy or
 * Open Type Hierarchy (F4, CTRL_T)
 * 
 * 
 * (T/F) Each property of the model is displayed in at least one widget (instance
 * of a Component)
 * 
 * (T/F) No two properties of the model are displayed in the same widget.
 * 
 * (T/F) No property of the model is displayed in multiple widgets.
 *
 * Next class: ABMISpreadsheetView
 * 
 *
 */

