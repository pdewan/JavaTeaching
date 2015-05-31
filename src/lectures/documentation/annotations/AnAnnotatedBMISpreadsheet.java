package lectures.documentation.annotations;

import util.annotations.Explanation;
import util.annotations.Tags;
@Explanation("Stores previously computed BMI value in a variable.")
@Tags({"Annotations", "Spreadsheet", "Properties", "Interfaces", "Object Editor"})
public class AnAnnotatedBMISpreadsheet implements AnnotatedBMISpreadsheet   {
	double height, weight;
	double initialHeight, initialWeight;
	public AnAnnotatedBMISpreadsheet(double theInitialHeight, double theInitialWeight) {
		height = theInitialHeight;
		weight = theInitialWeight;
		initialHeight = theInitialHeight;
		initialWeight = theInitialWeight;		
	}
	public AnAnnotatedBMISpreadsheet() {}	
	public double getHeight() {return height;}	
	public void setHeight(double newValue) {height = newValue;}
	public double getWeight() {return weight;}	
	public void setWeight(double newValue) {weight = newValue;}		
	public double getBMI() {return weight/(height*height);}	
		
	public static void main (String[] args) {
		try {
//		java.awt.Desktop.getDesktop().browse(java.net.URI.create("http://www.cs.unc.edu/~carterjl/teaching/notes/4_State_Notes.pdf"));
//		java.awt.Desktop.getDesktop().browse(java.net.URI.create("http://www.cs.unc.edu/~carterjl/teaching/slides/1_Theater_Slides.pptx"));

		bus.uigen.ObjectEditor.edit(new AnAnnotatedBMISpreadsheet(1.77, 75));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}