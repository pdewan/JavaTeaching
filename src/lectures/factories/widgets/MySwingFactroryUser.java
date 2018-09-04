package lectures.factories.widgets;

import lectures.interfaces.ABMISpreadsheet;
import lectures.interfaces.BMISpreadsheet;
import bus.uigen.ObjectEditor;
import bus.uigen.widgets.FrameSelector;
import bus.uigen.widgets.TextFieldSelector;
import bus.uigen.widgets.VirtualToolkit;
import bus.uigen.widgets.awt.AWTToolkit;
import bus.uigen.widgets.swing.SwingToolkit;

public class MySwingFactroryUser {
	public static void main (String[] anArgs) {
		ObjectEditor.initialize();
		BMISpreadsheet aBMISpreadsheet = new ABMISpreadsheet();
		ObjectEditor.edit(aBMISpreadsheet);
		FrameSelector.setFrameFactory(new MySwingFrameFactory());
		ObjectEditor.edit(aBMISpreadsheet);		
	}
}
