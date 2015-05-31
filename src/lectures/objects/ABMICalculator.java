package lectures.objects;


public class ABMICalculator  {
	// weight is in Kgs, height in metres
	public double calculateBMI(double aHeight, double aWeight) {
		return aWeight/(aHeight*aHeight);
	}	

}