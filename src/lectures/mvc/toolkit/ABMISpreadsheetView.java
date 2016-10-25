package lectures.mvc.toolkit;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.JProgressBar;
import javax.swing.JSlider;
import javax.swing.JTextField;
/**
 * Here we see how to write our own observer.
 * 
 * Study the code.
 * 
 * Debug-run MVCToolkitMain.
 * 
 * Then, put a break point at the start of propertyChange method (after
 * it is already debug-running).
 * 
 * Edit the height field in the OE UI.
 * 
 * When the breakpoint is hit, look at all the methods in the stack 
 * (in the "Debug" window).
 * 
 * Look at the value of the argument to the method.
 * 
 * Step over until you reach the end of the method.
 * 
 * Which is true:
 * (a) propertyChange in ABMISpreadsheetView is called directly by 
 * notifyAllListeners in APropertyListenerSupport.
 * (b) notifyAllListeners in APropertyListenerSupport is called directly by 
 * propertyChange in ABMISpreadsheetView.
 * 
 * Which is true:
 * (a) notifyAllListeners in APropertyListenerSupport is called directly by 
 * setHeight in AnObservableBMISpreadsheet.
 * (b) setHeight in AnObservableBMISpreadsheet is called directly by 
 * notifyAllListeners in APropertyListenerSupport.
 * 
 * When the height property is set in the model, the resulting calls to propertyChange 
 * in the view call:
 * (a) heightField.setText()
 * (b) weightField.setText()
 * (c) bmiSlider.setValue()
 * (d) bmiProgressBar.setValue()
 *  
 * Terminate the running program. 
 *
 * Debug-run it again, while keeping the same break point from the start.
 * 
 * Which is true:
 * (a) propertyChange in ABMISpreadsheetView is called directly by setHeight() 
 * in AnObservableBMISpreadsheet.
 * (b) propertyChange in ABMISpreadsheetView is called directly by 
 * addPropertyChangeListener() in AnObservableBMISpreadsheet.
 * 
 * Step through for a while until you see what is going on.
 * 
 * When the view becomes an observer of the model, 
 * (a) the widgets displaying all properties are refreshed.
 * (b) the widgets displaying editable properties are refreshed.
 * (c) the widgets displaying readonly properties are refreshed.
 * (d) no widgets are refreshed.
 * 
 * Next class: ABMISpreadsheetController
 *  
 */
public class ABMISpreadsheetView implements PropertyChangeListener {
	JTextField heightField, weightField;
	JSlider bmiSlider;
	JProgressBar bmiProgressBar;
	public ABMISpreadsheetView (JTextField theHeightField, JTextField theWeightField, 
			                    JSlider theBMISlider, JProgressBar theBMIProgressBar) {
		heightField = theHeightField;
		weightField = theWeightField;
		bmiSlider = theBMISlider;	
		bmiProgressBar = theBMIProgressBar;
	}
	
	/*
	 * Method called on a PropertyChangeListener when a property event is fired.
	 * The ObjectEditor views implement this method.
	 * Here, one of our views is doing so.	 
	 */
	public void propertyChange(PropertyChangeEvent event) {
		String propertyName = event.getPropertyName();
		Double newValue = (Double) event.getNewValue();
		
		/* 
		 * Depending on which property was updated, change the appropriate widget 
		 */
		if (propertyName.equalsIgnoreCase("height")) {
			
			/* 
			 * setText is just like println except that it updates existing text rather 
			 * than displaying an additional value
			 */
			heightField.setText(newValue.toString()); 
		} else if (propertyName.equalsIgnoreCase("weight")) {		
			weightField.setText(event.getNewValue().toString());
		} else if (propertyName.equalsIgnoreCase("bmi")) {
			double newBMI = newValue;
			
			/*
			 * The slider and progress bar understand int values
			 */
			bmiSlider.setValue((int) newBMI);
			bmiProgressBar.setValue((int) newBMI);
		}		
	}	

}
