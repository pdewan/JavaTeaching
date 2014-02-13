package lectures.functions;

public class AMyAverageBMICalculator {
	public double calculateMyAverageBMI(double weight1, double weight2) {
		AMyBMICalculator aMyBMICalculator = new AMyBMICalculator();
		double bmi1 = aMyBMICalculator.calculateMyBMI(weight1);
		double bmi2 = aMyBMICalculator.calculateMyBMI(weight2);
		return (bmi1 + bmi2) / 2;
	}

	public double succintCalculateMyAverageBMI(double weight1, double weight2) {
		AMyBMICalculator aMyBMICalculator = new AMyBMICalculator();
		return (aMyBMICalculator.calculateMyBMI(weight1) + aMyBMICalculator
				.calculateMyBMI(weight2)) / 2;
	}
}
