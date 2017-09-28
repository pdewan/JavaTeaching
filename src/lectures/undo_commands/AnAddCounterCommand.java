package lectures.undo_commands;

import lectures.mvc.Counter;

public class AnAddCounterCommand implements UndoableCommand {
	Counter counter;
	int addAmount;
	public AnAddCounterCommand (Counter theCounter, int theAmount) {
		counter = theCounter;
		addAmount = theAmount;
	}
	public void execute() {counter.add(addAmount);}	
	public void undo() {counter.add(-addAmount);}
}
