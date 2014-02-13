package lectures.interfaces;


public class ALbInchBMISpreadsheetUsingInterfaceConstants implements LBInchBMISpreadsheet{    
	double height, weight, bmi;	
	public double getHeight() {
        return height;
    }
    public void setHeight(double newHeight) {
        height = newHeight;
        bmi = calculateBMI();
    }    
    public double getWeight() {
        return weight;
    }
    public void setWeight(double newWeight) {
        weight = newWeight;
        bmi = calculateBMI();
    }    
    public double getBMI() {
        return bmi;
    }
    //not least privilege
//  double heightInMeters = height*CMS_IN_INCH/100;
    double calculateBMI() {    	
        double heightInMeters = height*CMS_IN_INCH/100; // least privilege
        return (weight/LBS_IN_KG) /
        (heightInMeters*heightInMeters);

    }
}

