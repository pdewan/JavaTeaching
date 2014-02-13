package lectures.extra.demoers;

import lectures.composite.objects_shapes.ALoan;
import lectures.graphics.ACartesianPoint;
import lectures.mvc.properties.AnObservablePlottedShuttle;
import lectures.objects.ABMICalculator;
import lectures.objects.ASquareCalculator;
import lectures.types.math.ABMIAndOverweightSpreadsheet;
import bus.uigen.ObjectEditor;
import bus.uigen.WidgetAdapter;
import bus.uigen.uiFrame;
import bus.uigen.attributes.AttributeNames;

public class Comp110Driver {
	public static void main(String args[]) {
		ObjectEditor.setDefaultAttribute(AttributeNames.SEPARATE_THREAD, true);
		ObjectEditor.edit(new Comp110Driver());
	}
	public static void createInstantiator() {
		ObjectEditor.edit(new ObjectEditor());
	}
	public static void demoFunctions() {
		ObjectEditor.edit(new ABMICalculator());
		ObjectEditor.edit(new ASquareCalculator());		
	}	
	public static void demoSimpleState() {
		//VirtualToolkit.selectAWT();
		
		uiFrame frame = ObjectEditor.edit(new ABMIAndOverweightSpreadsheet(1.77, 75));
		WidgetAdapter.setFontInFrameTree(frame, null, null, null, 18);
		ObjectEditor.edit(new ACartesianPoint(100, 200));
	}
	public static void demoStructuredState() {
		ObjectEditor.edit(new ALoan(100000));
		ObjectEditor.edit(new AnObservablePlottedShuttle(50, 100));
	}
	
}
