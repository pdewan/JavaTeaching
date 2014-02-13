package lectures.undo_commands;
public class LastCommandUndoer  implements Undoer {
    UndoableCommand lastCommand = null;
    boolean lastCommandWasUndone = false;
    public void execute (UndoableCommand c){
        c.execute();
        lastCommand = c;
        lastCommandWasUndone = false;
    }    
    public void undo() {
    	if (lastCommandWasUndone || lastCommand == null)   
    		return;       
        lastCommand.undo();
        lastCommandWasUndone = true;              
    }
    public void redo() {
    	if (!lastCommandWasUndone || lastCommand == null)
    		return;        
        lastCommand.execute();
        lastCommandWasUndone = false;                   
    }
}