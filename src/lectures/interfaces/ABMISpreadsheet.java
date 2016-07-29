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
//	"WeightGainRate",
	"BMI"
	})
@EditablePropertyNames({
	"Height", 
	"Weight",
//	 "BMI"
})

public class ABMISpreadsheet implements BMISpreadsheet {
	double height;
	double weight;	
	public ABMISpreadsheet() { }	
	public ABMISpreadsheet(
			double anInitialHeight, double anInitialWeight) {
		setHeight(anInitialHeight);
		setWeight(anInitialWeight);
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double newValue) {
		weight = newValue;
	}	
	public double getHeight() {
		return height;
	}
	public void setHeight(double newValue) {
		height = newValue;
	}	
	public double getBMI() {
		return weight/(height*height);
	}	
}
