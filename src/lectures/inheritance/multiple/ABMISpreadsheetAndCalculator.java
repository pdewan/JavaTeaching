package lectures.inheritance.multiple;

public class ABMISpreadsheetAndCalculator implements BMISpreadsheetAndCalculator{    
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
    	final int initWeight = 75;
    	final double initHeight = 1.77;
    	BMISpreadsheetAndCalculator bmiSpreadsheet = new ABMISpreadsheetAndCalculator();
    	double bmi = bmiSpreadsheet.calculateBMI(initHeight, initWeight);
    	bmi = bmiSpreadsheet.getBMI();
    }
}

