package lectures.undo_commands;
import lectures.interfaces.BMISpreadsheet;
public interface UndoableBMISpreadsheet extends BMISpreadsheet {
	public void undo();
	public void redo();
	public boolean preUndo();
	public boolean preRedo();
}
