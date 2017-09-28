package lectures.mvc.properties;
import lectures.interfaces.BMISpreadsheet;
import lectures.mvc.toolkit.AnObservableBMISpreadsheet;
import bus.uigen.ObjectEditor;
public class AnObservableBMISpreadsheetDemoer {
	public static void main (String[] args) {
		BMISpreadsheet bmiSpreadsheet = new AnObservableBMISpreadsheet();
		ObjectEditor.edit(bmiSpreadsheet);
		bmiSpreadsheet.setHeight(1.77);
		bmiSpreadsheet.setWeight(75);
	}
}
