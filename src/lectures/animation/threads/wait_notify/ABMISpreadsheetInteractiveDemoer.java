package lectures.animation.threads.wait_notify;

import lectures.interfaces.ABMISpreadsheet;
import lectures.interfaces.BMISpreadsheet;
import bus.uigen.OEFrame;
import bus.uigen.ObjectEditor;
public class ABMISpreadsheetInteractiveDemoer {	
	public static void main (String[] args) {	
		ClearanceManager clearanceManager = new AClearanceManager();
		ObjectEditor.edit(clearanceManager);
		BMISpreadsheet bmiSpreadsheet = new ABMISpreadsheet();	
		final int initWeight = 75;
    	final double initHeight = 1.77;
		bmiSpreadsheet.setHeight(1.77);
		bmiSpreadsheet.setWeight(75);
		OEFrame editor = ObjectEditor.edit(bmiSpreadsheet);
		clearanceManager.waitForProceed();
		editor.select(bmiSpreadsheet, "Weight");
		final int secondWeight = 70;
		bmiSpreadsheet.setWeight(secondWeight);
		editor.refresh();
		clearanceManager.waitForProceed();
		editor.select(bmiSpreadsheet, "Height");
		bmiSpreadsheet.setHeight(0);
		editor.refresh();
		clearanceManager.waitForProceed();
		editor.select(bmiSpreadsheet, "Weight");
		bmiSpreadsheet.setWeight(0);
		editor.refresh();
	}	
}
