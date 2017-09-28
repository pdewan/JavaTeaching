package lectures.state_properties;
import lectures.constructors_pointers.ABMISpreadsheet;
import bus.uigen.OEFrame;
import bus.uigen.ObjectEditor;
public class ABMISpreadsheetRefreshedByMain {
	public static void main (String[] args) {
		ABMISpreadsheet bmiSpreadsheet = new ABMISpreadsheet();
		OEFrame oeFrame = ObjectEditor.edit(bmiSpreadsheet);
		bmiSpreadsheet.setHeight(1.77);
		bmiSpreadsheet.setWeight(75);
		oeFrame.refresh();
	}
}
