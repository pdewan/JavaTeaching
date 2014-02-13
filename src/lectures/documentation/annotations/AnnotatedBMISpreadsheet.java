package lectures.documentation.annotations;
import util.annotations.Explanation;
import util.annotations.StructurePattern;
import util.annotations.StructurePatternNames;
import util.annotations.WebDocuments;
@StructurePattern(StructurePatternNames.BEAN_PATTERN)
@Explanation("Calculates BMI from height in metres and weight in kgs.")
@WebDocuments({
	"http://www.cs.unc.edu/~dewan/comp114/f11/Class%20Notes/4_State_Notes.pdf",
	"http://www.cs.unc.edu/~dewan/comp114/f11/Lectures/4_State_Slides.pptx"
     })
public interface AnnotatedBMISpreadsheet  {
	public double getHeight();
	public void setHeight(double newVal); 
    @Explanation("Weight is in Kilograms. ")
	public double getWeight(); 
	@Explanation("Changing weight automatically recalculates BMI.")
	public void setWeight(double newVal); 
	public double getBMI();		
}