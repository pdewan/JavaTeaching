package lectures.functions;

import lectures.objects.ABMICalculator;

public class AMyBMICalculator {
    public double calculateMyBMI(double weight) {
        final double MY_HEIGHT = 1.77;
        return (new ABMICalculator()).calculateBMI(weight, MY_HEIGHT);
    }
}
