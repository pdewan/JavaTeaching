package lectures.mvc.toolkit;

import java.awt.GridLayout;
import java.beans.PropertyChangeListener;

import javax.swing.JFrame;

import lectures.mvc.properties.ObservableBMISpreadsheet;



public class BMIMVCComposer {
	
	public static  void edit(ObservableBMISpreadsheet aBMISpreadsheet) {
		
		BMIFrameComposer aBMIFrameComposer = new ABMIFrameComposer();
		// The controller needs to react to events in height and weight field, it can 
		// ignore the rest of the widget tree
		// Calling the constructor is enough
		new ABMISpreadsheetController(aBMISpreadsheet, 
				aBMIFrameComposer.getHeightField(), 
				aBMIFrameComposer.getHeightField());
		// The view needs access to all leaf level nodes showing updatable values
		PropertyChangeListener bmiSpreadsheetView = new ABMISpreadsheetView(
				aBMIFrameComposer.getHeightField(), 
				aBMIFrameComposer.getWeightField(), 
				aBMIFrameComposer.getBMISlider(), 
				aBMIFrameComposer.getBMIProgressBar());
		// Make the view an observer of the model
		aBMISpreadsheet.addPropertyChangeListener(bmiSpreadsheetView);
		JFrame aBMIFrame = aBMIFrameComposer.composeFrame();
		aBMIFrame.setVisible(true);	
	}
	
}

// Go to the controller (F3 on ABMISpreadsheetController)
