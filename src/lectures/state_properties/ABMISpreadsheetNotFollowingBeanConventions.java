package lectures.state_properties;

import util.annotations.EditablePropertyNames;
import util.annotations.PropertyNames;
import util.annotations.StructurePattern;
import util.annotations.StructurePatternNames;
import bus.uigen.ObjectEditor;
@StructurePattern(StructurePatternNames.BEAN_PATTERN)
@PropertyNames({ "Weight", "Height", "BMI"})
//@PropertyNames({ "Height", "Weight", "BMI"})
@EditablePropertyNames({"Height", "Weight"})
public class ABMISpreadsheetNotFollowingBeanConventions  {
	double height ;
	double weight;
	public double getWeight() {
		return weight;
	}
	// setter with wrong name and multiple args
	public void set(double newWeight, double newHeight) {
		weight = newWeight;
		height = newHeight;
	}	
	public double getHeight() {
		return height;
	}
	// setter with wrong arg type
	public void setHeight(int newHeight) {
		height = newHeight;
	}	
	// need get
	public double BMI() {
		return weight/(height*height);
	}
	public static void main (String[] args) {
		ObjectEditor.edit(new ABMISpreadsheetNotFollowingBeanConventions() );
	}
	
}
