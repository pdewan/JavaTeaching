package lectures.undo_commands;
import org.junit.Assert;

import bus.uigen.ObjectEditor;
import lectures.interfaces.ABMISpreadsheet;
import lectures.interfaces.BMISpreadsheet;
import util.annotations.StructurePattern;
import util.annotations.StructurePatternNames;
/**
 * 
 * A class demonstrating a basic or naive implementation of undo that does
 * not use any prescribed pattern for implementing undo - hence the term Monolithic. 
 * The undo model is simple and emulates the text editor  vi - only the last set 
 * can be undone or redone.
 * 
 * Study the code run it, and then restudy it to answer questions.
 * 
 */
@StructurePattern(StructurePatternNames.BEAN_PATTERN)
public class AMonolithicUndoableBMISpreadsheet implements UndoableBMISpreadsheet {
    /*
     * non undoable bmi spreadsheet used as a delegate, which we will call the executor
     */
	BMISpreadsheet bmiSpreadsheet; 
	/*
	 * If you have not seen enums before, look carefully at the next two lines.
	 * WriteMethod is an enum type and lastWriteMethod is a variable
	 * of the type. Look carefully also at the ways in which this variable
	 * is used. If you put the caret before the variable name and press
	 * CTRL SHIFT G or right click and select References-->Project,
	 * you can see all places in which the variable is defined.
	 */
	/*
	 * Either no method has been executed so far, or a setHeight or setWeight has 
	 * been executed. The following method captures these three conditions.
	 */
	public enum WriteMethod {SET_WEIGHT, SET_HEIGHT,  NO_COMMAND};
	WriteMethod lastWriteMethod = WriteMethod.NO_COMMAND; // initially no setter has been executed
	boolean undoEnabled = false; // cannot execute undo after an undo or when no command has been executed
	boolean redoEnabled = false; // cannot execute a redo after a redo or when no command has been undone or executed
	// undo uses oldWeight/oldHeight and redo used newWeight/newHeight
	double oldWeight, newWeight; 
	double oldHeight, newHeight; 
	public AMonolithicUndoableBMISpreadsheet (double aHeight, double aWeight) {
		bmiSpreadsheet = new ABMISpreadsheet(aHeight, aWeight);
	}
	public AMonolithicUndoableBMISpreadsheet (BMISpreadsheet aBMISpreadsheet) {
		bmiSpreadsheet = aBMISpreadsheet;
	}
	void enableUndo() {
		undoEnabled = true;
		redoEnabled = false;
	}
	void enableRedo() {
		undoEnabled = false;
		redoEnabled = true;
	}
	public double getBMI() {return bmiSpreadsheet.getBMI();}
	public double getHeight() {return bmiSpreadsheet.getHeight();}
	public double getWeight() {return bmiSpreadsheet.getWeight();}
	public void setHeight(double newValue) {
		oldHeight = getHeight();
		newHeight = newValue;
		lastWriteMethod = WriteMethod.SET_HEIGHT;
		enableUndo();
		bmiSpreadsheet.setHeight(newValue);
	}
	public void setWeight(double newValue) {
		oldWeight = getWeight();
		newWeight = newValue;
		lastWriteMethod = WriteMethod.SET_WEIGHT;
		enableUndo();
		bmiSpreadsheet.setWeight(newValue);		
	}
	
	void undoWeight() {
		// swap the two statements when asked
		bmiSpreadsheet.setWeight(oldWeight);
//		setWeight(oldWeight);
	}
	void undoHeight() {
		bmiSpreadsheet.setHeight(oldHeight);	
	}
	void redoWeight() {
		// swap the two statements when asked
//		bmiSpreadsheet.setWeight(newWeight);
		bmiSpreadsheet.setWeight(bmiSpreadsheet.getWeight());

	}
	void redoHeight() {
		bmiSpreadsheet.setHeight(newHeight);
	}	
	public boolean preUndo() {
		return undoEnabled;
	}
	public void undo() {
		/*
		 * assertTrue, like Java assert, is for internal errors, but is always enabled
		 * Provided by JUnit (testing)
		 */
		Assert.assertTrue("Cannot undo, call preundo before calling undo", preUndo());
		switch (lastWriteMethod) {
		case SET_WEIGHT: 
			undoWeight();
			break;
		case SET_HEIGHT:
			undoHeight();
			break;			
		}	
		enableRedo();
	}
	public boolean preRedo() {
		return redoEnabled;
	}
	public void redo() {
		Assert.assertTrue("Cannot redo, call preRedo before calling redo", preRedo());
		switch (lastWriteMethod) {
		case SET_WEIGHT: 
			redoWeight();
			break;
		case SET_HEIGHT:
			redoHeight();
			break;				
		}	
		enableUndo();
	}
	static final double INITIAL_HEIGHT = 1.77;
	static final double INITIAL_WEIGHT = 75;

	public static void main (String[] args) {		
		UndoableBMISpreadsheet aBMISpreadsheet = 
				new AMonolithicUndoableBMISpreadsheet(INITIAL_HEIGHT, INITIAL_WEIGHT);
		ObjectEditor.edit(aBMISpreadsheet);
		/*
		 * Uncomment this when asked, and then comment it back
		 */
//		aBMISpreadsheet.undo();
		
		/*
		 * Uncomment this when asked.
		 */
//		ObjectEditor.edit(new AMonolithicUndoableBMISpreadsheet(INITIAL_HEIGHT, INITIAL_WEIGHT));
	}
	
}
/*
 * Run the program and look at the ObjectEditor menu created for this class (AMonolithicUndoableBMISpreadsheet)
 * Make changes to the height and or weight and execute enabled commands. The following questions 
 * assume undo and redo are being executed by the user from the menu
 * 
 * (T/F) AMonolithicUndoableBMISpreadsheet makes it possible to redo before  
 * any changes to weight or height are made.
 * 
 * (T/F) AMonolithicUndoableBMISpreadsheet makes it possible to undo before 
 * any changes are made to weight or height.
 * 
 * (T/F) AMonolithicUndoableBMISpreadsheet allows an undo to be followed by another undo.
 * 
 * (T/F) AMonolithicUndoableBMISpreadsheet allows an undo to be followed by a redo.
 * 
 * (T/F) AMonolithicUndoableBMISpreadsheet allows a redo to be followed by a redo.
 * 
 * (T/F) AMonolithicUndoableBMISpreadsheet allows a redo to be followed by an undo.

 * 
 * The maximum number of undos that can be executed consecutively in AMonolithicUndoableBMISpreadsheet are:
 * a) 0
 * b) 1
 * c) 2
 * d) > 2
 * 
 * The maximum number of redos that can be executed consecutively in AMonolithicUndoableBMISpreadsheet are:
 * a) 0
 * b) 1
 * c) 2
 * d) > 2
 * 
 * (T/F) An undone command can always be immediately redone in AMonolithicUndoableBMISpreadsheet.
 * (T/F) A redone command can always be immediately undone in AMonolithicUndoableBMISpreadsheet.
 * (T/F) A newly executed command can always be immediately undone in AMonolithicUndoableBMISpreadsheet.
 * (A newly executed command is an explicit change to the object that is made not through undo or redo but by calling its write methods directly,)
 * (T/F) A newly executed command can always be immediately redone in AMonolithicUndoableBMISpreadsheet.
 * 
 * 
 * 
 *  Terminate the program.

 *  Uncomment the undo call from main. Run it again.
 * 
 * Calling the undo() method when its precondition is not met results:
 * (a) always in an AssertionError.
 * (b) an AssertionError when Java assertions are enabled
 * (c) in the object being changed.
 * (d) in no error being thrown and no change in the object.
 * 
 *  
 * The precondition of undo is:
 * (a) The last user action was a redo.
 * (b) The last user action was an undo.
 * (c) The last user action was a newly executed command or an undo.
 * (d) The last user action was a newly executed command or a redo.
 * (e) The last user action was a newly executed command or an undo or a redo.
 * 
 * 
 * 
 * The precondition of redo is:
 * (a) The last user action was a redo.
 * (b) The last user action was an undo.
 * (c) The last user action was a newly executed command or an undo.
 * (d) The last user action was a newly executed command or a redo.
 * (e) The last user action was a newly executed command or an undo or a redo.
 * 
 * 
 * Comment back the call to the erroneous undo.
 * 
 *
 * 
 * Now that we have seen the undo model here, let us try and understand its 
 * implementation. You can comment out the second BMI Spreadsheet display.
 * 
 * Study the methods and put breakpoints if necessary to answer the following questions.
 *  
 * 
 * (Forwarding a call in a class is not considered execution of application-specific code
 * in the class). 
 * In AMonolithicUndoableBMISpreadsheet, the getter methods of the 
 * undoable object (that is, instance of AMonolithicUndoableBMISpreadsheet) involve execution of
 * application-specific (that is, BMISpreasheet-specific) code in the:
 *  (a) undoable object  
 *  (b) executor delegate  (bmiSpreadsheet).
 * 
 * In AMonolithicUndoableBMISpreadsheet, the setter methods of the 
 * undoable object (that is, instance of AMonolithicUndoableBMISpreadsheet) 
 * involve execution of application-specific (that is, BMISpreasheet-specific) code in:
 *  (a) the undoable object.  
 *  (b) executor delegate  (bmiSpreadsheet).
 * 
 * In AMonolithicUndoableBMISpreadsheet, the undo/redo methods in the 
 * undoable object (that is, instance of AMonolithicUndoableBMISpreadsheet) involve 
 * execution of application-specific code in:
 *  (a) the undoable object.
 *  (b) the executor delegate  (bmiSpreadsheet).
 * 
 * (T/F) In AMonolithicUndoableBMISpreadsheet, the undo/redo methods in the undoable object
 *  involve execution of application-specific code in the undoable object.  
 * 
 * In undoWeight() swap the two statements through commenting and uncommenting.
 * Run the program, change the weight, and then execute undo followed by redo.
 * Do undo and redo still work like they did before?
 * 
 * (T/F) undoWeight()  is correct if it calls the setWeight() method of the  undoable object
 * rather than the setWeight() method of the executor delegate object (bmiSpreadsheet).
 * 
 * (T/F) The call to undoWeight() should result in a change to the value of newWeight variable in the undoable object.
 * 
 * Swap the two statements back.
 * 
 * Now swap the statements in redoWeight(). 
 * Run the program, change the weight, and then execute undo followed by redo.
 * Do undo and redo still work like they did before?
 * 
 * (T/F) newWeight in the undoable object should be the same as weight in the 
 * delegate at the end of each call to setWeight().
 * (T/F) newWeight in the undoable object should be the same as weight in the 
 * delegate at the end of each call to undo().
 * (T/F) newWeight in the undoable object should be the same as weight in the 
 * delegate at the end of each call to redo().
 * 
 * Uncomment the line that creates and display of another spreadsheet.
 * 
 * Interact with them to answer the following question.
 * 
 * (T/F) An undo of one instance of AMonolithicUndoableBMISpreadsheet disables 
 * the undo of another instance of this class.
 * (T/F) Both instances of this class share a common undo/redo history.
 * (T/F) Both instances of this class share a common implementation of undo/redo.
 * (T/F) AMonolithicUndoableBMISpreadsheet class can be used to support undo/redo
 * of (the set calls in) 
 * any executor delegate that implements the interface, BMISpreadsheet. 
 * (T/F) AMonolithicUndoableBMISpreadsheet can be used to support undo/redo of 
 * (the set calls in) 
 * 	any delegate that is a Bean object.
 * 
 * Next class AnUndoableBMISpreadsheet
 */
