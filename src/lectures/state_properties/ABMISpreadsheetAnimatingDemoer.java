package lectures.state_properties;

import lectures.animation.threads_commands.ThreadSupport;
import lectures.constructors_pointers.ABMISpreadsheet;
import bus.uigen.OEFrame;
import bus.uigen.ObjectEditor;
public class ABMISpreadsheetAnimatingDemoer {	
	public static void main (String[] args) {
		final int initWeight = 75;
    	final double initHeight = 1.77;
		final int sleepTime = 3000;
		ABMISpreadsheet bmiSpreadsheet = new ABMISpreadsheet();	
		bmiSpreadsheet.setHeight(initHeight);
		bmiSpreadsheet.setWeight(initWeight);
		OEFrame editor = ObjectEditor.edit(bmiSpreadsheet);
		ThreadSupport.sleep(sleepTime);
		editor.select(bmiSpreadsheet, "Weight");
		bmiSpreadsheet.setWeight(sleepTime);
		editor.refresh();
		ThreadSupport.sleep(sleepTime);
		editor.select(bmiSpreadsheet, "Height");
		bmiSpreadsheet.setHeight(0);
		editor.refresh();
		ThreadSupport.sleep(sleepTime);
		editor.select(bmiSpreadsheet, "Weight");
		bmiSpreadsheet.setWeight(0);
		editor.refresh();
	}	
}
