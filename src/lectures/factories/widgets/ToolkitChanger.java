package lectures.factories.widgets;

import lectures.interfaces.ABMISpreadsheet;
import lectures.interfaces.BMISpreadsheet;
import bus.uigen.ObjectEditor;
import bus.uigen.widgets.TextFieldSelector;
import bus.uigen.widgets.VirtualToolkit;
import bus.uigen.widgets.awt.AWTToolkit;
import bus.uigen.widgets.swing.SwingToolkit;

public class ToolkitChanger {
	public static void main (String[] anArgs) {
		BMISpreadsheet aBMISpreadsheet = new ABMISpreadsheet();
		VirtualToolkit.setDefaultToolkit(new SwingToolkit());
		ObjectEditor.edit(aBMISpreadsheet);
		VirtualToolkit.setDefaultToolkit(new AWTToolkit());
		ObjectEditor.edit(aBMISpreadsheet);		
	}

}
