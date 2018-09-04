package lectures.interfaces.extra;

import lectures.interfaces.BMISpreadsheet;

public class ABMISpreadsheetWithNonPublicMethods implements BMISpreadsheet{    
	double height, weight, bmi;
    
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
    // removes code duplication; not in interface
    double calculateBMI() {
        return weight/(height*height);
    }

}

