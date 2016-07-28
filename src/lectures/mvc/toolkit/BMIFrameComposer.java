package lectures.mvc.toolkit;

import java.awt.GridLayout;
import java.beans.PropertyChangeListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JSlider;
import javax.swing.JTextField;

import bus.uigen.ObjectEditor;
import lectures.mvc.properties.AnObservableBMISpreadsheet;
import lectures.mvc.properties.ObservableBMISpreadsheet;


// TOOLKIT-BASED MVC COMPOSITION 
// An exercise in creating our own view and controller, based not on console I/O
// but Toolkit I/O, which supports GUIS
// Run and interact with the program to see the two GUIS created, one by our view and controller
// and one by that of ObjectEditor and notice that the two UIs remain in sync, thanks to a common
// observable model
public class BMIFrameComposer {
	// The controller and view are responsible for reacting to input and refreshing the display
	// in response to model changes once the GUI is created.
	
	// The task of creating the GUI is a a separate one, which we will do in this composer object
	// We are essentially creating a widget tree of the kind we saw in an earlier application
	
	// These variables create nodes of the widget/window tree
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
		//compose the widget nodes into a tree
		composeLabelledField(heightPanel, heightLabel, heightField);
		composeLabelledField(weightPanel, weightLabel, weightField);
		composeBMI();
		composeFrame();
		
		// compose the model and view and controller
		composeMVC();
	}
	
	public static void composeLabelledField(JPanel aPanel, 
			                 JLabel aLabel, JTextField aField) {
		aPanel.setLayout(new GridLayout(1, 2)); // align the components of aPanel in a row with two columns
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
		ObservableBMISpreadsheet aBMISpreadsheet = new AnObservableBMISpreadsheet();
		// The controller needs to react to events in height and weight field, it can 
		// ignore the rest of the widget tree
		new ABMISpreadsheetController(aBMISpreadsheet, heightField, weightField);
		// The view needs access to all lead level nodes showing updatable values
		PropertyChangeListener bmiSpreadsheetView = 
			new ABMISpreadsheetView(heightField, weightField, bmiSlider, bmiProgressBar);
		// Make the view an observer of the model
		aBMISpreadsheet.addPropertyChangeListener(bmiSpreadsheetView);
		
		// This is a separate MVC composition
		ObjectEditor.edit(aBMISpreadsheet);
	}
}

// Go to the controller (F3 on ABMISpreadsheetController)
