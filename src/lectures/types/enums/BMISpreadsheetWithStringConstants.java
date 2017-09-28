package lectures.types.enums;
import util.annotations.Explanation;
import util.annotations.WebDocuments;
@Explanation("Calculates BMI from height in metres and weight in kgs, and infers overweight/underweight/normal status")
@WebDocuments({
				"4_State_Notes.pdf"
			 })
public interface BMISpreadsheetWithStringConstants  {
	public double getHeight();
	public void setHeight(double newVal); 
	public double getWeight(); 
	public void setWeight(double newVal); 
	public double getBMI();
	public static double MAX_UNDERWEIGHT_BMI = 18.5;
	public static double MAX_NORMAL_BMI = 24.9;
	public static double MAX_OVERWEIGHT_BMI = 29.9;
	public static double MAX_OBESE_BMI = 39.9;	
	public String getBMIClassification();
	public String getRace();
	public void setRace (String newVal);

}