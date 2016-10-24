package lectures.mvc.toolkit;

import bus.uigen.ObjectEditor;
import lectures.mvc.properties.ObservableBMISpreadsheet;
/*
 * 
 * An exercise in creating our own alternative to ObjectEditor for a BMI spreadsheet. 
 * 
 * Run and interact with the program to see the two GUIS created, one by our editor
 * and one by ObjectEditor. Experiment with the two UIs - change the editable
 * properties in each and observe the effect on different widgets. 
 * 
 * Recall that a widget is a rectangular screen area (window) with some behavior.
 * 
 * (T/F In the custom UI, the height property is displayed by a text field.
 * (T/F) In the custom UI, the height property is displayed by multiple widgets
 * (T/F) In the custom UI, the BMI property is displayed by a text field.
 * (T/F) In the custom UI, the BMI property is displayed by multiple widgets.
 * (T/F) In the custom UI, a widget displaying the BMI property can be edited. 
 * (T/F) Changing the height field in the custom UI causes changes in other widgets. 
 * (T/F) The OE and Custom UI are always in sync, that is, when an edit is committed
 * in one UI, the two UIS show the same information. 
 * 
 * Study the code below. 
 * 
 * The custom UI is implemented by:
 * (a) The main class
 * (b) BMIMVCComposer
 * 
 * (T/F) The main class ensures that code implementing the OE and custom UI
 * shares a common observable object.
 * 
 * Next class: BMIMVCComposer
 * 
 */
public class MVCToolkitMain {
	static final double EXAMPLE_HEIGHT = 1.77;
	static final double EXAMPLE_WEIGHT = 75;
	public static void main (String[] args) {
		ObservableBMISpreadsheet aBMISpreadsheet = 
				new AnObservableBMISpreadsheet(EXAMPLE_HEIGHT, EXAMPLE_WEIGHT);
		BMIMVCComposer.edit(aBMISpreadsheet);
		ObjectEditor.edit(aBMISpreadsheet);		
	}
}
