package lectures.undo_commands;
import lectures.interfaces.ABMISpreadsheet;
import lectures.interfaces.BMISpreadsheet;
public class AnUndoableBMISpreadsheet implements UndoableBMISpreadsheet {
	BMISpreadsheet bmiSpreadsheet;
//	Undoer undoer = new LastCommandUndoer();
//	Undoer undoer = new HistoryUndoer();
	Undoer undoer = UndoerFactory.getUndoer();
	public AnUndoableBMISpreadsheet (double aHeight, double aWeight) {
		bmiSpreadsheet = new ABMISpreadsheet(aHeight, aWeight);
	}
	public double getBMI() {return bmiSpreadsheet.getBMI();}
	public double getHeight() {return bmiSpreadsheet.getHeight();}
	public double getWeight() {return bmiSpreadsheet.getWeight();}
	public void setHeight(double newValue) {
		undoer.execute(new ASetHeightCommand(bmiSpreadsheet, newValue));
	}
	public void setWeight(double newValue) {		
		undoer.execute(new ASetWeightCommand(bmiSpreadsheet, newValue));		
	}	
	public void undo() {undoer.undo();}
	public void redo() {undoer.redo();}	
	public static void main (String[] args) {
		bus.uigen.ObjectEditor.edit(new AnUndoableBMISpreadsheet(1.77, 75));
	}
}
