package lectures.interfaces;

public class ABMISpreadsheet implements BMISpreadsheet {
	double height;
	double weight;	
	public ABMISpreadsheet() { }	
	public ABMISpreadsheet(
			double theInitialHeight, double theInitialWeight) {
		setHeight(theInitialHeight);
		setWeight(theInitialWeight);
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double newWeight) {
		weight = newWeight;
	}	
	public double getHeight() {
		return height;
	}
	public void setHeight(double newHeight) {
		height = newHeight;
	}	
	public double getBMI() {
		return weight/(height*height);
	}		
}
