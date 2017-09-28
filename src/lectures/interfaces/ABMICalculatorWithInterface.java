package lectures.interfaces;


public class ABMICalculatorWithInterface implements BMICalculator{
	public double calculateBMI(double height, double weight) {
		return weight/(height*height);
	}

  public static void main (String[] args) {
	BMICalculator[] bmiCalculators = {new ABMISpreadsheetAndCalculator(),
									  new ABMICalculatorWithInterface()};
  }
}
