package lectures.undo_commands;
import lectures.mvc.ObservableCounter;
public interface UndoableCounter extends ObservableCounter {
	public void undo();
}
