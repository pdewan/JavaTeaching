package lectures.mvc.toolkit;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.JProgressBar;
import javax.swing.JSlider;
import javax.swing.JTextField;
// TOOLKIT-BASED VIEW
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
	// Method called on a PropertyChangeLisetner when a property event is fired.
	// The ObjectEditor views implement this method.
	// Here, one of our views is doing so
	public void propertyChange(PropertyChangeEvent event) {
		String propertyName = event.getPropertyName();
		Double newValue = (Double) event.getNewValue();
		// Depending on which property was updated, change the appopriate widger
		if (propertyName.equalsIgnoreCase("height")) {
			// Just like println except that it updates existing text rather than displaying a new value
			heightField.setText(newValue.toString()); 
		} else if (propertyName.equalsIgnoreCase("weight")) {		
			weightField.setText(event.getNewValue().toString());
		} else if (propertyName.equalsIgnoreCase("bmi")) {
			double newBMI = newValue;
			// The slider and progress bar understand int values
			bmiSlider.setValue((int) newBMI);
			bmiProgressBar.setValue((int) newBMI);
		}		
	}	
//	public void register(PropertyListenerRegisterer aPropertyChangeRegister) {
//		aPropertyChangeRegister.addPropertyChangeListener(this);
//	}
}
