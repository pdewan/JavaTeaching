package lectures.objects;


public class ABMICalculator  {
	// weight is in Kgs, height in metres
	public double calculateBMI(double height, double weight) {
		return weight/(height*height);
	}	

}