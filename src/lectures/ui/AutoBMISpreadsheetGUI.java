package lectures.ui;
import util.annotations.EditablePropertyNames;
import util.annotations.PropertyNames;
import util.annotations.StructurePattern;
import util.annotations.StructurePatternNames;
import util.misc.ThreadSupport;
import bus.uigen.OEFrame;
import bus.uigen.ObjectEditor;
/**
 *
 * This class demonstrates ObjectEditor, a library class automatically generating 
 * user-interfaces of objects from their programming interfaces.
 * It also demonstrates annotations, used by ObjectEditor.
 */
public class AutoBMISpreadsheetGUI {
	
	/**
	 * OBJECTEDITOR
	 * 
	 * (T/F) It is possible to create a tool that automatically creates a user interface
	 * for displaying all properties of an object.
	 * 
	 * (T/F) It is possible to create a tool for interactively changing all properties of an object.
	 * 
	 * (T/F) It is possible to create a tool for interactively changing all editable properties of an 
	 * object.
	 * 
	 * When a property is edited (in an ObjectEditor window)
	 * 	  (a) the setter for only that property is called.
	 *    (b) the setters for all editable properties are called.
	 *    
	 * When a property is edited (in an ObjectEditor window)
	 *     (a) the getter for only that property is called.
	 *     (b) the getters for all editable properties are called.	 
	 *     (C) the getters for all properties are called.
	 * 
	 * Put your own oeall22.jar in the classpath. 
	 *  
	 * Go to {@link AUIBMISpreadsheet}. Look at all print methods in it.
	 * ALT <- to return to this class.
	 * 
	 * Run this program.
	 * 
	 * Edit the height property in the GUY and see what happens in the 
	 * console and in the GUI.
	 * 
	 * Can you change the value of the BMI property, which has no setter?
	 * 
	 * 
	 * (T/F) It is possible to create a tool that automatically creates a user
	 * interface for invoking the public methods of an object.
	 * 
	 * When a a method is invoked through an ObjectEditor window:
	 *     (a) no getter is called.
	 *     (b) the getters for all properties are called.	
	 * 
	 * Execute the commmand AUIBMISpreadsheet->Increment Weight from the menu
	 * at the top of the window).
	 * 
	 * Provide a positive or negative increment and hit apply. 
	 * 
	 * See the effects on the console and GUI.
	 * 	  
	 *
	 */
		
	public static void main (String[] args) {
		final double initialHeight = 1.77;
		final double initialWeight = 75;
		UIBMISpreadsheet aBMISpreadsheet = new AUIBMISpreadsheet(initialHeight, 
				initialWeight);
		OEFrame anOEFrame = ObjectEditor.edit(aBMISpreadsheet);
//		changeObjectProgrammatically(anOEFrame, aBMISpreadsheet);
			
	}
	
	/**
	 * Refreshing an Object
	 * 
	 * (T/F) When an object is changed from the program, 
	 * ObjectEditor knows about this event and calls getters in the object to update 
	 * the display of the object.
	 * 
	 * (T/F) The Common->Refresh command in ObjectEditor calls all getters in the displayed
	 * object to display current property values.
	 * 
	 * (T/F) The refresh method defined in OEFrame calls all getters in the displayed
	 * object to display current property values.	
	 *  
	 * Study the code in changeObjectProgrammatically.
	 * 
	 * Uncomment the call in main to change the object.
	 * 
	 * Terminate the previous run.
	 * 
	 * Run main again and observe any changes in the ObjectEditor window.
	 * 
	 * Now execute the Common->Refresh menu item in the OE window and
	 * observe if the display updates.
	 * 
	 * Terminate current run.
	 * 
	 * Uncomment the OEFrame refresh call in changeObjectProgrammatically below.
	 * 
	 * Run main again and observe any changes in the ObjectEditor window.
	 * 
	 * Now execute the Common->Refresh menu item in the OE window and
	 * observe if the display updates.	  	    	
	 * 
	 */
	 static void changeObjectProgrammatically(OEFrame anOEFrame, UIBMISpreadsheet aBMISpreadsheet ) {
			final double aWeightGain = 2;
			final int aNumGains = 5;
			final long aTimeBetweeenGains = 1000; // one second
			for (int aCount = 0; aCount < aNumGains; aCount++) {
				aBMISpreadsheet.incrementWeight(aWeightGain);
				ThreadSupport.sleep(aTimeBetweeenGains); // pause the program
//				anOEFrame.refresh();
			}
			System.out.println ("No more weight again!");
	 }
	 
	/**	 
     * ANNOTATIONS		
     * 
     * Comment out the call to changeObjectProgrammatically in main.
     * 
     * Go back to AUIBMISpreadsheet and process the instructions there.
     * When the instructions say run the program, they mean run this main class,
     * not AUIBMISpreadsheet.
     *
     * 
     * 
	 */

}
