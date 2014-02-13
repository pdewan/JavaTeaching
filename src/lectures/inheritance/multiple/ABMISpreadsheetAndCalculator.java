package lectures.inheritance.multiple;

public class ABMISpreadsheetAndCalculator implements BMISpreadsheetAndCalculator{    
	double height, weight, bmi;    
	public double getHeight() {
        return height;
    }
    public void setHeight(double newHeight) {
        height = newHeight;
        bmi = calculateBMI(height, weight);
    }    
    public double getWeight() {
        return weight;
    }
    public void setWeight(double newWeight) {
        weight = newWeight;
        bmi = calculateBMI(height, weight);
    }    
    public double getBMI() {
        return bmi;
    }
    public double calculateBMI(double height, double weight) {
		return weight/(height*height);
	}
    public static void main (String[] args) {
    	BMISpreadsheetAndCalculator bmiSpreadsheet = new ABMISpreadsheetAndCalculator();
    	double bmi = bmiSpreadsheet.calculateBMI(1.77, 75);
    	bmi = bmiSpreadsheet.getBMI();
    }
}

