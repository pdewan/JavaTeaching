package lectures.mvc.toolkit;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import lectures.interfaces.BMISpreadsheet;
/**
 * As we see below, ABMISpreadSheetController is not only a controller for 
 * the model, but an observer of the editable widgets, which are not models!
 * 
 * Here, a listener == observer *  
 *  
 */
public class ABMISpreadsheetController 
	implements ActionListener { // The observer interface defined by the editable widgets
	JTextField height, weight;
	BMISpreadsheet bmiSpreadsheet;
	public ABMISpreadsheetController (BMISpreadsheet theBMISpreadsheet, JTextField theHeight, JTextField theWeight) {
		height = theHeight;
		weight = theWeight;
		bmiSpreadsheet = theBMISpreadsheet;
		
		/*
		 *  Making this object an observer of two different observable widgets
		 */
		height.addActionListener(this);
		weight.addActionListener(this);
	}
	/*
	 *  Method called on an observer of a textfield when a user enters new 
	 *  text and presses ENTER.
	 */
	public void actionPerformed(ActionEvent event) {
	
		JTextField source = (JTextField) event.getSource();
		String text = source.getText();
		double val = Double.parseDouble(text);
		// Depending on which observable notified, do different things
		if (source == height) {
			
			/*
			 * Step into this call to trace the actions that lead to a 
			 * new BMI value being displayed by the progress bar and slider
			 */
			bmiSpreadsheet.setHeight(val);
			
		} else {
			bmiSpreadsheet.setWeight(val);
		}		
	}	
}
/**
 * 
 * (T/F) ABMISpreadsheetController is an observer of a JSlider widget.
 * 
 * (T/F) ABMISpreadsheetController is an observer of a JTextField widget.
 * 
 * 
 * Put a break point at the start of actionPerformed so you can observe the stack
 * when it is hit.
 * 
 * Debug-run MVCToolkitMain.
 * 
 * Change the slider in the custom UI.
 * 
 * Edit the height field in the custom UI.
 * 
 * (T/F) The actionPerformed method is called in ABMISpreadsheetController
 *  each time a new character is input in the height field.
 * 
 * (T/F) The actionPerformed method is called in ABMISpreadsheetController
 *  when the user presses ENTER to finish editing the height field.
 *  
 * (T/F) The actionPerformed method is called in ABMISpreadsheetController
 *  when the slider is dragged.
 *  
 * (T/F) The actionPerformed method is called in ABMISpreadsheetController:
 *  when the the use releases the slider after dragging it.
 *  
 * (T/F) When the height field is changed, actionPeformed calls setHeight() in
 * the model.
 * 
 * (T/F) When the height field is changed, actionPeformed calls getHeight() in
 * the model.
 * 
 * (T/F) When the height field is changed, actionPeformed calls getBMI() in
 * the model.
 * 
 * (T/F) When the height field is changed, the view calls getBMI() in the model.
 * 
 * (T/F) When the height field is changed, propertyChange() is called in the view.
 *
 *  
 */
