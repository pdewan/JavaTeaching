package lectures.mvc.toolkit;

import java.awt.Component;
import java.awt.GridLayout;
import java.beans.PropertyChangeListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JSlider;

import lectures.mvc.properties.AnObservableBMISpreadsheet;
import lectures.mvc.properties.ObservableBMISpreadsheet;

public class InterfaceBasedBMIFrameComposer {
	static JFrame frame = new JFrame("BMI Spreadsheet");
	static TextComponentInterface heightField = new ATextField();
	static JLabel heightLabel = new JLabel("Height:");
	static JPanel heightPanel = new JPanel();
	static TextComponentInterface weightField = new ATextField();
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
			                 JLabel aLabel, TextComponentInterface aField) {
		aPanel.setLayout(new GridLayout(1, 2));
		aPanel.add(aLabel);
		aPanel.add((Component) aField);		
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
		ObservableBMISpreadsheet bmiSpreadsheet = new AnObservableBMISpreadsheet(1.77, 75);
		new AnInterfaceBasedBMISpreadsheetController(bmiSpreadsheet, heightField, weightField);
		PropertyChangeListener bmiSpreadsheetView = 
			new AnInterfaceBasedBMISpreadsheetView(heightField, weightField, bmiSlider, bmiProgressBar);
		bmiSpreadsheet.addPropertyChangeListener(bmiSpreadsheetView);
	}
}
