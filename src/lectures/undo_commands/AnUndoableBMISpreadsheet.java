package lectures.undo_commands;
import lectures.interfaces.ABMISpreadsheet;
import lectures.interfaces.BMISpreadsheet;
public class AnUndoableBMISpreadsheet implements UndoableBMISpreadsheet {
	BMISpreadsheet bmiSpreadsheet;
//	Undoer undoer = new LastCommandUndoer();
	Undoer undoer = new HistoryUndoer();
	public AnUndoableBMISpreadsheet (double height, double weight) {
		bmiSpreadsheet = new ABMISpreadsheet(height, weight);
	}
	public double getBMI() {return bmiSpreadsheet.getBMI();}
	public double getHeight() {return bmiSpreadsheet.getHeight();}
	public double getWeight() {return bmiSpreadsheet.getWeight();}
	public void setHeight(double theHeight) {
		undoer.execute(new ASetHeightCommand(bmiSpreadsheet, theHeight));
	}
	public void setWeight(double theWeight) {		
		undoer.execute(new ASetWeightCommand(bmiSpreadsheet, theWeight));		
	}	
	public void undo() {undoer.undo();}
	public void redo() {undoer.redo();}	
	public static void main (String[] args) {
		bus.uigen.ObjectEditor.edit(new AnUndoableBMISpreadsheet(1.77, 75));
	}
}
