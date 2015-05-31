package lectures.least_privilege;

import lectures.interfaces.BMISpreadsheet;

public class ALbInchBMISpreadsheetWithLocalVariables implements BMISpreadsheet{    
	double height, weight, bmi;
	final double LBS_IN_KG = 2.2;
    final double CMS_IN_INCH = 2.54;   
	public double getHeight() {
        return height;
    }
    public void setHeight(double newValue) {
        height = newValue;
        bmi = calculateBMI();
    }    
    public double getWeight() {
        return weight;
    }
    public void setWeight(double newValue) {
        weight = newValue;
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

