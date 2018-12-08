package lectures.undo_commands;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
/*
 * Supports undo/redo of a history of commands rather than a single command.
 */
public class HistoryUndoer implements Undoer {
    List<UndoableCommand> commandHistory = new ArrayList();	
    int nextCommandIndex = 0; // separates undo and redo list of executed commands
	public void execute (UndoableCommand c) {
		while(nextCommandIndex < commandHistory.size()) {
		      commandHistory.remove(nextCommandIndex); // clear redo chain
		}		
		c.execute();
		commandHistory.add(c);	
		nextCommandIndex++;
    }
	public boolean preUndo() {
		return nextCommandIndex > 0;
	}
    public void undo() {
		Assert.assertTrue("Cannot undo, call preUndo before calling undo", preUndo());
    	nextCommandIndex--;
    	UndoableCommand c = commandHistory.get(nextCommandIndex);
    	c.undo();    	
    }
	public boolean preRedo() {
		return nextCommandIndex < commandHistory.size();
	}
    public void redo() {
		Assert.assertTrue("Cannot redo, call preRedo before calling redo", preRedo());
        UndoableCommand c = commandHistory.get(nextCommandIndex);
        c.execute();
        nextCommandIndex++;			
    }	
}
/*
 *  An undoer must keep references to ( that is, store in its instance variables):
 * a) Undoable objects (e.g. AnUndoableBMISpreadsheet, AnUndoableCounter)
 * b) Command objects (e.g. AnAddCounterCommand, ASetHeightCommand)
 * c) Executors (e.g ABMISpreadsheet and AnObservableCounter)
 * 
 * 
 * An undoer provides methods to:
 * (a) execute a write for the first time.
 * (b) redo a write.
 * (c) undo a write. 
 * 
 * The same method in an undoer is called to:
 * (a) Execute a write for the first time.
 * (b) Redo a write.
 * (c) Undo a write.
 * 
 * 
 * A history undoer may:
 * a) append a command to the stored command history.
 * b) remove the last command in the history.
 * c) insert a command in the middle of the history without deleting subsequent commands.
 * d) delete a command in the middle of the history without deleting subsequent commands.
 * 
 * 
 * The contents of the command history can be changed by which of the following 
 * methods of a history undoer:
 * a) execute
 * b) undo
 * c) redo
 * 
 *  
 * The pointer to the command history can be changed which of the following 
 * methods of a history undoer:
 * a) execute
 * b) undo
 * c) redo
 * 
 * 
 * The pointer to the command history separates:
 * 
 * a) commands that have never been executed from those that have been executed
 * b) executed commands that have not been undone from those that have been undone
 * c) executed commands that have not been redone from those that have been redone
 * 
 * The execute method of HistoryUndoer:
 * a) removes all commands from the history that have not been undone.
 * b) removes all redone commands from the history that have been undone.
 * c) removes all commands from the history that have not been redone.
 * d) removes all commands from the history that have been redone.
 * c) adds a command to the history
 *   
 *  In the following questions, suppose command C2 was executed after command C1:
 *  If command C2 exists in the history, then command C1 must appear in the history
 *  before C2.
 *  
 *  (T/F) If command C1 exists in the history, then command C2 must appear in the history
 *  after C1.
 *  
 *  (T/F) If command C1 exists in the history, then command C2 must appear in the history
 *  after C1. 
 *  
 *  (T/F) The size of command history never reduces.
 *  
 *  (T/F) The pointer to the command history moves exactly one step (forward/backward)
 *  when the undo(), redo() and execute() methods are invoked on the history undoer.
 *
 *  
 * In the following questions,
 * an executed (undone) (redone) command is one on which the last invoked method is 
 * execute() (undo()) (redo()).
 * The precondition of history redo is:
 * (a) An undone command exists in the history
 * (b) A redone command exists in the history
 * (c) An executed command exists in the history
 * (d) An executed or redone commmnd exists in the history
 * (e) An executed or undone command exists in the history
 * 
 * The precondition of history undo is:
 * (a) An undone command exists in the history
 * (b) A redone command exists in the history
 * (c) An executed command exists in the history
 * (d) An executed or redone command exists in the history
 * (e) An executed or undone command exists in the history
 * 
 * The history undo method undoes:
 * (a) the latest command in the history that has been executed.
 * (b) the earliest command in the history that has been executed.
 * (c) the latest command in the history that has been executed or redone.
 * (d) the earliest command in the history that has been executed or redone.
 * 
 * The history redo method redoes:
 * (a) the latest command in the history that has been executed.
 * (b) the earliest command in the history that has been executed.
 * (c) the latest command in the history that has been undone.
 * (b) the earliest command in the history that has been undone.
 
 */