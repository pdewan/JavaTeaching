package lectures.ui;

import bus.uigen.OEFrame;
import bus.uigen.ObjectEditor;
import lectures.interfaces.ABMISpreadsheet;
import lectures.interfaces.BMISpreadsheet;

// Let us see how we can exercise some control over the UI ObjectEditor cretaed
// Look at the new method call below
// Uncomment the component width field. 
// See the effect on the width and height of the complete OE window
// and the size of the text field created for displaying height

// More interesting uncomment the PropertyNames annotation and run the program
// You will notice no change in the UI. But the console will show a warning.
// Does the warning make sense? How can this annotation and associated warning help catch errors?
// How can it offer better documentation?

// Now comment out the WeightGainRate property name in the annotation to remove the warning.
// Uncomment the EditableProperty annotation and run the program.
// Notice the warning. Does it make sense? How can the annotation and associated warning help catch errors?
// How can it offer better documentation?
// Comment the BMI item in the annotation to make the warning go away

public class AutoGenerationControl {
	public static void main (String[] args) {
		final double initialHeight = 1.77;
		final double initialWeight = 75;
		final int aFrameWidth = 200;
		final int aFrameHeight = 150;
		BMISpreadsheet aBMISpreadsheet = new ABMISpreadsheet(initialHeight, initialWeight);		
		OEFrame anOEFrame = ObjectEditor.edit(aBMISpreadsheet);
		anOEFrame.setSize(aFrameWidth, aFrameHeight); // new method call
		
	
		
	}

}
