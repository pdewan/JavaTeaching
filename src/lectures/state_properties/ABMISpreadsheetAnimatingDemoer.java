package lectures.state_properties;

import lectures.animation.threads_commands.ThreadSupport;
import bus.uigen.OEFrame;
import bus.uigen.ObjectEditor;
public class ABMISpreadsheetAnimatingDemoer {	
	public static void main (String[] args) {		
		ABMISpreadsheet bmiSpreadsheet = new ABMISpreadsheet();	
		bmiSpreadsheet.setHeight(1.77);
		bmiSpreadsheet.setWeight(75);
		OEFrame editor = ObjectEditor.edit(bmiSpreadsheet);
		ThreadSupport.sleep(3000);
		editor.select(bmiSpreadsheet, "Weight");
		bmiSpreadsheet.setWeight(70);
		editor.refresh();
		ThreadSupport.sleep(3000);
		editor.select(bmiSpreadsheet, "Height");
		bmiSpreadsheet.setHeight(0);
		editor.refresh();
		ThreadSupport.sleep(3000);
		editor.select(bmiSpreadsheet, "Weight");
		bmiSpreadsheet.setWeight(0);
		editor.refresh();
	}	
}
