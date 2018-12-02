package lectures.undo_commands;

import lectures.interfaces.BMISpreadsheet;

public class ASetHeightCommand implements UndoableCommand {
	BMISpreadsheet bmiSpreadsheet;
	double oldHeight;
	double height;
	public ASetHeightCommand (BMISpreadsheet aBMISpreadsheet, double aHeight) {
		bmiSpreadsheet = aBMISpreadsheet;
		height = aHeight;	
		oldHeight = bmiSpreadsheet.getHeight();
	}
	public void execute() {bmiSpreadsheet.setHeight(height);}	
	public void undo() {bmiSpreadsheet.setHeight(oldHeight);}

 /*
  *  (T/F) A single command-object class must be implemented for all writes 
  *  (e.g setHeight() and setWeight()) to an executor (e.g. BMI Spreadhseet).
  *  
  *  (T/F) The constructor of a command object must take as an argument the executor.
  *  
  *  (T/F) The constructor of a command object must takes as an argument the kind
  *  of write (e.g setHeight(), setWeight(), add())
  *  
  *  (T/F) The constructor of a command object must take as arguments information about
  *  arguments of the write (e.g. height, weight, add amount)
  *  
  *  (T/F) The constructor of an undoable command object may call a read method in the executor.
  *  
  *  (T/F) Each instance variable of an undoable command object stores an argument passed to its constructor.
  *  
  *  (T/F) Each argument passed to the constructor of an undoable command object is stored in an instance
  *  variable.
  *
  *  
  *  The same method can be used in an undoable command object to:
  *  
  *  (a) Execute a write for the first time in an executor.
  *  (b) Redo a write in an executor.
  *  (c) Undo a write in an executor. 
  *
  * Next class AnAddCounterCommand
  *  
  */
}
