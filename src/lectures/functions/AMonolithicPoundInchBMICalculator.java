package lectures.functions;

import lectures.objects.ABMICalculator;

public class AMonolithicPoundInchBMICalculator {
	public double calculateBMI(double weightInLbs, double heightInInches) {
		return (new ABMICalculator()).calculateBMI(weightInLbs / 2.2,
				heightInInches * 2.54 / 100);
	}
}
