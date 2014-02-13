package lectures.functions;

import lectures.objects.ABMICalculator;

public class APoundInchBMICalculator {
	public double calculateBMI(
            double weightInLbs, double heightInInches) {
        return (new ABMICalculator()).calculateBMI(
            toKgs(weightInLbs), toMetres(heightInInches));    
   }

    public double toMetres(double heightInInches) {
        final double CMS_IN_METRES = 100;
        return toCentiMetres(heightInInches)/ CMS_IN_METRES;
    }
    public double toCentiMetres(double heightInInches) {
        final double CMS_IN_INCH = 2.54;
        return heightInInches* CMS_IN_INCH;
    }
    public double toKgs(double weightInLbs) {
        final double LBS_IN_KG = 2.2;
        return weightInLbs/LBS_IN_KG;
    }
}
