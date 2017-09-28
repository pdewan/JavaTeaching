package lectures.documentation.annotations;
import util.annotations.Explanation;
import util.annotations.StructurePattern;
import util.annotations.StructurePatternNames;
import bus.uigen.ObjectEditor;
@StructurePattern(StructurePatternNames.NO_PATTERN)
public class AnAnnotatedBMICalculator  {
	@Explanation("Height is in meters, weight in centimeters.")
	public double calculateBMI(double height, double weight) {
		return weight/(height*height);
	}
	public static void main (String[] args) {
		ObjectEditor.edit(new AnAnnotatedBMICalculator());
	}
}