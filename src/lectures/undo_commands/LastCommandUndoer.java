package lectures.undo_commands;

import org.junit.Assert;

public class LastCommandUndoer  implements Undoer {
    UndoableCommand lastCommand = null;
    boolean lastCommandWasUndone = false;
    public void execute (UndoableCommand c){
        c.execute();
        lastCommand = c;
        lastCommandWasUndone = false;
    }  
    public boolean preUndo() {
		return lastCommand != null && !lastCommandWasUndone;
	}
    public void undo() {
		Assert.assertTrue("Cannot undo, call preUndo before calling undo", preUndo());
        lastCommand.undo();
        lastCommandWasUndone = true;              
    }
    public boolean preRedo() {
    	return lastCommand != null && lastCommandWasUndone;
    }
    public void redo() {
		Assert.assertTrue("Cannot redo, call preRedo before calling redo", preRedo());
        lastCommand.execute();
        lastCommandWasUndone = false;                   
    }
	
	
}