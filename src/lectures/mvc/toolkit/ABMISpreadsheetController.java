package lectures.mvc.toolkit;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import lectures.interfaces.BMISpreadsheet;
// TOOLKIT CONTROLLER
// As we see below it is not only a controller for a the model
// but an observer of the editable widgets, which are not models!
public class ABMISpreadsheetController 
	implements ActionListener { // The observer interface defined by the editable widgets
	JTextField height, weight;
	BMISpreadsheet bmiSpreadsheet;
	public ABMISpreadsheetController (BMISpreadsheet theBMISpreadsheet, JTextField theHeight, JTextField theWeight) {
		height = theHeight;
		weight = theWeight;
		bmiSpreadsheet = theBMISpreadsheet;
		// Making this object an observer of two different observable widgets
		height.addActionListener(this);
		weight.addActionListener(this);
	}
	// Method called on on an observer of a textfield when a user enters new text and presses ENTER
	public void actionPerformed(ActionEvent event) {
	
		JTextField source = (JTextField) event.getSource();
		String text = source.getText();
		double val = Double.parseDouble(text);
		// Depending on which observable notified, do different things
		if (source == height) {
			bmiSpreadsheet.setHeight(val);		
		} else {
			bmiSpreadsheet.setWeight(val);
		}		
	}
	
	// Put a break point in actionPerformed and trace the actions that lead to a new BMI value being displayed
	// by the progress bar and slider. Step return (F7) when you execute the propertyChange 
	// method in ObjectEditor
	
}
