package lectures.undo_commands;
import lectures.interfaces.BMISpreadsheet;
public interface UndoableBMISpreadsheet extends BMISpreadsheet {
	public void undo();
}
