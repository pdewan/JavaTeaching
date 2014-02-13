package lectures.types.math;

import util.annotations.StructurePattern;
import util.annotations.StructurePatternNames;
@StructurePattern(StructurePatternNames.BEAN_PATTERN)
@util.annotations.Explanation("Stores previously computed BMI value in a variable")
@util.annotations.WebDocuments({"4_State_Notes.pdf",
	"http://delivery.acm.org/10.1145/2160000/2157159/p69-dewan.pdf?ip=152.2.128.61&acc=ACTIVE%20SERVICE&CFID=88842060&CFTOKEN=32985736&__acm__=1331662176_de4ded7d47b745b5f8c6f6256cf58c25"
	})

public class ABMIAndOverweightSpreadsheet implements BMIAndOvervweightSpreadsheet   {
	double height, weight;
	double initialHeight, initialWeight;
	public ABMIAndOverweightSpreadsheet(double theInitialHeight, double theInitialWeight) {
		height = theInitialHeight;
		weight = theInitialWeight;
		initialHeight = theInitialHeight;
		initialWeight = theInitialWeight;		
	}
	public ABMIAndOverweightSpreadsheet() {}	
	public double getHeight() {return height;}	
	public void setHeight(double newHeight) {height = newHeight;}
	public double getWeight() {return weight;}	
	public void setWeight(double newWeight) {weight = newWeight;}	
	public double getBMI() {return weight/(height*height);}		
	public boolean getOverWeight() {return getBMI() > HIGH_BMI;}	
	public static void main (String[] args) {
		try {
//		java.awt.Desktop.getDesktop().browse(java.net.URI.create("http://www.cs.unc.edu/~carterjl/teaching/notes/4_State_Notes.pdf"));
//		java.awt.Desktop.getDesktop().browse(java.net.URI.create("http://www.cs.unc.edu/~carterjl/teaching/slides/1_Theater_Slides.pptx"));

		bus.uigen.ObjectEditor.edit(new ABMIAndOverweightSpreadsheet(1.77, 75));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}