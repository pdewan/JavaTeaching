package lectures.style;

import util.annotations.EditablePropertyNames;
import util.annotations.PropertyNames;
import util.annotations.StructurePattern;
import util.annotations.StructurePatternNames;
import util.annotations.Tags;
import lectures.interfaces.AnotherBMISpreadsheet;
import lectures.interfaces.BMISpreadsheet;

@Tags({ "ScannerBean" })
@PropertyNames({ "Height", "Weight", "BMI", "IdealBMI" })
@EditablePropertyNames({ "Height", "Weight", "BMI" })
@StructurePattern(StructurePatternNames.BEAN_PATTERN)
public class ABMISpreadsheetWihStyleErrorsCS2 
	implements BMISpreadsheet 
	{
	double height;
	double weight;

	public ABMISpreadsheetWihStyleErrorsCS2() {
	}

	public ABMISpreadsheetWihStyleErrorsCS2(double theInitialHeight, double theInitialWeight) {
		setHeight(theInitialHeight);
		setWeight(theInitialWeight);
	}

	public double getWeight() {
		 return weight;
//		return 70.0;
	}

	public void setWeight(double newValue) {
		// weight = newValue;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double newValue) {
		// System.out.println("setHeight() Called");
		height = newValue;
	}

	public double getBMI() {
		// System.out.println("getBMI() Called");
		return weight / (height * height);
	}
//	public static void print(BMISpreadsheet aBMISpreadsheet) {
//		System.out.println ("Height:" + aBMISpreadsheet.getHeight());		
//		System.out.println ("Weight:" + aBMISpreadsheet.getWeight());
//		System.out.println ("BMI:" + aBMISpreadsheet.getBMI());	
//		
//	}
	public static void print(ABMISpreadsheetWihStyleErrorsCS2 aBMISpreadsheet) {
		System.out.println ("Height:" + aBMISpreadsheet.getHeight());		
		System.out.println ("Weight:" + aBMISpreadsheet.getWeight());
		System.out.println ("BMI:" + aBMISpreadsheet.getBMI());		
	}
	public static void main (String[] args) {
		print (new ABMISpreadsheetWihStyleErrorsCS2());
//		print (new AnotherBMISpreadsheet());
	}
}
