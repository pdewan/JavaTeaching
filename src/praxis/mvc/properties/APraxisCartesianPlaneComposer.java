package praxis.mvc.properties;

import bus.uigen.OEFrame;
import bus.uigen.ObjectEditor;

public class APraxisCartesianPlaneComposer {
	public static void main (String[] anArgs) {
		PraxisObservableCartesianPlane aModel = new APraxisNotifyingCartesianPlane(100, 125, 125);
//		new APraxisCartesianPlaneEventCounter(aModel);
		new APraxisCartesianPlaneEventDisplayer(aModel);
		PraxisConsoleController aController = new APraxisCartesianPlaneInputter(aModel);
		OEFrame aFrame = ObjectEditor.edit(aModel);		
		aFrame.setSize(300, 400);
		aController.processInput();
	}

}
