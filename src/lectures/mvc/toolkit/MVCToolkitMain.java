package lectures.mvc.toolkit;

import bus.uigen.ObjectEditor;
import lectures.mvc.properties.ObservableBMISpreadsheet;

public class MVCToolkitMain {
	static final double EXAMPLE_HEIGHT = 1.77;
	static final double EXAMPLE_WEIGHT = 75;
	public static void main (String[] args) {
		ObservableBMISpreadsheet aBMISpreadsheet = 
				new AnObservableBMISpreadsheet(EXAMPLE_HEIGHT, EXAMPLE_WEIGHT);
		BMIMVCComposer.edit(aBMISpreadsheet);
		ObjectEditor.edit(aBMISpreadsheet);		
	}
}
