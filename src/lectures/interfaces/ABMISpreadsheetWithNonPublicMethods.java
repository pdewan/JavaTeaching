package lectures.interfaces;
public class ABMISpreadsheetWithNonPublicMethods implements BMISpreadsheet{    
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
    // removes code duplication; not in interface
    double calculateBMI() {
        return weight/(height*height);
    }

}

