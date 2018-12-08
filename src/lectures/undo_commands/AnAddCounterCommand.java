package lectures.undo_commands;

import lectures.mvc.Counter;

public class AnAddCounterCommand implements UndoableCommand {
	Counter counter;
	int addAmount;
	public AnAddCounterCommand (Counter aCounter, int anAmount) {
		counter = aCounter;
		addAmount = anAmount;
	}
	public void execute() {counter.add(addAmount);}	
	public void undo() {counter.add(-addAmount);}
 /*
  *  
  *  (T/F) The constructor of an undoable command object associated with any write
  *   method must call a read method in the executor.
  *
  *  Next class: HistoryUndoer
  */
}

