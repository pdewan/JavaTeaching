package lectures.types.enums;

import util.annotations.StructurePattern;
import util.annotations.StructurePatternNames;
@StructurePattern(StructurePatternNames.BEAN_PATTERN)
@util.annotations.Explanation("Stores previously computed BMI value in a variable")
@util.annotations.WebDocuments({"4_State_Notes.pdf",
	"http://delivery.acm.org/10.1145/2160000/2157159/p69-dewan.pdf?ip=152.2.128.61&acc=ACTIVE%20SERVICE&CFID=88842060&CFTOKEN=32985736&__acm__=1331662176_de4ded7d47b745b5f8c6f6256cf58c25"
	})

public class ABMSpreadsheetWithEnumConstants implements BMISpreadsheetWithEnumConstants   {
	double height, weight;
	double initialHeight, initialWeight;
	public ABMSpreadsheetWithEnumConstants(double theInitialHeight, double theInitialWeight) {
		height = theInitialHeight;
		weight = theInitialWeight;
		initialHeight = theInitialHeight;
		initialWeight = theInitialWeight;		
	}
	public ABMSpreadsheetWithEnumConstants() {}	
	public double getHeight() {return height;}	
	public void setHeight(double newValue) {height = newValue;}
	public double getWeight() {return weight;}	
	public void setWeight(double newValue) {weight = newValue;}	
	public double getBMI() {return weight/(height*height);}	
	EnumRace race = EnumRace.AFRICAN_AMERICAN;
	public EnumRace getRace() {
		return race;
	}
	public void setRace (EnumRace newVal) {
		race = newVal;
	}
	public EnumBMIClassification getBMIClassification() {
		double bmi = getBMI();
		if (bmi <= MAX_UNDERWEIGHT_BMI)
			return EnumBMIClassification.UNDER_WEIGHT;
		else if (bmi <= MAX_NORMAL_BMI)
			return EnumBMIClassification.NORMAL;
		else if (bmi <= MAX_OVERWEIGHT_BMI)
			return EnumBMIClassification.OVER_WEIGHT;
		else if (bmi <= MAX_OBESE_BMI)
			return EnumBMIClassification.OBESE;
		else
			return EnumBMIClassification.EXTREMELY_OBESE;
	}	
	public static void main (String[] args) {
		try {
//		java.awt.Desktop.getDesktop().browse(java.net.URI.create("http://www.cs.unc.edu/~carterjl/teaching/notes/4_State_Notes.pdf"));
//		java.awt.Desktop.getDesktop().browse(java.net.URI.create("http://www.cs.unc.edu/~carterjl/teaching/slides/1_Theater_Slides.pptx"));

		bus.uigen.ObjectEditor.edit(new ABMSpreadsheetWithEnumConstants(1.77, 75));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}