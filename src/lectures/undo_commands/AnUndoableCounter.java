package lectures.undo_commands;
import lectures.mvc.AnObservableCounter;
import lectures.mvc.CounterObserver;
import lectures.mvc.ObservableCounter;
import bus.uigen.ObjectEditor;
import bus.uigen.attributes.AttributeNames;
public class AnUndoableCounter implements UndoableCounter {
	ObservableCounter counter;
	Undoer undoer = new LastCommandUndoer();
//	Undoer undoer = new HistoryUndoer();
//	Undoer undoer = UndoerFactory.getUndoer();
	public AnUndoableCounter (ObservableCounter theCounter){
		counter = theCounter;
	}
	public int getValue() {
		return counter.getValue();
	}
	public void add(int theAmount) {
		undoer.execute(new AnAddCounterCommand(counter, theAmount));
	}
	public void addObserver(CounterObserver observer) {
		counter.addObserver(observer);		
	}
	public void undo() {undoer.undo();}
	public void redo() {undoer.redo();}		
	public boolean preUndo() {
		return undoer.preUndo();
	}
	public boolean preRedo() {
		return undoer.preRedo();
	}
	public static void main (String[] args) {	
		ObjectEditor.edit(new AnUndoableCounter(new AnObservableCounter()));
	}
	
}
