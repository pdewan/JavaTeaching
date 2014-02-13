package lectures.types.math;
import util.annotations.Explanation;
import util.annotations.WebDocuments;
@Explanation("Calculates BMI from height in metres and weight in kgs, and infers overweight/underweight/normal status")
@WebDocuments({
				"4_State_Notes.pdf"
			 })
public interface BMIAndOvervweightSpreadsheet  {
	public double getHeight();
	public void setHeight(double newVal); 
	public double getWeight(); 
	public void setWeight(double newVal); 
	public double getBMI();
	public double HIGH_BMI = 25.0;	
	public boolean getOverWeight() ;
}