package lectures.state_properties;
import bus.uigen.ObjectEditor;
public class ABMISpreadsheetManipulatedByMainAndObjectEditor {
	public static void main (String[] args) {
		ABMISpreadsheet bmiSpreadsheet = new ABMISpreadsheet();
		ObjectEditor.edit(bmiSpreadsheet);
		bmiSpreadsheet.setHeight(1.77);
		bmiSpreadsheet.setWeight(75);
	}
}
