package lectures.interfaces;
import util.annotations.Explanation;
import util.annotations.WebDocuments;
@Explanation("Calculates BMI from height in metres and weight in kgs")
@WebDocuments({
				"4_State_Notes.pdf"
			 })
public interface LBInchBMISpreadsheet {
	public final double CMS_IN_INCH = 2.54;
    public final double LBS_IN_KG = 2.2;
	double getWeight();
	void setWeight(double newValue);	
	double getHeight();
	void setHeight(double newValue);	
	double getBMI();	
}
