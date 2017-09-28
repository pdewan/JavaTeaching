package lectures.ui;

import util.misc.ThreadSupport;
import lectures.interfaces.ABMISpreadsheet;
import lectures.interfaces.BMISpreadsheet;
import bus.uigen.OEFrame;
import bus.uigen.ObjectEditor;

public class OERefresh {
	public static void main (String[] args) {
		// INTERACTIVE AND PROGRAMMED REFRESH
		final double initialHeight = 1.77;
		final double initialWeight = 75;
		BMISpreadsheet aBMISpreadsheet = new ABMISpreadsheet(initialHeight, initialWeight);
		OEFrame anOEFrame = ObjectEditor.edit(aBMISpreadsheet);
		// What happens if we change a displayed object from the program, as below.
		// Will the display change? Think about it and then run the program.
			
		final double aWeightGain = 2;
		final int aNumGains = 5;
		final long aTimeBetweeenGains = 1000; // one second
		for (int aCount = 0; aCount < aNumGains; aCount++) {
			aBMISpreadsheet.setWeight(aBMISpreadsheet.getWeight() + aWeightGain);
			ThreadSupport.sleep(aTimeBetweeenGains); // pause the program
//					anOEFrame.refresh();
		}
		System.out.println ("No more weight again!");
		
		// Execute the Common->Refresh command and observe its behavior
		// Now uncomment the refresh() line above and run the program again.
		// Does the new behavior make sense?
	}

}
