package praxis.mvc.properties;

import bus.uigen.ObjectEditor;
import praxis.composite.objects_shapes.PraxisCartesianPlane;

public class APraxisCartesianPlaneComposer {
	public static void main (String[] anArgs) {
		PraxisObservableCartesianPlane aModel = new APraxisObservableCartesianPlane(100, 125, 125);
		new APraxisCartesianPlaneObserver(aModel);
		PraxisConsoleController aController = new APraxisCartesianPlaneController(aModel);
		ObjectEditor.edit(aModel);
		aController.processInput();
	}

}
