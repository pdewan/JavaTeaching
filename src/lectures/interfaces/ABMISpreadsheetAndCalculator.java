package lectures.interfaces;

public class ABMISpreadsheetAndCalculator implements BMISpreadsheet, BMICalculator{    
	double height, weight, bmi;    
	public double getHeight() {
        return height;
    }
    public void setHeight(double newValue) {
        height = newValue;
        bmi = calculateBMI(height, weight);
    }    
    public double getWeight() {
        return weight;
    }
    public void setWeight(double newValue) {
        weight = newValue;
        bmi = calculateBMI(height, weight);
    }    
    public double getBMI() {
        return bmi;
    }
    public double calculateBMI(double aHeight, double aWeight) {
		return aWeight/(aHeight*aHeight);
	}
    public static void main (String[] args) {
    	BMICalculator bmiCalculator = new ABMISpreadsheetAndCalculator();
    	BMISpreadsheet bmiSpreadsheet = new ABMISpreadsheetAndCalculator();
    	double bmi = bmiCalculator.calculateBMI(1.77, 75);
    	bmi = bmiSpreadsheet.getBMI();
//    	bmi = bmiCalculator.getBMI();
//    	bmi = bmiSpreadsheet.calculateBMI(1.77, 75);

    }
}

