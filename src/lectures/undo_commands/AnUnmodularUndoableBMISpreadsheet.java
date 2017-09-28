package lectures.undo_commands;
import lectures.interfaces.ABMISpreadsheet;
import lectures.interfaces.BMISpreadsheet;
public class AnUnmodularUndoableBMISpreadsheet implements UndoableBMISpreadsheet {
	BMISpreadsheet bmiSpreadsheet;
	public enum WriteMethod {SET_WEIGHT, SET_HEIGHT,  NO_COMMAND};
	WriteMethod lastWriteMethod = WriteMethod.NO_COMMAND;
	boolean undoEnabled = false;
	boolean redoEnabled = false;
	double oldWeight, newWeight;
	double oldHeight, newHeight;
	public AnUnmodularUndoableBMISpreadsheet (double height, double weight) {
		bmiSpreadsheet = new ABMISpreadsheet(height, weight);
	}
	public double getBMI() {return bmiSpreadsheet.getBMI();}
	public double getHeight() {return bmiSpreadsheet.getHeight();}
	public double getWeight() {return bmiSpreadsheet.getWeight();}
	public void setHeight(double newValue) {
		oldHeight = getHeight();
		newHeight = newValue;
		undoEnabled = true;
		redoEnabled = false;
		bmiSpreadsheet.setHeight(newValue);
	}
	public void setWeight(double newValue) {
		oldWeight = getWeight();
		newWeight = newValue;
		lastWriteMethod = WriteMethod.SET_WEIGHT;
		undoEnabled = true;
		redoEnabled = false;
		bmiSpreadsheet.setWeight(newValue);		
	}
	void undoWeight() {bmiSpreadsheet.setWeight(oldWeight);	}
	void undoHeight() {bmiSpreadsheet.setHeight(oldHeight);	}
	void redoWeight() {bmiSpreadsheet.setWeight(newWeight);}
	void redoHeight() {bmiSpreadsheet.setHeight(newHeight);}
	
	public void undo() {
		if (!undoEnabled) 
			System.out.println("Undo not applicable");
		switch (lastWriteMethod) {
		case SET_WEIGHT: 
			undoWeight();
			break;
		case SET_HEIGHT:
			undoHeight();
			break;		 
			
		}		
	}
	public void redo() {
		if (!redoEnabled) 
			System.out.println("Undo not applicable");
		switch (lastWriteMethod) {
		case SET_WEIGHT: 
			undoWeight();
			break;
		case SET_HEIGHT:
			undoHeight();
			break;	 
			
		}		
	}
	
	public static void main (String[] args) {
		bus.uigen.ObjectEditor.edit(new AnUnmodularUndoableBMISpreadsheet(1.77, 75));
	}

}
