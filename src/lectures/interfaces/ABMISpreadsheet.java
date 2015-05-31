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
	public void setWeight(double newValue) {
		weight = newValue;
	}	
	public double getHeight() {
		return height;
	}
	public void setHeight(double newValue) {
		height = newValue;
	}	
	public double getBMI() {
		return weight/(height*height);
	}		
}
