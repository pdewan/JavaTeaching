package lectures.interfaces;

import util.annotations.ComponentWidth;
import util.annotations.EditablePropertyNames;
import util.annotations.PropertyNames;
import util.annotations.StructurePattern;
import util.annotations.StructurePatternNames;

@StructurePattern(StructurePatternNames.BEAN_PATTERN)
@PropertyNames({ 
	"Weight", 
	"Height",
	"WeightGainRate",
	"BMI"
	})
@EditablePropertyNames({
	"Height", 
	"Weight",
	 "BMI"
})

public class ABMISpreadsheet implements BMISpreadsheet {
	double height;
	double weight;	
	public ABMISpreadsheet() { }	
	public ABMISpreadsheet(
			double theInitialHeight, double theInitialWeight) {
		setHeight(theInitialHeight);
		setWeight(theInitialWeight);
	}
//	@ComponentWidth(300)
	public double getWeight() {
//		System.out.println("getWeight() called");
		return weight;
	}
	public void setWeight(double newValue) {
//		System.out.println("setWeight() called");
		weight = newValue;
	}	
	public double getHeight() {
//		System.out.println("getHeight() called");
		return height;
	}
	public void setHeight(double newValue) {
//		System.out.println("setHeight() called with new value:" + newValue);
		height = newValue;
	}	
	public double getBMI() {
//		System.out.println("getBMI() called");
		return weight/(height*height);
	}		
}
