package lectures.undo_commands;

import lectures.interfaces.BMISpreadsheet;

public class ASetHeightCommand implements UndoableCommand {
	BMISpreadsheet bmiSpreadsheet;
	double oldHeight;
	double height;
	public ASetHeightCommand (BMISpreadsheet theBMISpreadsheet, double theHeight) {
		bmiSpreadsheet = theBMISpreadsheet;
		height = theHeight;	
		oldHeight = bmiSpreadsheet.getHeight();
	}
	public void execute() {bmiSpreadsheet.setHeight(height);}	
	public void undo() {bmiSpreadsheet.setHeight(oldHeight);}
}
