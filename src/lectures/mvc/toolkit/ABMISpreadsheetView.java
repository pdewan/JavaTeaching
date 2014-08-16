package lectures.mvc.toolkit;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.JProgressBar;
import javax.swing.JSlider;
import javax.swing.JTextField;

import util.models.PropertyListenerRegistrar;

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
	@Override
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
//	public void register(PropertyListenerRegisterer aPropertyChangeRegister) {
//		aPropertyChangeRegister.addPropertyChangeListener(this);
//	}
}
