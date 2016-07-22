package lectures.ui;
import util.misc.ThreadSupport;
import lectures.interfaces.ABMISpreadsheet;
import lectures.interfaces.BMISpreadsheet;
import bus.uigen.OEFrame;
// A library class automatically generating user-interfaces of objects
// from their programming interfaces
// Make sure you have oeall22.jar in the classpath
import bus.uigen.ObjectEditor;

// Run this program, see how it works.
// Enter different values for height and weight and press enter.
// Can you change the value of the BMI property?
public class AutoBMISpreadsheetGUI {
	public static void main (String[] args) {
		final double initialHeight = 1.77;
		final double initialWeight = 75;
		BMISpreadsheet aBMISpreadsheet = new ABMISpreadsheet(initialHeight, initialWeight);
		OEFrame anOEFrame = ObjectEditor.edit(aBMISpreadsheet);
	
		// Look carefully again at the code in ABMISpreadsheet.
		
		// Based on this code, and maybe some experimentation, can you say
		// whether ObjectEditor shows the variables or properties (as defined by bean conventions)
		// of the object?
		
		// When you run the program, you see a warning from ObjectEditor.	
		// Uncomment the line beginning with StructurePattern.
		// The warning goes away. 
		// The line you uncommented is an annotation - which you can consider as a typed comment
		// available at runtime. We know it is available at runtime because ObjectEditor, which
		// does not compile the class of the object, changes its behavior. We know it is
		// typed because it has to be imported like a regular class (or interface) and one
		// cannot use a different spelling for StructurePattern.
		// Does the term Bean in the annotation make sense?
		
		// Let us now understand the interaction between ObjectEditor and the object being edited.
		// What is your hypothesis regarding how ObjectEditor interacts with the edited object
		// to display the object and to change the weight? That is what methods are called iniitally
		// and on each edit?
		
		// Uncomment the print lines in ABMISpreadsheet. Observe the output before you 
		// interact with the UI and after you change weight. Does that make sense?
		// One aspect will not. It has do with the fact that ObjectEditor supports undo.
		// Before changing a value in the object in response to a user command, ObjectEditor
		// calls  a method to obtain the previous version of the value, in case it need to be
		// restored. Because of this you will see an extra print that would not be needed without undo.
		
		// What happens if we change a displayed object from the program, as below.
		// Will the display change? Think about it and then uncomment this code,
		// leaving the refresh part commented and wait until you get the println output.
	
//		final double aWeightGain = 2;
//		final int aNumGains = 5;
//		final long aTimeBetweeenGains = 1000; // one second
//		for (int aCount = 0; aCount < aNumGains; aCount++) {
//			aBMISpreadsheet.setWeight(aBMISpreadsheet.getWeight() + aWeightGain);
//			ThreadSupport.sleep(aTimeBetweeenGains); // pause the program
////			anOEFrame.refresh();
//		}
//		System.out.println ("No more weight again!");
		// Execute the Common->Refresh command and observe its behavior
		// Now uncomment the refresh() line above and run the program again.
		// Does the new behavior make sense?
	}

}
