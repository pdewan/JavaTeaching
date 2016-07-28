package lectures.mvc.properties;

import bus.uigen.OEFrame;
import bus.uigen.ObjectEditor;

public class ACartesianPlaneComposer {
	public static void main (String[] anArgs) {
		ObservableCartesianPlane aModel = new AnObservableCartesianPlane(100, 125, 125);
		new ACartesianPlaneEventDisplayer(aModel);
		PraxisConsoleController aController = new ACartesianPlaneInputter(aModel);
		OEFrame aFrame = ObjectEditor.edit(aModel);		
		aFrame.setSize(300, 400);
		aController.processInput();
	}
}
