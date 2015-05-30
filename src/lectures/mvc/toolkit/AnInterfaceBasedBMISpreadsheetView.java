package lectures.mvc.toolkit;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.JProgressBar;
import javax.swing.JSlider;

public class AnInterfaceBasedBMISpreadsheetView implements PropertyChangeListener {
	TextComponentInterface heightField, weightField;
	JSlider bmiSlider;
	JProgressBar bmiProgressBar;
	public AnInterfaceBasedBMISpreadsheetView (TextComponentInterface theHeightField, TextComponentInterface theWeightField, 
			                    JSlider theBMISlider, JProgressBar theBMIProgressBar) {
		heightField = theHeightField;
		weightField = theWeightField;
		bmiSlider = theBMISlider;	
		bmiProgressBar = theBMIProgressBar;
	}
	public void propertyChange(PropertyChangeEvent event) {
		String propertyName = event.getPropertyName();
		Double newValue = (Double) event.getNewValue();
		if (propertyName.equalsIgnoreCase("height")) {
			heightField.setText(newValue.toString()); 
		} else if (propertyName.equalsIgnoreCase("weight")) {		
			weightField.setText(event.getNewValue().toString());
		} else if (propertyName.equalsIgnoreCase("bmi")) {
			double newBMI = newValue;
			bmiSlider.setValue((int) newBMI);
			bmiProgressBar.setValue((int) newBMI);
		}		
	}
}
