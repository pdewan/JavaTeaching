package lectures.undo_commands;

import lectures.interfaces.BMISpreadsheet;

public class ASetWeightCommand implements UndoableCommand {
	BMISpreadsheet bmiSpreadsheet;
	double oldWeight;
	double weight;
	public ASetWeightCommand (BMISpreadsheet theBMISpreadsheet, double theWeight) {
		bmiSpreadsheet = theBMISpreadsheet;
		weight = theWeight;	
		oldWeight = bmiSpreadsheet.getWeight();
	}
	public void execute() {bmiSpreadsheet.setWeight(weight);}	
	public void undo() {bmiSpreadsheet.setWeight(oldWeight);}
}
