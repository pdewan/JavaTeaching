package lectures.mvc.toolkit;

import java.awt.GridLayout;
import java.beans.PropertyChangeListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JSlider;
import javax.swing.JTextField;

import lectures.mvc.properties.AnObservableBMISpreadsheet;
import lectures.mvc.properties.ObservableBMISpreadsheet;



public class BMIFrameComposer {
	static JFrame frame = new JFrame("BMI Spreadsheet");
	static JTextField heightField = new JTextField();
	static JLabel heightLabel = new JLabel("Height:");
	static JPanel heightPanel = new JPanel();
	static JTextField weightField = new JTextField();
	static JLabel weightLabel = new JLabel("Weight:");
	static JPanel weightPanel = new JPanel();
	static JSlider bmiSlider = new JSlider();
	static JProgressBar bmiProgressBar = new JProgressBar();
	static JPanel bmiPanel = new JPanel();	
	
	public static void main (String args[]) {
		composeLabelledField(heightPanel, heightLabel, heightField);
		composeLabelledField(weightPanel, weightLabel, weightField);
		composeBMI();
		composeFrame();
		composeMVC();
	}
	
	public static void composeLabelledField(JPanel aPanel, 
			                 JLabel aLabel, JTextField aField) {
		aPanel.setLayout(new GridLayout(1, 2));
		aPanel.add(aLabel);
		aPanel.add(aField);		
	}
	public static void composeBMI() {
		bmiPanel.setLayout(new GridLayout(1, 2));
		bmiPanel.add(bmiSlider);
		bmiPanel.add(bmiProgressBar);		
	}
	public static void composeFrame() {
		frame.setLayout(new GridLayout(3, 1));
		frame.add(heightPanel);
		frame.add(weightPanel);
		frame.add(bmiPanel);
		frame.setSize(250, 150);
		frame.setVisible(true);
	}
	public static void composeMVC() {
		ObservableBMISpreadsheet bmiSpreadsheet = new AnObservableBMISpreadsheet();
		new ABMISpreadsheetController(bmiSpreadsheet, heightField, weightField);
		PropertyChangeListener bmiSpreadsheetView = 
			new ABMISpreadsheetView(heightField, weightField, bmiSlider, bmiProgressBar);
		bmiSpreadsheet.addPropertyChangeListener(bmiSpreadsheetView);
	}
}
