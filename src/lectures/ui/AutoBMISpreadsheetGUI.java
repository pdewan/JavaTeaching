package lectures.ui;
import util.annotations.EditablePropertyNames;
import util.annotations.PropertyNames;
import util.annotations.StructurePattern;
import util.annotations.StructurePatternNames;
import util.misc.ThreadSupport;
import bus.uigen.OEFrame;
import bus.uigen.ObjectEditor;
/**
 * This class demonstrates ObjectEditor, a library class automatically generating 
 * user-interfaces of objects from their programming interfaces.
 * It also demonstrates annotations, used by ObjectEditor.
 * Most important, like C# it further crystallizes and formalizes the concept
 * of properties and how they differ from variables. * 
 */
public class AutoBMISpreadsheetGUI {
	
/* 
 * Put your own oeall22.jar in the classpath.   * 
 * Run this program. 
 */
		
	public static void main (String[] args) {
		final double initialHeight = 1.77;
		final double initialWeight = 75;
		UIBMISpreadsheet aBMISpreadsheet = new AUIBMISpreadsheet(initialHeight, 
				initialWeight);
		OEFrame anOEFrame = ObjectEditor.edit(aBMISpreadsheet);
// uncomment when asked
//		changeObjectProgrammatically(anOEFrame, aBMISpreadsheet);
			
	}
/*
 * GUI Structure
 * 
 * Look at the GUI and relate it to the properties in AUIBMISpreadsheet.
 * 
 * (T/F) It is possible to create a tool that automatically creates a user interface
 *  displaying all properties of an object.
 * 
 * Can you change the height property, which has a setter?
 * 
 * Can you change the value of the BMI property, which has no setter?
 * 
 * It is possible to create a tool for interactively changing:
 *     all properties of an object.
 *     all editable properties of an object.
 *     
 * An application that contains only computation code and relies completely 
 * on an external tool to manage its user-interface follows the separation
 * of concerns principle.
 */
/*
 * GUI Dynamics
 * 
 * This part will help you better understand properties and how they can be
 * formalized in OE.
 * 
 * Look at the C# code below, which also formalized properties, at the language
 * level.
 * 
 //Declaring a class with property
 class Person
 {
     string name;  // the name field (instance variable)
     string Name    // the Name property
     {
         get // getter for the property Name, accesses variable name
         {
             return name;
         }
         set //setter for the property Name, writes variable name
         {
             name = value;
         }
     }
 }
// Using a class with properties
Person p = new Person();
p.Name = "Stack"  // invokes Name's set with argument "Stack"
Console.Writeline(p.Name) //invokes Name's getter and uses return value

 * What triggers execution of the getter and setter in the above code?
 * 
 *In C#: 
 *    (a) a getter for a property must be given the name, getP.
 *    (b) all getters have are given the same name, get.
 *    (c) none of the above
 *  
 * In C#, to assign the value of property P of object o to variable v, 
 * we must execute a statement of the form:
 * 	(a) v = o.getP();
 *  (b) v = o.get();
 *  (c) v = o.P;
 *  (d) None of the above
 *  
 * In C#, to change the value of property P of object o to expression E, 
 * we must execute code of the form:
 * 	(a) o.setP(E);
 *  (b) o.set(E);
 *  (b) o.P = E;
 *  (c) None of the above.
 * 
 * In C#, the setters and getters of properties are:
 *    (a) explicitly invoked by the caller by making regular method calls in 
 *    which the methods are explicitly named.
 *    (b) implicitly invoked by the caller by using the syntax provided for 
 *    reading and changing variables.
 *    (c) None of the above.
 * 
 * Go to {AUIBMISpreadsheet}. Look at all print methods in it.
 * ALT <- to return to this class.
 * 
 * Edit the height property in the GUI and see what happens in the 
 * console and in the GUI. Look at the print statements in AUIBMISpreadsheet.
 * 
 * When a property is edited (in an ObjectEditor window:
 * 	  (a) the setter for only that property is called.
 *    (b) the setters for all editable properties are called.
 *    (c) no setter is called
 *    
 * When a property is edited (in an ObjectEditor window)
 *     (a) the getter for only that property is called.
 *     (b) the getters for all editable properties are called.	 
 *     (C) the getters for all properties are called.
 *  
 * (T/F) It is possible to create a tool that calls getters and setters of 
 * properties implicitly in response to user actions that display or edit these 
 * properties.
 *  
 * Execute the commmand AUIBMISpreadsheet->Increment Weight from the menu
 * at the top of the window to call the corresponding method (incrementWeight) in 
 * AUIBMISpreadsheet.
 * 
 * Provide a positive or negative increment and hit apply. 
 * 
 * See the effects on the console and GUI. 
 * 
 * (T/F) It is possible to create a tool that automatically creates a user interface for 
 * invoking the public methods of an object
 * 
 * When a a method is invoked through an ObjectEditor window:
 *     (a) no getter is called.
 *     (b) the getters for all properties are called.	  
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
 /*
  * REFRESH
  * 
  * We saw above that a user can interact with the UI to call methods
  * in your program. 
  * 
  * Let us consider the converse issue of changing the UI in response to
  * actions taken by the program.	
  *  
  * Study the code in changeObjectProgrammatically above.
  * 
  * Uncomment the call in main that calls this method.
  * 
  * Terminate the previous run.
  * 
  * Run main again and observe any changes in the ObjectEditor window.
  * Are the changes made by changeProgrammatically (called after the
  * object is displayed) reflected by the UI?
  * 
  * (T/F) When an object is changed from the program, 
  * ObjectEditor knows about this event and calls getters in the object to update 
  * the display of the object.
  * 
  * Now execute the Common->Refresh menu item in the OE window and
  * observe if the display updates.
  * 
  * (T/F) The Common->Refresh command in ObjectEditor calls all getters in the displayed
  * object to display current property values. 
  * 
  * Terminate the current run.
  * 
  * Uncomment the OEFrame refresh call in changeObjectProgrammatically below.
  * 
  * Run main again and observe any changes in the ObjectEditor window.
  * 
  * Now execute the Common->Refresh menu item in the OE window and
  * observe if the display chnages.
  *  
  * (T/F) The refresh() method in OEFrame has the same effect as the Common->Refresh menu
  * command.   	    	
  * 
  */	 
/*	 
 * ANNOTATIONS		
 * 
 * Comment out the call to changeObjectProgrammatically in main.
 * 
 * Go back to AUIBMISpreadsheet and process the instructions there.
 * When the instructions say run the program, they mean run this main class,
 * not AUIBMISpreadsheet.  
 * 
 */

}
