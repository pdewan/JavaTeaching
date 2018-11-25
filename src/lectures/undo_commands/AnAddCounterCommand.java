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
}
