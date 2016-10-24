package lectures.mvc.toolkit;

import java.awt.GridLayout;
import java.beans.PropertyChangeListener;

import javax.swing.JFrame;

import lectures.mvc.properties.ObservableBMISpreadsheet;

/** 
 * This class introduces us to the MVC (Model View Controller) design pattern.
 * A model is just an observable object. 
 * 
 * A controller is an object responsible for reacting to input.
 * 
 * A view is an observer of a model responsible for refreshing the display 
 * in response to model changes
 * 
 * The task of creating the initial GUI is a separate one, which is done in
 * a composer object.
 * 
 * Study the code below.
 * 
 * The state (data) shared by the two UIs (OE and custom) is maintained by:
 * (a) model
 * (b) view
 * (c) controller
 * (d) widget-tree composer
 * 
 * (T/F) The widgets displaying readonly properties need to accessed by the controller.  
 * (T/F) the widgets displaying editable properties need to be accessed by the controller.
 * (T/F) The widgets displaying readonly properties need to accessed by the view.  
 * (T/F) the widgets displaying editable properties need to be accessed by the view.
 * 

 *
 * (T/F) BMIMVCComposer gives the controller a reference to the model.
 * (T/F) BMIMVCCompsoer gives the model a reference to the controller.
 * (T/F) BMIMVCComposer creates a connection between the model and controller.
 * 
 * (T/F) BMIMVCCompsoer gives the model a reference to the view. 
 * (T/F) BMIMVCCompsoer gives the view a reference to the model.
 * (T/F) BMIMVCComposer creates a connection between the model and view.
 * 
 * (T/F) A view is an observer.
 * (T/F) A model is an observable.
 * 
 * Next class: ABMIFrameComposer    
 * 
 */

public class BMIMVCComposer {
	
	public static  void edit(ObservableBMISpreadsheet aBMISpreadsheet) {
		/*
		 * ABMIFrameComposer creates the widget tree for the custom GUI. 
		 * It defines getters to access the widgets (fields) for the different
		 * properties of the model.
		 */
		BMIFrameComposer aBMIFrameComposer = new ABMIFrameComposer();
		
		/*
		 * The controller needs to react to events in height and weight field, it can 
		 * ignore the rest of the widget tree. It also needs access to the model.
		 * 
		 */
		new ABMISpreadsheetController(aBMISpreadsheet, 
				aBMIFrameComposer.getHeightField(), 
				aBMIFrameComposer.getHeightField());
		
		/*
		 * The view needs access to all leaf level nodes showing updatable values
		 */
		PropertyChangeListener bmiSpreadsheetView = new ABMISpreadsheetView(
				aBMIFrameComposer.getHeightField(), 
				aBMIFrameComposer.getWeightField(), 
				aBMIFrameComposer.getBMISlider(), 
				aBMIFrameComposer.getBMIProgressBar());
		/*
		 * Make the view an observer of the model
		 * 
		 */
		aBMISpreadsheet.addPropertyChangeListener(bmiSpreadsheetView);
		JFrame aBMIFrame = aBMIFrameComposer.composeFrame();
		aBMIFrame.setVisible(true);	
	}
	
}

// Go to the controller (F3 on ABMISpreadsheetController)
