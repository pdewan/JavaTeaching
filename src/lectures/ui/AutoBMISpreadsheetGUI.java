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
	 * ObjectEditor
	 * (T/F) It is possible to create a tool that automatically creates a user interface
	 * for displaying all  properties of an object.
	 * 
	 * (T/F) It is possible to create a tool for changing all properties of an object.
	 * 
	 * (T/F) It is possible to create a tool for changing all editable properties of an 
	 * object.
	 * 
	 * When a property is edited (in an ObjectEditor window)
	 * 	  the setter for only that property is called.
	 *    the setters for all properties are called.
	 *    
	 * When a property is edited (in an ObjectEditor window)
	 *     the getter for only that property is called.
	 *     the getters for all properties are called.	 
	 * Put your own oeall22.jar in the classpath. 
	 * Uncomment all print methods in {@link AUIBMISpreadsheet}.
	 * Run this program.
	 * 
	 * Edit the height property and see what happens in the console and in the GUI.
	 * Can you change the value of the BMI property, which has no setter?
	 * 
	 * (T/F) It is possible to create a tool that automatically creates a user
	 * interface for invoking the public methods of an object.
	 * 
	 * When a a method is invoked through an ObjectEditor window:
	 *     no getter is called.
	 *     the getters for all properties are called.	
	 * 
	 * Execute AUIBMISpreadsheet->Increment Weight. Provide a positive
	 * or negative increment and hit apply. See the effects on the console and GUI.
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
	 * (T/F) When an object is changed from the program, 
	 * ObjectEditor knows about this event and calls getters in the object to update 
	 * the display of the object.
	 * 
	 * (T/F) The Common->Refresh command in ObjectEditor calls all getters in the displayed
	 * object to display current property values.
	 * 
	 * (T/F) The refresh method in OEFrame calls all getters in the displayed
	 * object to display current property values.	
	 *  
	 * Study the code in changeObjectProgrammatically.
	 * Uncomment the call in main to change the object.
	 * Terminate the previous run.
	 * Run main again and observe any changes in the ObjectEditor window.
	 * Now execute the Common->Refresh menu item in the OE window and
	 * observe if the display updates.
	 * 
	 * Terminate current run.
	 * Uncomment the OEFrame refresh call in changeObjectProgrammatically below.
	 * Run main again and observe any changes in the ObjectEditor window.
	 * Now execute the Common->Refresh menu item in the OE window and
	 * observe if the display updates.	
	 *  
	 * 	    	
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
     * Annotations		
     * 
     * Comment out the call to changeObjectProgrammatically in main.
     * 
     * Go back to AUIBMISpreadsheet and look at the annotations starting with @.
     * 
     * (T/F) ObjectEditor checks that each property listed in the  @PropertyNames
     *  annotation of a class is actually a property of the class.
     * 
     * (T/F) The Java compiler checks that each property listed in the 
     * @EditablePropertyNames annotation of a class is actually an editable property of
     * the class.
     * 
     * Uncomment the commented property name in  @PropertyNames. Do you get a warning or 
     * error from the compiler?
     * If not, run the program. Do you get a warning or error from the ObjectEditor
     * in the console?
     * 
     * Uncomment the commented property name in @EditablePropertyNames. Do you get a 
     * warning or error from the compiler?
     * If not, run the program. Do you get a warning or error from the ObjectEditor
     * in the console?

     * 
     * (T/F) Removing the name of an editable property from the @EditablePropertyNames 
     * annotation makes ituneditable by the user and results in a warning from ObjectEditor.
     * 
     * (T/F) Removing the name of the name of a property from both
     * @EditablePropertyNames  and @PropertyNames annotation makes it 
     * unviewable and results in a warning from ObjectEditor.
     * 
     * Comment out the height property from the editable property names annotation.
     * Run the program. Do you see a warning from OE? Can you edit the property?
     * 
     * Now comment out this property also from the property names annotation.
     * Run the program. Do you see a warning from OE? Can you view the property?
     * 
     * (T/F) Removing @StructurePattern(StructurePatternNames.BEAN_PATTERN) annotation from
     * a class results in a warning from ObjectEditor if the class defines one or more
     * properties.
     * 
     * (T/F) Annotations can help specify and document the (editable) properties 
     * of a class.
     * 
     * 
     * (T/F) Its is possible to build a tool that checks that a class implements
     * specified properties.
     * 
	 */

}
