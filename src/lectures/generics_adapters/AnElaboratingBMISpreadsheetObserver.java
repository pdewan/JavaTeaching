package lectures.generics_adapters;

import lectures.interfaces.BMISpreadsheet;

public class AnElaboratingBMISpreadsheetObserver implements GenericObserver<BMISpreadsheet> {
	public void update(BMISpreadsheet aBMISpreadsheet) {
		System.out.println(aBMISpreadsheet.getBMI());		
	}
}
