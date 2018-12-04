package lectures.undo_commands;
import bus.uigen.ObjectEditor;
import lectures.interfaces.ABMISpreadsheet;
import lectures.interfaces.BMISpreadsheet;
import lectures.mvc.ACounter;
import lectures.mvc.AnObservableCounter;
/**
 * 
 * This class uses a new design pattern for implementing undo/redo.
 * In this pattern, this object is called the undoable, and is responsible
 * for composing the three other kinds of objects in this pattern -
 * undoer, executor, and command objects.
 * 
 * Study the class and comments and then follow the instructions after
 * main.
 */
public class AnUndoableBMISpreadsheet implements UndoableBMISpreadsheet {
	/*
	 * 	We still have a delegate for executing getters and setters, which we will
	 *  call the executor
	 */
	BMISpreadsheet bmiSpreadsheet; 
	/*
	 * Another delegate, called the undoer, which keeps the undo/redo state.
	 * The questions ask you to make two alternative assignments to it.
	 */
	Undoer undoer = new LastCommandUndoer(); // undoer, another delegate
//	Undoer undoer = new HistoryUndoer(); // undoer, another delegate
//	Undoer undoer = UndoerFactory.getUndoer(); // undoer, another delegate

	public AnUndoableBMISpreadsheet (double aHeight, double aWeight) {
		bmiSpreadsheet = new ABMISpreadsheet(aHeight, aWeight);
	}
	/*
	 * The getters do not change
	 */
	public double getBMI() {return bmiSpreadsheet.getBMI();}
	public double getHeight() {return bmiSpreadsheet.getHeight();}
	public double getWeight() {return bmiSpreadsheet.getWeight();}
	/*
	 * Each setter creates a command object, which has both execute
	 * and undo methods, and submits it for execution to the undoer.
	 * Like a Thread object, the undoer calls the execute method (run)
	 * of the executor - both for executing the requested write for the first
	 * time and for redoing it. In addition, it calls the undo method for
	 * redoing the write.
	 * 
	 */
	public void setHeight(double newValue) {
		
		undoer.execute(new ASetHeightCommand(bmiSpreadsheet, newValue));

	}
	
	public void setWeight(double newValue) {
		/*
		 * Put a breakpoint in the next statement, and follow the execution
		 * of the setter by stepping into (F5) and stepping out (F7) repeatedly
		 * and look at the stack
		 */
		/*
		 * Swap the two statements and put a breakpoint in the uncommented
		 * statement. Look at the stack.
		 *  
		 */
		undoer.execute(new ASetWeightCommand(bmiSpreadsheet, newValue));
//		undoer.execute(new ASetWeightCommand(this, newValue));		

	}	
	/*
	 * The (pre) undo and (pre) redo methods on the undoable are simply forwarded 
	 * to the undoer
	 */
	public void undo() {
		/*
		 * Put a breakpoint and follow its execution using step into (F5)
		 */
		undoer.undo();
	}
	public void redo() {
		/*
		 * Put a breakpoint and follow its execution
		 */
		undoer.redo();
	}		
	public boolean preUndo() {
		
		return undoer.preUndo();
	}	
	public boolean preRedo() {
		return undoer.preRedo();
	}
	static final double INITIAL_HEIGHT = 1.77;
	static final double INITIAL_WEIGHT = 75;
	public static void main (String[] args) {
		ObjectEditor.edit(new AnUndoableBMISpreadsheet(INITIAL_HEIGHT, INITIAL_WEIGHT));
		/*
		 * Uncomment the two lines when asked.
		 */
//		ObjectEditor.edit(new AnUndoableBMISpreadsheet(INITIAL_HEIGHT, INITIAL_WEIGHT));
//		ObjectEditor.edit(new AnUndoableCounter(new AnObservableCounter()));
	}
}
/*
 * Run the program and study its initial undo/redo model,
 *  
 * 
 * (T/F) AMonolithicUndoableBMISpreadsheet and AnUndoableBMISpreadsheet implement 
 * the same interface.
 * (T/F) AMonolithicUndoableBMISpreadsheet and AnUndoableBMISpreadsheet provide 
 * the same user interface when the undoer is assigned a LastCommandUndoer.
 * 
 * Put breakpoints in setWeight and undo methods, run the programs,
 * and follow execution of these methods (and/or simply look at the source code).
 * 
 * (Again, forwarding a call in a class is not considered execution of application-specific code
 * in the class. Instantiating an object is considered execution of such code). 
 * In AnUndoableBMISpreadsheet, the getter methods of the 
 * undoable object (that is, instance of AnUndoableBMISpreadsheet) involve execution of
 * application-specific (that is, BMISpreasheet-specific) code in:
 *  (a) the undoable object  
 *  (b) executor delegate  (bmiSpreadsheet)
 *  (c) the undoer delegate (undoer)
 *  (d) the command objects
 * 
 * In AnUndoableBMISpreadsheet, the setter methods of the 
 * undoable object (that is, instance of AnUndoableBMISpreadsheet) 
 * involve execution of application-specific (that is, BMISpreasheet-specific) code in:
 *  (a) the undoable object  
 *  (b) executor delegate  (bmiSpreadsheet)
 *  (c) the undoer delegate (undoer)
 *  (d) the command objects
 * 
 * (T/F) In AnUndoableBMISpreadsheet, the undo/redo methods in the 
 * undoable object involve execution of application-specific code in:
 *  (a) the undoable object
 *  (b) the executor delegate  (bmiSpreadsheet)
 *  (c) the undoer delegate (undoer)
 *  (d) the command objects
 *  
 *  Assign to the undoer the HistoryUndoer. Study the new undo/redo model.
 *  
 *  
 * (T/F) HistoryUndoer makes it possible to redo before  
 * any changes to weight or height are made.
 * 
 * (T/F) HistoryUndoer makes it possible to undo before 
 * any changes are made to weight or height.
 * 
 * (T/F) HistoryUndoer allows an undo to be followed by another undo
 * 
 * (T/F) HistoryUndoer allows an undo to be followed by a redo
 * 
 * (T/F) HistoryUndoer allows a redo to be followed by a redo
 * 
 * The maximum number of executed commands that HistoryUndoer allows to be undone is:
 * a) 0
 * b) 1
 * c) 2
 * d) > 2 
 *    
 *  
 *  Uncomment the lines in main that create and display another spreadsheet and
 *  the counter. 
 *  
 *  Run the program to display the objects.
 *  
 *  
 *  Change the weight in one spreadsheet. Can you undo it from another spreadsheet?
 *  
 * 
 * (T/F) A set of objects that choose their own undoers support the same 
 * undo/redo model.
 * 
 *  Invoke the add() command from the menu of the counter a few times.
 *  Can you undo all of them?
 *       
 * (T/F)A set of objects that choose that choose their own undoers share a common undo/redo
 * history
 * 
 * 
 * Assign to the undoer the the object returned by UndoerFactory returning a
 * singleton.
 * 
 * Go to AnUndoableCounter and assign to its undoer also the object returned by 
 * UndoerFactory.
 * 
 * Change the weight in one spreadsheet. Can you undo it from another spreadsheet?
 *  
 * 
 * (T/F) A set of objects that choose a singleton undoer support the same 
 * undo/redo model.
 * 
 *  Invoke the add() command from the menu of the counter a few times.
 *  Can you undo all of them?
 *       
 * (T/F) A set of objects that choose a singleton undoer share a common undo/redo
 * history.
 * 
 * (T/F) The same undoer class can be used to undo writes of objects of different
 * types (e.g. BMISpreadsheet and Counter) that are not related by IS-A relationships.
 * 
 * Study the command objects created by  AnUndoableCounter.
 * 
 * (T/F) The same command objects can be used to undo writes of objects of 
 * different types (e.g. BMISpreadsheet and Counter) that are not related by IS-A 
 * relationships.
 * 
 * To answer the next question look at the alternate assignments of the static 
 * variable in UndoerFactorty
 * 
 * (T/F) With factory classes, it is possible to change the undoer of a class of undoable objects 
 * (e.g. instance of AnUndoableBMISpreadsheet) without making any changes to the 
 * class of the object.
 * 
 * Next class ASetHeightCommand
 */
