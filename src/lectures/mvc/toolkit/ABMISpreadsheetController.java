package lectures.mvc.toolkit;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import lectures.interfaces.BMISpreadsheet;

public class ABMISpreadsheetController implements ActionListener {
	JTextField height, weight;
	BMISpreadsheet bmiSpreadsheet;
	public ABMISpreadsheetController (BMISpreadsheet theBMISpreadsheet, JTextField theHeight, JTextField theWeight) {
		height = theHeight;
		weight = theWeight;
		bmiSpreadsheet = theBMISpreadsheet;
		height.addActionListener(this);
		weight.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent event) {
		// can we make this code safer?
		JTextField source = (JTextField) event.getSource();
		String text = source.getText();
		double val = Double.parseDouble(text);
		if (source == height) {
			bmiSpreadsheet.setHeight(val);		
		} else {
			bmiSpreadsheet.setWeight(val);
		}		
	}
}
