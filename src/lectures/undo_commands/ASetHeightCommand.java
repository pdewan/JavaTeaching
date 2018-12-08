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
  *  (T/F) A separate command-object class is implemented for each write method 
  *  (e.g setHeight() and setWeight()) invoked on undoable object (e.g. BMISpreadhseet).
  *  
  *  (T/F) The constructor of a command object takes as an argument the executor.
  *  
  *  (T/F) The constructor of a command object takes as an argument the undoable.
  *  
  *  (T/F) The constructor of a command object takes as an argument the undoer.
  *  
  *  (T/F) The constructor of a command object takes as an argument information 
  *  about the kind of write (e.g setHeight(), setWeight(), add())
  *  
  *  (T/F) The constructor of a command object takes as arguments information about
  *  arguments of the write (e.g. height, weight, add amount)
  *  
  *  (T/F) The constructor of an undoable command object associated with a setter
  *  calls a read method in the executor.
  *  
  *  (T/F) Each instance variable of an undoable command object stores an argument 
  *  passed to its constructor.
  *  
  *  (T/F) Each argument passed to the constructor of an undoable command object 
  *  is stored in an instance variable.
  *
  *  
  *  The same method in a command object can be used in an undoable command object to:
  *  
  *  (a) Execute a newly issued user write.
  *  (b) Redo a previously issued write.
  *  (c) Undo a previously issued write. 
  *
  * Next class AnAddCounterCommand
  *  
  */
}
