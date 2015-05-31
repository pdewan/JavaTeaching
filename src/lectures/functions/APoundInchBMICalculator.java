package lectures.functions;

import lectures.objects.ABMICalculator;

public class APoundInchBMICalculator {
	public double calculateBMI(
            double weightInLbs, double heightInInches) {
        return (new ABMICalculator()).calculateBMI(
            toKgs(weightInLbs), toMetres(heightInInches));    
   }

    public double toMetres(double heightInInches) {
        final double cmsInMetres = 100;
        return toCentiMetres(heightInInches)/ cmsInMetres;
    }
    public double toCentiMetres(double heightInInches) {
        final double cmsInInch = 2.54;
        return heightInInches* cmsInInch;
    }
    public double toKgs(double weightInLbs) {
        final double lbsInKg = 2.2;
        return weightInLbs/lbsInKg;
    }
}
