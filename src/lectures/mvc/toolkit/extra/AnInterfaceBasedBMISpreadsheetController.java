package lectures.mvc.toolkit.extra;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import lectures.interfaces.BMISpreadsheet;

public class AnInterfaceBasedBMISpreadsheetController implements ActionListener {
	TextComponentInterface height, weight;
	BMISpreadsheet bmiSpreadsheet;
	public AnInterfaceBasedBMISpreadsheetController (BMISpreadsheet theBMISpreadsheet, TextComponentInterface theHeight, TextComponentInterface theWeight) {
		height = theHeight;
		weight = theWeight;
		bmiSpreadsheet = theBMISpreadsheet;
		height.addActionListener(this);
		weight.addActionListener(this);
	}
	public void actionPerformed(ActionEvent event) {
		TextComponentInterface source = (TextComponentInterface) event.getSource();
		String text = source.getText();
		double val = Double.parseDouble(text);
		if (source == height) {
			bmiSpreadsheet.setHeight(val);		
		} else {
			bmiSpreadsheet.setWeight(val);
		}		
	}
}
